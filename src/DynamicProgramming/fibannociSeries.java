package DynamicProgramming;

public class fibannociSeries {
    static  int n=1150;
  static   int[] dp=new int[n+1];

    public  static  int fibannoci_dp(int n)
    {

        if (n<=1)
            return n;
        if (dp[n]!=-1)
            return dp[n];

        return dp[n]=fibannoci_dp(n-1)+fibannoci_dp(n-2);


    }
    public  static  int  fibannoci_recursion(int n)
    {
        if(n<=1)
            return n;

        return fibannoci_recursion(n-1)+fibannoci_recursion(n-2);
    }
    public static void main(String[] args) {
       // int res=fibannoci_recursion(n);
        for (int i = 0; i<dp.length; i++)
            dp[i]=-1;

        int ans=fibannoci_dp(n);
        System.out.println(ans);

    }
}
