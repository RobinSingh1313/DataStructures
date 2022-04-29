package BitManipulation;

public class bitmaskings {


    public static void main(String[] args) {
        System.out.println((1<<3)-1+" hr");
        System.out.println();

        System.out.println("A^b "+(5^7));

        long A=93,B =4;
        String a=Long.toBinaryString(A);
        long ans=-1;
        System.out.println(a);
        String subString=a.substring((int) (a.length()-B));
        String sub=a.substring(0, (int) ( a.length()-B));





        System.out.println(ans);

    }
}
