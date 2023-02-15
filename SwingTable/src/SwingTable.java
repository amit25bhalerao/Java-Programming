import javax.swing.*;

public class SwingTable
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame();


        String heading[]={"SR.No","NAME","MARKS"};

        String data[][]=
                {
                        {"1","Arun","25"},
                        {"2","Amul","45"},
                        {"3","Ram","43"},
                        {"4","Sham","52"},
                        {"5","lakshman","35"},
                        {"6","Ram","46"},
                };

        JTable jTable = new JTable(data,heading);
        JScrollPane jScrollPane = new JScrollPane(jTable);

        jScrollPane.setBounds(0,0,500,400);
        jFrame.add(jScrollPane);


        jFrame.setSize(500,400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
