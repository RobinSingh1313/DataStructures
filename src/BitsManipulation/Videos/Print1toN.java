package BitsManipulation.Videos;

import java.util.Scanner;

public class Print1toN {

    public static void main(String[] args) {
        /*

        1---> 1
        2 ---> 2
        3 --->

         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n%4==0)
        {
            System.out.println(n);
        }else if(n%4==1)
        {
            System.out.println(1);
        }else if(n% 4==2)
        {
            System.out.println(n+1);

        }else if(n% 4==3)
        {
            System.out.println(0);
        }


    }
}
