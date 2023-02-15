import java.util.Scanner;

public class LeadersInArray
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n,i,j,a[],temp=1;

        System.out.println("Enter The Size Of The Array");
        n=s.nextInt();
        a=new int[n];

        System.out.println("Enter "+n+" Elements Into The Array");

        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }

        System.out.println("The Leaders In The Array Are Displayed Below");

        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]<=a[j])
                    break;
            }

            if(j==n)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
