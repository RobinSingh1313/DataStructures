package Scaler;

public class smallestLengthSubarray {

    public static void main(String[] args) {
        String len = "test.email+alex@leetcode.com";
        int sub = len.length() - 13;
        if (len.endsWith(len.substring(sub))){
            System.out.println(len.substring(sub));

        }
        int[] arr={1,2,3,1,3,4,6,4,6,3};
        int si=-1,eni=-1;
        int max=0;
        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]==1)
            {
                si=i;
            }
            if(arr[i]==6)
            {
                eni=i;
            }
            if(si!=-1 && eni!=-1)
            {
               max= Math.max(max,(eni-si+1));
            }
        }
        System.out.println(max);
    }
}
