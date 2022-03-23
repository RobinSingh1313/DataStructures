package sheetQuestion.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class permuations {
public  static  void  permute(int [] arr, int i)
{
    if(i== arr.length-1)
    {
        System.out.println(Arrays.toString(arr));
        return;
    }
    //take
for (int j=i;j<arr.length;j++)
{
    swap(arr,j,i);
    permute(arr,i+1);
    swap(arr,j,i);

}





    //notake
}

    private static void swap(int[] arr, int j, int i) {
    int temp=arr[j];
    arr[j]=arr[i];
    arr[i]=temp;



    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        permute(arr,0);
    }
}
