import java.util.Scanner;

public class ComputeAByB
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        double a,b,res;

        System.out.println("Enter First Number");
        a=s.nextDouble();

        System.out.println("Enter Second Number");
        b=s.nextDouble();

        res=a/b;

        if(b!=0.0)
        {
            System.out.println(a+" Divided By "+b+" Results In "+res);
        }

        else
        {
            throw new ArithmeticExpression("/ By Zero");
        }
    }
}
