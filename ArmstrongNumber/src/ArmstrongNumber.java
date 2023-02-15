import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int c=0,a,temp,n;

        System.out.println("Enter The Number To Check Whether It Is A Armstrong Number Or Not");
        n=s.nextInt();

        temp=n;

        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }

        if(temp==c)
            System.out.println(temp+" Is An Armstrong Number");
        else
            System.out.println(temp+" Is Not An Armstrong Number");
    }
}