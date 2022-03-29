package March28;

public class MaxProductSubarray {
    /*
    1st aprroach bruteforve
    2nd dp
     */
public  static  int bruteforceapproach(int[] arr)
{
    int length=arr.length-1;
    int curr=1;
    int Max=Integer.MIN_VALUE;
    for (int i=0;i<=length;i++)
    {

        for (int j=i;j<=length;j++)
        {
            curr=arr[j]*curr;
            if(curr==0)
                curr=1;
            Max=Math.max(curr,Max);

        }
        curr=1;
    }
    return  Max;

}
    public static int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;

        int curMin = 1;
        int curMax = 1;

        for(int n : nums) {
            int temp = curMax * n;
            curMax = Math.max(n, Math.max(temp, n*curMin));
            curMin = Math.min(n, Math.min(temp, n*curMin));
            res = Math.max(res, curMax);
        }
        return res;
    }
    public static void main(String[] args) {
    int[] arr={6, -3, -10, 0, 2};
    int nas=bruteforceapproach(arr);
        System.out.println(nas);
     int ans=maxProduct(arr);
        System.out.println(ans);

    }
}
