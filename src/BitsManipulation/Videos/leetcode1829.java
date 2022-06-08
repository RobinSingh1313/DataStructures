package BitsManipulation.Videos;

import java.util.Arrays;

public class leetcode1829 {
    public static int[] getMaximumXor(int[] nums, int maximumBit) {
        for(int i=1; i<nums.length; i++)
            nums[i] ^= nums[i-1];

        int k = (int)Math.pow(2, maximumBit)-1;

        int[] res = new int[nums.length];
        int index = 0;
        for(int i=nums.length-1; i>=0; i--){
            res[index] = nums[i] ^ k;
            index++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,1,3};int maximumBit = 2;
        int[] ans=getMaximumXor(nums,maximumBit);
        System.out.println(Arrays.toString(ans));
    }
}
