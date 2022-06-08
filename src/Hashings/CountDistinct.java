package Hashings;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinct {

    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        ArrayList<Integer> ars=new ArrayList<>();

       int[] A = {1, 2, 1, 3, 4, 3};
       int B = 3;
      for (int i=0;i<B-1;i++)
      {
          hashMap.put(A[i],hashMap.put(A[i],0)+1);
      }
      ars.add(hashMap.size());

      for (int i=B;i<A.length;i++)
      {
          int n=A[i-B];
          if (hashMap.get(n)==1)
          {
              hashMap.remove(n);

          }else {
              hashMap.put(n,hashMap.get(n)-1);

          }
          hashMap.put(A[i],hashMap.getOrDefault(A[i],0)+1);
          ars.add(hashMap.size());



      }

        System.out.println(ars);



    }
}
