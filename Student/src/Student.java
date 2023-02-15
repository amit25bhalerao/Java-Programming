import java.util.Scanner;

public class Student
{
    String name, usn, phno, programme;
    Scanner s = new Scanner(System.in);

    public void read()
    {
        System.out.println("Enter The Name Of The Student");
        name = s.next();
        System.out.println("Enter The Usn Of The Student");
        usn = s.next();
        System.out.println("Enter The Phone Number Of The Student");
        phno = s.next();
        System.out.println("Enter The Programme Chosen By The Student");
        programme = s.next();
    }

    public void display()
    {
        System.out.println(name + "\t\t\t" + usn + "\t\t\t" + phno + "\t\t\t" + programme);
    }

    public static void main(String args[])
    {
        int i,n;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter The Total Number Of Students Whose Details Are To Be Accepted");
        n=s.nextInt();

        Student obj[]= new Student[n];

        for(i=0;i<n;i++)
            obj[i]=new Student();

        System.out.println("\nEnter The Details Of "+n+" Students\n");

        for(i=0;i<n;i++)
            obj[i].read();

        System.out.println("\nThe Details Of "+n+" Students Are Displayed Below\n");

        System.out.println("NAME\t\t\tUSN\t\t\tPHNO\t\t\tPROGRAMME");

        for(i=0;i<n;i++)
            obj[i].display();

    }
}

