package sheetQuestion.Arrays;

public class coins {
public  static int counts=0;
    public  static  void coinselecct(int[] arr, int total,int i,int coins)
    {
       if(i== arr.length  || total==18)
       {
           return;
       }
        coinselecct(arr,total+arr[i],i+1,coins+1);
        coinselecct(arr,total-arr[i],i+1,coins);
        counts=Math.max(coins,counts);







    }

    public static void main(String[] args) {
        int[] arr={1,5,7};
        coinselecct(arr,0,0,0);
        System.out.println(counts);




    }
}
