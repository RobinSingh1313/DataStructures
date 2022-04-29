package BitManipulation;

public class OnetoN {

/*

110010
   1
------   ----

 */
    public static void main(String[] args) {

        int bit=1101001;
        int mask=1<<2;
        bit=bit|mask;
        System.out.println(bit|mask);
        System.out.println(bit);
        System.out.println(1<<2);
        bit=bit&(1<<2);
        System.out.println(bit);

//1101101
 //  1000
// --------
 //
   //      */
        System.out.println(bit);

        int n=4;
        if((n& 2)==0)
        {
            System.out.println("Even");

        }else {
            System.out.println("Odd");
        }

    }
}
