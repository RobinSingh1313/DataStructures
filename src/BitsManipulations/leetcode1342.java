package BitsManipulations;

public class leetcode1342 {

    public int numberOfSteps(int num) {
        int steps=0;
        while(num!=0)
        {
            if((num & 1)==1)
            {
                num-=1;
            }else
            {
                num=num>>1;
            }
            steps++;

        }
        return steps;
    }
}
