import java.util.Scanner;

public class NewPyramidUsingPattern
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int i, j, k, n, temp, temp1, count=1, temp2;

        System.out.println("Enter The Value Of N Upto Which You Wish To Print The Pattern");
        n = s.nextInt();
        temp=n-1;

        for(i=1;i<=n;i++)
        {
            for(j=temp;j>=1;j--)
            {
                System.out.print(" "+" ");
            }

            temp=temp-1;
            temp1=i;

            for(k=1;k<=count;k++)
            {
                System.out.print(temp1+" ");
                temp1=temp1+1;
            }

            count=count+1;
            temp2=((2*i)-1);

            if(i!=1)
            {
                for(j=temp2-1;j>=i;j--)
                {
                    System.out.print(j+" ");
                }
            }

            System.out.println(" ");
        }
    }
}
