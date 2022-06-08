package Hashings;

import java.util.*;

public class leetcode1282 {


    public static void main(String[] args) {
       int[] groupSizes = {3,3,3,3,3,1,3};

        List<List<Integer>> res = new ArrayList<>();
        int n = groupSizes.length;
        List<Integer> arr[] = new ArrayList[n+1];
        for(int i = 1; i <= n; i++)
            arr[i] = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int x = groupSizes[i];
            arr[x].add(i);
            if(arr[x].size() == x){
                res.add(arr[x]);
                arr[x] = new ArrayList<>();

            }
        }

        System.out.println(res);
    }
}
