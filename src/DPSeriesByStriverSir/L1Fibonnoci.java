package DPSeriesByStriverSir;

public class L1Fibonnoci {
//recursion format
public  static  int  FibannociSeries(int n)
{
    if(n<=1)
        return n;
    return FibannociSeries(n-1)+FibannociSeries(n-2);
/*
Time COmplexity -->O(2N)
Space Complexity-->O(N)

 */

}

    public  static  int fibnaoociDp(int n,int[] dp)
    {
        if(n<=1)
            return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]= fibnaoociDp(n-1,dp)+fibnaoociDp(n-2,dp);
        /*

Time COmplexity -->O(N)
Space Complexity-->O(N)+O(n)
         */
    }

    /*
    Tabulation(Bottom -UP)

     */
    public static void main(String[] args) {
int n=10;
int[]dp=new int[n+1];

/*
Tabulea
 */
        //int neans=DpTabulation(n,arr);
for (int i=0;i< dp.length;i++)
{
    dp[i]=-1;
}
        dp[0]=0;
        dp[1]=1;
        for (int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];

        }
        System.out.println(dp[n]);

    int ans=fibnaoociDp(n,dp);
        System.out.println(ans);

    }

}
