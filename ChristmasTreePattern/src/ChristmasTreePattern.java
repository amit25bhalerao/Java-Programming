import java.util.Scanner;

public class ChristmasTreePattern
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,k,l,n;

        System.out.println("Enter The Value Of N Upto Which You Wish ToPrint The Pattern");
        n=s.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }

            for(k=1;k<i;k++)
            {
                System.out.print("\\");
            }

            System.out.print("|");

            for(k=1;k<i;k++)
            {
                System.out.print("/");
            }

            for (k=n-i;k>=1;k--)
            {
                System.out.print(" ");
            }

            System.out.println();
        }

        for(i=1;i<=5;i++)
        {
            for(j=n-2;j>=1;j--)
                System.out.print(" ");

            for(k=1;k<=3;k++)
                System.out.print("|");
            System.out.println();
        }

        for(i=1;i<=n+2;i++)
        {
            if(i<=n-2)
                System.out.print(" ");

            if((i>=(n-2))&&(i<n))
                System.out.print("/");

            if((i>n))
                System.out.print("\\");
        }

    }
}
