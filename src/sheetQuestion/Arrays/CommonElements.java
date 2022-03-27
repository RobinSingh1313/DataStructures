package sheetQuestion.Arrays;

import java.util.ArrayList;

public class CommonElements {
  public  static   ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        // code here

        ArrayList<Integer> arr=new ArrayList<>();
      int i=0,j=0,k=0;
      int re=Math.max(A.length,B.length);
      re=Math.max(re,C.length);

      while(i<n1 && j<n2 && k<n3)
      {
          if(A[i]<B[j])
          {
              i++;

          }else if(A[i]>B[j])
          {
              j++;
          }else
          {
              if(i>0&& A[i]==A[i-1])
              {
                  i++;
                  continue;

              }
          }
          while (k<n3 && C[k]<B[j])
              k++;
          if(k<n3 &&C[k]==B[j])
          {
              arr.add(C[k]);
          }
          i++;
          j++;



      }
        return arr;
    }
    public static void main(String[] args) {
      int[]  A = {1, 5, 10, 20, 40, 80};
      int[] B = {6, 7, 20, 80, 100};
       int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
       ArrayList<Integer> arr=commonElements(A,B,C,6,5,8);
        System.out.println(arr);

    }
}
