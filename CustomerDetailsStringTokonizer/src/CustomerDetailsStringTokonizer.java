import java.util.Scanner;

public class CustomerDetailsStringTokonizer
{
    public static void main(String[] args)
    {
        String name, date;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter The Name");
        name=s.nextLine();
        System.out.println("Enter The Date In Format DD/MM/YYYY");
        date=s.nextLine();

        Customer c = new Customer();
        c.getdetails(name,date);
    }
}
