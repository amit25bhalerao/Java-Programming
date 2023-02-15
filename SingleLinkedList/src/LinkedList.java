import java.util.Scanner;

public class LinkedList
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int item;

        Node first=null;

        Operation op=new Operation();

        System.out.println("Enter The Item To Be Inserted");
        item=s.nextInt();

        first=op.insert_front(first,item);

        op.display(first);
    }
}
