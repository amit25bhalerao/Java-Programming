import java.util.Scanner;

public class SymmetricMatrix
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a[][],n,m,suml=0,sumr=0;

        System.out.println("Enter The Number Of Rows In The Array");
        n=s.nextInt();

        System.out.println("Enter The Number Of Columns In The Array");
        m=s.nextInt();

        a=new int[n][m];

        System.out.println("Enter Elements Into The Array");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=s.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j)
                {
                    suml=suml+a[i][j];
                }
                if((i+j)==n-1)
                {
                    sumr=sumr+a[i][j];
                }
            }
        }


        System.out.println("Sum Of Left Diagonal Matrix: "+suml);
        System.out.println("Sum Of Right Diagonal Matrix: "+sumr);

        if(suml==sumr)
        {
            System.out.println("The Given Matrix Is Symmetric In Nature");
        }
        else
        {
            System.out.println("The Given Matrix Is Not Symmetric In Nature");
        }
    }
}
