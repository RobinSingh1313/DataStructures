package Scaler;

public class maxsum {
    public  static int sum(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        int curr_sum=0;


        for(int i=0;i<arr.length;i++)
        {
            curr_sum=Math.max(arr[i] +curr_sum,arr[i]);
            max=Math.max(curr_sum,max);





        }
        return  max;
    }

    public static void main(String[] args) {
int[]        A = {1, 2, 3, 4, -10};
int ans=sum(A);
        System.out.println(ans);

    }
}
