import java.util.Scanner;

public class BulbFlip
{
    public static void main(String[]args)
    {
        int k;

        Scanner s = new Scanner(System.in);

        System.out.println("Bulb Has 2 States i.e. 0 - OFF State And 1 - ON State");

        System.out.println("Enter The Number Of Times You Wish To Flip The State Of The Bulb");
        k=s.nextInt();

        if(k%2==0)
        {
            System.out.println("The Bulb Is In Off State After "+k+" Flips");
        }
        else
        {
            System.out.println("The Bulb Is In On State After "+k+" Flips");
        }
    }
}
