public class leetcode50 {
    public static double myPow(double x, int n) {
        if(n==0)
            return 1;

        if(n<0)
        {
            return (1/x)* myPow(x,n+1);
        }
        return x* myPow(x,n-1);

    }
    public static void main(String[] args) {
     double x=   0.00001;int
              n=
        2147483647;
     double ans=myPow(x,n);
        System.out.println(ans);



    }
}
