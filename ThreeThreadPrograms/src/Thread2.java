import java.util.Scanner;

public class Thread2 extends Thread
{
    Scanner s  = new Scanner(System.in);

    int x;

    public Thread2(int n)
    {
        this.x=n;
    }

    public void run()
    {
        System.out.println("Thread 2: Squared Number = "+x*x);
    }
}
