package Recursion;

public class matrixpath {
    public static  void findingpath(int[][] arr,String text,int i,int j)
    {
        if (i>=arr.length || j>= arr[0].length) return;
        if(i== arr.length-1 && j== arr[0].length-1)
        {
            System.out.println(text);
            return;
        }


        text +='D';
        findingpath(arr,text,i+1,j);
        text.substring(0,text.length()-1);

        text+='R';

        findingpath(arr,text,i,j+1);
        text.substring(0,text.length()-1);

    }
    public static void main(String[] args) {
        int[][] arr={{0,0},{0,1}};

        findingpath(arr,"",0,0);
    }
}
