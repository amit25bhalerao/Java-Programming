import java.util.Scanner;

public class UniqueNumber
{
    Scanner s = new Scanner(System.in);

    void find()
    {
        int i,j,n,cons=0,temp=0;

        System.out.println("Enter The Number Of Elements In The Array");
        n=s.nextInt();

        int a[]=new int[n];
        int f[]=new int[n];
        int z[]=new int[n*n];

        for(i=0;i<(n*n);i++)
            z[i]=0;

        System.out.println("Enter "+n+" Numbers Into The Array");

        for (i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }

        System.out.println("The Unique Number Whose Frequency Isn't 2 Is Displayed Below");

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                    continue;
                if(a[i]==a[j])
                {
                    temp=temp+1;
                }
            }
            f[i]=temp+1;
            temp=0;
        }

        for(i=0;i<n;i++)
        {
            cons=a[i];
            if(f[i]!=2)
            {
                for(j=0;j<n;j++)
                {
                    if(a[i]==a[j])
                    {
                        z[cons]=a[i];
                    }
                }
            }
        }

        for (i=0;i<(n*n);i++)
        {
            if(z[i]!=0)
                System.out.println(z[i]);
        }
    }

    public static void main(String args[])
    {
        UniqueNumber s = new UniqueNumber();
        s.find();
    }
}
