import java.util.Scanner;

public class ReverseStringUsingRecursion
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter The String");
        String str = s.next();

        String reversed = reverseString(str);
        System.out.println("The Reversed String Is : " + reversed);
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}