package Scalingwindow;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class firstNegativeNumber {

    public  static  ArrayList<Integer> negativeNumbers(int[] arr,int k)
    {
        HashMap<Integer,Integer> ahs=new HashMap<>();

        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i< arr.length-k;i++)
        {
            int num=0;
            for (int j=i;j<i+k;j++)
            {
                if(arr[j]<0 && num==0)
                    num=arr[j];

            }
            ar.add(num);

        }
        return ar;

    }

    public static void main(String[] args) {
        int[] arr={12,-1,-7,8,-15,30,10,28};
        ArrayList<Integer> ars=negativeNumbers(arr,3);
        System.out.println(ars);
    }
}
