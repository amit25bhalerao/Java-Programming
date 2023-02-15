import java.util.Scanner;

public class MultipleAtEachLinePattern
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,k,n;

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        for(i=1;i<=n;i++)
        {
            k=i;
            for(j=1;j<=i;j++)
            {
                System.out.print(j*k+" ");
            }
            System.out.println();
        }
    }
}
