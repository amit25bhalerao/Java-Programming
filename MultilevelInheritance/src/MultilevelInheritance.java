class A
{
    int a;
    A(int a)
    {
        this.a=a;
    }
}

class B extends A
{
    int b;
    B(int a,int b)
    {
        super(a);
        this.b=b;
    }
}

class C extends B
{
    int c,add;
    C(int a,int b,int c)
    {
        super(a,b);
        this.c=c;
    }

    void sum()
    {
        add=a+b+c;
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        System.out.println("C: "+c);
        System.out.println("The Sum Of "+a+", "+b+" And "+c+" Is "+add);
    }
}
public class MultilevelInheritance
{
    public static void main(String[] args)
    {
        C c = new C(5,10,15);
        c.sum();
    }
}
