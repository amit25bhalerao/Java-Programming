import java.util.Scanner;

public class SecondLargestAndSecondSmallestNumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n,a[],temp;

        System.out.println("Enter The Size Of The Array");
        n=s.nextInt();

        a=new int[n];

        System.out.println("Enter "+n+" Elements Into The Array");

        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("The Second Largest Element In The Array Is "+a[n-2]);
        System.out.println("The Second Smallest Element In The Array Is "+a[1]);
    }
}
