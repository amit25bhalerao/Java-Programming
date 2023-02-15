import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class AxisBank
{
    public static void main(String args[])throws IOException
    {
        int choice,count=0;

        Evaluation obj = new Evaluation();

        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        for(;;)
        {
            System.out.println("Enter 1: Create Account");
            System.out.println("Enter 2: Display Customer Details");
            System.out.println("Enter 3: Deposit Amount");
            System.out.println("Enter 4: Withdraw Amount");
            System.out.println("Enter 5: Exit");
            System.out.println("Enter Your Choice");
            choice=Integer.parseInt(in.readLine());

            switch (choice)
            {
                case 1: obj.create();
                        break;
                case 2: obj.display();
                        break;
                case 3: obj.depositamt();
                        break;
                case 4: obj.withdrawamt();
                        break;
                case 5: System.out.println("Thank You. Visit Again");
                        System.exit(0);
                default:System.out.println("Invalid Input Entered. Please Try Again.");
            }
        }
    }
}

