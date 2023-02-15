import java.util.Scanner;

public class DiamondPattern
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,k,n,temp;
        char ch;

        System.out.println("Enter The Character Whose Pattern Is To Be Printed");
        ch=s.nextLine().charAt(0);

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        temp=n-1;

        for(i=1;i<=n;i++)
        {
            for(j=temp;j>=1;j--)
            {
                System.out.print(" "+" ");
            }
            temp=temp-1;

            for(k=1;k<=i;k++)
            {
                System.out.print(ch+" ");
            }

            if(i==1)
                System.out.println();

            if(i!=1)
            {
                for(k=1;k<i;k++)
                {
                    System.out.print(ch+" ");
                }
                System.out.println();
            }
        }

        temp=n-1;

        for(i=1;i<=n-1;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" "+" ");
            }

            for(k=temp;k>=1;k--)
            {
                System.out.print(ch+ " ");
            }

            for(j=1;j<=temp-1;j++)
            {
                System.out.print(ch+" ");
            }

            System.out.println();
            temp=temp-1;
        }
    }
}
