package leetcode;

public class findtotalnumberofOccurenece {
    public  static  int   BinaryNumber(int arr[],int num)
    {
        int locate=-1;
        int s=0;
        int e= arr.length-1;
        while (s<=e)
        {
            int mid=s+(e-s)/3;
            if(arr[mid]==num)
            {
                locate=mid;
                e=mid-1;
            }else  if(arr[mid]<num)//4 8
            {
                s=mid+1;
                //e=arr.length;

            }else {
                e=mid-1;
            }
        }
        return locate;
    }
    public  static  int   BinaryNumbers(int arr[],int num)
    {
        int locate=-1;
        int s=0;
        int e= arr.length-1;
        while (s<=e)
        {
            int mid=s+(e-s)/3;
            if(arr[mid]==num)
            {
                locate=mid;
                s=mid+1;
            }else  if(arr[mid]<num)//4 8
            {
                s=mid+1;
                //e=arr.length;

            }else {
                e=mid-1;
            }
        }
        return locate;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,4,5,6,7};
        int m=2;
        int res=BinaryNumber(arr,m);
        int res1=BinaryNumbers(arr,m);

        System.out.println(res1-res+1);
    }
}
