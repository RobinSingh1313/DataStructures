package BitManipulation.Question;

public class FindNoOfBits {

    public static void main(String[] args) {
        int n=53;
        int s=8;
        int result = (int)(Math.log(s) / Math.log(2));

        while (s>0) {
            s=s&(s-1);
            System.out.println(s);
        }
        int temp=1;
        int count=0;
        while (n>0)
        {
            if ((n&temp)==1)
                count++;

            n=n>>1;



        }
        System.out.println(count);
    }
}
