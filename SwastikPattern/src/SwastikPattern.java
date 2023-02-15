import java.util.Scanner;

public class SwastikPattern
{
    public static void main(String[]args)
    {
        Scanner s= new Scanner(System.in);

        int i,j,c,n;
        char ch;

        System.out.println("Enter The Character Whose Pattern Is To Be Printed");
        ch=s.nextLine().charAt(0);

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        if(n%2==0)
            n=n+1;

        c=(n/2)+1;


        for(i=1;i<=1;i++)
        {
            for(j=1;j<=n;j++)
            {
                if((i==1)&&((j==1)||(j>=c)))
                    System.out.print(ch+" ");
                else
                    System.out.print(" "+" ");
            }
        }

        System.out.println();

        for(i=2;i<c;i++)
        {
            for(j=1;j<=n;j++)
            {
                if((j==1)||(j==c))
                    System.out.print(ch+" ");
                else
                    System.out.print(" "+" ");
            }

            System.out.println();
        }


        for(i=1;i<=1;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(ch+" ");
            }
        }

        System.out.println();

        for(i=c+1;i<=n-1;i++)
        {
            for(j=1;j<=n;j++)
            {
                if((j==c)||(j==n))
                    System.out.print(ch+" ");
                else
                    System.out.print(" "+" ");
            }

            System.out.println();
        }

        for(i=1;i<=1;i++)
        {
            for(j=1;j<=n;j++)
            {
                if((j<=c)||(j==n))
                    System.out.print(ch+" ");
                else
                    System.out.print(" "+" ");
            }
        }
    }
}
