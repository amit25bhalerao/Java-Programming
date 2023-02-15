import java.util.Scanner;

public class SquareOfDiagonalsInOnTIme
{
    static Scanner s = new Scanner(System.in);

    static  int a[][],n,i,j,square,temp=0;

    static void create()
    {
        System.out.println("Enter The Order Of Matrix");
        n=s.nextInt();

        a=new int[n][n];

        System.out.println("Enter The Elements Into The 2D Array");

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
    }

    static void SquareOfDiagonals()
    {
        System.out.println("D1*D1\t\t\t\t\tD2*D2");

        for(i=0;i<n;i++)
        {
            square=a[i][i]*a[i][i];
            System.out.print("Array["+i+"]["+i+"]:"+square+"\t\t\t");

            temp=(n-i-1);

            if(temp+i==(n-1))
            {
                square=a[i][temp]*a[i][temp];
                System.out.println("Array["+i+"]["+temp+"]:"+square);
            }
        }
    }

    public static void main(String[] args)
    {
        create();
        SquareOfDiagonals();
    }
}
