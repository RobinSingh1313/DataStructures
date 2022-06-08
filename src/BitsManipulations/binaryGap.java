package BitsManipulations;

public class binaryGap {
    public static int binaryGap(int n) {
        /*
        0111
        1000
        -----

         */

        int gap=0;
        int max=0;
        while (n!=0)
        {
            if((n&1)==1) {
                max=Math.max(gap,max);
               gap=1;

            }else  {
                if(gap>=1 || (n&1)==1)
                {
                    gap++;
                }
            }

            n=n>>1;

        }
        return  max;

    }
    //1001

    public static void main(String[] args) {
        int n=binaryGap(9);
        System.out.println( n);

    }
}
