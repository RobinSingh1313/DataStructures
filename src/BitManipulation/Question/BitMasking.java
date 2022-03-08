package BitManipulation.Question;

public class BitMasking {
    public static void main(String[] args) {
        int n=1111001;
        int mask=0;
        for (int i=0;i<32;i++)
        {
            mask=1<<i;
            if ((n& mask)!=0)
                System.out.println(1);
            else
                System.out.println(0);


        }

    }
}
