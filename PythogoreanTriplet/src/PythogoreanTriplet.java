import java.util.Scanner;

public class PythogoreanTriplet
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
                for(k=j+1;k<n;k++)
                {
                    if((Math.pow(a[i],2)+Math.pow(a[j],2))==Math.pow(a[k],2))
                    {
                        System.out.print(++count+" Pyhtogorean Triplet: ");
                        System.out.println("{ "+a[i]+" "+a[j]+" "+a[k]+" }");
                    }
                }
            }
        }

        if(count==0)
        {
            System.out.println("No Pythogorean Triplets Found In The Given Array");
        }
    }
}
