import java.util.Scanner;

public class SpecialJavaArrayAddition
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a[],b[],n,m,sum,num1=0,num2=0,i,temp1,temp2,digit1=0,digit2=0,rev1=0,rev2=0;

        System.out.println("Enter The Size Of Array1");
        n=s.nextInt();

        a=new int[n];

        System.out.println("Enter "+n+" Element Into The Array");

        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }

        System.out.println("Enter The Size Of Array2");
        m=s.nextInt();

        b=new int[m];

        System.out.println("Enter "+m+" Element Into The Array");

        for(i=0;i<m;i++)
        {
            b[i]=s.nextInt();
        }

        for(i=n-1;i>=0;i--)
        {
            while(a[i]!=0)
            {
                temp1=a[i]%10;
                num1=num1*10+temp1;
                a[i]=a[i]/10;
            }
        }

        while(num1!=0)
        {
            digit1=num1%10;
            rev1=rev1*10+digit1;
            num1=num1/10;
        }

        for(i=m-1;i>=0;i--)
        {
            while(b[i]!=0)
            {
                temp2=b[i]%10;
                num2=num2*10+temp2;
                b[i]=b[i]/10;
            }
        }

        while(num2!=0)
        {
            digit2=num2%10;
            rev2=rev2*10+digit2;
            num2=num2/10;
        }

        sum=rev1+rev2;

        System.out.print("The Sum Of Given Arrays Is "+sum);
    }
}
