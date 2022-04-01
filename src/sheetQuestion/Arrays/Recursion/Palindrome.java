package sheetQuestion.Arrays.Recursion;

public class Palindrome {

    public  static  boolean  isPalindrome(String text)
    {
        if(text.length()==1|| text.length()==0)
        {
            return true;
        }

if (text.charAt(0)==text.charAt(text.length()-1)) {
    return isPalindrome(text.substring(1, text.length() - 1));

}return  false;
    }

    public static void main(String[] args) {

        String text="racecar";
        System.out.println(text.charAt(text.length()-1));
        System.out.println(text.substring(1,text.length()-1));
        System.out.println(isPalindrome(text));

    }
}
