package BitManipulation.Question;

import java.util.Scanner;

public class Sol {
    public static String sum(String[] arr)
    {
        String ans="";
        int sum=0;
        if(arr.length>0)
        {
            if(arr[0].length()==1)
            {
                for (int i=0;i< arr.length;i++)
                {
                    String letters=arr[i];
                    char letter=letters.charAt(0);
                    if(letter>=48 && letter<=57)
                    {
                        sum+=Integer.parseInt(letters);

                    }
                }
                return  String.valueOf(sum);
            }

            for (int i=0;i< arr.length;i++)

            {
                ans+=arr[i];
            }

        }
        return ans;

    }


    public static void main(String[] args)
    {
        int k=010;
        char ak='a';
        System.out.println(k);
        System.out.println(ak*3);


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();


        }
        String ans=sum(arr);
        System.out.println(ans);

/* hello/* **** */

    }
}
