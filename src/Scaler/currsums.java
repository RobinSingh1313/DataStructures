package Scaler;

public class currsums {


    public  static  int sum(int[] arr,int B)
    {
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<B;i++)
        {
            currsum+=arr[i];



        }
        maxsum=Math.max(currsum,maxsum);

        int j=B-1;
        for(int i=arr.length-1;i>=arr.length-B;i--)
        {
            currsum=(currsum-arr[j])+arr[i];
            maxsum=Math.max(currsum,maxsum);
            j--;
        }

        /*


max=0
5-2+3=6



        */
        return maxsum;
    }

    public static void main(String[] args) {
int[]        A = {5, -2, 3 , 1, 2};

int ans=sum(A,3);
        System.out.println(ans);


    }
}
