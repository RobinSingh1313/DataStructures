package sheetQuestion.Arrays;

public class MinSteps {


    public static void main(String[] args) {
        int N = 11;
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int pos=0,dest=0;
        int jump=0;

        for (int i=0;i<N;i++)
        {
            dest=Math.max(dest,arr[i]+i);
            //(0,1)//1
            //(1,4)//4//1
            //(4,7)


            if (pos==i)
            {
                pos=dest;
                jump++;

            }

        }
        System.out.println(jump);
        //Output: 3;
    }
}
