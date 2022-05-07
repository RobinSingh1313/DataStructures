package BitsManipulations;

public class Addof2 {

    public static String add(String a, String b) {
        String result = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j > +0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            result += String.valueOf(sum % 2);


        }
        return  "";


    }




    public static void main(String[] args) {

    }
}
