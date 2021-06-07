// Thread
class FirstProcess extends Thread
{
    public void run()
    {
        for(int i =0; i<5; i++)
        {
            System.out.println("1st process");
            try{Thread.sleep(500);} catch(Exception e){}
        }
    }
}
class SecondProcess extends Thread
{
    public void run()
    {
        for(int i =0; i<5; i++)
        {
            System.out.println("2nd process");
            try{Thread.sleep(500);} catch(Exception e){}
        }
    }
}

public class ThreadClass {
    public static void main(String[] args)
    {
        FirstProcess fp = new FirstProcess();
        SecondProcess sp = new SecondProcess();

        fp.start();
        try{Thread.sleep(5);} catch(Exception e){}
        sp.start();
    }
}