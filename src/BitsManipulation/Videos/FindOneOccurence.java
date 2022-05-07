package BitsManipulation.Videos;

public class FindOneOccurence {


    public static void main(String[] args) {
        int[] arr={2,1,2,5,6,5,7,7,6};
        int Xor=0;
        for (int i:arr)
        {
            Xor^=i;

        }
        System.out.println(Xor);
    }
}
