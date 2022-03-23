package Scaler;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
/*
10
138613
359664
672448
446486
496
606234
738982
8128
484512
513847

 */

        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int sum=0;
           int  i=1;
            int n=sc.nextInt();
            while(i <= n/2) {
                if (n % i == 0) {
                    sum = sum + i;
                }
                i++;
            }
                if(sum==n)
                {
                    System.out.println("YES");
                }
                else
                    System.out.println("NO");
            }


    }
}