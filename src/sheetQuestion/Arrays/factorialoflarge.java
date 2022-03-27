package sheetQuestion.Arrays;

import java.util.ArrayList;

public class factorialoflarge {
   public static ArrayList<Integer> factorial(int n)
   {
       ArrayList<Integer> arr=new ArrayList<Integer>();
       arr.add(1);
       int carry=0;
       int digit=0;
       int ans;
       for (int i=1;i<=n;i++)
       {
           for (int j=digit;j>=0;j--)
           {
                ans=arr.get(j)*i;//24//6
               if (carry==0)
               {
                   arr.set(digit,ans);
               }else {
                   while (ans > 0) {
                       int rem = ans % 10;//4
                       carry = rem;

                       ans = ans / 10;


                       if (carry > 0) {
                           arr.add(j, carry);
                           digit++;
                       }

                       carry = carry / 10;

                   }
               }


           }

       }
       return  arr;

   }
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<Integer>();
      ar=factorial(5);
        System.out.println(ar);

    }

}
