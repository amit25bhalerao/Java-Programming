import java.util.Scanner;

public class KShapePattern
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,n,temp;
        char ch;

        System.out.println("Enter The Character Whose Pattern Is To Be Printed");
        ch=s.nextLine().charAt(0);

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        temp=n;

        for(i=1;i<=n;i++)
        {
            for(j=temp;j>=1;j--)
            {
                System.out.print(ch+" ");
            }
            temp=temp-1;
            System.out.println();
        }

        for(i=2;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }

    }
}
