import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
    JLabel l1, l2, l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1, b2, b3;

    Login()
    {
        setFont(new Font("System",Font.BOLD, 25));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("CARD APPLICATION FORM");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x - 200;
        int w = z/y;
        String pad = "";
        pad = String.format("%"+ w+ "s", pad);
        setTitle(pad + "CARD APPLICATION FORM");

        l1 = new JLabel("WELCOME TO CARD APPLICATION FORM");
        l1.setFont(new Font("ALGERIAN", Font.BOLD, 35));

        l2 = new JLabel("CARD NO: ");
        l2.setFont(new Font("ALGERIAN", Font.BOLD, 30));

        l3 = new JLabel("PIN NO: ");
        l3.setFont(new Font("ALGERIAN", Font.BOLD, 30));

        tf1 = new JTextField(15);
        pf2 = new JPasswordField(15);

        b1 = new JButton("Sign In");
        b1.setBackground(Color.white);
        b1.setForeground(Color.BLACK);

        b2 = new JButton("Clear");
        b2.setBackground(Color.white);
        b2.setForeground(Color.BLACK);

        b3 = new JButton("New User?");
        b3.setBackground(Color.white);
        b3.setForeground(Color.BLACK);

        setLayout(null);

        l1.setBounds(15,50,700,200);
        add(l1);

        l2.setBounds(125,150,375,200);
        add(l2);

        l3.setBounds(125,225,375,200);
        add(l3);

        tf1.setFont(new Font("Aerial", Font.BOLD, 15));
        tf1.setBounds(300,235,230,30);
        add(tf1);

        pf2.setFont(new Font("Aerial", Font.BOLD, 15));
        pf2.setBounds(300,310,230,30);
        add(pf2);

        b1.setFont(new Font("Aerial", Font.BOLD, 15));
        b1.setBounds(300,400,100,30);
        add(b1);

        b2.setFont(new Font("Aerial", Font.BOLD, 15));
        b2.setBounds(430,400,100,30);
        add(b2);

        b3.setFont(new Font("Aerial", Font.BOLD, 15));
        b3.setBounds(300,450,230,30);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        //getContentPane().setBackground(Color.ORANGE);

        ImageIcon imageIcon = new ImageIcon("abstract-13-4k.jpg"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        setIconImage(newimg);

        setSize(700, 550);
        setLocation(400,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            Conn c1 = new Conn();
            String a = tf1.getText();
            String b = pf2.getText();
            String q = "select * from login where cardno = '"+a+"' and pin = '" +b+"'";
            ResultSet rs = c1.s.executeQuery(q);

            if(ae.getSource() == b1)
            {
                if(rs.next())
                {
                    JOptionPane.showMessageDialog((Component)null, "Login Successful!");
                    new Services().setVisible(true);
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number Or Password Entered. Please Try Again");
                }
            }

            else if(ae.getSource() == b2)
            {
                tf1.setText("");
                pf2.setText("");
            }

            else if (ae.getSource() == b3)
            {
                new Signup1().setVisible(true);
                setVisible(false);
            }



        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args)
    {
        new Login().setVisible(true);
    }
}
