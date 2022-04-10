package leetcode;

import java.util.HashSet;

public class findkthOccurnene {
public  static  int  nthKthOcuurence(int[] arr)
{
    HashSet<Integer> hashSet=new HashSet<>();
    hashSet.add(1);
    hashSet.add(1);

    int count=1;
    for (int i=1;i<arr.length;i++)
    {
        if (arr[i]==arr[i-1])
            count++;
    }
return  count;
}

    public static void main(String[] args) {
int[] arr={1,2,3,3,3,3,5};
int ans=nthKthOcuurence(arr);
        System.out.println(ans);


    }
}
