package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class multiplerotation {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();

        //12
        //54321
        //34512
        //12345
        //45123

        for(int i=0;i<B.size();i++)
        {
            int temp=B.get(i)%A.size();
            ArrayList<Integer> ars=new ArrayList<>();

            for(int j=temp;j<A.size();j++)
            {
                ars.add(A.get(j));


            }
            for(int j=0;j<temp;j++)
            {
                ars.add(j);
            }
            arr.add(ars);
        }

        return arr;

    }
    public
    static void main(String[] args) {
        System.out.println(2%5);
        int[] A = { 4, 74, 35, 16, 100, 77, 50, 51, 31, 29, 67, 12, 43, 31, 83, 2, 85, 85, 39, 27, 64, 86, 5 };
        int[]  B ={ 73, 70, 47, 19, 46, 25, 46, 4, 33, 33, 6, 31, 23, 19, 44, 53, 69, 30, 69, 89, 59, 25, 38, 82, 26, 8, 36, 3 };

        ArrayList<Integer> ar=new ArrayList<>();
        ArrayList<Integer> ars=new ArrayList<>();
        for (int k:A)
            ar.add(k);
        for (int k:B)
            ars.add(k);
        ArrayList<ArrayList<Integer>> arrayList=solve(ar,ars);
        for (ArrayList<Integer> arrr:arrayList)
        {
            System.out.println(arrr);
        }

    }


}
