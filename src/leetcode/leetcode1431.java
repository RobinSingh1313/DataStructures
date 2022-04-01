package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode1431 {
    public static void main(String[] args) {
     int[]   candies = {2,3,5,1,3};int extraCandies = 3;

        int max=Integer.MIN_VALUE;
        for(int k:candies)
        {
            max=Math.max(max,k);

        }
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            if(max<=(candies[i]+extraCandies))
            {
                list.add(i,true);
            }else
            {
                list.add(i,false);
            }
        }
        System.out.println(list);

    }
}
