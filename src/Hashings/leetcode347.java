package Hashings;

import java.util.*;

public class leetcode347 {

    public static int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket=new List[nums.length+1];

        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int n:nums)
        {
            hash.put(n,hash.getOrDefault(n,0)+1);

        }

        for (int key: hash.keySet())
        {
            int  fre=hash.get(key);
            if(bucket[fre]==null)
            {
                bucket[fre]=new ArrayList<>();
            }
            bucket[fre].add(key);
        }
        int ans[]=new int[k];
        int count=0;
        for (int i= bucket.length-1;i>=0;i--)
        {
            if(bucket[i]!=null)
            {
                for (int j=0;j< bucket[i].size();j++)
                {
                    ans[count++]=bucket[i].get(j);
                }
                if (count==k)break;
            }
        }
        return ans;


    }

    public static void main(String[] args) {
        int[] nums = {4,1,-1,2,-1,2,3};int  k = 2;
        int arr[]=topKFrequent(nums,k);
        System.out.println(Arrays.toString(arr));


    }
}
