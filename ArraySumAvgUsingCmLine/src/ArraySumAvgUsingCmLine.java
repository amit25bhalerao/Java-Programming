public class ArraySumAvgUsingCmLine
{
    public static void main(String[]args)
    {
        int sum=0,num;

        for(int i=0;i<args.length;i++)
        {
            num=Integer.parseInt(args[i]);
            sum+=num;
        }

        System.out.println("Sum: "+sum);
        System.out.println("Average: "+sum/args.length);
    }
}
