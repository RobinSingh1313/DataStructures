package Hashings;

import java.util.HashMap;
import java.util.Iterator;

public class leetcode11347 {

    public static void main(String[] args) {
        int count=0;
        String s="gctcxyuluxjuxnsvmomavutrrfb",t="qijrjrhqqjxjtprybrzpyfyqtzf";


        HashMap<Character,Integer> hash=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char text=s.charAt(i);
            hash.put(text,hash.getOrDefault(text,0)+1);
        }
        Iterator<Character> it=hash.keySet().iterator();
        for(int i=0;i<t.length();i++)
        {
            char character=t.charAt(i);
            if(hash.containsKey(character))
            {
                int value=hash.get(character);

                if(value<=0)
                {
                    count++;
                }
                hash.put(character,value-1);

            }else
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
