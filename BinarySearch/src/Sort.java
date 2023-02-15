public class Sort
{
    public int sort(int a[],int n,int key)
    {
        int low,high,mid;
        low=0;
        high=n-1;

        while(low<high)
        {
            mid=(low+high)/2;

            if(a[mid]==key)
            {
                return 1;
            }
            if(key<a[mid])
            {
                high=high-1;
            }
            if(key>a[mid])
            {
                low=low+1;
            }
        }

        return -1;
    }
}
