package leetcode;

import java.util.HashSet;

public class leetcode17111 {
    //[2,7,11,15]

    public static int countPairs(int[] deliciousness) {
        HashSet<Integer> hashSet=new HashSet<>();
      int count=0;
      for (int i=0;i<deliciousness.length;i++)
      {
          for (int j=i+1;j<deliciousness.length;j++)
          {
              //2
              if(isPowerOfTwo(deliciousness[i]+deliciousness[j]))
              {
                  count++;


              }
          }
      }

return  count;
    }
   public static boolean isPowerOfTwo(int n)
    {
        if(n==0)
            return false;

        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==
                (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }

    public static void main(String[] args) {
        int[] deliciousness = {1,1,1,3,3,3,7};
        int ans=countPairs(deliciousness);
        System.out.println(ans);
    }
}
