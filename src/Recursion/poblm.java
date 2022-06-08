package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class poblm {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        subrecursionCombinationSum(candidates,target,0,list,stack);
        return list;



    }

    private void subrecursionCombinationSum(int[] candidates, int target, int i, List<List<Integer>> list,Stack<Integer> st) {

        if (i==candidates.length)
        {
            int sum=0;
            List<Integer> list1=new ArrayList<>();
            for (int k:st)
            {
                sum+=k;
                list1.add(k);

            }
            if (sum==target)
                list.add(list1);
            return;
        }

        st.add(candidates[i]);
        subrecursionCombinationSum(candidates,target,i+1,list,st);
        st.pop();

        subrecursionCombinationSum(candidates,target,i+1,list,st);
        return;

    }

    public static void main(String[] args) {
        int[]  ar={1,2,3};
        int n= ar.length;;
        Stack<Integer> stack=new Stack<>();
        subrecursion(0,ar,n,stack);
        subsumrecursion(0,ar,n,stack,3);
    }
public  static  void  subsumrecursion(int i,int[] ar,int n,Stack<Integer> ds,int sum)

{
   // int sums=0;
    if(i==n)
    {
        int sums=0;
        ArrayList<Integer> ars=new ArrayList<>();

        for (int k:ds)
        {
            sums+=k;
            ars.add(k);
        }
        if(sums==sum)
        {
            System.out.println(ars);


        }

        return;

    }
    subsumrecursion(i+1,ar,n,ds,sum);

    ds.add(ar[i]);
    subsumrecursion(i+1,ar,n,ds,sum);
    ds.pop();

}
    private static void subrecursion(int i, int[] ar, int n, Stack<Integer> ds) {

        if(i==n){
            for (int k:ds)
                System.out.print(k+" ");
            System.out.println();
            return;
        }

        subrecursion(i+1,ar,n,ds);

        ds.add(ar[i]);
        subrecursion(i+1,ar,n,ds);
        ds.pop();

    }
}
