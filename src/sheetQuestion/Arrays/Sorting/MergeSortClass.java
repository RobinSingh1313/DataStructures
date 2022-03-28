package sheetQuestion.Arrays.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortClass {

    public  static  int divide(ArrayList<Integer>arr, int low, int high)
    {
        int inverse=0;
        int mid=low+(high-low)/2;

        if(low<high)
        {
          divide(arr,low,mid);
          divide(arr,mid+1,high);
          merge(arr,low,mid,high);


        }
       return  inverse;
    }

    public  static int merge(ArrayList<Integer> arr, int l, int m, int r)
    {
        int inverse=0;
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        ArrayList<Integer> L = new ArrayList<>();
        ArrayList<Integer> R = new ArrayList<>();

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L.add(i, arr.get(l + i));
        for (int j = 0; j < n2; ++j)
            R.add(j,arr.get(m + 1 + j));

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L.get(i) <= R.get(j)) {
                arr.set(k,L.get(i));
                i++;
            }
            else {
                //arr[k] = R[j];
                arr.set(k,R.get(j));



                j++;
                inverse+=(n1-i);
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr.set(k,L.get(i));
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr.set(k,R.get(j));


            j++;
            k++;
        }
        return  inverse;
    }
    public static void main(String[] args) {
        int[]  arr = { 9, 47, 17, 39, 35, 35, 20, 18, 15, 34, 11, 2, 45, 46, 15, 33, 47, 47, 10, 11, 27};
        ArrayList<Integer> ars=new ArrayList<>();
        for (int i=0;i<arr.length;i++)
        {
            ars.add(i,arr[0]);
        }
       int ans= divide(ars,0,arr.length-1);
        System.out.println(ans);

        System.out.println(Arrays.toString(arr));


    }
}
