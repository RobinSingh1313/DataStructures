package sheetQuestion.Arrays.Recursion;

public class DecimalToBinary {


    public  static  String decimalToBinary(int num,String text)
    {//base case
        if(num==0)
            return text;


        text+=(num%2);


String ans=decimalToBinary(num/2,text);
        return  ans;
    }

    public static void main(String[] args) {
        String ans=decimalToBinary(233,"");
        System.out.println(ans);

    }
}
