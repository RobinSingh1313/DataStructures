package sheetQuestion.Arrays;

public class countones {

    public static void main(String[] args) {
        int n=9;
/*
Brian Kernighan’s Algorithm:
 */
        int count=0;
        while (n>0)
        {

            if((n& 1)==1)
            {
                count++;
            }
            //count+=n& 1;
            n=n>>1;

        }
        System.out.println(count);

    }
}
