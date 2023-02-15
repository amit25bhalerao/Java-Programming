import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Services extends JFrame implements ActionListener{

    JLabel l1;
    JButton b4,b5,b6,b7;

    Services(){

        setFont(new Font("ALGERIAN", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("SERVICES AVAILABLE");
        int y = fm.stringWidth(" ");
        int z = getWidth() - 2*x - 100 ;
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"SERVICES AVAILABLE");

        l1 = new JLabel("Please Select Your Desired Service Option");
        l1.setFont(new Font("ALGERIAN", Font.BOLD, 29));

        b4 = new JButton("CARD TYPE");
        b4.setFont(new Font("ALGERIAN", Font.BOLD, 18));
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.BLACK);


        b5 = new JButton("PIN CHANGE");
        b5.setFont(new Font("ALGERIAN", Font.BOLD, 18));
        b5.setBackground(Color.WHITE);
        b5.setForeground(Color.BLACK);

        b6 = new JButton("VIEW PERSONAL DETAILS");
        b6.setFont(new Font("ALGERIAN", Font.BOLD, 18));
        b6.setBackground(Color.WHITE);
        b6.setForeground(Color.BLACK);

        b7 = new JButton("EXIT");
        b7.setFont(new Font("ALGERIAN", Font.BOLD, 18));
        b7.setBackground(Color.WHITE);
        b7.setForeground(Color.BLACK);

        setLayout(null);

        l1.setBounds(50,100,700,40);
        add(l1);

        b4.setBounds(240, 240, 300, 60);
        add(b4);

        b5.setBounds(40,150,300,60);
        add(b5);

        b6.setBounds(440,150,300,60);
        add(b6);

        b7.setBounds(240,330,300,60);
        add(b7);

        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        //getContentPane().setBackground(Color.ORANGE);

        ImageIcon imageIcon = new ImageIcon("abstract-13-4k.jpg"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        setIconImage(newimg);


        setSize(800,600);
        setLocation(400,40);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
         if(ae.getSource()==b5)
         {
         new Pin().setVisible(true);
         setVisible(false);
         }

         else if(ae.getSource()==b4)
         {
             new CardType().setVisible(true);
             setVisible(false);
         }


         else if(ae.getSource()==b6)
         {
         new PersonalDetails().setVisible(true);
         setVisible(false);
         }
         else if(ae.getSource()==b7)
         {
         System.exit(0);
         }
    }

    public static void main(String[] args)
    {
        new Services().setVisible(true);
    }
}