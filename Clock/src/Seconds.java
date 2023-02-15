import java.awt.*;

public class Seconds extends Thread
{
    static int i,count2;
    Seconds()
    {
        for (i=0;i<60;i++)
        {
            System.out.print(Hours.count0+":"+Minutes.count1+":"+count2);
            System.out.println();
            count2=count2+1;

            if((Hours.count0==Clock.hh)&&(Minutes.count1==Clock.mm)&&(count2==Clock.ss))
            {
                Toolkit.getDefaultToolkit().beep();
                System.out.println("Timer Ends Here !");
                System.exit(0);
            }

            temp t = new temp();
            t.start();
            try {
                t.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        i=0;
        count2=0;
        Minutes.count1=Minutes.count1+1;
        Minutes m = new Minutes();
        m.start();
    }
}
