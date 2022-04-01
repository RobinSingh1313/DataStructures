package leetcode;

import java.util.Arrays;

public class leetcode1365 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res=new int[nums.length];
        int[] new_temp=new int[101];

        for(int i=0;i<nums.length;i++)
        {
            new_temp[nums[i]]++;

        }
        for(int i=1;i<101;i++)
        {
            new_temp[i]+=new_temp[i-1];

        }
       for (int i=0;i<nums.length;i++)
       {
           if(nums[i]==0)
           {
               res[i]=0;

           }else
           {
               res[i]=new_temp [nums[i]-1];
           }
       }
return  res;
    }

    public static void main(String[] args) {
       int[] nums = {8,1,2,2,3};
       int[] res=smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(res));

    }
}
