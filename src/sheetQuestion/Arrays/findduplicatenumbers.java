package sheetQuestion.Arrays;

import java.util.HashSet;

public class findduplicatenumbers {
    public static int findDuplicate(int[] arr) {
        HashSet<Integer> hashSet=new HashSet<>();


        for(int i=0;i<arr.length;i++)
        {
            int index=Math.abs(arr[i])-1;
            if(arr[index]<0)
                return index+1;
            arr[index]=-arr[index];
        }





        return  0;
    }
    public static void main(String[] args) {
       int[] nums = {1,3,4,2,2};
       int a=findDuplicate(nums);
        System.out.println(a);

    }
}
