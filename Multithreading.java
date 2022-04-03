public class Multithreading
{
    public static void main(String args[])
    {
        for(int i=0;i<5;i++)
        {
            MultithreadThing myThing=new MultithreadThing(i);
            //Thread myThread = new Thread(myThing);
            //myThread.star();     for second type
            //myThread.join();waits for the threads to execute keep inside try catch block
            //myThread.alive();to check alive
            myThing.start();
        }
    }
}
