package Hashings;

import java.util.ArrayList;
import java.util.HashSet;

public class scalerproblems {
    public static void main(String[] args) {
       int[] A={1, 2, 1, 3, 4, 3} ;int B = 3;
        ArrayList<Integer> ar=new ArrayList<>();
        HashSet<Integer> hash=new HashSet<>();

        for (int i=0;i<A.length;i++)
        {
            int j=i-B;
            if(i>B-1)
            {
                if (A[i]!=A[j])
                {
                    ar.remove(A[j]);

                }
            }
        }


        System.out.println(ar);
    }
}
