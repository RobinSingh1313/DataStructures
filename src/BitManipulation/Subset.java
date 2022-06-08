package BitManipulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Subset {
    static int max=0;
    public static int countMaxOrSubsets(int[] nums) {
        ArrayList<Integer> ar=new ArrayList<>();
        findsubsets(nums,0,ar);
        return  max;

    }

    private static int findsubsets(int[] nums, int i,ArrayList<Integer> ars) {
        if (i== nums.length)
        {
            return 0;
        }
      int num=nums[i];

        return max;
    }



    public static void main(String[] args) {
       int[] nums = {3,2,1,5};
       int ans=countMaxOrSubsets(nums);
        System.out.println(ans);

    }
}
