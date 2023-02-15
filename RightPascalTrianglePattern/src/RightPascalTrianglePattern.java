import java.util.Scanner;

public class RightPascalTrianglePattern
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,k,n;
        char ch;

        System.out.println("Enter The Character Whose Pattern Is To Be Displayed");
        ch=s.nextLine().charAt(0);

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }

        for(i=n-1;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }

    }
}
