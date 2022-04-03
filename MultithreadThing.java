public class MultithreadThing extends Thread//implements Runnable instead of extends Thread for second type   other class can be extended  
{
    private int threadNumber;
    public MultithreadThing(int threadNumber)
    {
        this.threadNumber=threadNumber;
    }
    @Override
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println(i+"from thread"+threadNumber);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            
        }
    }
}
