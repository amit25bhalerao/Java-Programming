import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class CountTheZeros
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        String se;
        int i,count=0;
        char temp;

        System.out.println("Enter The String Consisting Only Zero's And One's");
        se=s.nextLine();

        char a[]=se.toCharArray();

        for(i=0;i<a.length;i++)
        {
            if((a[i]!='0')&&(a[i]!='1'))
            {
                System.out.println("Invalid Input Entered..Program Will Terminate");
                System.exit(0);
            }
        }

        for(i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        for(i=0;i<a.length;i++)
        {
            if(a[i]=='0')
            {
                count++;
            }
        }

        System.out.println("The Number Of Zeros Present In String "+se+" Are "+count);
    }
}
