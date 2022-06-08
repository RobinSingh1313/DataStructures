package BitsManipulation.Videos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class leetcode1684 {
    public static
    int solve(ArrayList<Character> A) {
        int flag=1;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<A.size();i++)
        {
            int num=A.get(i);
            if((!(A.get(i) >=65) && A.get(i)<=90) ||(!(A.get(i)>=97 && A.get(i)<=122)) ||(! (A.get(i)>=48 && A.get(i)<=57)))
            {
                flag=0;
            }
        }
        return flag;
    }

    public ArrayList<Character> to_lower(ArrayList<Character> A) {

        ArrayList<Character> arrayList=new ArrayList<>();
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)>=65 && A.get(i)<=90)
            {
                A.set(i, (char) (A.get(i)+32));
            }
        }
        return A;
    }

    public static void main(String[] args) {
       int[] A = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
       ArrayList<Character> arrayList=new ArrayList<>();
       for(int i=0;i<A.length;i++) {
           arrayList.add((char) A[i]);

       }
       int anss=solve(arrayList);
        System.out.println(anss);
      String  allowed = "fstqyienx";String[] words = {"n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"};

        HashSet<Character> hash=new HashSet<>();
        int count=0;
        for(int i=0;i<allowed.length();i++)
        {
            hash.add(allowed.charAt(i));
        }

        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                if(!hash.contains(words[i].charAt(j)))
                {
                    //System.out.println(count);

                    count--;
                    break;
                }

            }
            count++;
        }
        System.out.println(count);

    }
}
