import java.util.Scanner;

public class MergeSinglyLinkedList
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int choice;
        int ch;

        Node first1=null;
        Node first2=null;
        Operations op = new Operations();

        for(;;)
        {
            System.out.println("Enter -1 For First Linked List A And -2 For Second Linked List B Or 0 To Exit");
            ch=s.nextInt();

            if(ch==0)
            {
                System.out.println("Thank You");
                System.exit(0);
            }

            if(ch==-1)
            {
                System.out.println("Enter 1: Insert At Front");
                System.out.println("Enter 2: Insert At Rear");
                System.out.println("Enter 3: Delete At Front");
                System.out.println("Enter 4: Delete At Rear");
                System.out.println("Enter 5: Display");
                System.out.println("Enter 6: Merge Linked List A With B");
                System.out.println("Enter 7: Exit");

                System.out.println("Enter Your Choice");
                choice=s.nextInt();

                switch (choice)
                {
                    case 1:
                        first1=op.insert_at_front(first1);
                        break;
                    case 2:
                        first1=op.insert_at_rear(first1);
                        break;
                    case 3:
                        first1=op.delete_at_front(first1);
                        break;
                    case 4:
                        first1=op.delete_at_rear(first1);
                        break;
                    case 5:
                        op.display(first1);
                        break;
                    case 6:
                        first1=op.MergeAWithB(first1,first2);
                        break;
                    case 7:
                        System.out.println("Thank You");
                        System.exit(0);
                    default:
                        System.out.println("Invalid Input Entered..Please Try Again");
                }
            }

            if(ch==-2)
            {
                System.out.println("Enter 1: Insert At Front");
                System.out.println("Enter 2: Insert At Rear");
                System.out.println("Enter 3: Delete At Front");
                System.out.println("Enter 4: Delete At Rear");
                System.out.println("Enter 5: Display");
                System.out.println("Enter 6: Merge Linked List B With A");
                System.out.println("Enter 7: Exit");

                System.out.println("Enter Your Choice");
                choice=s.nextInt();
                switch (choice)
                {
                    case 1:
                        first2=op.insert_at_front(first2);
                        break;
                    case 2:
                        first2=op.insert_at_rear(first2);
                        break;
                    case 3:
                        first2=op.delete_at_front(first2);
                        break;
                    case 4:
                        first2=op.delete_at_rear(first2);
                        break;
                    case 5:
                        op.display(first2);
                        break;
                    case 6:
                        first2=op.MergeBWithA(first2,first1);
                        break;
                    case 7:
                        System.out.println("Thank You");
                        System.exit(0);
                    default:
                        System.out.println("Invalid Input Entered..Please Try Again");
                }
            }

            if((ch!=-1)&&(ch!=-2))
            {
                System.out.println("Invalid Input Entered..Please Choose Among Given Options");
            }
        }
    }
}

