import java.util.Scanner;

public class Node
{
    int item;
    Node link;

    Scanner s = new Scanner(System.in);

    Node()
    {
        System.out.println("Enter The Item To Be Inserted");
        item=s.nextInt();
    }
}
