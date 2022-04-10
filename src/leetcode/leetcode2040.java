package leetcode;

import java.util.Arrays;

public class leetcode2040 {
    public static long kthSmallestProducts(int[] nums1, int[] nums2, long k) {
        long lb = (long) -1e10, rb = (long) 1e10;

        while (lb <= rb) {
            long dotProduct = (lb + rb) / 2;
            if (countNoOfElements(nums1, nums2, dotProduct) < k)
                lb = dotProduct + 1;
            else
                rb = dotProduct - 1;
        }

        return rb;
    }

    private static long countNoOfElements(int[] nums1, int[] nums2, long dotProduct) {
        long count = 0;
        for (int ele : nums1) {
            if (ele >= 0) {
                int li = 0, ri = nums2.length;
                while (li < ri) {
                    int mid = (li + ri) / 2;
                    if ((long) ele * nums2[mid] < dotProduct) li = mid + 1;
                    else ri = mid;
                }

                count += li;
            } else {
                int li = 0, ri = nums2.length;
                while (li < ri) {
                    int mid = (li + ri) / 2;
                    if ((long) ele * nums2[mid] >= dotProduct) li = mid + 1;
                    else ri = mid;
                }

                count += nums2.length - li;
            }
        }

        return count;
    }


    public static long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long[] ansarr=new long[nums1.length*nums2.length];
        int s=0;

        for (int i=0;i<nums1.length;i++)
        {
            for (int j=0;j< nums2.length;j++)
            {
                long ans=(long) nums1[i]* nums2[j];
                ansarr[s]=ans;
                s++;

            }
        }
        Arrays.sort(ansarr);


        return  ansarr[(int) k-1];


    }

    public static void main(String[] args) {
        int[]  nums1 = {-100000,100000},nums2={-100000,100000};int k = 1;
     //   long ans=kthSmallestProduct(nums1,nums2,k);
        long an=kthSmallestProducts(nums1,nums2,k);
        System.out.println(an);
      //  System.out.println(ans);

    }
}
