package sheetQuestion.Arrays;

public class minandmax {
  static   int min,max;
    public static  void minandMax(int[] arr)
    {
        int i=0;
        if (arr.length%2==0)
        {
            min=Math.min(arr[0],arr[1]);
            max=Math.max(arr[0],arr[1]);
            i=i+2;

        }else {
            min=max=arr[0];
            i=i+1;


        }

        for ( ;i<arr.length-1;i=i+2)
        {
            min=Math.min(arr[i],min);
            min=Math.min(arr[i+1],min);


            max=Math.max(arr[i],max);
            max=Math.max(arr[i+1],max);


        }


    }

    public static void main(String[] args) {
        int[] arr={7,1,2,3,4,13};
        minandMax(arr);
        System.out.println("Min:"+min +" Max:"+max);

    }
}
