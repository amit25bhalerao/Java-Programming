import java.util.Scanner;

public class Thread3 extends Thread
{
    Scanner s  = new Scanner(System.in);

    int x;

    public Thread3(int n)
    {
        this.x=n;
    }

    public void run()
    {
        System.out.println("Thread 3: Cubed Number = "+x*x*x);
    }
}
