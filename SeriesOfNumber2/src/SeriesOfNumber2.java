import java.util.Scanner;

public class SeriesOfNumber2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,n;

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(2+" ");
            }

            if(i!=n)
                System.out.print(", ");
        }

    }
}
