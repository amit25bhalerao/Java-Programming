import java.util.Scanner;

public class ButterflyPattern
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int i, j, k, temp, c, n, l;
        char ch;

        System.out.println("Enter The Character Whose Pattern Is To Be Printed");
        ch = s.nextLine().charAt(0);

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n = s.nextInt();

        c=n/2;

        for (i = n; i >= 1; i--)
        {
            for (j = 1; j <=(n+1-i); j++)
            {
                System.out.print(ch + " ");
            }

            temp = (int) (Math.pow(i, 2) - Math.pow(i - 1, 2));
            for (k = 1; k <= temp; k++)
            {
                System.out.print(" " + " ");
            }
            for (j = 1; j <= n+1-i; j++)
            {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        if(n%2==1)
        {
            for(i=1;i<=(2*n)+1;i++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }

        for (i = 1; i <=n; i++)
        {
            for (j = 1; j <=(n+1-i); j++)
            {
                System.out.print(ch + " ");
            }

            temp = (int) (Math.pow(i, 2) - Math.pow(i - 1, 2));

            for (k = 1; k <= temp; k++)
            {
                System.out.print(" " + " ");
            }

            for (j = 1; j <= n+1-i; j++)
            {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
