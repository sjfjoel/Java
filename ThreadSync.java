// Multithreading - Synchronized - used to the method that allows only one thread to process at a time

class Counter
{
    int count ;
    public synchronized void increase()  // used to allow the single thread to access at a time
    {
        count++;
    }
}
public class ThreadSync {
    public static void main(String[] args) throws Exception
    {
        Counter c = new Counter();
        Thread t1 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=0; i<10000; i++)
                {
                    c.increase();
                }
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=0; i<10000; i++)
                {
                    c.increase();
                }
            }    
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
           
            
    }
}
