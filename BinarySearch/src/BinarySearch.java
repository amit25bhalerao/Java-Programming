import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args)
    {
        Sort sort = new Sort();

        Scanner s = new Scanner(System.in);

        int a[],n,key,res;

        System.out.println("Enter The Size Of The Array");
        n=s.nextInt();

        a=new int[n];

        System.out.println("Enter "+n+" Elements Into The Array");

        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }

        System.out.println("Enter The Search Element");
        key=s.nextInt();

        res=sort.sort(a,n,key);

        if(res==-1)
        {
            System.out.println(key+" Not Found In The Given Array");
        }
        else
        {
            System.out.println(key+" Found In The Given Array");
        }
    }
}
