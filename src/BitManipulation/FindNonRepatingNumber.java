package BitManipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindNonRepatingNumber {
    /*
    Q:[1,1,2,3,3,2,4,5,6,4,6] Ans:4 -->find non Repeating Twice Num
    There are three approaches to solve problem
    -->Brute Force Approach
    -->HashingApproach
    -->XorApproach
     */
    public static void main(String[] args) {
        int[] arr={6, 2, 5, 2, 2, 6, 6};
        int find_number=4;
        bruteForceApproch(arr,find_number);
        hashingApproach(arr,find_number);
        //xorApproach(arr,find_number);
        threexorApproach(arr,3);


    }

    private static void threexorApproach(int[] arr, int k) {
        byte sizeof_int = 4;
        int INT_SIZE = 8 * sizeof_int;
        int count[] = new int[INT_SIZE];

        // AND(bitwise) each element of the array
        // with each set digit (one at a time)
        // to get the count of set bits at each
        // position
        for (int i = 0; i < INT_SIZE; i++)
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] & (1 << i));
                if ((arr[j] & (1 << i)) != 0)
                    count[i] += 1;
            }
        // Now consider all bits whose count is
        // not multiple of k to form the required
        // number.
        int res = 0;
        for (int i = 0; i < INT_SIZE; i++)
            res += (count[i] % k) * (1 << i);
        System.out.println(res);


    }

    private static void xorApproach(int[] arr, int find_number) {
        int XOR=0;
        int a=0,b=0;
        for (int i=0;i<arr.length;i++)
        {
            XOR=XOR^arr[i];
        }
        int temp=XOR;
      int num=XOR & ~(XOR-1);
      for (int i=0;i<arr.length;i++)
      {
          if((num & arr[i])==0)
              a^=arr[i];
          else b^=arr[i];
      }

        System.out.println(a+""+b);
    }

    private static void hashingApproach(int[] arr, int find_number) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        List<Integer> lists=new ArrayList<>();

        int i=1;
        for(int k:arr)
        {
            hashMap.put(k, hashMap.getOrDefault(k,0)+1 );

        }
       for (Map.Entry<Integer,Integer>e:hashMap.entrySet())
       {
           if (e.getValue()==1)
           {
               lists.add(e.getKey());
           }
       }
        System.out.println(lists);
    }

    private static void bruteForceApproch(int[] arr, int find_number) {
        List<Integer> list=new ArrayList<>();
        for (int i=0;i< arr.length;i++)
        {        boolean isnumber=true;


            for (int j=0;j<arr.length;j++)
            {
                if(i==j)
                    continue;
                if(arr[i]==arr[j])
                {
                    isnumber=false;
                }


            }//ending ineer loop

            if (isnumber)
                list.add(arr[i] );

        }//ending outer loop
        System.out.println(list);
    }
}
