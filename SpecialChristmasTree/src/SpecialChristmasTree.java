import java.util.Scanner;

public class SpecialChristmasTree
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,k,l,n,c;
        char ch;

        System.out.println("Enter The Character Whose Pattern Is To Be Printed");
        ch=s.nextLine().charAt(0);

        System.out.println("Enter The Value Of N (15<N<18) Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        if((n<15)||(n>18))
        {
            System.out.print("Invalid Input Entered. Program Will Stop");
            System.exit(0);
        }

        k=c=4;

        for(i=1;i<=12;i++)
        {
            if(i<=k)
            {
                System.out.print(" "+" ");

                for(j=k;j>=i;j--)
                {
                    System.out.print(" "+" ");
                }

                if(i==1)
                {
                    System.out.print(ch);
                    System.out.println();
                    continue;
                }


                for(l=1;l<i;l++)
                {
                    System.out.print(ch+" ");
                }

                System.out.print(ch+" ");

                for(l=1;l<i;l++)
                {
                    System.out.print(ch+" ");
                }

                System.out.println();

            }

            if((i>k)&&(i<=2*k))
            {
                for(j=c;j>=(i-c);j--)
                {
                    System.out.print(" "+" ");

                }

                for(j=c+1;j<=i;j++)
                {
                    System.out.print(ch+" ");
                }

                System.out.print(ch+" ");

                for(j=c+1;j<=i;j++)
                {
                    System.out.print(ch+" ");
                }
                System.out.println();
            }

            if(i>2*k)
            {
                for(j=2*c;j>(i-c);j--)
                {
                    System.out.print(" "+" ");

                }

                for(j=2*c+1;j<=i;j++)
                {
                    System.out.print(ch+" ");
                }

                for(l=1;l<=3;l++)
                {
                    System.out.print(ch+" ");
                }

                for(j=2*c+1;j<=i;j++)
                {
                    System.out.print(ch+" ");
                }

                System.out.println();
            }

        }

        for(i=12;i<=n;i++)
        {
            for(j=1;j<=4;j++)
            {
                System.out.print(" "+" ");
            }

            for(l=1;l<=3;l++)
            {
                System.out.print(ch+" ");
            }

            System.out.println();
        }
    }
}
