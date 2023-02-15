import java.util.Scanner;

public class MatrixInterchange
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,m,n,temp1=0,temp2=0;

        System.out.println("Enter The Number Of Rows");
        m=s.nextInt();

        System.out.println("Enter The Number Of Columns");
        n=s.nextInt();

        int a[][]=new int[m][n];

        System.out.println("Enter The Elements Into The 2D Array");

        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();
            }
        }

        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(j==0)
                    temp1=a[i][j];
                if(j==n-1)
                    temp2=a[i][j];
            }

            for(j=0;j<n;j++)
            {
                if(j==0)
                    a[i][j]=temp2;
                if(j==n-1)
                    a[i][j]=temp1;
            }
        }

        System.out.println("The Matrix After Interchanging Its First And Last Column Is Displayed Below");

        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
