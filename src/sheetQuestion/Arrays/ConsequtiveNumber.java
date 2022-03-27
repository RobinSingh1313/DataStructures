package sheetQuestion.Arrays;

import java.util.Arrays;

public class ConsequtiveNumber {

    public  static int findLongestConseqSubseq(int arr[], int N)
    {
        // add your code here
        Arrays.sort(arr);
        int start=0;
        int max=0;
        int same=0;
        int num=0;

        for (int i=1;i<arr.length;i++)
        {
            int gap=arr[i]-arr[i-1];
            if(gap==0 )
            {
                if(num!=arr[i])
                {
                    num=arr[i];
                    same++;
                    start=0;
                    continue;
                }

            }
            if(gap!=1)
            {
                max=Math.max(max,start+1);
                start=0;



            }
            if(start==0  && gap==1)
            {
                start++;
            }else if((start!=0 && (gap==1)) )
            {
                start++;
            }

        }
        if(same>0)
        {
            same=same-1;
        }

        return Math.max(start+1+
                same,max+same);

    }

    public static void main(String[] args) {
        int a[] = {8 ,8 ,9 ,9 ,3 ,4



        };

        int ans=findLongestConseqSubseq(a,20);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(ans);

    }
}
