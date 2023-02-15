import javax.swing.*;


public class SwingTextArea
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame();

        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(0,0,500,400);
        jFrame.add(jTextArea);


        jFrame.setSize(500,400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jScrollPane.setBounds(0,0,500,400);
        jFrame.add(jScrollPane);
    }
}
