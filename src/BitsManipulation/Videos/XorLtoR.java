package BitsManipulation.Videos;

import java.util.Scanner;

public class XorLtoR {

    public  static int fun(int n)
    {


        if(n%4==0)
        {
            return n;
        }else if(n%4==1)
        {
            return 1;
        }else if(n% 4==2)
        {
            return n+1;

        }else if(n% 4==3)
        {
            return  0;
        }
        return 0;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int R=sc.nextInt();
        int ans=fun(R)^fun(L-1);
        System.out.println(ans);

    }
}
