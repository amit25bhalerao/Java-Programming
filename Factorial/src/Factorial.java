import java.util.Scanner;

public class Factorial
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int n,f=1;

        System.out.println("Enter The Number Whose Factorial Is To Be Found Out");
        n=s.nextInt();

        for(int i=n;i>=1;i--)
        {
            f=f*i;
        }

        System.out.println("The Factorial Of "+n+" Is "+f);
    }
}
