package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class CountofPairs {


    public static int solve(ArrayList<Integer> A, int B) {

        int ans=0;
        int j=0;
        int res=0;
        for(int i=0;i<A.size();i++)
        {
            res+=A.get(i);
            if(res==B)
                ans++;
            else if(res<B)
                continue;
            else if(res>B) {
                res=res-A.get(j);
                if(res==B)
                    ans++;
                j++;
            }



        }

        return  ans;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        int po= (int) Math.pow(71045970,41535484);
        po=po%64735492;
        System.out.println(po);
        int B=2;


    }
}
