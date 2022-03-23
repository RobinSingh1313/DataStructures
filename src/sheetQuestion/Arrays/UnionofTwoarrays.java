package sheetQuestion.Arrays;

import java.util.HashSet;

public class UnionofTwoarrays {

    public  static  int unionOFTWOARRAYS(int[] arr,int[] arr1)
    {
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i:arr)
            hashSet.add(i);
        for (int j:arr1)
        {
            hashSet.add(j);

        }




        return hashSet.size();
    }

    public static void main(String[] args) {
        int[] arr={85, 25 ,1 ,32, 54, 6},arr1=
                { 85, 2 };
        int ans=unionOFTWOARRAYS(arr,arr1);
        System.out.println(ans);
    }
}
