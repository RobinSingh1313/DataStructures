package sheetQuestion.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Greycode {
    public static List<Integer> grayCode(int n) {


        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> binaryString=Solution(n);
        for(int i=0;i<binaryString.size();i++)
        {
            String ans=binaryString.get(i);
            int decimal=Integer.parseInt(ans,2);
            list.add(decimal);


        }
        return list;

    }
    public static ArrayList<String> Solution(int n)
    {
        if(n==1)
        {
            ArrayList<String> bres=new ArrayList<>();
            bres.add("0");
            bres.add("1");
            return bres;

        }

        ArrayList<String> lres=Solution(n-1);
        ArrayList<String> mres=new ArrayList<>();


        for(int i=0;i<=lres.size()-1;i++)
        {
            String rstring=lres.get(i);
            mres.add("0"+rstring);


        }
        for(int i= lres.size()-1;i>=0;i--)
        {
            String rstring="1"+lres.get(i);
            mres.add(rstring);


        }
        return mres;
    }
    public static ArrayList<String> fun(int n)
    {
        if (n==1)
        {
            ArrayList<String> bres=new ArrayList<>();
            bres.add("0");
            bres.add("1");
            return  bres;
        }
        ArrayList<String> rres=fun(n-1);
        ArrayList<String> mres=new ArrayList<>();
        for (int i=0;i<rres.size();i++)
        {
            String rstr=rres.get(i);
            mres.add("0"+rstr);

        }
        for (int i= rres.size()-1;i>=0;i--)
        {
            String rstr=rres.get(i);
            mres.add("1"+rstr);

        }

        return mres;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ans=new ArrayList<>();
//ans=fun(3);
        ans= (ArrayList<Integer>) grayCode(3);
        System.out.println(ans);
    }
}
