import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Thread1 extends Thread
{
    public void run()
    {

        int ran=0;
        Random r= new Random();

        for(int i=1;i<=10;i++)
        {
            ran=r.nextInt(10);
            System.out.println("Thread 1: Generated Number = "+ran);
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            Thread2 thread2 = new Thread2(ran);
            thread2.start();
            try
            {
                thread2.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            Thread3 thread3 = new Thread3(ran);
            thread3.start();
            try
            {
                thread3.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }
}