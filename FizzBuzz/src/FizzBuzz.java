
public class FizzBuzz
{
    public static void main(String[]args)
    {

        for(int i=0;i<100;i++)
        {
            System.out.print(i+": ");
            if(((i%3)==0)&&((i%5)==0))
            {
                System.out.println("FizzBuzz");
                continue;
            }

            if((i%3)==0)
            {
                System.out.println("Fizz");
                continue;
            }

            if((i%5)==0)
            {
                System.out.println("Buzz");
                continue;
            }

            System.out.println(i);
        }

    }
}
