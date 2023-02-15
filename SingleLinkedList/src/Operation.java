import java.util.Scanner;

public class Operation
{
    Node temp=new Node();
    Scanner s = new Scanner(System.in);

    Node insert_front(Node first, int item)
    {
        temp.data=item;
        temp.link=null;

        if(first==null)
        {
            System.out.println("Item Inserted "+item);
            return temp;
        }

        temp.link=first;
        first=temp;
        return first;
    }

    void display(Node first)
    {
        Node cur;
        cur=first;

        while(cur!=null)
        {
            System.out.println(cur.data);
            cur=cur.link;
        }
    }
}
