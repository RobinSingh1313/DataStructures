package sheetQuestion.Arrays;

import java.util.Arrays;

public class sortzero {
    public  static  void  onestapproach(int[] arr)
    {
        //O(nlog(n))
        Arrays.sort(arr);

    }

    public  static  void  secondApproach(int[] arr)
    {
        //O(n)

        int zero=0,ones=0,two=0;
        for(int k:arr)
        {
            if(k==0){
                zero++;
            }else if(k==1) {
                ones++;
            }else {
                two++;
            }
        }
        for (int i=0;i< arr.length;i++)
        {
            if(zero>0)
            {
                arr[i]=0;
                zero--;
            }else if(zero==0 && ones>0)
            {
                arr[i]=1;
                ones--;
            }else
            {
                arr[i]=2;
                two--;
            }
        }
    }
    //dutch national flag
public  static  void  thirdapproach(int[] arr)
{
    int low=0;
    int mid=0;
    int high=arr.length-1;
    while (low<high)
    {
        if(arr[mid]==0)
        {
            int temp=arr[mid];
            arr[mid]=arr[low];
            arr[low]=mid;
            mid++;
            low++;
        }else if(arr[mid]==1)
        {
            mid++;
        }else {
            int temp=arr[high];
            arr[high]=arr[mid];
            arr[mid]=temp;
            high--;
        }
    }
;
}

    public static void main(String[] args) {
       int arr[]= {2 ,2 ,1 ,2 ,0};
       onestapproach(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("second Approach");
        secondApproach(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Third Approach");
        thirdapproach(arr);
        System.out.println(Arrays.toString(arr));



    }
}
