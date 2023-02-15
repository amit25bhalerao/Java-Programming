import java.util.Scanner;

public class KSmallestElement
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a[],n,k,i,j,temp;

        System.out.println("Enter The Size Of The Array");
        n=s.nextInt();
        a=new int[n];

        System.out.println("Enter "+n+" Elements Into The Array");

        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }

        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("Enter The Kth Position Where You Wish To Find The Smallest Element");
        k=s.nextInt();

        System.out.println("The "+k+" th Smallest Element In The Array Is "+ a[k-1]);

    }
}
