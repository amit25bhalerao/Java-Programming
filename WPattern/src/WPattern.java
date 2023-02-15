import java.util.Scanner;

public class WPattern
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,k,c,n,temp;
        char ch;

        System.out.println("Enter The Character Whose Pattern Is To Be Printed");
        ch=s.nextLine().charAt(0);

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        temp=n;

        for(i=n;i>=1;i--)
        {
            for(j=1;j<=(n-i);j++)
            {
                System.out.print(" "+" ");
            }

            for(k=1;k<2*temp;k++)
            {
                System.out.print(ch+" ");
            }

            c=2*(n-i); //c=2*(n-i)-1;

            for(j=1;j<=c;j++)
            {
                System.out.print(" "+" ");
            }

            for(k=1;k<2*temp;k++)
            {
                System.out.print(ch+" ");
            }

            temp=temp-1;

            System.out.println();
        }

    }
}
