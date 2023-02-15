import java.util.Scanner;

public class NamePattern
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        String st;
        int l,i,j;

        System.out.println("Enter The String");
        st=s.nextLine();

        char ch[]=st.toCharArray();

        l=ch.length;

        for(i=0;i<l;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(ch[j]+" ");
            }

            System.out.println();
        }

        for(i=l-1;i>=1;i--)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(ch[j]+" ");
            }
            System.out.println();
        }
    }
}
