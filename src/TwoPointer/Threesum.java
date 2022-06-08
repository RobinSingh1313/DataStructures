package TwoPointer;

import java.util.*;

public class Threesum {

    public  static List<List<Integer>> threeSum(int[] arr)
    {
      Arrays.sort(arr);
      List<List<Integer>> list=new ArrayList<>();
      for (int i=0;i< arr.length-2;i++)
      {
          if(i==0 || ((i>0)&& arr[i]!=arr[i-1]))
          {
              int low=i+1;
              int hi= arr.length-1;
              int sum=2-arr[i];
              while (low<hi)
              {

                  if (arr[low]+arr[hi]==sum)
                  {
                      list.add(Arrays.asList(arr[i],arr[low],arr[hi]));
                      while (low<hi && arr[low]==arr[low+1])low++;
                      while (low<hi && arr[hi]==arr[hi-1])hi--;

                      low++;hi--;



                  }else if(arr[low]+arr[hi]<sum)low++;
                  else hi--;

              }

          }
      }
      return list;
    }

    public static void main(String[] args) {
        int[] nums={-1,2,1,-4};
        threeSum(nums);
        System.out.println(threeSum(nums));
    }
}
