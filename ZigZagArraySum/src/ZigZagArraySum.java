import java.util.Scanner;

public class ZigZagArraySum
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a[][],n,m,sum=0;

        System.out.println("Enter The Number Of Rows In Matrix");
        n=s.nextInt();

        System.out.println("Enter The Number Of Columns In Matrix");
        m=s.nextInt();

        a=new int[n][m];

        System.out.println("Enter Elements Into The Array");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((i==0)&&(j<=(n-2)))
                {
                    sum=sum+a[i][j];
                }

                if((i+j==(n-1)))
                {
                    sum=sum+a[i][j];
                }

                if((i==n-1)&&(j>0))
                {
                    sum=sum+a[i][j];
                }
            }
        }

        System.out.println("The Sum Of Zig Zag Elements In Array Is "+sum);
    }
}
