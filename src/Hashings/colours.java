package Hashings;

import java.util.HashMap;
import java.util.Iterator;

public class colours {
    public  static int countPoints(String rings) {
        int count=0;
        HashMap<Integer,Character> hashMap=new HashMap<>();


       int i=0,j=1;
        HashMap<Character,Integer> hs=new HashMap<>();
       // hs.put(i,hs.getOrDefault(i,1)+1);
       while (j<rings.length())
       {
           char letter=rings.charAt(i);
           int no=rings.charAt(j);
           i+=2;
           j+=2;
           hashMap.put(no,letter);




       }
        Iterator<Integer> iterator=hashMap.keySet().iterator();
        while (iterator.hasNext())
        {
            int key= iterator.next();

        }
       return 0;


    }

    public static void main(String[] args) { String rings = "B0R0G0R9R0B0G0";
        int ans=countPoints(rings);
        System.out.println(ans);
    }
}
