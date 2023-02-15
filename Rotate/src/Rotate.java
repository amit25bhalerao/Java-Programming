import java.util.Scanner;

public class Rotate
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int i,n,d,c=0;

        System.out.println("Enter The Size Of The Array");
        n=s.nextInt();

        int a[]=new int[n];

        System.out.println("Enter The Number Of Time You Wish To Rotate The Array Towards Left");
        d=s.nextInt();

        int temp[]=new int[d];

        System.out.println("Enter "+n+" Number Of Elements Into The Array");

        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }

        for(i=0;i<d;i++)
        {
            temp[i]=a[i];
        }

        for(i=d;i<n;i++)
        {
            a[i-d]=a[i];
        }

        for(i=n-d;i<n;i++)
        {
            a[i]=temp[c];
            c=c+1;
        }

        System.out.println("The Rotated Array Is Displayed Below");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
