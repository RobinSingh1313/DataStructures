package BitManipulation.Question;

import java.util.ArrayList;
import java.util.List;

public class findnextBiggernumber {
    public static void main(String[] args) {
        String s1="218765";
        List<String> list=new ArrayList<>();

        finding(s1,list, "",0);
        System.out.println(list);
    }

    private static void finding(String s1, List<String> list,String s2,int i) {
        if(s1.length()==s2.length())
        {
            list.add(s2);

            return;
        }
        char c=s1.charAt(i);
        finding(s1,list,s2+c,i+1);
        s2=s2.substring(1);
        finding(s1,list,s2,i+1);



    }
}
