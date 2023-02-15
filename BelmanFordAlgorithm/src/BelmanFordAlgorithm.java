import java.util.Scanner;

public class BelmanFordAlgorithm
{
    static void shortest_path(int n, int s, Double a[][])
    {
        Double[] D = new Double[n+1];

        for(int i = 1; i <= n; i++)
        {
            D[i] = Double.POSITIVE_INFINITY;
        }

        D[s] = 0.0;           // Distance From Source To Itself Is Zero

        for(int k = 1; k <= n-1; k++)
        {
            for(int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= n; j++)
                {
                    if((a[i][j] != Double.POSITIVE_INFINITY) && (D[i] + a[i][j] < D[j]))
                    {
                        D[j] = D[i] + a[i][j];
                    }
                }
            }
        }


        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(a[i][j] != Double.POSITIVE_INFINITY)
                {
                    if(D[i] + a[i][j] < D[j])
                    {
                        System.out.println("The Graph Contains Negative Edge Cycle. The Program Will Terminate");
                        System.exit(0);
                    }
                }
            }
        }

        for(int i = 1; i <= n; i++)
        {
            if((D[i] == Double.POSITIVE_INFINITY) || (D[i] == Double.NEGATIVE_INFINITY))
            {
                System.out.println(i+" Is Not Reachable From Source " + s);
            }
            else
            {
                System.out.println("Distance Of " + i + " From Source " + s + " Is: " + D[i] +" Units");
            }

        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n, source;
        Double[][] a;
        System.out.print("Enter The Number Of Vertices: ");
        n = s.nextInt();

        a = new Double[n+1][n+1];

        System.out.println("Enter The Values Into The Distance Matrix, Use 'Infinity' For No Link");
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                a[i][j] = s.nextDouble();
            }
        }

        System.out.print("Enter The Source Vertex: ");
        source = s.nextInt();

        if((source <= 0) || (source > n))
        {
            System.out.println("Invalid Source Vertex Entered! The Program Will Terminate");
            System.exit(0);
        }

        shortest_path(n, source, a);
    }
}



