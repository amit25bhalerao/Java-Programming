import java.util.Scanner;

public class PyramidPattern
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);

        int i,j,k,temp,c,n;
        char ch;

        System.out.println("Enter The Character Whose Pattern Is To Be Printed");
        ch=s.nextLine().charAt(0);

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        c=n-1;

        for(i=1;i<=n;i++)
        {
            for(j=c;j>=1;j--)
            {
                System.out.print(" "+" ");
            }

            c=c-1;
            temp=(int)(Math.pow(i,2)-Math.pow((i-1),2));

            for(k=1;k<=temp;k++)
            {
                System.out.print(ch+" ");
            }

            System.out.println();
        }

    }
}
