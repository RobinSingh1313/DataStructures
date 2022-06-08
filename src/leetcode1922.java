public class leetcode1922 {
    public static void main(String[] args) {
int n=9;

        int MOD=1000000007;
        long result = n%2==0 ?1:5;
        long x=20;
        for(long i=n/2;i>0;i/=2)
        {
            if(i%2!=0) result=result*x%MOD;
            x=x*x%MOD;
        }
        System.out.println(result);

    }
}
