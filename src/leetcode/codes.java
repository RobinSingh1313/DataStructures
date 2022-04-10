package leetcode;

import java.util.ArrayList;

public class codes {
    public static void main(String[] args) {
        int[] arr={1,4,5};
        int[] arr1={3,4,5};
        ArrayList<Integer> ar=new ArrayList<>();
        int j=0;
        int i=0;
        while(i<arr.length && j<arr1.length && i<arr.length)
        {     if(arr[i]<arr1[j] )
            {
                i++;
            }else
            {
                j++;
            }
            if(arr[i]==arr1[j])
            {
                ar.add(arr1[j]);

            }

        }
        System.out.println(ar);
    }

}
