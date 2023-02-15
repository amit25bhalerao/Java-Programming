import java.util.Scanner;

public class Stack
{
    static Scanner s = new Scanner(System.in);

    static int i, top = -1, item, n, stack[];

    public Stack()
    {
        System.out.println("Enter The Size Of The Stack");
        n = s.nextInt();
        stack = new int[n];
    }

    void pop()
    {
        if (top == -1)
        {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Element Deleted Is " + stack[top--]);
    }

    void push()
    {
        if (top == (n - 1))
        {
            System.out.println("Stack Overflow");
            return;
        }

        System.out.println("Enter The Element To Be Inserted");
        item = s.nextInt();

        stack[++top] = item;
        System.out.println("Element Inserted Is " + stack[top]);
    }

    void display()
    {
        if (top == -1)
        {
            System.out.println("Stack Is Empty");
            return;
        }

        System.out.println("Stack Elements Are Displayed Below");

        for (i = top; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }


    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        Stack obj = new Stack();

        int choice;

        for(;;)
        {
            System.out.println("Enter 1: Push Operation");
            System.out.println("Enter 2: Pop Operation");
            System.out.println("Enter 3: Display Operation");
            System.out.println("Enter 4: Exit");
            System.out.println("Enter Your Choice Please");

            choice=s.nextInt();

            switch (choice)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    System.out.println("Thank You");
                    System.exit(0);
                default:System.out.println("Invalid Input Entered. Please Try Again");
            }
        }
    }
}




