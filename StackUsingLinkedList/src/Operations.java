public class Operations
{
    Node insert_at_rear(Node first)
    {
        Node cur;
        Node temp = new Node();
        temp.link=null;

        if(first==null)
        {
            first=temp;
            System.out.println(temp.data+" Pushed Into The Stack Successfully");
            return first;
        }

        cur=first;

        while(cur.link!=null)
        {
            cur=cur.link;
        }

        cur.link=temp;
        System.out.println(temp.data+" Pushed Into The Stack Successfully");
        return first;
    }

    Node delete_at_rear(Node first)
    {
        Node cur,prev;

        if(first==null)
        {
            System.out.println("No Elements In The Stack To Be Deleted");
            return first;
        }

        if(first.link==null)
        {
            System.out.println(first.data+" Deleted Successfully");
            return null;
        }

        prev=null;
        cur=first;

        while(cur.link!=null)
        {
            prev=cur;
            cur=cur.link;
        }

        System.out.println(cur.data+" Popped Successfully From The Stack");
        prev.link=null;
        return first;
    }

    void display(Node first)
    {
        Node cur;

        if(first==null)
        {
            System.out.println("Stack Is Empty");
            return;
        }

        cur=first;

        System.out.println("The Contents Of Stack Are Displayed Below");

        while(cur!=null)
        {
            System.out.println(cur.data);
            cur=cur.link;
        }
    }
}
