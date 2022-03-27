package sheetQuestion.Arrays;

import java.util.HashMap;
import java.util.Map;

public class subarraywithzerosum {
  static   int count=0;
    public static  boolean subarraySum(int[] arr,int n,int i,int add)
    {

        boolean iszero=false;

        if(i==n-1)
        {count++;
          // System.out.println("add: "+add+" "+count);
            return iszero;
        }
        add=arr[i]+add;
        subarraySum(arr,n,i+1,add);
        add=add-arr[i];
        subarraySum(arr,n,i+1,add);




        return  iszero;
    }

    public  static  void  subarrays(int[] arr,int n)
    {
        boolean iszer=false;
        int sum=0;
        HashMap<Integer,Integer> hashmap=new HashMap<>();

      for(int k:arr)
      {

          sum+=k;
          hashmap.put(sum,hashmap.getOrDefault(sum,0)+1);
      }

        for (Map.Entry<Integer,Integer>e:hashmap.entrySet())
        {
            if (e.getValue()>1)
            {
                iszer=true;
            }
            if (e.getKey()==0)
            {
                iszer=true;

            }
        }
        if (iszer==true)
            System.out.println(iszer);
    }
    public static void main(String[] args) {
        int[] arr={10,-10};int n=2;
        subarraySum(arr,n,0,0);
        subarrays(arr,n);
    }
}
