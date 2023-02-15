public  class Operations
{
    Node insert_at_front(Node first)
    {
        Node temp = new Node();
        temp.link=temp;
        Node cur;

        if(first==null)
        {
            first=temp;
            System.out.println(temp.item+" Inserted Successfully");
            return first;
        }

        temp.link=first;
        cur=first;

        while(cur.link!=first)
        {
            cur=cur.link;
        }
        cur.link=temp;
        first=temp;
        System.out.println(temp.item+" Inserted Successfully");
        return first;
    }

    Node insert_at_rear(Node first)
    {
        Node temp=new Node();
        temp.link=temp;

        Node cur;

        if(first==null)
        {
            first=temp;
            System.out.println(temp.item+" Inserted Successfully");
            return first;
        }

        cur=first;

        while(cur.link!=first)
        {
            cur=cur.link;
        }
        cur.link=temp;
        temp.link=first;
        System.out.println(temp.item+ " Inserted Successfully");
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

        if(first.link==first)
        {
            System.out.println(first.item+" Deleted Successfully");
            return null;
        }

        sec=first.link;
        System.out.println(first.item+" Deleted Successfully");

        cur=first;

        while(cur.link!=first)
        {
            cur=cur.link;
        }
        cur.link=sec;
        first=sec;
        return first;
    }

    Node delete_at_rear(Node first)
    {
        Node cur,prev;
        prev=null;

        if(first==null)
        {
            System.out.println("Linked List Is Empty");
            return null;
        }

        if(first.link==first)
        {
            System.out.println(first.item+" Deleted Successfully");
            return null;
        }

        cur=first;

        while(cur.link!=first)
        {
            prev=cur;
            cur=cur.link;
        }

        prev.link=first;
        System.out.println(cur.item+" Deleted Successfully");
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

        while(cur.link!=first)
        {
            System.out.println(cur.item);
            cur=cur.link;
        }
        System.out.println(cur.item);

    }
}

