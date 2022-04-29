package sheetQuestion.Arrays.Stack;

import java.util.Stack;

public class brackets {
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        boolean ans=true;
        for(int i=0;i<s.length();i++) {
            char character = s.charAt(i);
            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);

            } else {
                char a = stack.peek();

                if (character == ')' && a=='(' || character == '}' && a=='{'|| character == ']' && a=='[') {
                         stack.pop();


                }else {
                    return false;
                }


            }
        }
if(!stack.empty())
    return false;

        return ans;
    }

    public static void main(String[] args) {
       String s = "()";
        boolean ans=isValid(s);
        System.out.println(ans);
    }
}
