package BitManipulation.Question;

public class countNoOfSetBits {

    public static void main(String[] args) {
        int no=11010;
        String A="12346778";
        int num=Integer.parseInt(A.substring(A.length()-3));
        System.out.println(num);

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
