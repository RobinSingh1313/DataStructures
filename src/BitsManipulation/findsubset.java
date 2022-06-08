package BitsManipulation;

import java.util.ArrayList;

public class findsubset {
    public static void main(String[] args) {
        int[] ar={1,2,3};
int size=ar.length;
     for (int i=0;i<=((1<<size)-1);i++)
     {
         ArrayList<Integer> ars=new ArrayList<>();
         for (int bit=0;bit<size;bit++)
         {
             if((i & (1<<bit))!=0)
             {
                 ars.add(ar[bit] );


             }

         }
         for (int k:ars)
         {
             System.out.print(k+" ,");
         }
         System.out.println();
     }
    }
}
