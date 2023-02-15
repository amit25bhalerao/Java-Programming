import java.util.Scanner;

public class FlyodsTriangle
{
    public static void main(String[]args)
    {
        Scanner s= new Scanner(System.in);

        int i,j,n,temp=1;

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(temp+" ");
                temp=temp+1;
            }

            System.out.println();
        }

    }
}
