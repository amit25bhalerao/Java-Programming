import java.util.Scanner;

public class TrappingRainWater
{
    static int rainwater(int a[], int n)
    {
        int res = 0;
        for(int i = 1; i < n - 1; i++)
        {

            // Find maximum element on its left
            int left = a[i];
            for(int j = 0; j < i; j++)
            {
                left = Math.max(left, a[j]);
            }

            // Find maximum element on its right
            int right = a[i];
            for(int j = i + 1; j < n; j++)
            {
                right = Math.max(right, a[j]);
            }

            // Update maximum water value
            res += Math.min(left, right) - a[i];
        }
        return res;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a[],n;

        System.out.println("Enter The Size Of The Array");
        n=s.nextInt();

        a=new int[n];

        System.out.println("Enter The List Of Non Negative Integers Representing Elevation Map");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            if(a[i]<0)
            {
                System.out.println("Invalid Input Entered.. The Program Will Quit");
                System.exit(0);
            }
        }
        int r=rainwater(a,n);
        System.out.println("The Units Of Water Which Can Be Stored Are "+r+" Units");
    }
}
