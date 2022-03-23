package sheetQuestion.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class mergewithoutextraspace {

    public static void merge(int arr1[], int arr2[], int N, int M) {
        // code here
        int i=0,j=0;


      while (i<N)
      {
          if (arr1[i]>arr2[j])
          {
              int temp=arr1[i];
              arr1[i]=arr2[j];
              arr2[j]=temp;
              fixArray(arr2);


          }
          i++;

      }


    }

    private static void fixArray(int[] arr2) {
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
      int  arr1[] = {2, 7, 10, 15};

       int arr2[] = {  2, 2 ,2 ,7, 10, 12, 14, 14, 17, 20};
       merge(arr1,arr2,4,10);
        System.out.println(Arrays.toString(arr1)+Arrays.toString(arr2));


    }
}
