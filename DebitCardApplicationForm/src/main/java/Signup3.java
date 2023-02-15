import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l13;
    JButton b1,b2;
    JCheckBox c1,c2,c3,c4,c7;
    JTextField t1, t2, t3, t4;
    String email1id;

    long fno;


    Signup3(Long formno, String email_id)
    {
        fno = formno;
        email1id = email_id;

        setFont(new Font("ALGERIAN", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW CARD APPLICATION FORM - PAGE 3");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"NEW CARD APPLICATION FORM - PAGE 3");


        l1 = new JLabel("NEW CARD APPLICATION FORM - PAGE 3");
        l1.setFont(new Font("ALGERIAN", Font.BOLD, 22));


        //l12 = new JLabel("Email Id: ");
        //l12.setFont(new Font("ALGERIAN", Font.BOLD, 18));

        l2 = new JLabel("Desired Credit Limit: ");
        l2.setFont(new Font("ALGERIAN", Font.BOLD, 18));

        l13 = new JLabel("Desired Cash Withdrawal Limit: ");
        l13.setFont(new Font("ALGERIAN", Font.BOLD, 18));

        l3 = new JLabel("Card Number:");
        l3.setFont(new Font("ALGERIAN", Font.BOLD, 18));

        l4 = new JLabel("XXXX-XXXX-XXXX-XXXX");
        l4.setFont(new Font("ALGERIAN", Font.BOLD, 18));

        l5 = new JLabel("(Your 16-digit Card number)");
        l5.setFont(new Font("ALGERIAN", Font.BOLD, 12));

        l6 = new JLabel("It Would Appear On ATM Card/Cheque Book And Statements");
        l6.setFont(new Font("ALGERIAN", Font.BOLD, 12));

        l7 = new JLabel("PIN:");
        l7.setFont(new Font("ALGERIAN", Font.BOLD, 18));

        l8 = new JLabel("XXXX");
        l8.setFont(new Font("ALGERIAN", Font.BOLD, 18));

        l9 = new JLabel("(4-digit password)");
        l9.setFont(new Font("ALGERIAN", Font.BOLD, 12));

        l10 = new JLabel("Services Required:");
        l10.setFont(new Font("ALGERIAN", Font.BOLD, 18));

        l11 = new JLabel("Form No: "+fno);
        l11.setFont(new Font("ALGERIAN", Font.BOLD, 16));


        b1 = new JButton("Submit");
        b1.setFont(new Font("ALGERIAN", Font.BOLD, 14));
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);

        b2 = new JButton("Cancel");
        b2.setFont(new Font("ALGERIAN", Font.BOLD, 14));
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);


        c1 = new JCheckBox("SECURITY ALERTS");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("ALGERIAN", Font.BOLD, 16));

        c2 = new JCheckBox("OFFER ALERTS");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("ALGERIAN", Font.BOLD, 16));

        c3 = new JCheckBox("EMAIL ALERTS");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("ALGERIAN", Font.BOLD, 16));

        c4 = new JCheckBox("SMS ALERTS");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("ALGERIAN", Font.BOLD, 16));


        c7 = new JCheckBox("I PERMIT BANK PERSONNEL'S TO CONTACT ME FOR ANY FURTHER COMMUNICATION",true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("ALGERIAN", Font.BOLD, 13));


        t1 = new JTextField();
        t1.setFont(new Font("Aerial", Font.BOLD, 12));

        t2 = new JTextField();
        t2.setFont(new Font("Aerial", Font.BOLD, 12));

        t3 = new JTextField();
        t3.setFont(new Font("Aerial", Font.BOLD, 12));

        t4 = new JTextField();
        t4.setFont(new Font("Aerial", Font.BOLD, 12));

        setLayout(null);

        l11.setBounds(650,10,150,30);
        add(l11);

        //t1.setBounds(720,10,55,30);
        //add(t1);

        //l12.setBounds(100,85,400,40);
        //add(l12);

        l13.setBounds(100,80,700,40);
        add(l13);

        t4.setBounds(430, 80,300,30);
        add(t4);


        t3.setBounds(330, 140,270,30);
        add(t3);

        l1.setBounds(200,25,700,40);
        add(l1);

        l2.setBounds(100,140,350,30);
        add(l2);

        //t2.setBounds(280, 140,270,30);
        //add(t2);

        l3.setBounds(100,200,200,30);
        add(l3);

        l4.setBounds(330,200,250,30);
        add(l4);

        l5.setBounds(100,220,200,20);
        add(l5);

        l6.setBounds(330,220,500,20);
        add(l6);

        l7.setBounds(100,270,200,30);
        add(l7);

        l8.setBounds(330,270,200,30);
        add(l8);

        l9.setBounds(100,290,200,20);
        add(l9);

        l10.setBounds(100,340,200,30);
        add(l10);

        c1.setBounds(100,375,200,30);
        add(c1);

        c2.setBounds(350,375,200,30);
        add(c2);

        c3.setBounds(100,420,200,30);
        add(c3);

        c4.setBounds(350,420,200,30);
        add(c4);

        c7.setBounds(100,480,520,30);
        add(c7);

        b1.setBounds(200,530,100,30);
        add(b1);

        b2.setBounds(350,530,100,30);
        add(b2);


        //getContentPane().setBackground(Color.ORANGE);

        ImageIcon imageIcon = new ImageIcon("abstract-13-4k.jpg"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        setIconImage(newimg);

        setSize(850,650);
        setLocation(400,20);
        setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae){

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        long first8 = Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        long first4 = Math.abs(first3);

        String b = "";
        if(c1.isSelected()){
            b = b+" Security Alerts";
        }
        if(c2.isSelected()){
            b = b+" Offer Alerts";
        }
        if(c3.isSelected()){
            b = b+" Email Alerts";
        }
        if(c4.isSelected()){
            b = b+" SMS Alerts";
        }

        long c = fno;
        String d = t2.getText();

        try{

            if(ae.getSource()==b1){

                if(b.equals("")){

                    JOptionPane.showMessageDialog(null, "***Please Fill All The Required Fields***");

                }else
                {


                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 values('"+c+"','"+d+"','"+first8+"','"+first4+"','"+b+"')";
                    String q2 = "insert into login values('"+first8+"','"+first4+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Your Login Credentials Have Been Sent To Your Registered Email Id!");

                    SendingMail sendingMail = new SendingMail(email1id, first4, first8);
                    sendingMail.email();

                    new Login().setVisible(true);
                    setVisible(false);
                }

            }else if(ae.getSource()==b2){
                System.exit(0);
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    public static void main(String[] args){
        new Signup3((long) 0, "").setVisible(true);
    }
}


