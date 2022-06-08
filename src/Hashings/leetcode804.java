package Hashings;

import java.util.HashSet;

public class leetcode804 {
    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};

        HashSet<String> hash=new HashSet<>();
        String[] arr=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0;i<words.length;i++)
        {
            String text="";
            for(int j=0;j<words[i].length();j++)
            {
                text+=arr[words[i].charAt(j)-'a'];



            }
            hash.add(text);
        }
        System.out.println();
    }
}
