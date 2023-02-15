import java.util.Scanner;

class Evaluation
{
    public Scanner s = new Scanner(System.in);
    int accno;
    String name;
    double balance, bal, withdraw, deposit;

    void create()
    {
        System.out.println("Welcome To Account Creation Portal");
        System.out.println("Enter The Customers Name");
        name=s.next();
        System.out.println("Enter The Account Number Of The Customer");
        accno=s.nextInt();
        System.out.println("Enter The Amount To Be Deposited. Minimum Amount To Be Deposited Is Rs 1000");
        balance=s.nextDouble();

        if(balance<1000)
        {
            System.out.println("Account Cannot Be Created. Minimum Balance Criteria Not Satisfied");
            balance=0;
            name=" ";
            accno=0;
        }
    }

    void display()
    {
        System.out.println("Welcome To Customer Details Portal");
        System.out.println("Customer Name: "+name);
        System.out.println("Customer Account Number: "+accno);
        System.out.println("Customer Account Balance: "+balance);
    }

    void depositamt()
    {
        int a;
        System.out.println("Welcome To Deposit Portal");
        System.out.println("Enter The Deposit Amount");
        deposit=s.nextDouble();

        if(deposit<1)
        {
            System.out.println("1 Rs Is Minimum Deposit Amount");
            System.out.println("Do You Wish To Deposit Again? Press 1 to Proceed");
            a=s.nextInt();

            if(a==1)
            {
                depositamt();
            }
            else
            {
                balance=balance;
                return;
            }
        }
        else
        {
            balance=balance+deposit;
            System.out.println("Amount Deposited Successfully");
        }
    }

    void withdrawamt()
    {
        System.out.println("Welcome To Amount Withdrawal Portal");
        System.out.println("Enter The Amount To Be Withdrawm From Account");
        withdraw=s.nextDouble();

        bal=balance-withdraw;

        if((bal<1000)||(withdraw>4500)||(withdraw>balance))
        {
            if(withdraw>4500)
            {
                System.out.println("Transaction Not Allowed");
                return;
            }

            else if(bal<1000)
            {
                System.out.println("Withdrawal Amount Will Decrease Minimum Account Balance To Be Maintained");
                return;
            }

            else
            {
                System.out.println("Not Sufficient Balance In Your Account To Proceed Transaction");
                return;
            }
        }

        balance=bal;
        System.out.println("Amount Withdrawn Successfully");
    }
}




