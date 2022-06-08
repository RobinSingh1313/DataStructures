package BitsManipulation.Videos;

import java.util.Scanner;

public class CheckithbitSetorNot {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bit=sc.nextInt();
        if((n & (1<<bit)) ==0)
        {
            System.out.println("No");
        }else {
            System.out.println("yes");
        }



    }
}
