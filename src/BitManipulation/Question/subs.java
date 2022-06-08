package BitManipulation.Question;

import java.util.HashSet;

public class subs {

public  static  boolean compare(int a,int b)
{
    if(a==b)
    {
        return true;
    }
    return false;
}
public  static  boolean compare(String a, String b)
{
    if(a.equals(b))
    {
        return true;
    }
    return false;
}

    public  static  boolean compare(int[] a, int[] b)
    {
        HashSet<Integer> hashSet=new HashSet<>();
        for(int k:a)
        {
            hashSet.add(k);

        }
        if(a.length== b.length)
        {
            boolean is_valid=true;
            for (int n:b)
            {
                if(!hashSet.contains(n))
                {
                    is_valid=false;

                }
            }
            return  is_valid;

        }
        return false;
    }
    public static String decryptMessage(String encryptedMessage) {

        String[] splited = encryptedMessage.split(" ");
       String res="";
        for (int i=splited.length-1;i>=0;i--)
        {
            res+=splited[i];
            res=res+" ";
        }

        String ans="";
        for (int i=0;i<res.length();i++)
        {
            char letter=res.charAt(i);

            if(letter>=48 && letter<=57 )
            {


                int no=letter;

                for (int k=1;k<Integer.parseInt(String.valueOf(letter));k++)
                {
                 ans+=res.charAt(i-1);
                }

            }else {
                ans+=letter;
            }


        }
        return  ans;
    }

    public static void main(String[] args) {
        String ans= "a197808  tea3n  of a3b4q2i";
     // String  string = String.valueOf(ans.split(" "));


        String res=decryptMessage(ans);
        System.out.println(res);
    }
}
