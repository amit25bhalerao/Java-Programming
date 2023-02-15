import java.util.Scanner;

public class DoublyLinkedList
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int choice;

        Node first=null;
        Operations op = new Operations();

        for(;;)
        {
            System.out.println("Enter 1: Insert At Front");
            System.out.println("Enter 2: Insert At Rear");
            System.out.println("Enter 3: Delete At Front");
            System.out.println("Enter 4: Delete At Rear");
            System.out.println("Enter 5: Display");
            System.out.println("Enter 6: Exit");

            System.out.println("Enter Your Choice");
            choice=s.nextInt();

            switch (choice)
            {
                case 1:
                    first=op.insert_at_front(first);
                    break;
                case 2:
                    first=op.insert_at_rear(first);
                    break;
                case 3:
                    first=op.delete_at_front(first);
                    break;
                case 4:
                    first=op.delete_at_rear(first);
                    break;
                case 5:
                    op.display(first);
                    break;
                case 6:
                    System.out.println("Thank You");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input Entered..Please Try Again");
            }
        }
    }

}
