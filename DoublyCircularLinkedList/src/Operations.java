public class Operations
{
    Node insert_at_front(Node first)
    {
        Node cur;

        Node temp=new Node();
        temp.rlink=temp;
        temp.llink=temp;

        if(first==null)
        {
            first=temp;
            System.out.println(temp.item+" Inserted Successfully");
            return first;
        }

        cur=first;

        while(cur.rlink!=first)
            cur=cur.rlink;

        temp.rlink=first;
        temp.llink=cur;
        cur.rlink=temp;
        first=temp;
        System.out.println(temp.item+" Inserted Successfully");
        return first;
    }

    Node insert_at_rear(Node first)
    {
        Node cur;

        Node temp=new Node();
        temp.rlink=temp;
        temp.llink=temp;

        if(first==null)
        {
            first=temp;
            System.out.println(temp.item+" Inserted Successfully");
            return first;
        }

        cur=first;

        while(cur.rlink!=first)
            cur=cur.rlink;

        cur.rlink=temp;
        System.out.println(temp.item+" Inserted Successfully");
        temp.llink=cur;
        temp.rlink=first;
        first.llink=temp;
        return first;
    }

    Node delete_at_front(Node first)
    {
        Node sec,cur;

        if(first==null)
        {
            System.out.println("Linked List Is Empty");
            return null;
        }

        if(first.rlink==first)
        {
            System.out.println(first.item+" Deleted Successfully");
            return null;
        }

        sec=first.rlink;
        cur=first;

        while(cur.rlink!=first)
            cur=cur.rlink;

        System.out.println(first.item+" Deleted Successfully");
        cur.rlink=sec;
        sec.llink=cur;
        first=sec;
        return first;
    }

    Node delete_at_rear(Node first)
    {
        Node cur,prev;

        if(first==null)
        {
            System.out.println("Linked List Is Empty");
            return null;
        }

        if(first.rlink==first)
        {
            System.out.println(first.item+" Deleted Successfully");
            return null;
        }

        prev=null;
        cur=first;

        while(cur.rlink!=first)
        {
            prev=cur;
            cur=cur.rlink;
        }

        System.out.println(cur.item+" Deleted Successfully");
        prev.rlink=first;
        first.llink=prev;
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

        System.out.println("The Contents Of Linked List Are Displayed Below");
        cur=first;

        while(cur.rlink!=first)
        {
            System.out.println(cur.item);
            cur=cur.rlink;
        }

        System.out.println(cur.item);
    }
}