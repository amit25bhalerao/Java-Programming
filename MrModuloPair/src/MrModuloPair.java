import java.util.Scanner;

public class MrModuloPair
{
    public static void main(String[]args)
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

        System.out.println("Enter The Value Of K");
        k=s.nextInt();

        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if((a[i]%a[j])==k)
                {
                    System.out.print(++count+" Modulo Pair: ");
                    System.out.println("{ "+a[i]+"%"+a[j]+" }");
                }
            }
        }

        if(count==0)
        {
            System.out.println("No Modulo Pairs Found In The Given Array");
        }
    }
}
