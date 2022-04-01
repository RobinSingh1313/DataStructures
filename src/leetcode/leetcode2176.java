package leetcode;

import java.util.HashMap;

public class leetcode2176 {

    /*
     nums = [3,1,2,2,2,1,3], k = 2
     */
    public  static  int fun(int[] arr,int k)
    {
        HashMap<Integer,Integer> hashMap=new HashMap<>();

        int count=0;
        for (int i=0;i< arr.length;i++)
        {
            for (int j=i+1;j< arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    if(i*j % k==0)
                    {
                        count++;
                    }
                }
            }
        }


        return count;
    }

    public static void main(String[] args) {
       int[] nums = {1,2,3,4}; int k = 1;
        int ans=fun(nums,k);
        System.out.println(ans);
    }
}
