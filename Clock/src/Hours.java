public class Hours extends Thread
{
    static int k,count0;
    Hours()
    {
        for(k=0;k<24;k++)
        {
            Minutes m = new Minutes();
            m.start();

            try {
                m.sleep(3600000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        k=0;
    }
}
