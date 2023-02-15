import java.awt.image.BufferStrategy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSort
{
    public static void main(String args[])throws IOException
    {

        int n,i,j,temp;

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter The Size Of The Array");
        n=Integer.parseInt(in.readLine());

        int a[] = new int[n];

        System.out.println("Enter "+n+" Elements Into The Array");

        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }

        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[j]<a[i])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("The Sorted Array Is Displayed Below In Non Decreasing Order");

        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
