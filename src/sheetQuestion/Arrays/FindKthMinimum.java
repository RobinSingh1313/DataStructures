package sheetQuestion.Arrays;

import java.util.Arrays;

public class FindKthMinimum {
//1st approach sorting
    static int min,max;
    public  static  void   findKthMinimumElement(int[] arr,int k)
    {
        Arrays.sort(arr);
        min=arr[k-1];
        max=arr[arr.length-k];



    }
    public static void main(String[] args) {
       int arr[] = {7, 10 ,4 ,3 ,20, 15};
       int K = 3;
       findKthMinimumElement(arr,K);
        System.out.println("Min"+min+" Max:"+max);

    }
}
