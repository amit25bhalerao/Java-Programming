import java.util.Scanner;

public class Rotate2DArrayByNinetyDegreeClockwise
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int i, j, m, n;

        System.out.println("Enter The Number Of Rows");
        m = s.nextInt();

        System.out.println("Enter The Number Of Columns");
        n = s.nextInt();

        int a[][] = new int[m][n];

        System.out.println("Enter Elements Into The 2D Array");

        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
            {
                a[i][j] = s.nextInt();
            }
        }

        System.out.println("The 2D Array After Rotating By 90 Degree Clockwise Is Displayed Below");

        for(j=0;j<n;j++)
        {
            for(i=m-1;i>=0;i--)
            {
                System.out.print(a[i][j]+" ");
            }

            System.out.println();
        }
    }
}
