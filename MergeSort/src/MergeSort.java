import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MergeSort
{
    static  Scanner s = new Scanner(System.in);

    static void generaterandom(int min, int max, int a[])
    {
        Random r = new Random();

        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt((max-min)+1)+min;
        }
    }

    static void merge(int arr[], int beg, int mid, int end)
    {

        int l = mid - beg + 1;
        int r = end - mid;

        int LeftArray[] = new int [l];
        int  RightArray[] = new int [r];

        for (int i=0; i<l; ++i)
            LeftArray[i] = arr[beg + i];

        for (int j=0; j<r; ++j)
            RightArray[j] = arr[mid + 1+ j];


        int i = 0, j = 0;
        int k = beg;

        while (i<l&&j<r)
        {
            if (LeftArray[i] <= RightArray[j])
            {
                arr[k] = LeftArray[i];
                i++;
            }
            else
            {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }

        while (i<l)
        {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j<r)
        {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    static void SortMerge(int arr[], int beg, int end)
    {
        if (beg<end)
        {
            int mid = (beg+end)/2;
            SortMerge(arr, beg, mid);
            SortMerge(arr , mid+1, end);
            merge(arr, beg, mid, end);
        }
    }

    public static void main(String[] args)
    {
        int a[],min=5001, max=5999,n;
        long starttime, stoptime, consumedtime;

        starttime=System.nanoTime();

        System.out.println("Enter The Size Of The Array");
        n=s.nextInt();

        a=new int[n];

        generaterandom(min, max, a);

        SortMerge(a,0,n-1);

        stoptime=System.nanoTime();

        consumedtime= TimeUnit.MICROSECONDS.convert(stoptime-starttime, TimeUnit.NANOSECONDS);

        System.out.println("The Sorted Array Is Displayed Below");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("Time Take To Sort Array Using Quick Sort Is "+consumedtime+" Microseconds");
    }
}
