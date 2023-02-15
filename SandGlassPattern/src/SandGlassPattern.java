import java.util.Scanner;

public class SandGlassPattern
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,k,n;
        char ch;

        System.out.println("Enter The Character Whose Pattern Is To Be Printed");
        ch=s.nextLine().charAt(0);

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        for(i=1;i<=n;i++)
        {
            for(k=1;k<i;k++)
            {
                System.out.print(" ");
            }

            for(j=n;j>=i;j--)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }

        for(i=1;i<=n;i++)
        {
            for(j=(n-1);j>=i;j--)
            {
                System.out.print(" ");
            }

            for(k=1;k<=i;k++)
            {
                System.out.print(ch+" ");
            }

            System.out.println();
        }
    }
}
