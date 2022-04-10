package DynamicProgramming;

public class ClimbSteps {
   static int n=3 ;

    static   int[] dp=new int[n+1];
   static int left,right;

    public  static  int steps_Dp(int n)
    {
        if(n==0 || n==1)
            return 1;
        if (n==2)
            return  2;
        //left=steps_Dp(n-1);
        //right=steps_Dp(n-2);

        return steps_Dp(n-1)+steps_Dp(n-2);


    }

    public static int steps_Recursion(int n)
    {
        if(n<1)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        if (dp[n]!=-1)
            return dp[n];


        return dp[n]=steps_Recursion(n-1)+steps_Recursion(n-2);
    }
    public static void main(String[] args) {
        for (int i = 0; i<dp.length; i++)
            dp[i]=-1;

        int res=steps_Dp(n);
       // int newres=steps_Recursion(n);
       System.out.println(res);
      //  System.out.println(newres);

    }
}
