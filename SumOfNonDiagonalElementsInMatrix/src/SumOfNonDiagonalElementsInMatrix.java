import java.util.Scanner;

public class SumOfNonDiagonalElementsInMatrix
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a[][],n,m,sum=0;

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
                    continue;
                }
                if((i+j)==n-1)
                {
                    continue;
                }
                sum=sum+a[i][j];
            }
        }


        System.out.println("Sum Of All Non Diagonal Elements Is: "+sum);

    }
}
