package sheetQuestion.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FirstmissingInteger {
    public static int firstMissingPositives(ArrayList<Integer> A) {
        int len = A.size();
        for (int i = 0; i < len; i++) {

            while (A.get(i) != (i + 1) || A.get(i) <= 0) {

                int num = A.get(i);
                int targetIndex = num - 1;

                if ((targetIndex < 0 || targetIndex >= len) || num == A.get(num - 1)) {

                    break;
                }

                A.set(i, A.get(num - 1));
                A.set(num - 1, num);
            }
        }
        // find the missing integer
        for (int i = 0; i < len ; i++) {
            if (A.get(i) != i + 1) {
                // found missing
                return i + 1;
            }
        }
        // no missing number
        return len + 1;
    }



    public static  int firstMissingPositive(ArrayList<Integer> A) {
        //{3,4,-1,-1}
        /*
        -1,4,-1,1
         */
        //102
        int i=0;
      while(i<A.size())
      {
          int s=A.get(i);
        if(A.get(i)>0 && A.get(i)<A.size() && A.get(i)!=A.get(s))
        {
            if(A.get(i)!=i+1)//1
            {
                int temp=A.get(i);
                int k=A.get(i);
                A.set(i,A.get(k-1));
                A.set(k-1,temp);
            }else
            {
                i++;
            }
        }else
        {
            i++;
        }

       }

      for (int k=0;k<A.size();k++)
      {
          if(A.get(k)!=k+1)
          {
              return k+1;
          }

      }
        return A.size()+1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
      int[]  A ={3,4,-1,1};
        for (int i=0;i<A.length;i++)
        {
            arrayList.add(i,A[i]);

        }
        int ans=firstMissingPositives(arrayList);

        System.out.println(ans);

    }
}
