import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

class CardType extends JFrame implements ActionListener
{
    JTable t1;
    JButton b1;
    String[] x = new String[]{"Card Application Form No", "Card Type Issued"};
    String[][] y = new String[1][2];
    int i = 0;
    int j = 0;
    static int count = 0;

    CardType()
    {
        super("Card Type");
        this.setSize(500, 100);
        this.setLocation(400, 400);
        String Formno = JOptionPane.showInputDialog("Enter Form Number");
        String b = "Silver Card";
        String c = "Gold Card";
        String d = "Diamond Card";
        String e = "Platinum Card";
        String f = "Premium Card";


        try {
            Conn c1 = new Conn();

            for(ResultSet rs = c1.s.executeQuery("SELECT * FROM signup2 where formno = '" + Formno + "'"); rs.next(); this.j = 0)
            {
                this.y[this.i][this.j++] = rs.getString("FORMNO");

                if(rs.getString("Income").equals("<1,50,000"))
                {
                    this.y[this.i][this.j++] = "Silver Card";
                    String q1 = "insert into cardtype values('"+Formno+"','"+b+"')";
                    c1.s.executeUpdate(q1);
                    break;
                }
                else if(rs.getString("Income").equals("<2,50,000"))
                {
                    this.y[this.i][this.j++] = "Gold Card";
                    String q1 = "insert into cardtype values('"+Formno+"','"+c+"')";
                    c1.s.executeUpdate(q1);
                    break;
                }
                else if(rs.getString("Income").equals("<5,00,000"))
                {
                    this.y[this.i][this.j++] = "Diamond Card";
                    String q1 = "insert into cardtype values('"+Formno+"','"+d+"')";
                    c1.s.executeUpdate(q1);
                    break;
                }
                else if(rs.getString("Income").equals("<10,00,000"))
                {
                    this.y[this.i][this.j++] = "Platinum Card";
                    String q1 = "insert into cardtype values('"+Formno+"','"+e+"')";
                    c1.s.executeUpdate(q1);
                    break;
                }
                else if(rs.getString("Income").equals("Above 10,00,000"))
                {
                    this.y[this.i][this.j++] = "Premium Card";
                    String q1 = "insert into cardtype values('"+Formno+"','"+f+"')";
                    c1.s.executeUpdate(q1);
                    break;
                }
            }

            ImageIcon imageIcon = new ImageIcon("secure-payment.jpg"); // load the image to a imageIcon
            Image image = imageIcon.getImage(); // transform it
            Image newimg = image.getScaledInstance(1000, 1000,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
            setIconImage(newimg);


            this.t1 = new JTable(this.y, this.x);
            this.b1 = new JButton("Print");
            this.add(this.b1, "South");
            JScrollPane sp = new JScrollPane(this.t1);
            this.add(sp);
            this.b1.addActionListener(this);
            new Services().setVisible(true);

            //String q1 = "delete from cardtype where formno = '" + Formno + "' ";
            //c1.s.executeUpdate(q1);



        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            this.t1.print();
        } catch (Exception var3) {
        }

    }

    public static void main(String[] args) {
        (new CardType()).setVisible(true);
        new Services().setVisible(true);
    }
}
