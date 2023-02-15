import java.util.Scanner;
import java.lang.Math;

public class PowerOfTwo
{
    Scanner s = new Scanner(System.in);

    void calculate()
    {
        int n,c=0;
        double res=0;

        System.out.println("Enter The Number To Check Whether It Is A Power Of 2");
        n=s.nextInt();

        while(res<=n)
        {
            res=Math.pow(2,c);
            c=c+1;

            if(res==n)
            {
                System.out.println(n+" Is A Power Of 2");
                return;
            }
        }

        System.out.println(n+" Isn't A Power Of 2");
    }

    public static void main(String args[])
    {
        PowerOfTwo obj = new PowerOfTwo();
        obj.calculate();
    }
}
