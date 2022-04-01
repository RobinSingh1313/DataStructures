package sheetQuestion.Arrays.Recursion;

public class StringReverse {
    public  static  String  recursion(String text)
    {
        if (text.equals(""))
        {
            return "";
        }
      String ans=  recursion(text.substring(1))+text.charAt(0);
        return ans;
    }

    public static void main(String[] args) {
        String text="hello";
        String ans=recursion(text);
        System.out.println(ans);

    }
}
