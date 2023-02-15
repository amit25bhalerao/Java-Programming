import java.util.Scanner;

public class FCFSAlgorithm
{
    static Scanner s = new Scanner(System.in);
    static int i,j,n,at[],bt[],tt[],wt[],ct[],sum;
    static double avgtt,avgwt,sumtt,sumwt;

    static void accept()
    {
        System.out.println("Enter The Number Of Processes");
        n=s.nextInt();
        System.out.println("Enter The Details Of "+n+" Processes");

        at=new int[n];
        bt=new int[n];
        tt=new int[n];
        wt=new int[n];
        ct=new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter The Arrival Time Of Process P:"+(i+1));
            at[i]=s.nextInt();
            System.out.println("Enter The Burst Time Of Process P:"+(i+1));
            bt[i]=s.nextInt();
        }
    }

    static void ttwt()
    {
        for(i=0;i<n;i++)
        {
            sum=0;
            j=0;

            while(j<=i)
            {
                sum=sum+bt[j];
                ++j;
            }

            ct[i]=sum;
            tt[i]=ct[i]-at[i];
            wt[i]=tt[i]-bt[i];

            sum=0;
        }

        for(i=0;i<n;i++)
        {
            sumtt=sumtt+tt[i];
            sumwt=sumwt+wt[i];
        }

        avgtt=sumtt/n;
        avgwt=sumwt/n;
    }

    static void display()
    {
        System.out.println("P\tAT\tBT\tCT\tTT\tWT");

        for(i=0;i<n;i++)
        {
            System.out.println("P"+(i+1)+"\t"+at[i]+"\t"+bt[i]+"\t"+ct[i]+"\t"+tt[i]+"\t"+wt[i]);
        }

        System.out.print("|| ");
        for(i=0;i<n;i++)
        {
            System.out.print("P:"+(i+1)+" || ");
        }

        System.out.println();
        System.out.print("|| ");

        for(i=0;i<n;i++)
        {
            System.out.print(" "+ct[i]+" || ");
        }

        System.out.println();

        System.out.println("Average Turnaround Time: "+avgtt+" Units");
        System.out.println("Average Waiting Time: "+avgwt+" Units");
    }

    public static void main(String[] args)
    {
        accept();
        ttwt();
        display();
    }
}
