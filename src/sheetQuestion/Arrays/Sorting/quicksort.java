package sheetQuestion.Arrays.Sorting;

import java.util.Arrays;

public class quicksort {

    /*


    1.partiton
    2. conquer
     */
    static long k=0;
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
           if(low>=high) {

               swap(arr, low, high);
               low++;
               high--;

           }

       }
      //swap(arr,0,high );
        return low;


    }
    public static long  quicksort(int[] arr, int low,int high)
    {
        boolean issortd=true;
        if(arr.length<=1)
        {

            return k;

        }
        for (int i=1;i<=arr.length-1;i++)
        {
            if(arr[i]<arr[i-1])
            {
                issortd=false;

            }
        }
        if (issortd==true)
        {
            return k;
        }

        if(low<high)
        {


            int pivot=partition(arr, low, high);
            if (low<pivot-1) {
                k++;
                quicksort(arr, low, pivot - 1);
            }
            if (pivot<high) {
                k++;
                quicksort(arr, pivot, high);
            }
        }
        return k;

    }

    private static void swap(int[] arr, int low, int high) {

        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        /*
        42
468 335 1 170 225 479 359 463 465 206 146 282 328 462 492 496 443 328 437 392
105 403 154 293 383 422 217 219 396 448 227 272 39 370 413 168 300 36 395 204 312 323
         */
        long ans=quicksort(arr,0,arr.length-1);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));






    }
}
