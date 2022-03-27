package sheetQuestion.Arrays;

public class Maxprofit {

    /*

    1st aprroach O(n^2)  brute force
    2 nd approach
     */
public  static  int singleprofit(int[] prices)
    {
        int profit=0;
        int i=0;
        for(int j=1;j <prices.length;j++)
        {
            if(prices[i]<prices[j])
            {
                profit=Math.max(prices[j]-prices[i],profit);

            }else
            {
                i=j;

            }


        }
        return profit;

    }
    public  static  int  secondapproach(int[] price )
    {
        int profit=0;
        for (int i=1;i<price.length;i++)
        {
            if(price[i]>price[i-1])
            {
               profit=profit+(price[i]-price[i-1]);

            }
        }
        return profit;
    }
    public  static  int maxProfit(int[] price,int start,int end)
    {
        if(end<=start)
            return 0;
        int profit=0;


        for(int i=start;i<=end;i++)
        {
            for(int j=start+1;j<=end;j++)
            {
                int currprofit=(price[j]-price[i])+maxProfit(price,j+1,end);
                profit=Math.max(currprofit,profit);
            }
        }
        return  profit;
    }


    public static void main(String[] args) {
        int[] price={1,5,3,8,12};
      //  int ans=maxProfit(price,0,price.length-1);
        //System.out.println(ans);
        //System.out.println("@ND A");
        //int anss=secondapproach(price);
   //     System.out.println(anss);
int arr[]={1,2,4,2,5,7,2,4,9,0,9};
singleprofit(arr);

    }


}
