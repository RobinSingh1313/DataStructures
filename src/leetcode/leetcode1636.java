package leetcode;

import java.util.*;

public class leetcode1636 {
    public static  void  arys(int[] arr)
    {
        Map<Integer,Integer> hashMap=new HashMap<>();
        List<Integer> list = new ArrayList<>();

        // Iterate through the array
        for (int t : arr) {
            // Add each element into the list
            list.add(t);
        }
        for (int a:arr)
        {
            hashMap.put(a, hashMap.getOrDefault(a,0)+1);


                   }
        list.sort((n1, n2) ->
        {
            int fre1 = hashMap.get(n1);
            int fre2 = hashMap.get(n2);
            if (fre1 != fre2) {
                return fre2 - fre1;
            }
            return n1 - n2;

        });
    }

    public static void main(String[] args) {
     int[]   nums = {-1,1,-6,4,5,-6,1,4,1};
     arys(nums);
    }
}
