import java.util.Scanner;

public class RemoveDuplicatesFromArray
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,a[],n;

        System.out.println("Enter The Size Of The Array");
        n= s.nextInt();

        a=new int[n];

        System.out.println("Enter "+n+" Elements Into The Array");

        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }

        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    a[j]=a[n-1];
                    n--;
                    j--;
                }
            }
        }

        System.out.println("The Array After Removing Duplicates Is Displayed Below");

        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }

    }
}