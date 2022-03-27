package sheetQuestion.Arrays;

import java.util.Arrays;

public class Arraymissing {
    public  static  int missingArray(int[] arr)
    {
        int[] newarr =new int[arr.length];

        Arrays.sort(arr);
        //123

        /*

        0__-1
        1--2
        2--3
         */

        int j=1;
        int i=0;
      while(i<arr.length)
      {
          if(arr[i]==j)
          {
              j++;
          }
          i++;
      }

return  j;
    }

    public static void main(String[] args) {

        int[] arr={-3,4,-1,1};
        int ans=missingArray(arr);
        System.out.println(ans);

    }
}
