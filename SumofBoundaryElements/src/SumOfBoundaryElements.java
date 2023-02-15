import java.util.Scanner;

public class SumOfBoundaryElements
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a[][],n,m,sum=0,i,j;

        System.out.println("Enter The Number Of Rows");
        n=s.nextInt();

        System.out.println("Enter The Number Of Columns");
        m=s.nextInt();

        a=new int[n][m];

        System.out.println("Enter Elements Into The Array");

        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=s.nextInt();
            }
        }

        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if((i==0)||(i==n-1))
                {
                    sum=sum+a[i][j];
                }
                if((i!=0)&&(i!=(n-1)))
                {
                    if((j==0)||(j==(n-1)))
                    {
                        sum=sum+a[i][j];
                    }
                }
            }
        }

        System.out.println("The Sum Of Boundary Elements Of The Array Is "+sum);
    }
}
