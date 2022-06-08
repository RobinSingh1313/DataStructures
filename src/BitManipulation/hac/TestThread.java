package BitManipulation.hac;

public class TestThread {

    public static void main(String[] args) {
        SampleDEmo A=new SampleDEmo("A");
        SampleDEmo B=new SampleDEmo("B");
        B.start();
        A.start();
    }
}
