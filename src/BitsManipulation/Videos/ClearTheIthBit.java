package BitsManipulation.Videos;

import java.util.Scanner;

public class ClearTheIthBit {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int bit =sc.nextInt();

        int mask=~(1<<bit);
        System.out.println((no & mask));

        //000100



    }
}
