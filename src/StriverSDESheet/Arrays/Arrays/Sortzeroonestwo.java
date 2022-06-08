package StriverSDESheet.Arrays.Arrays;

import java.util.Arrays;

public class Sortzeroonestwo {


    public  static  void  pointertype(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp = 0;
        while (mid <= high) {
            //Input: nums = [2,0,2,1,1,0]
            switch (arr[mid]) {

                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,1,2,0,0,0,1};
        pointertype(arr);

        System.out.println(Arrays.toString(arr));
    }
}
