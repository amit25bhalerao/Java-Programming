import java.util.Scanner;

public class ArrangeArrayAlternatively
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a[], n, i, j, temp, temp1, temp2;

        System.out.println("Enter The Size Of The Array");
        n = s.nextInt();
        a=new int[n+1];

        temp1=n;
        temp2=1;

        System.out.println("Enter " + n + " Elements Into The Array");

        for (i = 0; i < n; i++)
        {
            a[i]=s.nextInt();
        }

        for(i=n;i>0;i--)
        {
            a[i]=a[i-1];
        }

        for(i=1;i<=n;i++)
        {
            for(j=i+1;j<=n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("The Alternatively Arranged Array Is Displayed Below");

        for(i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(a[temp1]);
                temp1=temp1-1;
            }
            else
            {
                System.out.println(a[temp2]);
                temp2=temp2+1;
            }
        }
    }
}
