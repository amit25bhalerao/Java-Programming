public class Minutes extends Thread
{
    static int j,count1;
    Minutes()
    {
        for(int j=0;j<60;j++)
        {
            Seconds s = new Seconds();
            s.start();
            try {
                s.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        j=0;
        Hours.count0=Hours.count0+1;
        count1=0;
        Hours h = new Hours();
        h.start();
    }
}
