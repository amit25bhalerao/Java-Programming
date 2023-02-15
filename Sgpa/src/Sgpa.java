import java.util.Scanner;

public class Sgpa
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int i,n,totalc=0,sumval=0,count=0;
        float sgpa;
        double per;
        String status;

        System.out.println("Enter The Total Number Of Courses In The Semester");
        n=s.nextInt();

        int m[] = new int[n];
        int c[] = new int[n];
        int g[] = new int[n];

        String crcode[] = new String[n];

        for(i=0;i<n;i++)
        {
            System.out.println("Enter The Course Code Of Course "+(i+1));
            crcode[i]=s.next();
            System.out.println("Enter The Marks Obtained In Course "+crcode[i]);
            m[i]=s.nextInt();
            System.out.println("Enter The Credits Allocated For Course "+crcode[i]);
            c[i]=s.nextInt();
        }

        for(i=0;i<n;i++)
        {
            if(m[i]>=90)
                g[i]=10;
            else if(m[i]>=80)
                g[i]=9;
            else if(m[i]>=70)
                g[i]=8;
            else if(m[i]>=60)
                g[i]=7;
            else if(m[i]>=50)
                g[i]=6;
            else if(m[i]>=45)
                g[i]=5;
            else if(m[i]>=40)
                g[i]=4;
            else
                g[i]=0;

            sumval=sumval+(g[i]*c[i]);
            totalc=totalc+c[i];
        }

        System.out.println("COURSE  \t\tMARKS  \t\tCREDITS  \t\tGRADE  \t\tSTATUS");

        for(i=0;i<n;i++)
        {
            if(g[i]>=4.0)
                status="PASS";
            else
                status="FAIL";
            System.out.println(crcode[i]+"\t\t\t"+m[i]+"\t\t\t"+c[i]+"\t\t\t\t"+g[i]+"\t\t\t\t"+status);
        }

        sgpa=(float)sumval/totalc;
        per=(sgpa-0.75)*10;

        System.out.println("PERCENTAGE OBTAINED: "+per);
        System.out.println("SGPA OBTAINED: "+sgpa);

        for(i=0;i<n;i++)
        {
            if(g[i]<4)
                count=count+1;
        }

        if((sgpa>7.0)&&(count<4))
        {
            System.out.println("RESULT: FIRST CLASS WITH DISTINCTION");
        }
        else if ((sgpa>6.0)&&(count<4))
        {
            System.out.println("RESULT: FIRST CLASS");
        }
        else if((sgpa>3.5)&&(count<4))
        {
            System.out.println("RESULT: SECOND CLASS");
        }
        else
        {
            System.out.println("RESUlT: FAIL");
        }
    }
}
