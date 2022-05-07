package BitsManipulations;

public class leetcode1486 {
    public static int xorOperation(int n, int start) {

        int ans=start;
        for(int i=0;i<n-1;i++)
        {

            start=start+2;
            ans^=start;
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans=xorOperation(4,3);
        System.out.println(ans);
    }

}
