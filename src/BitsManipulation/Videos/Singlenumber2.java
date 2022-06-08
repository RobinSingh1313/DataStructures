package BitsManipulation.Videos;

public class Singlenumber2 {
    public static void main(String[] args) {
        int[] nums={2,2,3,2};
        int ones=0;
        int twos=0;
        for(int i=0;i<nums.length;i++)
        {
            int newtem=~ones;
        int tem=~twos;
            ones= (ones^nums[i])&tem;
            twos= (twos^nums[i])&newtem;
        }
    }
}
