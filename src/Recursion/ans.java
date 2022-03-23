package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ans {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        System.out.println(32392	+29359 +28146);

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int item=sc.nextInt();
            int amount=sc.nextInt();
            int price[]=new int[item];

            for(int j=0;j<item;j++)
            {
                price[j]=sc.nextInt();


            }
            Arrays.sort(price);

            int total=0;
            int ans=0;
            for(int n=0;n<price.length;n++)
            {
                total=total+price[n];
                if(total<=amount)
                {
                    ans++;
                }else{

                    int temp=price[n];
                    total=total-price[n];


                    total=total+temp/2;
                    if(total<=amount)
                    {
                        ans++;
                        break;
                    }

                }



            }



        }
    }
}
