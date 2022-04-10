package leetcode;

public class CODESTUDIO11 {


    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,4};
        int k=2;
        findKthElement(arr,k);

    }

    private static void findKthElement(int[] arr, int k) {
        binarysearch(arr,k,0,arr.length);


    }

    private static void binarysearch(int[] arr, int k, int start_index, int end_index) {
        int start_answer_index=-1,end_answer_index=-1;

        while (start_index<end_index)
        {

            int mid=(start_index+end_index)/2;
            if(arr[mid]==k)
            {
                if (start_answer_index==-1)
                    start_answer_index=k;
                if(end_answer_index==-1 && start_answer_index!=-1)
                    end_answer_index=k;
                System.out.println(start_answer_index);
                System.out.println(end_answer_index);
                return;


            }else if(arr[mid]>k)
            {
                binarysearch(arr,k,start_index,mid-1);

            }else {
                binarysearch(arr,k,mid+1,end_index);

            }


        }
    }
}
