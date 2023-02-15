import java.util.Scanner;

public class BinarySearchRecursively
{
    static Scanner s = new Scanner(System.in);

    static int a[], n, temp,mid,low,high,key;
    static boolean result;

    static void accept(int a[])
    {
        System.out.println("Enter "+a.length+" Elements Into The Array");

        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
    }

    static void sort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    static boolean BinaryRecursive(int low, int high, int key)
    {

        if(low==high)
        {
            if(a[low]==key)
                return true;
            else
                return false;
        }

        else
        {
            mid=(low+high)/2;

            if(a[mid]==key)
                return true;
            if(a[mid]<key)
                return BinaryRecursive(mid+1,high,key);
            else
                return BinaryRecursive(low,mid-1,key);
        }

    }

    static void display(int a[])
    {
        System.out.println("The Array Elements Are Displayed Below");

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter The Size Of The Array");
        n=s.nextInt();

        a= new int[n];

        low=0;
        high=n-1;

        accept(a);
        display(a);

        System.out.println("Enter The Key Element");
        key=s.nextInt();

        sort(a);

        result=BinaryRecursive(low,high,key);

        if(result)
        {
            System.out.println(key+" Found In The Array");
        }
        else
        {
            System.out.println(key+" Not Found In The Array");
        }
    }
}
