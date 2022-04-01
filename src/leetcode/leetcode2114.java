package leetcode;

public class leetcode2114 {

    public static void main(String[] args) {

      String[]  sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max = 0;
        for (String s : sentences) {
            int x = s.indexOf(" "), count = 1;
            while (x != -1) {
                count++;
                x = s.indexOf(" ", x + 1);
            }
            max = Math.max(count, max);
        }

        System.out.println(max);
    }
}
