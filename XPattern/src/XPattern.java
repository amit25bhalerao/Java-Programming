import java.util.Scanner;

public class XPattern
{
    public  static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,n;
        char ch;

        System.out.println("Enter The Character Whose Pattern Is To be Printed");
        ch=s.nextLine().charAt(0);

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        char a[][]=new char[n][n];

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                    a[i][j]=ch;
                if(i!=j)
                    a[i][j]='\0';
            }
        }

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                    continue;
                if((i+j)==n-1)
                    a[i][j]=ch;
                if((i+j)!=n-1)
                    a[i][j]='\0';
            }
        }

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }

    }
}
