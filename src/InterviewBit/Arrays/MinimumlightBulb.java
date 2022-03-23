package InterviewBit.Arrays;

import java.util.ArrayList;

public class MinimumlightBulb {
    public static int solves(int[] A, int B) {

        int count=0;
        int i=0,j=A.length-1;
        while(i<j)
        {
            int right=Math.min(i+B-1,j);
            int left=Math.max(i-B+1,0);
            boolean bulb=false;
            while(right>=left)
            {
                if(A[right]==1)
                {
                    bulb=true;
                    break;
                }
                right--;




            }
            if(!bulb)
                return -1;
            count++;
            i=right+B;
        }
        return count;



    }

    public static int solve(int[] A, int B) {

        int count=0;
        int i=0,j=A.length-1;
        boolean bulb=false;
        while(i<=j)
        {
            if(A[i]==0)
            {
                for(int k=i+B-1;k>=i;k--)
                {
                    if(A[k]==1)
                    {
                        bulb=true;
                        i=i+k-1;


                    }

                }
//A : [ 1, 1, 1, 1, 1, 0, 0 ]
//B : 3
                if(bulb==false)
                {
                    return -1;
                }else{
                    count++;
                }

            }else
            {
                i++;
            }




        }
        return count;
    }
    public static void main(String[] args) {
      int[]  A = {  1, 1, 1, 1, 1, 0, 0};
        int B = 3;
   //     int ns= solve(A,B);
        int ks=solves(A,B);

        System.out.println(ks);
    }
}
