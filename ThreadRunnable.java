// Runnable interface
class FirstProcessRunnable implements Runnable
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
class SecondProcessRunnable implements Runnable
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
class ThreadRunnable
{
    public static void main(String[] args) 
    {
        FirstProcessRunnable fpr = new FirstProcessRunnable();
        SecondProcessRunnable spr = new SecondProcessRunnable();
        
        Thread fp = new Thread(fpr);
        Thread sp = new Thread(spr);
        fp.start();
        try{Thread.sleep(5);} catch(Exception e){}
       sp.start();
    }
}