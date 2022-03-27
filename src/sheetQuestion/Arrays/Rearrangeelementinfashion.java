package sheetQuestion.Arrays;

import java.util.Arrays;

public class Rearrangeelementinfashion {
public  static  void rearrangement(int[] arr)
{
int positive=0,negative= arr.length-1 ;
while (positive<negative)
{
    if (arr[positive]>=0)
    {
        positive++;
    }
    if (arr[negative]<0)
    {
        negative--;
    }
    if(arr[positive]<0 && arr[negative]>=0)
    {
        int temp=arr[positive];
        arr[positive]=arr[negative];
        arr[negative]=temp;
positive++;
negative--;


    }
}
int i=0;
int j=arr.length-1;
while (i<j)
{
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i=i+2;
    j=j-1;
}
}
    public static void main(String[] args) {
        int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrangement(arr);
        System.out.println(Arrays.toString(arr));
    }
}
