package sheetQuestion.Arrays;

public class minmaxdifference {

    public  static  int getMinDiff(int[] arr,int n,int k)
    {
        int ans=arr[n-1]-arr[0];
        int  smallest=arr[0]+k;
        int  largest=arr[n-1]-k;
        int mi,ma;
        for (int i=0;i<n-1;i++)
        {
            mi=Math.min(smallest,arr[i+1]-k);
            ma=Math.max(largest,arr[i]+k);
            if (mi<0)
                continue;
            ans=Math.min(ans,ma-mi);

        }
return  ans;

    }
    public static void main(String[] args) {
       int K = 3, N = 5;
        int Arr[] = {3, 9, 12, 16, 20};
       int ans= getMinDiff(Arr,N,K);
        System.out.println(ans);

    }
}
