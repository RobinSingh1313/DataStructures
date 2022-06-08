package BitManipulation.hac;

public class SampleDEmo  implements  Runnable{
   private  Thread T;
   private  String threds;
   SampleDEmo(String threds)

   {
       this.threds=threds;
   }


    @Override
    public void run() {
   while (true)
       System.out.println(threds);
    }
    public  void  start()
    {
        if(T==null)
        {
            T=new Thread(this,threds);
            T.start();
        }
    }
}
