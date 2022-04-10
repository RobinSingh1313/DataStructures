package Scaler;

public class microsoft {

    public static void main(String[] args) {
        int pairs=0;
        //3 3 3
        String[] arr={"g","a","a","a","g","g","a","g"};
        int[] newarr=new int[arr.length];
        int c=0;

        for (int i= arr.length-1;i>=0;i--)
        {
            if(arr[i].equals("g"))
            {
              //  newarr[i]=arr[];

            }

        }
        int count=0;
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]=="g")
            {
                count++;

            }

        }

        for (int i=0;i<arr.length;i++)
        {
            if(arr[i].equals("a"))            {
                pairs=pairs+count;
            }else if(i!=0)
            {
                count--;
            }


        }
        System.out.println(pairs);
    }
}
