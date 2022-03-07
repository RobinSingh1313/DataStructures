package Recursion;

import java.util.Scanner;

public class waysofmatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
      int ans=  noOfWays(n,m);
      System.out.println(ans);
    }

    private static int noOfWays(int n, int m) {
        if(n==1 || m==1)
            return 1;
        return  noOfWays(n-1,m)+noOfWays(n,m-1);
    }
}
