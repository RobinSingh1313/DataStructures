package leetcode;

import java.util.HashSet;
import java.util.Set;

public class leetcode929 {
    public static int numUniqueEmails(String[] emails) {
HashSet<Character> hashSet=new HashSet<>();

        Set<String> set = new HashSet<>();
        for(String addr : emails) {
            String[] parts = addr.split("@");
            parts[0] = parts[0].replaceAll("\\.", "");
            set.add(parts[0].split("\\+")[0]+"@"+parts[1]);
        }
        return set.size();

    }

    public static void main(String[] args) {
        String[] arr={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int ans=numUniqueEmails(arr);
        System.out.println(ans);


    }
}
