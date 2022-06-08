package BitsManipulations;

public class changeBit {

    public  static int minFlips(int a, int b, int c) {
        int count = 0;
        while(a>0 || b>0 || c>0){
            /*
            100
            010
            111
            ----
            11
             */
            if(((a&1)|(b&1))!=(c&1)){
                //427
                count+= (c&1)==1 ? 1 : (a&1)+(b&1);
            }
            a>>=1;
            b>>=1;
            c>>=1;
        }
        return count;


    }

    public static void main(String[] args) {
        System.out.println(4&1+6&1);
        int ans =minFlips(2,6,5);
        System.out.println(ans);
    }
}
