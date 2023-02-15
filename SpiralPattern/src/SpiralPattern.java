public class SpiralPattern
{
    public static void main(String[]args)
    {
        int i,j,k,n,count;
        int a[][]=new int[11][11];

        n=10;
        count=1;
        i=1;
        k=2;

        for(int z=1;z<=5;z++)
        {
            for(j=i;j<=n;j++)
            {
                a[i][j]=count;
                count=count+1;
            }

            for(j=k;j<=n;j++)
            {
                a[j][n]=count;
                count=count+1;
            }

            for(j=10-i;j>i;j--)
            {
                a[n][j]=count;
                count=count+1;
            }

            for(j=n;j>=k;j--)
            {
                a[j][i]=count;
                count=count+1;
            }

            i=i+1;
            n=n-1;
            k=k+1;

        }

        System.out.println("The Spiral Pattern Is Displayed Below");

        for(i=1;i<=10;i++)
        {
            for(j=1;j<=10;j++)
            {
                if(i==1)
                    System.out.print(" ");
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
}
