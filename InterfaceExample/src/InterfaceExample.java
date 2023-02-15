interface I1
{
    int a =15;          //public void static integer
    void show();        //public void abstract show()
}

interface I2
{
    int b=10;
}

class A implements I1, I2
{
    public void show()
    {
        System.out.println("The Sum Of " + a + " And " + b + " Is " + (a + b));
    }
}
public class InterfaceExample
{
    public static void main(String[] args)
    {
        A a = new A();
        a.show();
    }
}
