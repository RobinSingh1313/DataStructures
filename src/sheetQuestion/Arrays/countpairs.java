package sheetQuestion.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class countpairs {
    public  static int getPairsCount(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int maxrepeatnum=1;
        int max=1;
        for(int i=1;i<arr.length;i++)
        {

            if(arr[i]==arr[i-1])
            {
                max++;
                maxrepeatnum= Math.max(max,maxrepeatnum);


            }else
            {
                maxrepeatnum= Math.max(max,maxrepeatnum);
                max=1;
            }
        }
        if(maxrepeatnum==1)
        {
            return 0;
        }
        maxrepeatnum=maxrepeatnum-1;
int asn= maxrepeatnum*2;

        return asn;
    }
    /*
    //1+3=4
    //2+2=4
    49 50
48 24 99 51 33 39 29 83 74 72 22 46 40 51 67
37 78 76 26 28 76 25 10 65 64 47 34 88 26 49 86
 73 73 36 75 5 26 4 39 99 27 12 97 67 63 15 3 92 90
     */


    public static  int bruteforceapproach(int[] arr,int k)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==k)
                    count++;
            }
        }
        return count;
    }
   public static int getPairsCounts(int[] arr, int n, int k) {
        // code here
       int count=0;

       HashMap<Integer,Integer> hashMap=new HashMap<>();
       for (int i:arr)
       {
           if (hashMap.containsKey(k-i))
           {
               count+=hashMap.get(i);


           }
           hashMap.put(i,hashMap.getOrDefault(i,0)+1);



       }
       return  count;
    }

    public  static  int hashsingapproach(int[]  arr,int k)
    {
        int count=0;
        /*
           for(int k:arr)
        {
            hashMap.put(k, hashMap.getOrDefault(k,0)+1 );

        }
         */
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i:arr)
        {
            if (hashMap.containsKey(k-i))
            {
                count+=hashMap.get(i);


            }
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);



        }
        return  count;


    }
    public static int shortcutapproach(int[] arr,int k)
    {
        int coun=0;
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i:arr)
            hashSet.add(i);
      for(int a:arr)
      {
          if(hashSet.contains(k-a))
          {
              coun++;
          }
      }
      return coun;
    }
    public static void main(String[] args) {
       int arr[] = {1, 1,1, 1};
      int n= bruteforceapproach(arr,6);
        System.out.println(n);
    //    int ns= shortcutapproach(arr,6);
      //  System.out.println(ns);

        int ks=getPairsCounts(arr,4,2);
        System.out.println(ks);

    }

}
