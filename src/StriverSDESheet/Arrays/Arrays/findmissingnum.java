package StriverSDESheet.Arrays.Arrays;

public class findmissingnum {
public  static  void findMissingNum(int[] arr)
{
    int x=0,y=0;
    int xor=0;
    for (int i:arr)
        xor^=i;

    /* Get the rightmost set bit in set_bit_no */
   int set_bit_no = xor & ~(xor - 1);
   /*


    */
    for (int i = 0; i < arr.length; i++) {
        if ((arr[i] & set_bit_no) != 0)
            /* arr[i] belongs to first set */
            x = x ^ arr[i];

        else
            /* arr[i] belongs to second set*/
            y = y ^ arr[i];
    }
    for (int i = 1; i <= arr.length-1; i++) {
        if ((i & set_bit_no) != 0)
            /* i belongs to first set */
            x = x ^ i;

        else
            /* i belongs to second set*/
            y = y ^ i;
    }

    System.out.println(x+""+y);
}

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 1, 6, 2 };
        System.out.println(4  & ~(4-1));
        findMissingNum(arr);

    }
}
