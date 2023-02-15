
import java.util.Scanner;

abstract class Motherboard
{
    Scanner s = new Scanner(System.in);
    int port;

    Motherboard()
    {
        System.out.println("Enter The Ports Present In The MotherBoard");
        port=s.nextInt();
    }

    abstract void show();
}

class Implement extends Motherboard
{
    void show()
    {
        System.out.println("The MotherBoard Has "+port+" Ports In It");
    }
}


public class AbstractClassDemo
{
    public static void main(String[] args)
    {
        Implement i = new Implement();
        i.show();
    }
}
