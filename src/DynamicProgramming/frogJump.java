package DynamicProgramming;

public class frogJump {
    static  int right,left;
    static int[] arr={10,20,30,10};

    static  int[] dp=new int[arr.length+1];
public  static  int frogJump(int[] arr,int idx)
{
    if(idx==0)
        return 0;
    left=frogJump(arr, idx-1)+Math.abs(arr[idx]-arr[idx-1] );
    if(idx>1)
        right=frogJump(arr, idx-2)+Math.abs(arr[idx]-arr[idx-2] );
    return Math.min(left,right);

}

    public static void main(String[] args) {
        for (int i=0;i< dp.length;i++)
            dp[i]=-1;
   int res= frogJump(arr, arr.length-1);

   System.out.println(res);

    }
}
