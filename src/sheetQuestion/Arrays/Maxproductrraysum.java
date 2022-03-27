package sheetQuestion.Arrays;

public class Maxproductrraysum {
   public static long maxProduct(int[] arr, int n) {
        // code here
       int ma=arr[0];
       int mi=arr[0];
     for(int i=1;i<arr.length;i++)
     {
         if(arr[i]<0)
         {
             swap(ma,mi);
         }
         ma=Math.max(arr[i]*ma,arr[i]);
         mi=Math.min(arr[i]*ma,arr[i]);

     }
        return Math.max(ma,mi);
    }

    private static void swap(int ma, int mi) {
       int temp=ma;
       ma=mi;
       mi=temp;
    }

    public static void main(String[] args) {
        int[] arr={ 0, 9, 9};
        int n=3;
        long ans=maxProduct(arr,n);
        System.out.println(ans);
    }
}
