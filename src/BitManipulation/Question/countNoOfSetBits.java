package BitManipulation.Question;

public class countNoOfSetBits {

    public static void main(String[] args) {
        int no=11010;
        System.out.println((-40%7)+7);
        int count=0;
        while (no!=0)
        {
            if((no&1)==1)

            no=no>>1;
        }
        System.out.println(count);

    }
}
