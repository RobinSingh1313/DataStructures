package BitManipulation.Question;

public class MedianofTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int start1=0;
        int start2=1;

        while(start1<nums1.length)
        {
            if(nums1[start1]>nums2[0])
            {
                int temp=nums1[start1];
                nums1[start1]=nums2[0];
                nums2[0]=temp;
            }
            start1++;
        }

        while(start2<nums2.length)
        {
            if(nums1[start2]>nums2[start2-1])
            {
                int temp=nums1[start2];
                nums1[start2-1]=nums2[start2];
                nums2[start2]=temp;
            }
            start2++;

        }

int ans=0;
        int len1=nums1.length;
        int firste=0;
        int sece=0;
        int len2=nums2.length;
        int mid=(len1+len2)/2;

        if((len1+len2)%2==0)
        {
            //1 2 3 4
            if(mid-1<=nums1.length)
            {
                firste=nums1[mid-1];

            }else {
                firste=nums2[nums1.length-mid-1];
            }
            if(mid<=nums1.length)
            {
                sece=nums1[mid];
            }else {
                sece=nums2[nums1.length-mid];

            }


            return (firste+sece)/2;

        }else {
            if (mid+1<=nums1.length)
            {
                firste=nums1[mid];

            }else {
                firste=nums2[nums1.length-mid];
            }
        }


        return firste;

    }

    public static void main(String[] args) {
        int[] arr={1,2};
        int[] arr1={3,4};
        double ans=findMedianSortedArrays(arr,arr1);
        System.out.println(ans);
    }
}
