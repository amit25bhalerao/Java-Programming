import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrongNumber
{
    public static void main(String args[])throws IOException
    {
        int i,f,num,digit,sum,temp;
        f=1;sum=0;

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter A Number To Check Whether It Is A Strong Number Or Not");
        num=Integer.parseInt(in.readLine());

        temp=num;

        while(num!=0)
        {
            digit=num%10;
            for(i=1;i<=digit;i++)
            {
                f=f*i;
            }
            sum=sum+f;
            num=num/10;
            f=1;
        }

        if(temp==sum)
            System.out.println(temp+" Is A Strong Number");
        else
            System.out.println(temp+" Isn't A Strong Number");
    }
}
