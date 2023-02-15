import java.util.Scanner;

public class RepeatingPatternCount
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a[],i,n,temp=0,count=0;

        System.out.println("Enter The Size Of The Array");
        n=s.nextInt();

        a=new int[n];

        System.out.println("Enter "+n+" Elements Into The Array Consisting Of 0's And 1's Only");

        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();

            if((a[i]!=0)&&(a[i]!=1))
            {
                System.out.println("Invalid Input Entered..Program Will Terminate");
                System.exit(0);
            }
        }

        for(i=0;i<n;i++)
        {
            if (a[i] == 0)
            {
                count++;
            }
            else
            {
                count = 0;
            }

            if (temp<count)
            {
                temp = count;
            }
        }
        System.out.println("The Maximum Number Of Consecutive Zeros Are "+temp);
    }
}
