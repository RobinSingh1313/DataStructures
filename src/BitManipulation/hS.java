package BitManipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class hS {
    public static int solve(ArrayList<Integer> A) {

        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int sum=0;
        for(int k:A)
        {
            sum+=k;
            hashMap.put(sum,hashMap.getOrDefault(sum,0)+1);

        }        Iterator<Integer> it=hashMap.keySet().iterator();
        while (it.hasNext())
        {
            int key=it.next();
            int val=hashMap.get(key);
            if(val>1)
            {
                return 1;
            }

        }
        return 0;


    }

    public static void main(String[] args) {
        int[] arr={1,-1};
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(1);
        ar.add(-1);
        int ans=solve(ar);
        System.out.println(ans);


    }
}
