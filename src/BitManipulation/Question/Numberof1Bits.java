package BitManipulation.Question;

public class Numberof1Bits {

    //leetCode Ques 191 & Geeks


    public static void main(String[] args) {
        int[] ar={1,0,1,1};
        int[] newar=new int[ar.length];
        int[] bit=new int[ar.length+1];
        bit[0]=1;
        firstAproach(00000000000000000000000000001011);


    }


    private static void firstAproach(int n) {
        int count=0;
        int mask=1;

        for(int i=0;i<32;i++)
        {
            System.out.println(n&mask);
            if((n & mask) !=0)
                count++;
            mask=mask<<1;


        }

        System.out.println(count);

    }
}
