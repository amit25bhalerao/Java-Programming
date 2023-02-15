import java.util.Scanner;

public class InteractiveQuiz
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int choice, count=0;

        System.out.println("Are You Ready For A Quiz");
        System.out.println("Okay, Here It Comes");

        System.out.println("Q1) What Is The Capital Of Alaska");
        System.out.println("        1)Melbourne");
        System.out.println("        2)Anchorage");
        System.out.println("        3)Juneau");

        choice=s.nextInt();

        if(choice==3)
        {
            System.out.println("That's Correct!");
            count++;
        }
        else if((choice==2)||(choice==1))
        {
            System.out.println("That's Wrong. Capital of Alaska Is Juneau");
        }
        else
        {
            System.out.println("Invalid Input Entered...You Missed A Chance To Answer Correctly!");
        }


        System.out.println("Q2) Can You Store The Value \'\'Cat\'\' In A Variable Of Type Int");
        System.out.println("        1)Yes");
        System.out.println("        2)No");

        choice=s.nextInt();

        if(choice==2)
        {
            System.out.println("That's Correct!");
            count++;
        }
        else if(choice==1)
        {
            System.out.println("Sorry, \'\'Cat\'\' Is A String. Int'c Can Only Store Numbers");
        }
        else
        {
            System.out.println("Invalid Input Entered...You Missed A Chance To Answer Correctly!");
        }


        System.out.println("Q3) What Is The Result Of 9+6/3");
        System.out.println("        1)5");
        System.out.println("        2)11");
        System.out.println("        3)15/3");

        choice=s.nextInt();

        if(choice==2)
        {
            System.out.println("That's Correct!");
            count++;
        }
        else if((choice==1)||(choice==3))
        {
            System.out.println("That's Wrong. The Expression Evaluates To 11");
        }
        else
        {
            System.out.println("Invalid Input Entered...You Missed A Chance To Answer Correctly!");
        }

        System.out.println("Overall, You Got "+count+" Correct Out Of 3");
        System.out.println("Thanks For Playing");
    }
}
