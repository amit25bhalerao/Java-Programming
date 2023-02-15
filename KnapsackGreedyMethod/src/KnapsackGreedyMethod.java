import java.util.Scanner;

public class KnapsackGreedyMethod
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int i,j=0,max_qty,m,n,array[][];
        float sum=0,max;

        System.out.println("Enter The Number Of Objects");
        n=s.nextInt();

        System.out.println("Enter Capacity Of The Knapsack");
        max_qty=s.nextInt();

        array=new int[2][n];

        System.out.println("Enter Weight Of Each Individual Object");
        for(i=0;i<n;i++)
        {
            System.out.print("Object"+(i+1)+" Weight: ");
            array[0][i]=s.nextInt();
        }

        System.out.println("Enter Value Of Each Individual Object");
        for(i=0;i<n;i++)
        {
            System.out.print("Object"+(i+1)+" Value: ");
            array[1][i]=s.nextInt();
        }

        m=max_qty;

        while(m>=0)
        {
            max=0;
            for(i=0;i<n;i++)
            {
                if(((float)array[1][i])/((float)array[0][i])>max)
                {
                    max=((float)array[1][i])/((float)array[0][i]);
                    j=i;
                }
            }
            if(array[0][j]>m)
            {
                System.out.println("Quantity Of Object" +  (j+1) + " Added Is " +m+"/"+array[0][j]);
                sum+=m*max;
                m=-1;
            }
            else
            {
                System.out.println("Quantity Of Object" + (j+1) + " Added Is " + array[0][j]+"/"+array[0][j]);
                m-=array[0][j];
                sum+=(float)array[1][j];
                array[1][j]=0;
            }
        }
        System.out.println("The Optimal Profit Obtained Is " + sum);
    }
}
