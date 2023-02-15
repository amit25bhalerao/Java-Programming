import java.util.Scanner;

public class SwappingOfTwoVariables
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		float first,second;
		
		System.out.println("Enter First Number");
		first=s.nextFloat();
		
		System.out.println("Enter Second Number");
		second=s.nextFloat();

        System.out.println("--Before Swapping--");
        System.out.println("First Number = " + first);
        System.out.println("Second Number = " + second);

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After Swapping--");
        System.out.println("First Number = " + first);
        System.out.println("Second Number = " + second);
	}

}
