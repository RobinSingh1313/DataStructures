package sheetQuestion.Arrays.Sorting;

import java.util.Arrays;

public class MergeSortClass {

    public  static  int divide(int[] arr, int low, int high)
    {
        int inverse=0;
        int mid=low+(high-low)/2;

        if(low<high)
        {
         inverse +=  divide(arr,low,mid);
         inverse +=   divide(arr,mid+1,high);
         inverse +=   merge(arr,low,mid,high);


        }
        return  inverse;
    }

    public  static int merge(int arr[], int l, int m, int r)
    {
        int inverse=0;
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];


                j++;
                inverse+=(n1-i);
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return  inverse;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
       int ans= divide(arr,0,arr.length-1);
        System.out.println(ans);

        System.out.println(Arrays.toString(arr));


    }
}
