package Striver.bitmanipulation;

import java.sql.Array;
import java.util.Arrays;

public class SingleElement {

    public static void main(String[] args) {
        int[] arr={1,2,1,2,4,3,5,3,4,6,7,7,6};
        Arrays.sort(arr);
//x =4, y=2;//60
        int nas=((1<<4)-1)<<2;
        System.out.println(nas);
        int a=4;
        /*

        100

         */
        int b=a &(1 << 2);
        System.out.println(b);
        int ans=0;
        for(int k:arr)
            ans=ans^k;
        System.out.println(ans);
    }
}
