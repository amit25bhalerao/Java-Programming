import java.util.Scanner;

public class ImplementTwoStackUsingArrays
{
    static Scanner s = new Scanner(System.in);

    public static int array[],top1,top2,n1,n2,item,choice,stchoice=0,deleted,length;

    static void push_stack1()
    {
        if(top1==(n1-1))
        {
            System.out.println("Stack 1 Overflow");
            return;
        }

        System.out.println("Enter The Item To Be Inserted");
        item=s.nextInt();
        array[++top1]=item;
        System.out.println(item+" Inserted Successfully");
    }

    static void pop_stack1()
    {
        if(top1==-1)
        {
            System.out.println("Stack Underflow");
            return;
        }

        deleted = array[top1];
        --top1;
        System.out.println(deleted+" Deleted Successfully");
    }

    static void display_stack1()
    {
        if(top1==-1)
        {
            System.out.println("Stack 1 Is Empty");
            return;
        }

        System.out.println("Stack 1 Elements Are Displayed Below");

        for(int i=top1;i>=0;i--)
        {
            System.out.println(array[i]);
        }
    }

    static void push_stack2()
    {
        if(top2==length-1)
        {
            System.out.println("Stack 2 Overflow");
            return;
        }

        System.out.println("Enter The Item To Be Inserted");
        item=s.nextInt();
        array[++top2]=item;
        System.out.println(item+" Inserted Successfully");
    }

    static void pop_stack2()
    {
        if(top2==n1-1)
        {
            System.out.println("Stack Underflow");
            return;
        }
        deleted = array[top2--];
        System.out.println(deleted+" Deleted Successfully");
    }

    static void display_stack2()
    {
        if(top2==n1-1)
        {
            System.out.println("Stack 2 Is Empty");
            return;
        }

        System.out.println("Stack 2 Elements Are Displayed Below");

        for(int i=top2;i>=n1;i--)
        {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter Size Of Stack1");
        n1=s.nextInt();

        System.out.println("Enter Size Of Stack2");
        n2=s.nextInt();

        length=n1+n2;

        array=new int[length];

        top1 = -1;
        top2 = n1-1;


        for(;;)
        {
            System.out.println("Enter 1 To Select Stack 1 And Enter 2 To Select Stack 2");
            stchoice=s.nextInt();

            if(stchoice==1)
            {
                System.out.println("Enter 1: Push Element Into Stack 1");
                System.out.println("Enter 2: Pop Elements From Stack 1");
                System.out.println("Enter 3: Display Stack 1 Elements");
                System.out.println("Enter 4: Exit");

                System.out.println("Enter Your Choice");
                choice=s.nextInt();

                switch (choice)
                {
                    case 1:
                        push_stack1();
                        break;
                    case 2:
                        pop_stack1();
                        break;
                    case 3:
                        display_stack1();
                        break;
                    case 4:
                        System.out.println("Thank You");
                        System.exit(0);
                    default:System.out.println("Invalid Input Entered..Please Try Again");
                }
            }

            else if(stchoice==2)
            {
                System.out.println("Enter 1: Push Element Into Stack 2");
                System.out.println("Enter 2: Pop Elements From Stack 2");
                System.out.println("Enter 3: Display Stack 2 Elements ");
                System.out.println("Enter 4: Exit");

                System.out.println("Enter Your Choice");
                choice=s.nextInt();

                switch (choice)
                {
                    case 1:
                        push_stack2();
                        break;
                    case 2:
                        pop_stack2();
                        break;
                    case 3:
                        display_stack2();
                        break;
                    case 4:
                        System.out.println("Thank You");
                        System.exit(0);
                    default:System.out.println("Invalid Input Entered..Please Try Again");
                }
            }

            else
            {
                System.out.println("Invalid Input Entered...Please Try Again");
            }
        }
    }
}