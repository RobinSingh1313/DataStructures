package BitsManipulations;

import java.util.Arrays;

public class indexes {

    public static void main(String[] args) {
        int[] arr={-3,0,2,2,5,5,5,5,8,8,10,10,10,14};
       int[] A = { 100, 35, -85, 82, -36, 64, -71, 71, 43, -4, -9, 33, 44, -47, -49, -7, -24, 7 };
Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        int ans=0;
        int less=0;
        if(arr[0]==0)
            ans++;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                less=i;
            }
            if(less==arr[i])
            {
                ans++;
            }
        }

    }
}
