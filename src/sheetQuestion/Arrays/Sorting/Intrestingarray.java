package sheetQuestion.Arrays.Sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;
import java.util.Stack;

public class Intrestingarray {
    public static String solve(ArrayList<Integer> A) {
        Stack<Character> stack=new Stack<>();

        int ans=0;
        HashSet<Integer> hash=new HashSet<>();
        String anss="yes";
        for(int k:A)
        {
            ans=ans^k;

        }
        while(ans!=0)
        {
            if(hash.contains(ans))
            {
                anss="No";
                return anss;
            }
            if(ans%2==0)
            {
                ans=ans/2;
                ans=ans^ans;
            }else
            {
                ans=ans/2;
                ans=(ans+1)^ans;
            }
            hash.add(ans);

        }

        return anss;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(9);
        ar.add(17);
        String ans=solve(ar);
        System.out.println(ans);


    }
}
