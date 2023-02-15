public class Operations
{
    Node insert_at_front(Node first)
    {
        Node temp = new Node();

        if(first==null)
        {
            first=temp;
            System.out.println(temp.item+" Inserted Successfully");
            return first;
        }

        temp.link=first;
        System.out.println(temp.item+" Inserted Successfully");
        return temp;
    }

    Node insert_at_rear(Node first)
    {
        Node temp = new Node();
        Node cur;

        if(first==null)
        {
            first=temp;
            System.out.println(temp.item+" Inserted Successfully");
            return first;
        }

        cur=first;

        while(cur.link!=null)
        {
            cur=cur.link;
        }

        cur.link=temp;
        System.out.println(temp.item+" Inserted Successfully");
        return first;

    }

    Node delete_at_front(Node first)
    {
        Node sec;

        if(first==null)
        {
            System.out.println("Linked List Is Empty");
            return first;
        }

        System.out.println(first.item+" Deleted Successfully");
        sec=first.link;
        first=sec;
        return first;
    }

    Node delete_at_rear(Node first)
    {
        Node cur,prev;

        if(first==null)
        {
            System.out.println("Linked List Is Empty");
            return first;
        }

        prev=null;
        cur=first;

        while(cur.link!=null)
        {
            prev=cur;
            cur=cur.link;
        }

        System.out.println(cur.item+" Deleted Successfully");
        prev.link=null;
        return first;
    }

    void display(Node first)
    {
        Node cur=first;

        if(first==null)
        {
            System.out.println("Linked List Is Empty");
            return;
        }

        System.out.println("The Contents Of Linked List Are Displayed Below");

        while (cur!=null)
        {
            System.out.println(cur.item);
            cur=cur.link;
        }
    }

    Node reverse(Node first)
    {
        Node prev=null;
        Node cur=first;
        Node next=null;

        while(cur!=null)
        {
            next=cur.link;
            cur.link=prev;
            prev=cur;
            cur=next;
        }
        first=prev;
        System.out.println("Linked List Reversed Successfully");
        return first;
    }
}
