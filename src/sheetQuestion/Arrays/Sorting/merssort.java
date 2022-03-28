package sheetQuestion.Arrays.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class merssort {

    public  static  void divide(ArrayList<Integer>arr,ArrayList<Integer> ar, int low, int high)
    {
        int inverse=0;
        int mid=low+(high-low)/2;

        if(low<high)
        {
            divide(arr,ar,low,mid);
            divide(arr,ar,mid+1,high);
            merge(arr,ar,low,mid,high);


        }
        // return  inverse;
    }

    public  static void merge(ArrayList<Integer> arr,ArrayList<Integer>ar, int l, int m, int r)
    {
        int inverse=0;
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        ArrayList<Integer> L = new ArrayList<>();
        ArrayList<Integer> R = new ArrayList<>();
        ArrayList<Integer> L1 = new ArrayList<>();
        ArrayList<Integer> R1= new ArrayList<>();
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) {
            L.add(i, arr.get(l + i));
            L1.add(i, ar.get(l + i));

        }
        for (int j = 0; j < n2; ++j) {
            R.add(j, arr.get(m + 1 + j));
            R1.add(j, ar.get(m + 1 + j));

        }
        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L.get(i) <= R.get(j)) {
                arr.set(k,L.get(i));
                ar.set(k,L1.get(i));


                i++;
            }
            else {
                //arr[k] = R[j];
                arr.set(k,R.get(j));
                ar.set(k,R1.get(j));




                j++;
                inverse+=(n1-i);
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr.set(k,L.get(i));
            ar.set(k,L1.get(i));

            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr.set(k,R.get(j));
            ar.set(k,R1.get(j));



            j++;
            k++;
        }
        //  return  inverse;
    }
    public  static boolean funs(ArrayList<Integer> arrive,ArrayList<Integer> departs,int n,int size)
    {
        boolean ans=false;

        divide(arrive,departs,0 ,size);

        for (int i=1;i<arrive.size();i++)
        {
            int a=departs.get(i-1);
            int b=arrive.get(i);
            if(departs.get(i-1)>arrive.get(i))
            {
                n--;
            }

        }
        if (n<=0)
        {
            ans=true;

        }else
        {
            ans=false;
        }
        if (ans==true)
        {
            return  false;

        }else {
            return true;
        }



    }

    public static void main(String[] args) {
        int[]  arr = { 9, 47, 17, 39, 35, 35, 20, 18, 15, 34, 11, 2, 45, 46, 15, 33, 47, 47, 10, 11, 27};
        int[]  B = {32, 82, 39, 86, 81, 58, 64, 53, 40, 76, 40, 46, 63, 88, 56, 52, 50, 72, 22, 19, 38 };

        ArrayList<Integer> ars=new ArrayList<>();
        ArrayList<Integer> ar=new ArrayList<>();

        for (int i=0;i<arr.length;i++)
        {
            ars.add(i,arr[i]);
            ar.add(i,B[i]);
        }
        int c=16;
       boolean ans =funs(ars,ar,c, arr.length-1);
       // divide(ars,ar,0,arr.length-1);
        //2   System.out.println(ans);
        System.out.println(ans);
        System.out.println(ars);
        System.out.println(ar);


    }
}
