import java.lang.reflect.Array;
import java.util.Arrays;

public class FindUniqueElement {

    public static void main(String[] args) {
        int ans=0;
        int[] arr={4,2,1,3,1};
        //4

        for (int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        for (int i=1;i<arr.length;i++)
        {
            ans=ans^i;
        }
        System.out.println(ans);
        int result=0;
        for (int k:arr)
            result=result^k;
        System.out.println(result);
    }
}
