import java.util.Scanner;

public class MissingNumberInArray
{
    public static void main(String[] args)
    {
        int i,j,first,last,temp[],a[],sum[],constant=0,max;

        first=Integer.parseInt(args[0]);

        a=new int[args.length];

        for(i=0;i<args.length;i++)
        {
            a[i]=Integer.parseInt(args[i]);
        }

        max=a[0];

        for(i=1;i<args.length;i++)
        {
            if(max<=a[i])
                max=a[i];
        }

        last=max;
        sum=new int[last+1];
        temp=new int[last+1];


        for(i=first;i<last+1;i++)
        {
            sum[i]=(i*(i+1))/2;
        }


        for(i=first;i<last+1;i++)
        {
            j=a[constant];
            temp[j]=(j*(j+1))/2;
            ++constant;


            if(constant==args.length)
                break;
        }

        System.out.println("The Missing Elements");

        for(i=first;i<last+1;i++)
        {

            if(sum[i]!=temp[i])
            {
                System.out.println(i);
            }
        }
    }
}
