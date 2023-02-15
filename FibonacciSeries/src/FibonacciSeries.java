import java.util.Scanner;

public class FibonacciSeries
{
    static int fibonacci(int n)
    {
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int n,res;

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        System.out.println("The Fibonacci Series Upto "+n+" Terms Is Displayed Below");

        for(int i=1;i<=n;i++)
        {
            res=fibonacci(i);
            System.out.print(res+" ");
        }
    }
}
