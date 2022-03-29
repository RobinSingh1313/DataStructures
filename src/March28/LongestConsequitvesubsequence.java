package March28;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestConsequitvesubsequence {

    public  static  int onesApproachusingset(int[] arr)
    {
        if(arr.length<=1)
        {
            return  1;
        }
        HashSet<Integer> hashSet=new HashSet<>();
        for (int l:arr)
            hashSet.add(l);
        int count=0;
        for (int l:arr)
        {
            if(!hashSet.contains(l-1))
            {
                int currNum=l;
                int currstreak=1;
                while (hashSet.contains(currNum+currstreak))
                {
                    currstreak+=1;
                }
                count=Math.max(count,currstreak);

            }
        }
        return count;

    }
public  static  int  AnotherAprroach(int[] arr)
{
    if(arr.length<=1)
    {
        return  1;
    }

    HashMap<Integer,Boolean> hashMap=new HashMap<>();
    for (int k:arr)
        hashMap.put(k,true);
    for (int i=0;i< arr.length;i++)
    {
        if (hashMap.containsKey(arr[i]-1))
        {
            hashMap.replace(arr[i],false);
        }
    }
int count=0;
     for (int i=0;i<arr.length;i++)
     {
         if (hashMap.get(arr[i])==true)
         {
             int currNum=arr[i];
             int currstreak=1;
             while (hashMap.containsKey(currNum+currstreak))
             {
                 currstreak+=1;
             }
             count=Math.max(count,currstreak);

         }
     }
     return count;

}
    public static int consequitve(int[] arr)
    {
        Arrays.sort(arr);
        int count=1;
        int maxCount=Integer.MIN_VALUE;

        for(int i=1;i<=arr.length-1;i++)
        {
            int gap=arr[i]-arr[i-1];

            if(gap==1)
            {
                count++;
                maxCount=Math.max(maxCount,count);



            }else if(arr[i]==arr[i-1])
            {
                continue;
            }
            else{
                maxCount=Math.max(maxCount,count);count=1;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {
                6 ,6, 2, 3, 1 ,4 ,1 ,5 ,6, 2, 8 ,7 ,4 ,2 ,1 ,3 ,4 ,5 ,9 ,6
        };
        //2,6,1,9,4,5,3

        //1 2 3 4 5 6 9
    /*    int ans=consequitve(arr);
        System.out.println(ans);*/
        int ans=onesApproachusingset(arr);
        System.out.println(ans);

    }
}
