import java.util.Scanner;

public class StairPattern
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int i,j,n,rows,columns,width,height,ns,c,temp;

        System.out.println("Enter The Width Of Each Step");
        width=s.nextInt();

        System.out.println("Enter The Height Of Each Step");
        height=s.nextInt();

        System.out.println("Enter The Total Number Of Steps");
        ns=s.nextInt();

        rows=height*(ns-1);
        columns=(width*ns)+1;

        System.out.println("Rows: "+rows);
        System.out.println("Columns: "+columns);

        temp=width;

        c=width;

       for(i=1;i<=rows;i++)
       {
           for(j=columns;j>=1;j--)
           {
                System.out.print("_"+" ");
           }
           System.out.println();
       }

    }
}
