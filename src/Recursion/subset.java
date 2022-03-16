package Recursion;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

public class subset {
    public static void main(String[] args) {
        String text="abc";
        subSets(text);

        permute(text,0,text.length()-1);

    }

    private static void subSets(String text) {
        Queue<Node> q=new LinkedList<>();
        int limit= (int) Math.pow(2,text.length());
        for (int i=0;i<limit;i++)
        {
            String newtext="";
            for(int j=limit-1;j>=0;j--)
            {
                int r=i%2;
                i=i/2;
                if(r==0)
                    newtext="_"+newtext;
                else newtext=text.charAt(j)+newtext;
            }
            System.out.println(newtext);
        }
    }

    private static void permute(String text, int l, int r) {
        if(l==r)
        {
            System.out.println(text);
            return;
        }
        for(int  i=l;i<=r;i++)
        {

        }
    }


}
