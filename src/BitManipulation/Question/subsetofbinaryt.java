package BitManipulation.Question;

import java.util.ArrayList;

public class subsetofbinaryt {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ars=new ArrayList<>();
        int[] arr={3,2,4};
        ArrayList<Integer> aray=new ArrayList<>();



        for(int counter=0;counter<(1<< arr.length)-1;counter++)
        {


            for (int j=0;j< arr.length-1;j++)
            {

                if ((counter & (1<<j))==1) {


                    aray.add(arr[j]);
                }
            }


        }
        int Xor=0;
        for (int k:aray)
        {
            Xor^=k;
        }
        System.out.println(Xor);
    }
}
