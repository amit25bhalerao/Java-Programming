import java.util.Scanner;

public class WayToHeaven
{
    static int ways(int n)
    {
        if(n==0)
            return 1;
        if(n==1)
            return 1;
        return ways(n-1)+ways(n-2);
    }

    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);

        int n,res;

        System.out.println("Enter The Total Number Of Steps Present To The Heaven Gateaway");
        n=s.nextInt();

        res=ways(n);

        System.out.println("The Total Number Of Ways To Reach Heaven Gateway When "+n+" Steps Are There Are "+res);
    }
}
