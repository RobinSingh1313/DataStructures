package BitsManipulations;

import java.util.Scanner;

public class HookUpTable {
    static int countSetBitsRec(int num)
    {
        int[] num_to_bits={0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4};
        int nibble = 0;
        if (0 == num)
            return num_to_bits[0];

        // Find last nibble
        nibble = num & 0xf;
        System.out.println(0xf);

        // Use pre-stored values to find count
        // in last nibble plus recursively add
        // remaining nibbles.
        return num_to_bits[nibble] + countSetBitsRec(num >> 4);
    }

    // Driver code


    public static void main(String[] args) {

        int num = 31;
        System.out.println(countSetBitsRec(num));


    }
}
