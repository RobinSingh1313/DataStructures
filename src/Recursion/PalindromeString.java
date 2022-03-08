package Recursion;

public class PalindromeString {

    public static void main(String[] args) {
        String input="abca";
       boolean ans= itsPalindrome(input,"",input.length()-1);
       boolean a=ispali(input,0,input.length()-1);
       System.out.println(ans);
        System.out.println(a);
    }

    private static boolean ispali(String input, int i, int i1) {
        if(i>=i1)
            return true;
        if(input.charAt(i)!=input.charAt(i1))
            return false;

        return ispali(input,i+1,i1-1);
    }

    private static boolean itsPalindrome(String input, String s, int i) {
        //n time complexity
        char c=input.charAt(i);
        if(i==0) {
            s = s + c;
            if(s.equals(input))
                return true;
            return false;
        }

        return itsPalindrome(input,s+c,i-1);



    }
}
