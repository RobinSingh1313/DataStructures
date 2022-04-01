package leetcode;

import java.util.*;

public class leetcode1679 {

    public  static  int maxK(int[] arr,int k)
    {
        int count=0;
       int[] temp=new int[arr.length];
       int i=0;
       for(int s:arr) {
           temp[i] = s;
           i++;
       }
        Arrays.sort(temp);
       int start=0,end=arr.length-1;
       while (start<end)
       {
           if(k==temp[start]+temp[end])
           {
               start++;
               end--;
               count++;
           }else if(k<temp[start]+temp[end])
           {
               end--;
           }else
           {
               start++;
           }


       }
       return  count;
    }

    public static void main(String[] args) {
       int[] nums = {3,5,1,5};int k = 2;

        int ans=maxK(nums,k);
        System.out.println(ans);
    }
}
