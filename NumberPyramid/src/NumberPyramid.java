import java.util.Scanner;

public class NumberPyramid
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,n,count,c,temp;

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        c=n-1;
        count=1;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=c;j++)
            {
                System.out.print(" "+" ");
            }
            c=c-1;

            temp=(int)(Math.pow(i,2)-Math.pow(i-1,2));

            for(j=1;j<=temp;j++)
            {
                System.out.print(count+" ");
            }

            count=count+1;
            System.out.println();

        }

    }
}
