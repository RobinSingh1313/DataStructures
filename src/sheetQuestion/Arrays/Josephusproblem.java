package sheetQuestion.Arrays;

public class Josephusproblem {

    /*
    next person should be dead
     */
    public  static  int newSolution(int n,int k)
    {


        return 0;
    }

    public static int solution(int n)
    {
        int higherpowwerof2=powerof2(n);
        int l=n-higherpowwerof2;
     return 2*l+1;

    }

    private static int powerof2(int n) {
        int i=1;
        while (i*2<=n)
        {
            i=i*2;
        }
        return i;
    }


    public static void main(String[] args) {
        int ans=solution(7);
        System.out.println(ans);



    }
}
