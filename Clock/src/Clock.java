import java.util.Scanner;

public class Clock extends Thread
{
    static int hh,mm,ss;

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter The Time Upto Which You Wish To Run The Timer");
        System.out.print("Hours: ");
        hh=s.nextInt();
        System.out.print("Minutes: ");
        mm=s.nextInt();
        System.out.print("Seconds: ");
        ss=s.nextInt();

        if((hh<0)||hh>23||(mm<0)||(mm>59)||(ss<0)||(ss>59))
        {
            System.out.println("Invalid Input Entered..Program Will Terminate");
            System.exit(0);
        }

        System.out.println("Timer Has Started !");

        Hours h = new Hours();
        h.start();
    }
}
