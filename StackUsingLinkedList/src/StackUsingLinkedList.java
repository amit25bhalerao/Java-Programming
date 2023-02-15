import java.util.Scanner;

public class StackUsingLinkedList
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int choice;

        Node first=null;
        Operations op = new Operations();

        for(;;)
        {
            System.out.println("Enter 1: Push Element Into Stack");
            System.out.println("Enter 2: Pop Element From Stack");
            System.out.println("Enter 3: Display Stack Contents");
            System.out.println("Enter 4: Exit");

            System.out.println("Enter Your Choice");
            choice=s.nextInt();

            switch (choice)
            {
                case 1:
                    first=op.insert_at_rear(first);
                    break;
                case 2:
                    first=op.delete_at_rear(first);
                    break;
                case 3:
                    op.display(first);
                    break;
                case 4:
                    System.out.println("Thank You");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input Entered..Please Try Again");
            }
        }

    }
}

