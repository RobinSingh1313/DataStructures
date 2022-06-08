package BitManipulation;

import java.util.HashMap;

public class Amazon {
    static int min = Integer.MAX_VALUE;

    public static int MinumCost(String input1, int input2, String[] input3, int[] input4) {
        int i = 0;
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int k=0;k<input1.length();k++)
        {
            hashMap.put(input1.charAt(k), hashMap.getOrDefault(input1.charAt(k),0)+1);

        }
        UsingRecursionMode(input1, input2, input3, input4, i, "", 0);


        return min;

    }


    public static void UsingRecursionMode(String input1, int input2, String[] input3, int[] input4, int i, String ans, int cost) {
        if (i ==input2-1) {
            if (ans.equals(input1)) {
              min=  Math.min(cost, min);



            }
return;
        }
        //take

        ans += input3[i];
        cost += input4[i];

        UsingRecursionMode(input1, input2, input3, input4, i + 1, ans, cost);

        //not take
        int length = ans.length();
        int sl = input3[i].length();
       ans= ans.substring(0, length - sl);
        UsingRecursionMode(input1, input2, input3, input4, i+1 , ans, cost - input4[i]);


    }

    public static void main(String[] args) {
        String s="lockdown";

        int size=4;
        String[] arr={"lock","down","lo","ck"};
        int[] aarr={50,50,5,5};
       int n= MinumCost(s,size,arr,aarr);
        System.out.println(n);


    }
}