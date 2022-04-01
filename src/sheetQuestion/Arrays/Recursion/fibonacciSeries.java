package sheetQuestion.Arrays.Recursion;

public class fibonacciSeries {
    //0 1 1 2 3 5 8 13

    public static long fib(int n) {
        int[] dp=new int[n+1];

        if (n == 1 || n == 0) {
            return n;
        } else {


            return fib(n - 1) + fib(n - 2);
        }

    }
    public static void main(String[] args) {
        long ans=fib(50);
        System.out.println(ans);
    }
}
