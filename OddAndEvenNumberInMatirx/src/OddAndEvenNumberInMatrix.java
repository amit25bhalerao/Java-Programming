import java.util.Scanner;

public class OddAndEvenNumberInMatrix
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int n,i;

        System.out.println("Enter The Size Of The Matrix");
        n=s.nextInt();

        int a[]=new int[n];

        System.out.println("Enter "+n+" Elements Into The Array");

        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }

        System.out.println("The Even And Odd Numbers In The Given Array Are Displayed Below");

        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
                System.out.println("Even Number: "+a[i]);
            else
                System.out.println("Odd Number: "+a[i]);
        }
    }
}
