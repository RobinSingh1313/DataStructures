package leetcode;

public class policemamThief {

    /*
     i can catch only one theif
     i can travel only k steps

     */



    public  static  int policeMan(char[] arr,int k)
    {
        boolean[] isvisited=new boolean[arr.length];
        int count=0;
        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]=='P')
            {
                int prev_element=i-k;
                if(!(prev_element <0))
                {
                    for (int j=i;j>prev_element ;j--) {
                        if (arr[j] == 'T' && isvisited[j]==false) {
                            isvisited[j] = true;
                            count++;
                        }
                    }

                }
                for (int j=i+1;j<=i+k && j<arr.length;j++)
                {
                    if(arr[j]=='T' && isvisited[j]==false)
                    {
                        isvisited[j]=true;
                        count++;
                }}




            }
        }

        return  count;
    }


    public static void main(String[] args) {
        char[] a={'T','T','P','P','T','P'};
        int ans=policeMan(a,2);
        System.out.println(ans);

    }
}
