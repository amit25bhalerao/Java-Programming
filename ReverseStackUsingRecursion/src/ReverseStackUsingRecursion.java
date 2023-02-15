import java.util.Scanner;

public class ReverseStackUsingRecursion
{
    Scanner s = new Scanner(System.in);

    static int stack[],n,temp[],top=-1,constant=0,size,deleted;

    static void push(int item)
    {
        Scanner s = new Scanner(System.in);

        if(top==(n-1))
        {
            return;
        }

        stack[++top]=item;
    }

    static void pop()
    {
        deleted=stack[top--];
    }

    static void display()
    {
        if(top==-1)
        {
            System.out.println("Stack Is Empty");
            return;
        }

        System.out.println("The Contents Of Stack Are Displayed Below");

        for(int i=top;i>=0;i--)
        {
            System.out.println(stack[i]);
        }

    }

    static void reverse()
    {

        if(top==-1)
            return;
        temp[constant++]=stack[top];
        pop();
        reverse();
        push(temp[size++]);
    }

    public static void main(String[] args)
    {
        int choice,item;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter The Size Of The Stack");
        n=s.nextInt();

        stack=new int[n];
        temp=new int[n];
        size=0;

        for(;;)
        {
            System.out.println("Enter 1: Push Element Into Stack");
            System.out.println("Enter 2: Pop Elements From Stack");
            System.out.println("Enter 3: Reverse Stack Elements");
            System.out.println("Enter 4: Display Stack Contents");
            System.out.println("Enter 5: Exit");

            System.out.println("Enter Your Choice");
            choice=s.nextInt();

            switch (choice)
            {
                case 1:
                    if(top!=n-1)
                    {
                        System.out.println("Enter The Item To Be Inserted Into Stack");
                        item=s.nextInt();
                        push(item);
                        System.out.println(item+" Pushed Successfully Into Stack");
                    }
                    else
                    {
                        System.out.println("Stack Overflow");
                    }
                    break;
                case 2:
                    if(top!=-1)
                    {
                        pop();
                        System.out.println(deleted+" Popped Successfully From Stack");
                    }
                    else
                    {
                        System.out.println("Stack Underflow");
                    }
                    break;
                case 3:
                    reverse();
                    System.out.println("Stack Reversed Successfully");
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("Thank You");
                    System.exit(0);
                default:System.out.println("Invalid Input Entered..Please Try Again");
            }
        }
    }
}
