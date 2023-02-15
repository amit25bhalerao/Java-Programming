import java.util.Scanner;

public class SpaceBoxing
{
    public static void main(String[]args)
    {
        Scanner s =new Scanner(System.in);

        double lbs, newlbs;
        int choice;
        double relativegravity [] = {0.78,0.39,2.65,1.17,1.05,1.23};

        System.out.println("Please Enter Your Current Earth Weight");
        lbs=s.nextDouble();

        System.out.println("I Have Information For The Following Planets");
        System.out.println("1. Venus        2. Mars         3.Jupiter");
        System.out.println("4. Saturn       5. Uranus       6.Neptune");

        System.out.println("Which Planet Are You Visiting?");
        choice=s.nextInt();

        if((choice<1)||(choice>relativegravity.length))
        {
            System.out.println("Invalid Input Entered...Program Will Quit");
            System.exit(0);
        }

        newlbs = relativegravity[choice-1]*lbs;
        System.out.println("Your Weight Would Be "+newlbs+" Pounds On That Planet");


    }
}
