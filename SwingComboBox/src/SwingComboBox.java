import javax.swing.*;


public class SwingComboBox
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame();

        String branch[]={"CSE","ISE"};
        JComboBox jComboBox = new JComboBox(branch);

        jFrame.setSize(500,400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jComboBox.setBounds(50,50,100,30);
        jFrame.add(jComboBox);
    }
}
