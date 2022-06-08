package BitManipulation;

import java.util.ArrayList;
public class TakeOrNot {
    public  static  void  recursion(int[] arr,ArrayList<Integer> ar,int i)
    {
        if(i== arr.length)
        {
            System.out.println(ar);
            return;
        }
        ar.add(arr[i] );

        recursion(arr,ar,i+1);

        ar.remove(i);
        recursion(arr,ar,i+1);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        ArrayList<Integer> ar=new ArrayList<>();
        recursion(arr,ar,0);



    }
}
