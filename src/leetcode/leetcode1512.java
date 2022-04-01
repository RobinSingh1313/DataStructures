package leetcode;

public class leetcode1512 {
    public static void main(String[] args) {
      int[]  nums = {1,2,3,1,1,3};
        int[] temp=new int[101];
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            res=res+temp[nums[i]];
            temp[nums[i]]++;

        }

        System.out.println(res);
    }
}
