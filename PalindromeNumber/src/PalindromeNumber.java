import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int num,digit,rem=0,temp;

        System.out.println("Enter The Number To Check Whether It Is Palindrome Or Not");
        num=s.nextInt();

        temp=num;

        while(num>0)
        {
            digit=num%10;
            rem=(rem*10)+digit;
            num=num/10;
        }

        if(temp==rem)
            System.out.println(temp+" Is A Palindrome Number");
        else
            System.out.println(temp+" Isnt A Palindrome Number");
    }
}
