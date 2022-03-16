import java.util.ArrayList;

public class subarray {
    public static int solve(ArrayList<Integer> A) {
        int j=0;
        int sum=A.get(j);
        int count=0;
        for(int i=1;i<A.size();i++)
        {


            sum=sum+A.get(i);
            if(sum==0)
            {
                count++;
            }

            if(sum>0)
            {
                sum=sum-A.get(j);
                j++;
            }


        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(-3);

        int ans=solve(arrayList);
        System.out.println(ans);

    }
}
