import java.util.Scanner;

public class PyramidUsingNumbers
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int i, j, k, n, temp = 0, temp1;

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n = s.nextInt();
        temp1 = n - 1;

        for (i = 1; i <= n; i++)
        {
            for (j = temp1; j >= 1; j--)
            {
                System.out.print(" " + " ");
            }
            temp1 = temp1 - 1;

            for (k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
                if (i == 1)
                    System.out.println();
                temp = k;
            }

            if (i != 1)
            {
                for (j = temp - 1; j >= 1; j--)
                {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
