package BitsManipulation.Videos;

public class TwiceInteger {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 4, 7, 7, 13};
        int XOR=0;
        for (int k : arr)
        {
            XOR^=k;

        }
int count=0;
        while (XOR!=0)
        {
            if((XOR & 1)==1)
            {
                break;
            }
            count++;
            XOR=XOR>>1;

        }

        int a1=0,a2=0;
        int mask=1<<count;
        for (int k:arr)
        {

            if((k & mask)!=0)
            {
                a1^=k;
            }else {
                a2^=k;
            }
        }
        System.out.println(a1);
        System.out.println(a2);

     }
}
