package sheetQuestion.Arrays;

public class kadannes {
public  static int maxSubSu(int[] arr, int n)
{
    int currsum=0;
    int maxsum=Integer.MIN_VALUE;
    for (int i=0;i<n;i++)
    {
        currsum=currsum+arr[i];
        maxsum=Math.max(currsum,maxsum);
        if (currsum<0)
            currsum=0;


    }
    return maxsum;
}
    public static void main(String[] args) {
       int N = 5;
       //1 -3=-2-2
        int Arr[] = {-1,-2,-3,-2,-5};
        int ans=maxSubSu(Arr,N);
        System.out.println(ans);
        /*
        -1,-2,-3,-4

        -1


        1
        3
        6
        4
        11

         */
    }
}
