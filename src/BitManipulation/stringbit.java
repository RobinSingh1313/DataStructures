package BitManipulation;

import java.util.ArrayList;

public class stringbit {
    static int getMaxLength(   ArrayList<Integer> ar, int n)
    {

        int count = 0; //initialize count
        int result = 0; //initialize max

        for (int i = 0; i < n; i++)
        {

            // Reset count when 0 is found
            if (ar.get(i)== 0)
                count = 0;

                // If 1 is found, increment count
                // and update result if count becomes
                // more.
            else
            {
                count++;//increase count
                result = Math.max(result, count);
            }
        }

        return result;
    }

    public static Long solve(int A, ArrayList<Integer> B) {
        long count=getMaxLength(B,A);
        ArrayList<String> ar=new ArrayList<>();
        for (int i = 0; i <A; i++) {
            String res = "";
            for (int j = i; j <A; j++) {
                res += B.get(j) + "";
                ar.add(res);
            }
        }


A= (int) (A+count);
long formula=(A*(A-1))/2;
        System.out.println(formula);

        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>();
        int[]  A = {  0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1 };
        int b=76;

        for (int k:A)
            ar.add(k);

        long ans=solve(b,ar);
        System.out.println(ans);

    }
}
