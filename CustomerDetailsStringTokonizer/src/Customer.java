import java.util.Scanner;
import java.util.StringTokenizer;

public class Customer
{
    String temp;
    int dd,mm,yyyy;

    Scanner s = new Scanner(System.in);

    void getdetails(String name,String date)
    {
        StringTokenizer token = new StringTokenizer(date,"/");

        temp=token.nextToken();
        dd=Integer.parseInt(temp);

        temp=token.nextToken();
        mm=Integer.parseInt(temp);

        temp=token.nextToken();
        yyyy=Integer.parseInt(temp);

        System.out.println(name+" "+dd+" "+mm+" "+yyyy);
    }
}
