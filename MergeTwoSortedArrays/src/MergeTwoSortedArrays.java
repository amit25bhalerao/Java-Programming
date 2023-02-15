
import java.util.Scanner;

public class MergeTwoSortedArrays
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a[],b[],n1,n2,temp=0;

        System.out.println("Enter The Size Of Array1");
        n1=s.nextInt();
        System.out.println("Enter The Size Of Array2");
        n2=s.nextInt();

        b=new int[n2];
        a=new int[n1+n2];

        System.out.println("Enter "+n1+" Elements Into The Array");

        for(int i=0;i<n1;i++)
        {
            a[i]=s.nextInt();
        }

        System.out.println("Enter "+n2+" Elements Into The Array");

        for(int i=0;i<n2;i++)
        {
            b[i]=s.nextInt();
        }

        for (int i=0;i<n1+n2;i++)
        {
            if(i>=n1)
            {
                a[i]=b[temp++];
            }
        }

        System.out.println("The Merged Array Is Displayed Below");

        for(int i=0;i<n1+n2;i++)
        {
            System.out.println(a[i]);
        }
    }
}
