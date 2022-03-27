package sheetQuestion.Arrays;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }
    }


   public static boolean isArmstrongNumber(int num) {
int sum = 0, rightDigit, temp;
temp = num;
while (temp != 0) {
rightDigit = temp % 10;
sum = sum + (rightDigit * rightDigit * rightDigit);
temp = temp / 10;
       }
if (sum == num) {
    return  true;
       }

       else {return false;}}
}