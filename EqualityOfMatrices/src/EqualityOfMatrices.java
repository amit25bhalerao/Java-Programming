import java.util.Scanner;

public class EqualityOfMatrices
{
    public static void main(String[] args)
    {
        Equality eq = new Equality();
        Scanner s = new Scanner(System.in);

        int a[][],b[][],n1,m1,n2,m2;

        System.out.println("Enter The Number Of Rows In Matrix 1");
        n1=s.nextInt();

        System.out.println("Enter The Number Of Columns In Matrix 1");
        m1=s.nextInt();

        a=new int[n1][m1];

        System.out.println("Enter Elements Into First Array");

        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<m1;j++)
            {
                a[i][j]=s.nextInt();
            }
        }

        System.out.println("Enter The Number Of Rows In Matrix 2");
        n2=s.nextInt();

        System.out.println("Enter The Number Of Columns In Matrix 2");
        m2=s.nextInt();

        b=new int[n2][m2];

        System.out.println("Enter Elements Into Second Array");

        for(int i=0;i<n2;i++)
        {
            for(int j=0;j<m2;j++)
            {
                b[i][j]=s.nextInt();
            }
        }

        eq.equality(a,n1,m1,b,n2,m2);
    }
}
