import java.util.Scanner;

public class InvertedRightAngledTriangle
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,n,temp;
        char ch;

        System.out.println("Enter The Character Whose Pattern Is To Be Displayed ");
        ch=s.nextLine().charAt(0);

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        temp=n;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=temp;j++)
            {
                System.out.print(ch);
            }
            temp=n-i;
            System.out.println();
        }
    }
}
