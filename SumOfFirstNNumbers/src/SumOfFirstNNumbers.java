import java.util.Scanner;

public class SumOfFirstNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n, sum;
		
		System.out.println("Enter The Value Of N Upto Which You Wish To Find The Sum Of First N Numbers");
		n=s.nextInt();
		
		sum=(n*(n+1))/2;
		
		System.out.println("The Sum Of First N Numbers Is Equal To " + sum);
		
	}

}
