package leetcode;

import java.util.Arrays;

public class squares {

    public static void main(String[] args) {
        int[] nums={1};
        int[] sort=new int[nums.length];

        if(nums[0]>=0)
        {
            for(int i=0;i<nums.length;i++)
            {
                System.out.println(nums[i]);
                nums[i]=nums[i]*nums[i];

            }
        }else
        {
            int length=nums.length-1;
            int left=0,right=length;
            for(int i=length;i>=0;i--)
            {
                if(Math.abs(nums[left])>Math.abs(nums[right]))
                {
                    sort[i]=nums[left]*nums[left];
                    left++;
                }else
                {
                    sort[i]=nums[right]*nums[right];
                    right--;
                }
            }
        }
        System.out.println(Arrays.toString(sort));


    }
}
