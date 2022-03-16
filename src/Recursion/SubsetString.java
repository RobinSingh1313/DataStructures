package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetString {

    public static void main(String[] args) {
        String text="abc";
        List<String> list=new ArrayList<>();
        subsetString(text,"",list,0);
        System.out.println(list);
    }


    private static void subsetString(String text, String s,List<String> list,int i) {
        if(text.length()==i)
        {
            list.add(s);
            return;

        }

        //take
        char c=text.charAt(i);
        subsetString(text,s+c,list,i+1);

        //not take
        subsetString(text,s,list,i+1);

    }
}
