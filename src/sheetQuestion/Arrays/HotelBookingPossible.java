package sheetQuestion.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HotelBookingPossible {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int n) {
        Collections.sort(arrive);
        Collections.sort(depart);

return false;

    }
    public  static  boolean  func(ArrayList<Integer> arrive, ArrayList<Integer> depart, int n)
    {
        boolean ans=false;
        for (int i=1;i<arrive.size();i++)
        {
            int a=depart.get(i-1);
            int b=arrive.get(i);
            if(depart.get(i-1)>arrive.get(i))
            {
                n--;
            }

        }
        if (n<=0)
        {
            ans=true;

        }else
        {
            ans=false;
        }
        if (ans==true)
        {
            return  false;

        }else {
            return true;
        }

    }

    public static void main(String[] args) {
        int[]  A = { 9, 47, 17, 39, 35, 35, 20, 18, 15, 34, 11, 2, 45, 46, 15, 33, 47, 47, 10, 11, 27};
      int[]  B = {32, 82, 39, 86, 81, 58, 64, 53, 40, 76, 40, 46, 63, 88, 56, 52, 50, 72, 22, 19, 38 };
        Arrays.sort(A);
        Arrays.sort(B);
        int C = 16;
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();

        for (int k:A)
            a1.add(k);
        for (int k:B)
            a2.add(k);

        boolean ans=func(a1,a2,C);
        System.out.println(ans);
    }
}
