package sheetQuestion.Arrays.Recursion;

public class BinarySearch {

    public  static  int binarysearch(int[] arr, int low,int high,int search)
    {
        if(low>high)
            return -1;

        int mid=(low+high)/2;
        if(arr[mid]==search)
            return mid;
        if(search<arr[mid]) {
          return   binarysearch(arr, low, mid,search);
        }
       return binarysearch(arr,mid+1,high,search);


    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int ans=binarysearch(arr,0,arr.length-1,3);
        System.out.println(ans);
    }

}
