package InterviewBit.Arrays;

import java.util.ArrayList;

public class pickfrombothsides {
    public static int solve(int A[], int B) {
        int i=0,j=A.length-1;
        int max=0;
        while(B>=1)
        {
            if(A[i]>A[j])
            {
                max=max+A[i];//5

                i++;

            }else
            {
                max=max+A[j];
                j--;
            }

        }
        return max;


    }
    public static void main(String[] args) {
      int  A[] ={ -533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961,
              -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447,
              726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747,
              -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35 };
      int  B = 48;
int ans=solve(A,B);
        System.out.println(ans);

    }
}
