package sheetQuestion.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeintervals {
        public static int[][] merge(int[][] intervals) {
            Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

            List<int[]> newarrs=new ArrayList();
            int first=intervals[0][0],second=intervals[0][1];
            int j=0;
            for(int i=1;i<intervals.length;i++)
            {
                int temp1=intervals[i][0];
                int temp2=intervals[i][1];
                if(second>=temp1)
                {

                    second=Math.max(second,temp2);
                }else
                {
                    int[] ars=new int[2];
                    ars[0]=first;
                    ars[1]=second;
                    newarrs.add(ars);





                    first=temp1;
                    second=temp2;
                    j++;

                }


            }
            int[] ars=new int[2];
            ars[0]=first;
            ars[1]=second;
            newarrs.add(ars);



            return newarrs.toArray(new int[newarrs.size()][]);

        }

    public static void main(String[] args) {
        //{{1,3},{2,6},{8,10},{15,18}}
    //    int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        //[[1,4],[2,3]]
        //{1,4},{0,4}};
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        int row=intervals[0].length;
        int col=intervals.length;
        int[][] arr=new int[row][col];
        arr=merge(intervals);
        System.out.println(Arrays.deepToString(arr));
        System.out.println(row+""+col);


    }
}
