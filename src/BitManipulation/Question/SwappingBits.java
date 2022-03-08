package BitManipulation.Question;

public class SwappingBits {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        System.out.println("before Swapping:A:"+a+" B:"+b);

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping:A:"+a+" B:"+b);


    }
}
