import java.util.Scanner;

public class GenderGame
{
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);

        String firstname, lastname;
        char gender, marriagestatus;
        int age;

        System.out.print("What Is Your Gender (M or F): ");
        gender = s.next().charAt(0);

        if (('F' == gender) || ('M' == gender))
        {
            System.out.print("First Name: ");
            firstname = s.next();
            System.out.print("Last Name: ");
            lastname = s.next();
            System.out.print("Age: ");
            age = s.nextInt();

            if (age < 0)
            {
                System.out.println("Invalid Age Entered. Program Will Terminate");
                System.exit(0);
            }

            if (age >= 20)
            {
                System.out.print("Are You Married, " + firstname + " (Y or N): ");
                marriagestatus = s.next().charAt(0);

                if ('Y' == marriagestatus)
                {
                    if (gender == 'F')
                    {
                        System.out.println("Then I Shall Call You Mrs. " + firstname + " " + lastname);
                    }

                    if ((gender == 'M'))
                    {
                        System.out.println("Then I Shall Call You Mr. " + firstname + " " + lastname);
                    }
                }

                else if('N' == marriagestatus)
                {
                    if (gender == 'F')
                    {
                        System.out.println("Then I Shall Call You Ms. " + firstname + " " + lastname);
                    }

                    if ((gender == 'M'))
                    {
                        System.out.println("Then I Shall Call You Mr. " + firstname + " " + lastname);
                    }
                }

                else
                {
                    System.out.println("Invalid Marriage Status Entered. Program Will Terminate");
                    System.exit(0);
                }
            }

            else
            {
                if (gender == 'F')
                {
                    System.out.println("Then I Shall Call You " + firstname + " " + lastname);
                }

                if ((gender == 'M'))
                {
                    System.out.println("Then I Shall Call You " + firstname + " " + lastname);
                }
            }
        }

        else
        {
            System.out.println("Invalid Gender Entered. Program Will Terminate");
            System.exit(0);
        }
    }
}