// Thread - Lambda and Anonyms class
public class ThreadLambda
{
    public static void main(String[] args) 
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
    }
}