import java.util.Scanner;

public class YYNumberDecreasingPattern
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,k,l,m,n,temp,temp1;

        System.out.println("Enter The Value Of N From Where You Wish To Decrease The Pattern Series");
        n=s.nextInt();

        temp=n;
        temp1=2;

        for(i=1;i<=n;i++)
        {
            if((temp<=n-1)&&(temp>=10))
            {
                for(m=1;m<i;m++)
                {
                    System.out.print(" ");
                }
            }

            if(temp<10)
            {
                for(m=n-9;m>=1;m--)
                {
                    System.out.print(" ");
                }
            }


            for(j=1;j<=temp;j++)
            {
                System.out.print(j);
            }

            if(temp<=n-1)
            {
                for(k=1;k<=temp1;k++)
                {
                    System.out.print("*");
                }
                temp1=temp1+2;
            }

            for(l=temp;l>=1;l--)
            {
                System.out.print(l);
            }

            temp=temp-1;
            System.out.println(" ");
        }
    }
}
