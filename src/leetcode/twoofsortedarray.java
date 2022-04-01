package leetcode;

import java.util.Arrays;

public class twoofsortedarray {

    public  static  double fimd(int[] nums1,int [] nums2)
    {
        double ans;
        int[] temp=new int[nums1.length+nums2.length];
        int i=0;
        for( i=0;i<nums1.length;i++)
        {
            temp[i]=nums1[i];
        }


        for(int k=0;k<nums2.length;k++)
        {
            temp[i]=nums2[k];
            i++;
        }

        Arrays.sort(temp);

        if(temp.length%2==0)
        {

            int mid=temp.length/2;
            ans=((double)(temp[mid]+temp[mid-1])/2);



        }else
        {            int mid=temp.length/2;

            ans=temp[mid];
        }
        return ans;
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0.0;
        int i = 0;
        int length1 = nums1.length;
        int length2 = nums2.length;
        int total = length1 + length2;
        if (total <= 1) {
            if (nums1.length == 1) {
                return nums1[0];
            } else {
                return nums2[0];
            }
        }
        //4 5
        //1 3
        if (nums1.length < 1) {
            int mid = nums2.length/2;
            if (nums2.length % 2 == 0) {
                ans = ((double) (nums2[mid] + nums2[mid - 1])) / 2;
                return ans;
            } else {
                ans = nums2[mid];
                return ans;
            }
        } else if (nums2.length < 1) {
            int mid = nums1.length/2;
            if (nums1.length % 2 == 0) {
                ans = ((double) (nums1[mid] + nums1[mid - 1])) / 2;
                return ans;
            } else {
                ans = nums1[mid];
                return ans;
            }


        } else
        {
            while (i < nums1.length) {
                if (nums1[i] > nums2[0]) {
                    int temp = nums1[i];
                    nums1[i] = nums2[0];
                    nums2[0] = temp;

                } else {
                    i++;
                }
            }
            for (int ks=1;ks< nums2.length;ks++)
            {
                if(nums2[ks]<nums2[ks-1]) {
                    int temp = nums2[ks];
                    nums2[ks] = nums2[ks - 1];
                    nums2[ks - 1] = temp;
                }
            }
        }


        //     System.out.println(5%4);


        /*
        1. 2
        2. 1
        2   2
        */

        if(total%2==0)
        {
            int mid=((length1+length2)/2);
            if(mid>nums1.length)
            {
                ans= (((double) nums2[mid-nums1.length]+nums2[(mid-1)-nums1.length])/2);
                return ans;
            }else
            {
                int temp= nums1[(mid-1)%nums1.length];
                if(mid>nums1.length-1)
                {
                    ans= (((double) nums2[(mid)-nums2.length]+temp)/2);
                    return ans;
                }else
                {
                    ans= (((double)  nums1[(mid)-nums1.length]+temp)/2);

                }
            }


        }else
        {
            int mid=((length1+length2)/2);
            if(mid>=nums1.length)
            {
                return nums2[(mid+1)-nums2.length];
            }else
            {
                return nums1[mid];
            }

        }


        return ans;
}

    public static void main(String[] args) {
        int[] ar={3};

        for(int i=0;i<30;i+=3
        )
        {
            System.out.println("s");
        }

        int[] ars={3};
       int[] arr= {-2,-1};

int[] ar1s={4};
       double ans=findMedianSortedArrays(ars,arr);
     //double ans=fimd(ar,ars);
        System.out.println(ans);
    }


}

