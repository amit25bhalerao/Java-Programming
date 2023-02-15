import java.util.Scanner;

public class DisjointArray
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a[],b[],n,m,i,j,res=0;

        System.out.println("Enter The Size Of Array 1");
        n=s.nextInt();

        a=new int[n];

        System.out.println("Enter "+n+" Elements Into Array 1");

        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }

        System.out.println("Enter The Size Of Array 2");
        m=s.nextInt();

        b=new int[m];

        System.out.println("Enter "+m+" Elements Into Array 1");

        for(i=0;i<m;i++)
        {
            b[i]=s.nextInt();
        }

        OUT:
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(a[i]==b[j])
                {
                    res=1;
                    break OUT;
                }
            }
        }

        if(res==1)
        {
            System.out.println("The Two Arrays Are Not Disjoint In Nature");
        }
        else
        {
            System.out.println("The Two Arrays Are Disjoint In Nature");
        }
    }
}
