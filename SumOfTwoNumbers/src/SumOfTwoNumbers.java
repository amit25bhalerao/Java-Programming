import java.util.Scanner;

public class SumOfTwoNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.println("Enter The First Number");
        a = scanner.nextInt();

        System.out.println("Enter The Second Number");
        b = scanner.nextInt();

        System.out.println("The Product Of " + a + " And " + b + " Equals " + (a+b));
    }
}
