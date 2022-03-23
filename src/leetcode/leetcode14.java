package leetcode;

public class leetcode14 {

    public  static String longestCommonPrefix(String[] strs) {
        String ans="";
        char newchar = 0;
        int j=0;
        while(j>=0){


            for(int i=1;i<strs.length;i++)
            {
                int len=strs[i].length();
                int lem2=strs[i-1].length();
                if(strs[i].length()-1<j || strs[i-1].length()-1<j)
                {
                    return ans;
                }
                newchar=strs[i-1].charAt(j);

                char c=strs[i].charAt(j);
                if(newchar!=c)
                {
                    return ans;


                }



            }
            j++;
            ans=ans+newchar;
        }


        return ans;

    }

    public static void main(String[] args) {
        String[] strs = {"flower","gflowersf","gflow"};
        String ans=longestCommonPrefix(strs);
        System.out.println(ans);
    }
}
