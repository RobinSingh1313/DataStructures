package Hashings;

public class leetcode60 {

    public static String getPermutation(int n, int k) {
        getSting(n, "");

        return "";

    }

    private static void getSting(int n, String s) {
        if(n<=0) {
            System.out.println(s);
        return;
        }
            s=s+n;
            getSting(n-1,s);
            s.substring(n);
            getSting(n-1,s);



    }

    public static void main(String[] args) {
        getPermutation(3,3);

    }

}
