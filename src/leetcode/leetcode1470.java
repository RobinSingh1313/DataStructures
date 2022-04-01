package leetcode;

import java.util.Arrays;

public class leetcode1470 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int a = 0;
        int b = n;
        int[] ans = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                ans[i] = nums[a];
                a++;
            } else {
                ans[i] = nums[b];
                b++;
            }

        }
        System.out.println(Arrays.toString(ans));
    }
}
