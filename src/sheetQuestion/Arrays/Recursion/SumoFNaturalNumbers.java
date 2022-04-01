package sheetQuestion.Arrays.Recursion;

public class SumoFNaturalNumbers {
public  static  int sumOfNatural(int n)
{
    //base case
    if (n==0)
    {
        return 0;
    }
    return  n+sumOfNatural(n-1);

}



    public static void main(String[] args) {
        System.out.println(sumOfNatural(5));

    }
}
