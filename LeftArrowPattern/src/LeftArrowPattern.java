import java.util.Scanner;

public class LeftArrowPattern
{
    public static void main(String[]args)
    {
        int i,j,k,n,z;
        char ch;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter The Character Whose Pattern Is To Be Displayed");
        ch=s.nextLine().charAt(0);

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        z=n-1;
        k=n;

        for(i=0;i<k;i++)
        {
            for(j=0;j<(n+(n-1));j++)
            {
                if (j < z)
                    System.out.print(" "+" ");
                else
                {
                    System.out.print(ch+" ");
                }
            }
            System.out.println();
            z = z - 1;
            n=n-1;
        }
    }
}
