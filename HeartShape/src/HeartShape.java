import java.util.Scanner;

public class HeartShape
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,k,l,n,o,temp,temp1,temp2,temp3;
        char ch;

        System.out.println("Enter The Character Whose Pattern Is To Be Printed");
        ch=s.nextLine().charAt(0);

        System.out.println("Enter The Value Of N (Minimum 11) Upto Which You Wish To Print The Pattern");
        n=s.nextInt();

        if(n<11)
        {
            System.out.print("Invalid Input Entered...Please Rerun The Program");
            System.exit(0);
        }

        temp=n-1;   //BelowTriangleColumnSize
        temp1=5;    //HeightAboveBelowTriangle
        temp2=n-11; //MiddleRectangleSize
        temp3=4;

        for(i=1;i<=5;i++)
        {
            for(j=temp1;j>=1;j--)
            {
                System.out.print(" "+" ");
            }

            temp1=temp1-1;

            for(k=1;k<=i;k++)
            {
                System.out.print(ch+" ");
            }

            for(l=1;l<=temp2;l++)
            {
                System.out.print(ch+" ");
            }

            for(k=1;k<=i;k++)
            {
                if(i==5)
                    break;
                System.out.print(ch+" ");

            }

            if(i==5)
            {
                for(i=1;i<=4;i++)
                {
                    System.out.print(ch+" ");
                }
            }

            for(j=temp3;j>=1;j--)
            {
                System.out.print(" "+" ");
            }

            for(j=temp3-1;j>=1;j--)
            {
                System.out.print(" "+" ");
            }

            temp3=temp3-1;

            for(k=1;k<=i;k++)
            {
                System.out.print(ch+" ");
            }

            for(l=1;l<=temp2;l++)
            {
                System.out.print(ch+" ");
            }

            for(k=1;k<=i;k++)
            {
                System.out.print(ch+" ");
            }

            System.out.println();
        }

        for(i=1;i<=n-1;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" "+" ");
            }

            for(k=temp-1;k>=1;k--)
            {
                System.out.print(ch+ " ");
            }

            for(j=1;j<=temp;j++)
            {
                System.out.print(ch+" ");
            }

            System.out.println();
            temp=temp-1;
        }
    }
}
