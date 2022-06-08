package TwoPointer;

public class TapRainWater {
public static  int fastaprroch(int[] height)
{

    int start=0;int end=height.length-1;
    int leftmax=0,rightmax=0,res=0;
    while(start<=end)
    {
        if(height[start]<=height[end])
        {
            if(height[start]>=leftmax) leftmax=height[start];
            else
                res+=leftmax-height[start];
            start++;
        }else
        {
            if(height[end]>=rightmax)rightmax=height[end];
            else
                res+=rightmax-height[end];
            end--;

        }
    }
    return res;


}
    public  static  int  bruteforce(int[] arr)
    {
        int units=0;
        for(int i=1;i< arr.length-1;i++)
        {
            int leftmax=Integer.MIN_VALUE;
            int j=0;
            int end=arr.length-1;
            while (j<i)
            {
              leftmax=  Math.max(arr[j],leftmax );
                j++;
            }
            int start=i+1;
            int right_max=Integer.MIN_VALUE;
            while (start<=end)
            {
              right_max=  Math.max(arr[start],right_max );
                start++;

            }
            int count=Math.min(leftmax,right_max)-arr[i];
            if ( count >=0)
                units+=count;


        }
        return  units;
    }
    public static void main(String[] args) {
int[]        height = {0,1,0,2,1,0,1,3,2,1,2,1};
int ans=fastaprroch(height);
        System.out.println(ans);

    }
}
