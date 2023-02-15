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

        temp.rlink=first;
        first.llink=temp;
        first=temp;
        System.out.println(temp.item+" Inserted Successfully");
        return first;
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

        while(cur.rlink!=null)
        {
            cur=cur.rlink;
        }

        cur.rlink=temp;
        temp.llink=cur;
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
        sec=first.rlink;
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

        while(cur.rlink!=null)
        {
            prev=cur;
            cur=cur.rlink;
        }

        System.out.println(cur.item+" Deleted Successfully");
        prev.rlink=null;
        return first;
    }

    void display(Node first)
    {
        Node cur;

        if(first==null)
        {
            System.out.println("Linked List Is Empty");
            return;
        }

        cur=first;

        System.out.println("The Contents Of Linked List Are Displayed Below");

        while(cur.rlink!=null)
        {
            System.out.println(cur.item);
            cur=cur.rlink;
        }
        System.out.println(cur.item);
    }
}

























