import java.util.Scanner;

public class HallowBlockPattern
{
    public static void main(String[]args)
    {
        int n,m;
        char ch;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter The Number Of Rows");
        n=s.nextInt();

        System.out.println("Enter The Number Of Columns");
        m=s.nextInt();

        System.out.println("Enter The Character Whose Pattern Is To Be Printed");
        ch=s.next().charAt(0);

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if((i==1)||(i==n)||(j==1)||(j==m))
                    System.out.print(ch+"");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}
