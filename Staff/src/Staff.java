import java.util.Scanner;

public class Staff
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int n;

        System.out.println("Enter The Number Of Staff Members Whose Details Are To Be Entered");
        n=s.nextInt();

        Staffdetails ob[] = new Staffdetails[n];

        for(int i=0;i<n;i++)
            ob[i]=new Staffdetails();

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter The Details Of "+(i+1)+" Staff Member");
            ob[i].accept();
        }
    }
}

class Staffdetails
{
    String stname;
    int stid, stphno, stsal;

    Scanner s = new Scanner(System.in);

    void accept()
    {
        Teaching obj = new Teaching();
        Technical obj1 = new Technical();
        Contract obj2 = new Contract();

        System.out.println("Enter The Name Of The Staff Member");
        stname=s.next();
        System.out.println("Enter The Id Of The Staff Member");
        stid=s.nextInt();
        System.out.println("Enter The Phone Number Of The Staff");
        stphno=s.nextInt();
        System.out.println("Enter The Salary Of The Employee");
        stsal=s.nextInt();

        System.out.println("Enter The Domain Of The Staff");
        obj.domain=s.next();
        System.out.println("Enter The Publication Of The Staff Member");
        obj.pub=s.next();

        System.out.println("Enter The Main Skill Of The Staff Member");
        obj1.skill=s.next();

        System.out.println("Enter The Contract Period Of The Staff Member");
        obj2.period=s.nextInt();
    }
}

class Teaching extends Staffdetails
{
    String domain,pub;
}

class Technical extends Staffdetails
{
    String skill;
}

class Contract extends Staffdetails
{
    int period;
}

