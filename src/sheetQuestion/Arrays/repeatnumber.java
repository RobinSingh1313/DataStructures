package sheetQuestion.Arrays;

import java.util.*;

public class repeatnumber {
    public  static  int repeats(List<Integer> a)
    {
        int value=-1;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int k:a)
        {
            hashMap.put(k,hashMap.getOrDefault(k,0)+1);

        }
        for (int k: hashMap.values())
        {
            if(a.size()/3<k)
            {
               value=k;
            }
        }
        if(value==-1)
        {
            return -1;
        }else {
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {

                // if give value is equal to value from entry
                // print the corresponding key
                if (entry.getValue() == value) {
                    return entry.getKey();
                }
            }
        }


        return value;
    }
    public static int repeatedNumber(final List<Integer> a) {
        Collections.sort(a);
        int times=a.size();
        int count=1;
        int max_value=-1;
        int currentvaluw=0;
        int max=0;
        System.out.println(times/3);
if(a.size()==1)
{
    return a.get(0);

}
        for (int i=1;i<times;i++)
        {
            if(Objects.equals(a.get(i), a.get(i - 1)))

            {
                currentvaluw=a.get(i);
                count++;
            }else
            {
                count=0;
            }

            if(count>max)
            {
                max_value=currentvaluw;
            }
            max=Math.max(count,max);
        }
        if(a.size()/3<max)
        {
            return  max_value;

        }else
        {
            max_value=-1;

        }

      return max_value;
    }

    public static void main(String[] args) {
        int[] arr={1 ,2 ,3 ,1 ,1};
        List<Integer> list=new ArrayList<>();
      //  1000441, 1000441, 1000994
      int[]  A = {  1000697, 1000110, 1000110, 1000671, 1000941, 1000304, 1000110, 1000742, 1000160, 1000558, 1000110, 1000110, 1000110, 1000650, 1000200, 1000110, 1000133, 1000110, 1000548, 1000002, 1000397, 1000110, 1000533, 1000724, 1000110, 1000882, 1000110, 1000515, 1000110, 1000110, 1000110, 1000181, 1000051, 1000110, 1000110, 1000644, 1000110, 1000301, 1000110, 1000040, 1000424, 1000336, 1000426, 1000244, 1000485, 1000439, 1000554, 1000110, 1000110, 1000497, 1000836, 1000760, 1000110, 1000135, 1000872, 1000110, 1000739, 1000242, 1000790, 1000110, 1000384, 1000110, 1000384, 1000110, 1000713, 1000110, 1000110, 1000048, 1000110, 1000172, 1000727, 1000502, 1000649, 1000830, 1000387, 1000953, 1000110, 1000640, 1000291, 1000612, 1000389, 1000110, 1000698, 1000462, 1000054, 1000110, 1000110, 1000181, 1000221, 1000408, 1000110, 1000905, 1000110, 1000532, 1000939, 1000110, 1000817, 1000388, 1000069, 1000110, 1000163, 1000453, 1000847, 1000908, 1000395, 1000574, 1000127, 1000132, 1000110, 1000110, 1000201, 1000689 };
       for (int k:A)
           list.add(k);

        int nas=repeatedNumber(list);
        repeats(list);

    }
}
