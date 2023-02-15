import java.util.Scanner;

public class Node
{
    Scanner s = new Scanner(System.in);

    int data;
    Node link;

    Node()
    {
        System.out.println("Enter The Item To Be Inserted Into Stack");
        this.data=s.nextInt();
    }
}
