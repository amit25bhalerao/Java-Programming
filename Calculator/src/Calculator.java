import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator
{
    public static void main(String args[])throws IOException
    {
        for(;;)
        {
            double op1,op2,res;
            res=0.0;
            char ch;

            InputStreamReader read = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(read);

            System.out.println("Enter 0 To Exit Or 1 To Proceed");
            op1=Integer.parseInt(in.readLine());

            if(op1==1)
            {
                System.out.println("Enter The First Operand");
                op1=Double.parseDouble(in.readLine());
                System.out.println("Enter The Second Operand");
                op2=Double.parseDouble(in.readLine());
                System.out.println("Enter The Character '+' For Addition, '-' For Subtraction, '*' For Multiplication, '/' For Division");
                ch=(char)in.read();

                if(ch=='@')
                {
                    System.out.println("Thank You");
                    System.exit(0);
                }

                switch (ch)
                {
                    case '+':
                        res=op1+op2;
                        System.out.println(op1+""+ch+""+op2+"="+res);
                        break;
                    case '-':
                        res=op1-op2;
                        System.out.println(op1+""+ch+""+op2+"="+res);
                        break;
                    case '*':
                        res=op1*op2;
                        System.out.println(op1+""+ch+""+op2+"="+res);
                        break;
                    case '/':
                        if(op2!=0)
                        {
                            res = op1 / op2;
                            System.out.println(op1 + "" + ch + "" + op2 + "=" + res);
                        }
                        else
                            System.out.println("Divide By Zero Error. Please Try Again");
                        break;
                    default:System.out.println("Invalid Input Entered. Please Try Again");
                }
            }
            else
            {
                System.out.println("Thank You");
                System.exit(0);
            }
        }
    }
}
