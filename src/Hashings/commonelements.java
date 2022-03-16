package Hashings;

import java.util.*;

public class commonelements {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        HashSet<Integer> hashSet=new HashSet<Integer>();
        HashSet<Integer> hashSets=new HashSet<Integer>();
        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for(int k:A)
            hashSet.add(k);
        for(int k:A)
            hashSets.add(k);

        for(int k:B)
        {
            if(hashSet.contains(k))
            {
                arrayList.add(k);
            }

        }
        return  arrayList;


    }

    public static void main(String[] args) {
        ArrayList<Integer> far=new ArrayList<>();
        ArrayList<Integer> seclist=new ArrayList<>();
        far.add(1);
        far.add(2);
        far.add(2);
        far.add(1);
        seclist.add(2);
        seclist.add(3);
        seclist.add(1);
        seclist.add(1);
        ArrayList<Integer> ans=solve(far,seclist);
        Collections.sort(ans);

        System.out.println(ans);


    }
}
