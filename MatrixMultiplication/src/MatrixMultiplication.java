import java.util.Scanner;

public class MatrixMultiplication
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,k,l,m,r1,r2,c1,c2,sum;

        System.out.println("Enter The Number Of Rows Present In The First Matrix");
        r1=s.nextInt();

        System.out.println("Enter The Number Of Columns Present In The First Matrix");
        c1=s.nextInt();

        System.out.println("Enter The Number Of Rows Present In The Second Matrix");
        r2=s.nextInt();

        System.out.println("Enter The Number Of Columns Present In The Second Matrix");
        c2=s.nextInt();

        if(c1!=r2)
        {
            System.out.println("Matrix Multiplication Not Possible");
            System.exit(0);
        }

        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];
        int c[][]=new int[r1][c2];

        System.out.println("Enter The Elements In Matrix A");

        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.println("Enter The Element At Position : Row("+i+")&Column("+j+")");
                a[i][j]=s.nextInt();
            }
        }

        System.out.println("Enter The Elements In Matrix B");

        for(l=0;l<r2;l++)
        {
            for(m=0;m<c2;m++)
            {
                System.out.println("Enter The Element At Position : Row("+l+")&Column("+m+")");
                b[l][m]=s.nextInt();
            }
        }

        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                sum=0;

                for(k=0;k<r2;k++)
                {
                    sum+=a[i][k]*b[k][j];
                }

                c[i][j]=sum;
            }
        }

        System.out.println("The Resultant Matrix C=AB Is Displayed Below");

        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
