import java.util.Scanner;

public class CentreElementEqualsSumOfHalfDiagonals
{
    static Scanner s = new Scanner(System.in);

    static  int a[][],n,i,j,half,sum1=0,sum2=0,sum3=0,sum4=0,centre;

    static void create()
    {
        System.out.println("Enter The Odd Order Of Matrix");
        n=s.nextInt();

        half=n/2;

        a=new int[n][n];

        if(n%2==0)
        {
            System.out.println("Invalid Input Entered...Program Will Terminate");
            System.exit(0);
        }

        System.out.println("Enter The Elements Into The 2D Array");

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        centre=a[half][half];
        System.out.println("Centre Element: "+centre);
    }

    static int checkhalfdiagonalsum()
    {
        for(i=0;i<n;i++)
        {                                                                      // 1   5   5   5   4
            for(j=0;j<n;j++)                                                   // 2   3   5   6   7
            {                                                                  // 1   2   5   4   5
                if((i==j)&&(i<half))                                           // 4   8   8   7   2
                {                                                              // 2   1   5   6   4
                    sum1=sum1+a[i][j];
                }

                if((i==j)&&(i>half))
                {
                    sum4=sum4+a[i][j];
                }

                if((i+j==(n-1))&&(i<half))
                {
                    sum2=sum2+a[i][j];
                }

                if((i+j==(n-1))&&(i>half))
                {
                    sum3=sum3+a[i][j];
                }
            }
        }

        System.out.println("Left Top Half Diagonal Sum: "+sum1);
        System.out.println("Left Bottom Half Diagonal Sum: "+sum3);
        System.out.println("Right Top Half Diagonal Sum: "+sum2);
        System.out.println("Right Bottom Half Diagonal Sum: "+sum4);

        if((sum1==centre)&&(sum2==centre)&&(sum3==centre)&&(sum4==centre))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args)
    {
        create();
        int res = checkhalfdiagonalsum();

        if(res==1)
            System.out.println("Centre Element Equals To Sum Of All The Half Diagonals");
        else
            System.out.println("Centre Element Differs From Sum Of All The Half Diagonals");
    }
}
