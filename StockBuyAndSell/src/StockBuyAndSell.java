import java.util.Scanner;

public class StockBuyAndSell
{
    public static void main(String[] args)
    {
        Scanner in  = new Scanner(System.in);

        int i,j,n,count=0;
        int []arr = new int[50];
        System.out.println("Enter The Size Of Array");
        n=in.nextInt();

        for(i=0;i<n;i++)
            arr[i] = in.nextInt();

        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i] <= arr[j])
                {
                    count++; // counter is used for last items
                    if(count == n)
                    {
                        System.out.println("Buy On Day "+i+" At "+arr[i]+"  ==>  Sell On Day "+j+ " At "+arr[j]);
                    }
                }
                else
                {
                    System.out.println("Buy On Day "+i+" At "+arr[i]+"  ==>  Sell On Day "+j+ " At "+arr[j-1]);
                    i = count; // counter is used, if any stock successfully buy and sell.
                }

            }
        }
    }
}
