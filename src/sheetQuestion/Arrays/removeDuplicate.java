package sheetQuestion.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class removeDuplicate {

    public  static void another_duplicates(int[] arr)
    {
        int n=arr.length;
        int temp=arr[0];
        for (int i=0;i<arr.length;i++)
        {

            int temp2=n+arr[temp];
            int newtemp=arr[temp];
            arr[temp]=temp2;
            temp=newtemp;

        }
        System.out.println(Arrays.toString(arr));
    }

    public static int remove_duplicate(int[] arr)
    {
        int res=-1;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int a:arr)
            hashMap.put(a, hashMap.getOrDefault(a,0)+1 );
        for (Map.Entry<Integer,Integer>e:hashMap.entrySet())
        {
            if (e.getValue()>1)
            {
                res=e.getKey();
            }

        }



        return  res;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,2,3};
      //  int ans=remove_duplicate(nums);
        //System.out.println(ans);
        another_duplicates(nums);
    }
}
