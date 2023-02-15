import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class AppletIntroduction extends Applet
{
    @Override

    public void paint(Graphics g)
    {
        g.setColor(Color.ORANGE);
        g.drawString("Hello Amit", 20, 20);
    }
}