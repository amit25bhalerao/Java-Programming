import java.util.Scanner;

public class FishPattern
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,k,l,n,t,c;
        char ch;

        System.out.println("Enter The Character Whose Pattern Is To be Printed");
        ch=s.nextLine().charAt(0);

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        System.out.println("Enter The Height Of The Tail (T<N) Of The Fish");
        t=s.nextInt();

        c=1;
        l=t;

        if(t>n)
        {
            System.out.print("Invalid Input Entered..Program Will Terminate");
            System.exit(0);
        }

        for(i=1;i<=n;i++)
        {
            for(j=n-i;j>=1;j--)
            {
                System.out.print(" "+" ");
            }

            for(j=1;j<=(2*i)-1;j++)
            {
                System.out.print(ch+" ");
            }

            if(i>(n-t))
            {
                for(k=1;k<=2*(n-i);k++)
                {
                    System.out.print(" "+" ");
                }

                for(j=1;j<=(2*c)-1;j++)
                {
                    System.out.print(ch+" ");
                }
                c=c+1;
            }
            System.out.println();
        }

        c=1;

        for(i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(" " + " ");
            }

            for(j=1;j<=(2*(n-i))-1;j++)
            {
                System.out.print(ch+" ");
            }

            if(i<=t)
            {
                for(k=1;k<=2*i;k++)
                {
                    System.out.print(" "+" ");
                }

                for(j=1;j<=(2*(l-1))-1;j++)
                {
                    System.out.print(ch+" ");
                }
                l=l-1;

            }
            System.out.println();
        }

    }
}
