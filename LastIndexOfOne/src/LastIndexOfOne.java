import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class LastIndexOfOne
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        String se;
        int i,index=0;

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
            if(a[i]=='1')
            {
                index=i;
            }
        }

        System.out.println("The Last Index Of 1 Is Found At Position "+index+" Of The Given String "+se);
    }
}
