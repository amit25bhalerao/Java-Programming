import javax.swing.*;

public class SwingCheckBox
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame();
        JCheckBox jCheckBox = new JCheckBox("MALE");

        jCheckBox.setBounds(50,50,100,100);
        jFrame.add(jCheckBox);

        jFrame.setSize(1000,500);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
