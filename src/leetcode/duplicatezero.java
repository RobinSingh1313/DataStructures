package leetcode;

import java.util.Arrays;

public class duplicatezero {
    public  static void duplicateZeros(int[] arr) {

        int count=0;
        for(int k:arr)
        {
            if(k==0)
                count++;
        }
        for(int j=arr.length-count;j>=0;j--)
        {

            if(arr[j]!=0)
            {
                arr[j+count-1]=arr[j];
            }else
            {
                arr[j+count-1]=0;

                arr[j+count-2]=0;
               // j=j-1;


            }


        }

    }

    public static void main(String[] args) {
       int[] arr = {1,0,2,3,0,4,5,0};
       duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
