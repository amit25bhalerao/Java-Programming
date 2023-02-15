import java.util.Scanner;

public class Curvefittingstraightline
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        int i,n,choice=0;

        double sumx=0.0,sumy=0.0,sumxx=0.0,sumxy=0.0;
        double a=0,b=0,a1,b1,c1,a2,b2,c2,detx,dety,det;

        System.out.println("Enter The Value Of N");
        n=s.nextInt();

        double x[]=new double[n];
        double y[]=new double[n];

        System.out.println("Enter The Value Of X and Y Present In The Data Set Of The Straight Line Of Form Y=A+BX Or Y=AX+B");

        System.out.println("Enter 1 To Enter Data From Data Set Of Form Y=A+BX");
        System.out.println("Enter 2 To Enter Data From Data Set Of Form Y=AX+B");
        System.out.println("Enter Your Choice");
        choice=s.nextInt();

        if((choice!=1)&&(choice!=2))
        {
            System.out.println("Invalid Input Entered");
            System.exit(0);
        }

        for(i=0;i<n;i++)
        {
            System.out.print("X"+(i+1)+": ");
            x[i]=s.nextDouble();
            System.out.print("Y"+(i+1)+": ");
            y[i]=s.nextDouble();
        }

        for(i=0;i<n;i++)
        {
            sumx=sumx+x[i];
            sumy=sumy+y[i];
            sumxx=sumxx+(x[i]*x[i]);
            sumxy=sumxy+(x[i]*y[i]);
        }

        System.out.println("Summation X: "+sumx);
        System.out.println("Summation Y: "+sumy);
        System.out.println("Summation X^2: "+sumxx);
        System.out.println("Summation XY: "+sumxy);

        a1=(double)n;
        b1=(double)sumx;
        c1=(double)sumy;
        a2=(double)sumx;
        b2=(double)sumxx;
        c2=(double)sumxy;

        if((a1==0&&b1==0&&c1==0)||(a2==0&&b2==0&&c2==0))
            System.out.println("The Equation Has Infinite Solution");
        else if((a1==0&&b1==0&&c1!=0)||(a2==0&&b2==0&&c2!=0))
            System.out.println("The Equation Has No Solution");
        else if(a1==0)
        {
            System.out.println("The equation has unique solution");
            a=c1/b1;
            b=(c2 - b2*a)/a2;
        }
        else if(a2==0)
        {
            System.out.println("The equation has unique solution");
            b=c2 / b2;
            a=(c1 - b1*b) / a1;
        }
        else if(b1==0)
        {
            System.out.println("The equation has unique solution");
            a=c1 / a1;
            b=(c2 - a2*a) / b2;
        }
        else if(b2==0)
        {
            System.out.println("The equation has unique solution");
            a=c2 / a2;
            b=(c2 - a2*a) / b2;
        }
        else
        {
            System.out.println("The equation has unique solution");

            det=b1*a2 - a1*b2;

            detx=b1*c2 - b2*c1;
            a=detx / det;

            dety=c1*a2 - c2*a1;
            b=dety / det;
        }

        if(choice==1)
        {
            System.out.println("X = "+a);
            System.out.println("Y = "+b);
        }
        else
        {
            System.out.println("X = "+b);
            System.out.println("Y = "+a);
        }
    }
}
