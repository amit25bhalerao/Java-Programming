import java.util.Scanner;

public class EquilibriumPointOfArray
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int eq,l,r,a[],n,suml=0,sumr=0;

        System.out.println("Enter The Size Of The Array");
        n=s.nextInt();
        a=new int[n];

        System.out.println("Enter "+n+" Elements Into The Array");

        for(int i =0;i<n;i++)
        {
            a[i]=s.nextInt();
        }

        for(eq=0;eq<n;eq++)
        {
            for(l=0;l<eq;l++)
            {
                suml=suml+a[l];
            }

            for (r=eq+1;r<n;r++)
            {
                sumr=sumr+a[r];
            }

            if(suml==sumr)
            {
                System.out.println("The Equilibrium Point Of The Given Array Is At Position "+(eq+1));
            }
            suml=sumr=0;
        }
    }
}
