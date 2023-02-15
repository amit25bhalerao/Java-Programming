import java.util.Scanner;

class Motherboard
{
    static int port;

    public Motherboard(int ports)
    {
        this.port=ports;
    }

    class Ports
    {
        void show()
        {
            System.out.println("The MotherBoard Has "+port+" Ports In It");
        }
    }
}

public class NestedClass
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int p;

        System.out.println("Enter The Number Of Ports");
        p=s.nextInt();

        Motherboard m = new Motherboard(p);
        Motherboard.Ports po =m.new Ports();
        po.show();
    }
}
