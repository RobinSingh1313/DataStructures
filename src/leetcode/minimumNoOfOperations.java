package leetcode;

import java.util.Arrays;

public class minimumNoOfOperations {
    /*
    Today task




****1476




*****1008
     */


    public static void main(String[] args) {
        String boxes = "110";
        char[] ch=boxes.toCharArray();
        int[] left=new int[boxes.length()];
        int count=ch[0]-'0';

        int[] right=new int[boxes.length()];

        for (int i=1;i<boxes.length();i++)
        {
            left[i]=left[i-1]+count;
            count+=ch[i]-'0';

        }
        int n=boxes.length();
        count=ch[n-1]-'0';

        for (int i=n-2;i>=0;i--)
        {
            right[i]=right[i+1]+count;
            count+=ch[i]-'0';


        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        int[] answer=new int[n];
        for (int i=0;i<n;i++)
        {
            answer[i]=left[i]+right[i];
        }


        System.out.println(Arrays.toString(answer));

    }





}
