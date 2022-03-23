package sheetQuestion.Arrays;

import java.util.Arrays;

public class movenegativeelements {
public  static void MoveNegativeElements(int[] arr)
{
    int low=0;
    int high= arr.length-1;
    while (low<high)
    {
        if(arr[low]>0)
        {
            int temp=arr[high];
            arr[high]=arr[low];
            arr[low]=temp;
            high--;
        }else
        {
            low++;
        }

    }

}


    public static void main(String[] args) {
        int[] arr={ -12, 11, -13, -5, 6, -7, 5, -3, -6};
        MoveNegativeElements(arr);
        System.out.println(Arrays.toString(arr));


    }


}
