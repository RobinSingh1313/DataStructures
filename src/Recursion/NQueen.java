package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class NQueen {

   static boolean  Nqueens(int col, int[][] ars)
    {
        if (col==ars.length)        {
            for (int[] a:ars)
            {
                System.out.println(Arrays.toString(a));
            }
            return true;

        }



        for(int row=0;row<ars.length;row++)
        {
            if (isbooleanSafe(row,col,ars))
            {
                ars[row][col]=1;
                if (Nqueens(col + 1, ars))return true;
                ars[row][col]=0;
            }
        }
        return false;
    }

    private static boolean isbooleanSafe(int row, int col, int[][] ars) {
        for (int i=row,j=col;i>=0 && j>=0;i--,j--)
        {
            if (ars[i][j]==1)
                return false;

        }
        for (int i=row,j=col;i>=0 && j>=0;j--)
        {
            if (ars[i][j]==1)
                return false;

        }
        for (int i=row,j=col;i< ars.length && j>=0;i++,j--)
        {
            if (ars[i][j]==1)
                return false;

        }
        return  true;
    }


    public static void main(String[] args) {
        int[][] a=new int[4][4];
        String anss="1";
        System.out.println(anss.charAt(0));
      boolean ans=Nqueens(0,a);
        System.out.println(ans);


    }

}
