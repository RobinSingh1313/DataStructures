package Scaler;

import java.util.Arrays;

public class mxsum {
    public static void main(String[] args) {
        int[] arr={7,5,0,-15,100,5,70,30};

        for (int i=1;i< arr.length;i++)
        {
            arr[i]=Math.max(arr[i-1],arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}
