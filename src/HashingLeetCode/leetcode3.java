package HashingLeetCode;

import java.util.HashSet;

public class leetcode3 {
    public static int lengthOfLongestSubstring(String s) {
        int max=1;
        int finalmax=1;
        HashSet<Character> hash=new HashSet<>();
        // hash.add(s.charAt(i));
        int i=0,j=0;
        while(j<s.length())
        {
            char letter=s.charAt(i);
            char letters=s.charAt(j);

            if(hash.contains(letters))
            {
                hash.remove(letter);
                hash.add(letters);
                i++;
                j++;

                finalmax=Math.max(hash.size(),finalmax);

            }else
            {
                j++;
                hash.add(letters);
            }


        }
        return finalmax;

    }

    public static void main(String[] args) {
      String  s = "abcabcbb";
      int ans=lengthOfLongestSubstring(s);
        System.out.println(ans);

    }

}
