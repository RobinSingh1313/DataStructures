package TwoPointer;

import java.util.Arrays;

public class removeDuplicates {
    public static int removesDuplicates(int[] nums) {

        int count=1;

        int start=0;int end=nums.length-1;
        int mid=1;
        while(mid<=end)
        {
            if(nums[mid]!=nums[start])
            {
                start++;
                nums[start]=nums[mid];

            }
            mid++;
        }

        return start+1;

    }

    public static void main(String[] args) {
        int[] arr={1,1,2};
        System.out.println(1/2);
        int ans=removesDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }
}
