class AB
{
    int a;
    AB(int b)
    {
        this.a=b;
    }

    public void show()
    {
        System.out.println("A: "+a);
    }
}

class B extends AB
{
    int z,sum;
    B(int a, int b)
    {
        super(a);
        this.z=b;
    }

    public void add()
    {
        sum=a+z;
        System.out.println("B: "+z);
        System.out.println("The Sum Of "+a+" And "+z+" Is "+sum);
    }
}

public class SingleLevelInheritance
{
    public static void main(String[] args)
    {
        B b = new B(5,10);
        b.show();
        b.add();
    }
}
