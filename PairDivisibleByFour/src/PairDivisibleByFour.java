import java.util.Scanner;

public class PairDivisibleByFour
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a[], i, j, k, n, count=0;

        System.out.println("Enter The Size Of The Array");
        n = s.nextInt();
        a = new int[n];

        System.out.println("Enter " + n + " Elements Into The Array");

        for (i = 0; i < n; i++)
        {
            a[i]=s.nextInt();
        }

        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(((a[i]+a[j])%4)==0)
                {
                    System.out.print(++count+" Quadralet: ");
                    System.out.println("{ "+a[i]+" "+a[j]+" }");
                }
            }
        }

        if(count==0)
        {
            System.out.println("No Quadralets Found In The Given Array");
        }
    }
}
