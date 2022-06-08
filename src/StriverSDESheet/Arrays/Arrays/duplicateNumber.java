package StriverSDESheet.Arrays.Arrays;

public class duplicateNumber {

    public  static  int tortoriseMethod(int[] arr)
    {
        int slow=arr[0];
        int fast=arr[0];
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];

        }while (slow!=fast);
        fast=arr[0];
        while (slow!=fast)
        {
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
int[] ar={2,5,9,6,9,3,8,9,7,1};
int ans=tortoriseMethod(ar);
        System.out.println(ans);
    }
}
