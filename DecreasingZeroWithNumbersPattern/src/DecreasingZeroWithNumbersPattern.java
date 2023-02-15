import java.util.Scanner;

public class DecreasingZeroWithNumbersPattern
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,k,n,temp;

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        temp=n;
        k=0;

        System.out.println(0);

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                k=temp;
                System.out.print(temp+" ");
                temp=temp+1;
            }

            System.out.print(0+" ");

            temp=k;

            for(j=1;j<=i;j++)
            {
                System.out.print(temp+" ");
                temp=temp-1;
            }

            for(j=1;j<=i;j++)
            {
                temp=n-j;
            }
            System.out.println();
        }
    }
}
