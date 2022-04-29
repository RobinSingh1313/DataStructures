package BitManipulation;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class scalers {
    public static int compressBits(ArrayList<Integer> A) {
        int[] arr=new int[A.size()];

        int i=0,j=1;

        while(j<A.size())
        {
            if(A.get(i)<A.get(j))
            {
                A.set(i,A.get(i) & A.get(j));

                A.set(j,A.get(i) | A.get(j));
            }
            i++;j++;

        }
        int count=0;
        for(int s:A)
        {
            count=count^s;

        }
        return count;

    }

    public static void main(String[] args) {

        ArrayList<Integer> ar=new ArrayList<>();
      int[]  A = {  1,3,5 };

        for (int k:A)
            ar.add(k);

        int ans=compressBits(ar);
        System.out.println(ans);
    }
}
