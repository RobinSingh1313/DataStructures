package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static  int[] twoSum(int[] nums, int target) {

        // 2 3 7 18=9
        //0,2
        double ans;
        int[] indices=new int[2];

        HashMap<Integer,Integer> hashmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hashmap.containsKey(target-nums[i]))
            {
                indices[0]=hashmap.get(target-nums[i]);
                indices[1]=i;
                return indices;
            }else
            {
                hashmap.put(nums[i],i);
            }

        }

        return indices;
    }

    public static void main(String[] args) {
double answ;
        answ=(double)(3+2)/2;
        System.out.println(answ
        );
     int[]   nums = {23,2,7,15};int target = 9;


        int[] ans=twoSum(nums,target);
        System.out.println(Arrays.toString(ans));

    }
}
