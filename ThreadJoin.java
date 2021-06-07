// join method - to keep wait the main thread till the other threads completion
public class ThreadJoin
{
    public static void main(String[] args) throws Exception
    {
        Thread t1 = new Thread(() ->
            {
                for(int i =0; i<5; i++)
                {
                    System.out.println("1st process");
                    try{Thread.sleep(500);} catch(Exception e){}
                }
            });
        Thread t2 = new Thread(() ->
            {
                for(int i =0; i<5; i++)
                {
                    System.out.println("2nd process");
                    try{Thread.sleep(500);} catch(Exception e){}
                }
            });

        t1.start();
        try{Thread.sleep(10);} catch(Exception e){}
        t2.start();
        t1.join(); // join() helps to keep the main thread wait till other thread's completion
        t2.join(); 
        System.out.println(t1.isAlive());   // isAlive() used to check whether the thread is completed its process
        System.out.println(t2.isAlive()); 
        System.out.println("Completed...");
    }
}