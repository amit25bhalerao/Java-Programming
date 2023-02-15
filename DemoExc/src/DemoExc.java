import java.util.Scanner;

public class DemoExc
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int a,b,d,ar[],n;

        //ArithmeticException

        System.out.println("Enter First Number");
        a=s.nextInt();

        System.out.println("Enter Second Number");
        b=s.nextInt();

        try
        {
            System.out.println(a/b);
        }catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException: "+e.getMessage());
        }

        //ArraryOutOfBounds

        System.out.println("Enter The Size Of The Array");
        n=s.nextInt();

        ar=new int[n];

        System.out.println("Enter "+n+" Elements Into Array");

        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }

        try
        {
            System.out.println("Enter The Position Of Element You Wish To Print");
            d=s.nextInt();
            System.out.println(ar[d]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayOutOfIndexException: "+e.getMessage());
        }
    }
}
