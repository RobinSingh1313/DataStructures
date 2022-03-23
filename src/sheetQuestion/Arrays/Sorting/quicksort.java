package sheetQuestion.Arrays.Sorting;

import java.util.Arrays;

public class quicksort {

    /*


    1.partiton
    2. conquer
     */
    public  static  int partition(int[] arr,int low ,int high)
    {
       int pivot=arr[(low+high)/2];
       while (low<=high) {
          while(arr[low] < pivot )
          {
               low++;
           }
          while (arr[high] > pivot) {
               high--;
           }
           if(low<=high) {
               swap(arr, low, high);
               low++;
               high--;

           }

       }
      //swap(arr,0,high );
        System.out.println(Arrays.toString(arr));
        return low;


    }
    public static void  quicksort(int[] arr, int low,int high)
    {
        if(low<high)
        {
            int pivot=partition(arr, low, high);
            if (low<pivot-1)
             quicksort(arr, low, pivot-1);
            if (pivot<high)
                quicksort(arr, pivot, high);
        }
    }

    private static void swap(int[] arr, int low, int high) {

        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }

    public static void main(String[] args) {
        int[] arr={4,6,2,5,7,9,1,3};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
