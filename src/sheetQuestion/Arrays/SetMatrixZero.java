package sheetQuestion.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {
    /*

    1101
    1111
    1111
    1111
     */
    /*
    *
    * *
    * * *
    * * * *
    * * * * *
     */

    public static void setZeroes(ArrayList<ArrayList<Integer>> a)     {
        ArrayList<Integer> row=new ArrayList<>(a.size());
        ArrayList<Integer> col=new ArrayList<>(a.get(0).size());
int ro=a.get(0).size();
int co=a.size();

        for (int i=0;i<a.size();i++)
        {
           for (int j=0;j< a.get(0).size();j++)
            {
                if (a.get(i).get(j)==0)

                {
                    col.add(j,-1);
                    row.add(i,-1);

                }
            }
        }
        for (int i=0;i< a.size();i++ )
        {
            for (int j=0;j<a.get(0).size();j++)
            {
                if(row.get(i)==-1)
                {
                    a.get(i).set(j,0);

                    /*
                    0  0
                    0  0
                    0  0
                    0  0
                     */
                }
                if(row.get(j)==-1)
                {
                    a.get(i).set(j,0);
                }
            }
        }
/*
[[0,1,2,0],
[3,4,5,2],
[1,3,1,5]]



[[0,0,0,0],
[0,4,5,2],
[0,3,1,5]]

[[0,0,0,0],
[0,4,5,2],
[0,3,1,5]]
[[0,0,0,0]
,[0,4,5,0],
[0,3,1,0]]
 */



    }


    public static void main(String[] args) {
        int[][] arr={{1,1,1},
                {1,0,1},
                {1,1,1}};
        ArrayList<ArrayList<Integer>> row=new ArrayList<>();
        for (int i=0;i< arr.length;i++)
        {
            row.add(new ArrayList<>());
            for (int j=0;j<arr[0].length;j++)
        {
            row.get(i).add(arr[i][j]);
        }

        }

        setZeroes(row);
        System.out.println("a");
        System.out.println(row);
    }


}
