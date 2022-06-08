package Hashings;

import java.util.HashMap;
import java.util.Iterator;

public class leetcode1941 {
    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hash=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char letter=s.charAt(i);
            hash.put(letter,hash.getOrDefault(letter,0)+1);


        }
        Iterator<Character> iterator=hash.keySet().iterator();
        int nas=0;
        while (iterator.hasNext())
        {
            char key= iterator.next();
            int value=hash.get(key);
            if(nas!=0 && nas!=value)
            {
                return false;

            }

            if(nas==0)
            {
                nas=value;
            }


        }

        return true;

    }

    public static void main(String[] args) {
        String text="abacbc";
    }
}
