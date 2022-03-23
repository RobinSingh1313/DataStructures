package sheetQuestion.Arrays;

import java.util.Arrays;

public class cycleRotateonebyone {
    public  static  int[]  CycelRotateOne(int[] arr)
    {
        int newarr[]=new int[arr.length];
        newarr[0]= arr[arr.length-1];
        for (int i=0;i< arr.length-1;i++)
        {
            newarr[i+1]=arr[i];

        }



        return newarr;

    }


    public static void main(String[] args) {
       int A[] = {1, 2, 3, 4, 5};
       int[] newar=CycelRotateOne(A);
        System.out.println(Arrays.toString(newar));


    }
}
