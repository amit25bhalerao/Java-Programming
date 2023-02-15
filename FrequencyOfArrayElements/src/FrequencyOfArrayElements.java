import java.util.Scanner;

public class FrequencyOfArrayElements
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a[],n,i,j,freq[],count=0;


        System.out.println("Enter The Size Of The Array");
        n=s.nextInt();
        a=new int[n];
        freq=new int[n];

        System.out.println("Enter "+n+" Values In The Array");

        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }

        for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    freq[j]=-1;
                }
            }

            if(freq[i]!=-1)
            {
                freq[i]=count;
            }

        }

        for(i=0;i<freq.length;i++)
        {
            if(freq[i]!=-1)
            {
                System.out.println(a[i]+" Occurs "+freq[i]+" Times");
            }
        }
    }
}
