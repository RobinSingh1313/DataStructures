package sheetQuestion.Arrays;

public class massubarray {
public  static  long maxSub(int[] arr,int n)
{


   long maxsum=0;
   long currsum=0;
    for(int i=0;i<n;i++)
    {
        currsum=currsum+arr[i];
     maxsum=   Math.max(currsum,maxsum);
     if(currsum<0)
     {
         currsum=0;
     }
    }
    // Your code here
    return maxsum;
}
    public static void main(String[] args) {
    int[] arr={
            1 ,2 ,3 ,-2,5};
    int n=5;
    long ans=maxSub(arr,n);
        System.out.println(ans);

    }


}
