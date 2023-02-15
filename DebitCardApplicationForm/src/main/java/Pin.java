import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Pin extends JFrame implements ActionListener
{
    JPasswordField t1;
    JPasswordField t2;
    JPasswordField t3;
    JButton b1;
    JButton b2;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;

    Pin() {
        this.setFont(new Font("ALGERIAN", 1, 22));
        Font f = this.getFont();
        FontMetrics fm = this.getFontMetrics(f);
        int x = fm.stringWidth("PIN CHANGE");
        int y = fm.stringWidth(" ");
        int z = this.getWidth() - 4 * x - 50;
        int w = z / y;
        String pad = "";
        pad = String.format("%" + w + "s", pad);
        this.setTitle(pad + "PIN CHANGE");
        this.l1 = new JLabel("CHANGE YOUR PIN");
        this.l1.setFont(new Font("ALGERIAN", 1, 35));
        this.l2 = new JLabel("Current PIN:");
        this.l2.setFont(new Font("ALGERIAN", 1, 22));
        this.l3 = new JLabel("New PIN:");
        this.l3.setFont(new Font("ALGERIAN", 1, 22));
        this.l4 = new JLabel("Re-Enter New PIN:");
        this.l4.setFont(new Font("ALGERIAN", 1, 22));
        this.t1 = new JPasswordField();
        this.t1.setFont(new Font("ALGERIAN", 1, 22));
        this.t2 = new JPasswordField();
        this.t2.setFont(new Font("ALGERIAN", 1, 22));
        this.t3 = new JPasswordField();
        this.t3.setFont(new Font("ALGERIAN", 1, 22));
        this.b1 = new JButton("SAVE");
        this.b1.setFont(new Font("ALGERIAN", 1, 18));
        this.b1.setBackground(Color.WHITE);
        this.b1.setForeground(Color.BLACK);
        this.b2 = new JButton("BACK");
        this.b2.setFont(new Font("System", 1, 18));
        this.b2.setBackground(Color.WHITE);
        this.b2.setForeground(Color.BLACK);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.setLayout((LayoutManager)null);
        this.l1.setBounds(220, 130, 800, 60);
        this.add(this.l1);
        this.l2.setBounds(90, 240, 150, 40);
        this.add(this.l2);
        this.l3.setBounds(90, 300, 180, 40);
        this.add(this.l3);
        this.l4.setBounds(90, 360, 250, 40);
        this.add(this.l4);
        this.t1.setBounds(350, 240, 360, 40);
        this.add(this.t1);
        this.t2.setBounds(350, 300, 360, 40);
        this.add(this.t2);
        this.t3.setBounds(350, 360, 360, 40);
        this.add(this.t3);
        this.b1.setBounds(220, 460, 160, 50);
        this.add(this.b1);
        this.b2.setBounds(400, 460, 160, 50);
        this.add(this.b2);
        //this.getContentPane().setBackground(Color.ORANGE);

        ImageIcon imageIcon = new ImageIcon("abstract-13-4k.jpg"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        setIconImage(newimg);

        this.setSize(800, 600);
        this.setLocation(400, 40);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String a = this.t1.getText();
            String b = this.t2.getText();
            String c = this.t3.getText();
            if (ae.getSource() == this.b1) {
                if (this.t1.getText().equals("")) {
                    JOptionPane.showMessageDialog((Component)null, "Please Enter Current PIN");
                }

                if (this.t2.getText().equals("")) {
                    JOptionPane.showMessageDialog((Component)null, "Enter New PIN");
                }

                if (this.t3.getText().equals("")) {
                    JOptionPane.showMessageDialog((Component)null, "Re-Enter New PIN");
                }

                if (this.t2.getText().equals(this.t3.getText())) {
                    Conn c1 = new Conn();
                    String q1 = "update login set pin = '" + b + "' where pin = '" + a + "' ";
                    String q2 = "update signup3 set pin = '" + b + "' where pin = '" + a + "' ";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog((Component)null, "PIN Changed Successfully");
                    (new Services()).setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "PIN Entered Doesn't Match");
                }
            } else if (ae.getSource() == this.b2) {
                (new Services()).setVisible(true);
                this.setVisible(false);
            }
        } catch (Exception var9) {
            var9.printStackTrace();
            System.out.println("Error: " + var9);
        }

    }

    public static void main(String[] args) {
        (new Pin()).setVisible(true);
    }
}
