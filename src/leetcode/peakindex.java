package leetcode;

public class peakindex {
    public static int peakIndexInMountainArray(int[] arr) {

        return getPeakIndex(arr);
    }

  static   int getPeakIndex(int[] arr){
        //If array has no elements
        if(arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length -1;
        int target = 0;

        while(start < end){

            int mid = start + (end-start)/2;
            //Comparing (mid) with (mid+1)
            target = arr[mid+1];

            if(target<arr[mid]){
                // you are in decreasing part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            }else if(target>arr[mid]){
                // you are in ascending part of array
                start = mid+1;
            }
        }
        //In the end start = end, so you can return either start or end
        return end;
    }

    public static void main(String[] args) {
        int[] arr={0,2,10,0};
       int ans= peakIndexInMountainArray(arr);
        System.out.println(ans);}
}
