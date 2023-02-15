import java.util.Scanner;

public class AllPairsInArray
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a[],n,i,j;

        System.out.println("Enter The Size Of The Array");
        n=s.nextInt();

        a=new int[n];

        System.out.println("Enter "+n+" Elements Into The Array");

        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }

        System.out.println("All Possible Pairs Of Array Are Displayed Below");

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("("+ a[i]+","+a[j]+")");
            }
        }
    }
}
