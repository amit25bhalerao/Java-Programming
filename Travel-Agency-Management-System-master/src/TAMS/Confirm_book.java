/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAMS;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import java.sql.Connection;
//import java.sql.Time;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author HP
 */
public class Confirm_book extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    /**
     * Creates new form Confirm_book
     */
    public Confirm_book() {
        initComponents();
        conn = Mysqlconnect.ConnectDB();
        retrieve();
     }
    public void retrieve()
    {
  
        String sql="SELECT vid FROM vehicle";
        String bb="select eid from employee";
        PreparedStatement ps1=null;
         ResultSet rs1=null;

        try
        {
              //STATEMENT
            conn = Mysqlconnect.ConnectDB();
            pst=conn.prepareStatement(sql);
             ps1=conn.prepareStatement(bb);
             rs=pst.executeQuery(sql);
             rs1=ps1.executeQuery(bb);

            //LOOP THRU GETTING ALL VALUES
            while(rs.next())
            {
                //GET VALUES
                String name=rs.getString("vid");

                combovid.addItem(name);
                
            }
            while(rs1.next())
            {
                //GET VALUES
                String name1=rs1.getString("eid");

                comboeid.addItem(name1);
                
            }
            
         }
         catch(Exception e){
            JOptionPane.showMessageDialog(null,e);  
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Bookbtn = new javax.swing.JButton();
        Tid2 = new javax.swing.JTextField();
        Tid3 = new javax.swing.JTextField();
        Tid4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combovid = new javax.swing.JComboBox<>();
        comboeid = new javax.swing.JComboBox<>();
        disp2 = new javax.swing.JLabel();
        disp1 = new javax.swing.JLabel();
        disp3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Calculate = new java.awt.Button();
        disp0 = new javax.swing.JLabel();
        Cid2 = new javax.swing.JTextField();
        Tid6 = new javax.swing.JTextField();
        Cdate = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        header.setBackground(new java.awt.Color(102, 0, 153));
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headerMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CONFIRM BOOKING");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Trip ID ");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer ID ");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vechicle ID ");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee ID ");

        Bookbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Bookbtn.setText("CONFIRM BOOKING");
        Bookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookbtnActionPerformed(evt);
            }
        });

        Tid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tid2ActionPerformed(evt);
            }
        });

        Tid3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tid3ActionPerformed(evt);
            }
        });

        Tid4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tid4ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Distance");

        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Amount");

        combovid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combovidItemStateChanged(evt);
            }
        });
        combovid.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combovidPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        combovid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combovidActionPerformed(evt);
            }
        });

        comboeid.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboeidPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        disp2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        disp2.setForeground(new java.awt.Color(255, 255, 255));

        disp1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        disp1.setForeground(new java.awt.Color(255, 255, 255));

        disp3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        disp3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date");

        Calculate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Calculate.setLabel("CALCULATE");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        disp0.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        disp0.setForeground(new java.awt.Color(255, 255, 255));

        Cid2.setText("jTextField1");
        Cid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cid2ActionPerformed(evt);
            }
        });

        Tid6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tid6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(85, 85, 85))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Tid3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Tid4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(comboeid, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combovid, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Cid2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tid6, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(132, 132, 132)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Tid2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Cdate, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(1, 1, 1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(disp3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disp2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disp1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(disp0, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(Bookbtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(Tid6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Cid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(disp0, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(disp1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(disp2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(disp3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tid4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboeid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Tid3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combovid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(Cdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Calculate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(Tid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(Bookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        // TODO add your handling code here:
        float a = parseFloat(Tid2.getText());
        var amt = (float) (a * 0.9);
        amount.setText((" "+amt));
    }//GEN-LAST:event_CalculateActionPerformed

    private void comboeidPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboeidPopupMenuWillBecomeInvisible
        String tmp=(String)comboeid.getSelectedItem();
        String aa="select * from employee where eid=? ";
        //pst =conn.prepareStatement(aa);
        try{
            pst =conn.prepareStatement(aa);
            pst.setString(1, tmp);
            rs=pst.executeQuery();
            if(rs.next()){
                String add=rs.getString("eid");
                Tid4.setText(add);
                String add1=("Name: "+rs.getString("ename"));
                String add2=("Address"+rs.getString("eaddress"));
                String add3=("Phone"+rs.getString("ephone"));
                String msg=("Employee Details");
                disp0.setText(msg);
                //String add4=rs.getString("ejdate");
                disp1.setText(add1);
                disp2.setText(add2);
                disp3.setText(add3);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        } // TODO add your handling code here:
    }//GEN-LAST:event_comboeidPopupMenuWillBecomeInvisible

    private void combovidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combovidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combovidActionPerformed

    private void combovidPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combovidPopupMenuWillBecomeInvisible
        String tmp=(String)combovid.getSelectedItem();
        String aa= "select * from vehicle where vid=? ";
        //pst =conn.prepareStatement(aa);
        try{
            pst = conn.prepareStatement(aa);
            pst.setString(1, tmp);
            rs=pst.executeQuery();
            if(rs.next()){
                
                String add=rs.getString("vid");
                Tid3.setText(add);
                // String add1=("Name: "+rs.getString("vname")+"\n type "+rs.getString("type")+"\n Capacity"+rs.getString("capacity"));
                String add1=("Name: "+rs.getString("vname"));
                String add2=("Type"+rs.getString("vtype"));
                String add3=("Capacity"+rs.getString("capacity"));
                String msg=( "Vehicle Details");
                
                disp0.setText(msg);
                //String add4=rs.getString("ejdate");
                disp1.setText(add1);
                disp2.setText(add2);
                disp3.setText(add3);

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_combovidPopupMenuWillBecomeInvisible

    private void combovidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combovidItemStateChanged
        //  String id=combovid.getSelectedItem().toString();
        // Tid3.setText(id);// TODO add your handling code here:
    }//GEN-LAST:event_combovidItemStateChanged

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void Tid4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tid4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tid4ActionPerformed

    private void Tid3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tid3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tid3ActionPerformed

    private void Tid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tid2ActionPerformed

    private void BookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookbtnActionPerformed
        // TODO add your handling code here:
        conn = Mysqlconnect.ConnectDB();
        PreparedStatement ps1= null;
        PreparedStatement ps2= null;
        String query = "INSERT INTO BOOKED_FOR (VID,CID,TID,BDATE)VALUES(?,?,?,?)";
        String sql = "INSERT INTO DRIVEN_BY (EID,VID,TID,DDATE)VALUES(?,?,?,?)";
        String ss = "INSERT INTO payment (TID,CID,DISTANCETRAVEL,AMOUNT,PDATE)VALUES(?,?,?,?,?)";

        //String sp = "INSERT INTO payment (TID,CID,DISTANCETRAVEL,AMOUNT)VALUES(?,?,?,?)";

        try{
            pst =conn.prepareStatement(query);

            ps1 =conn.prepareStatement(sql);

            ps2 =conn.prepareStatement(ss);
            //pst.setString(1,Eid.getText());
            pst.setString(1,Tid3.getText());
            pst.setString(2,Cid2.getText());
            pst.setString(3,Tid6.getText());
            pst.setDate(4, new java.sql.Date(Cdate.getDate().getTime()));
            ps1.setString(1,Tid4.getText());
            ps1.setString(2,Tid3.getText());
            ps1.setString(3,Tid6.getText());
            ps1.setDate(4, new java.sql.Date(Cdate.getDate().getTime()));
            ps2.setString(1,Tid6.getText());
            ps2.setString(2,Cid2.getText());
            ps2.setString(3,Tid2.getText());
            ps2.setString(4, amount.getText());
            ps2.setDate(5, new java.sql.Date(Cdate.getDate().getTime()));

            pst.execute();
            ps1.execute();
            ps2.execute();

            JOptionPane.showMessageDialog(null,"Booking Confirmed");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

        Home Hobj = new Home();
        Hobj.setVisible(true);
        //Book_Trip Bobj = new Book_Trip();
        
        dispose();

    }//GEN-LAST:event_BookbtnActionPerformed

    private void headerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseClicked
        // TODO add your handling code here:
        dispose();
        Home Hobj = new Home();
        Hobj.setVisible(true);
    }//GEN-LAST:event_headerMouseClicked

    private void Cid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cid2ActionPerformed

    private void Tid6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tid6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tid6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Confirm_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirm_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirm_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirm_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirm_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bookbtn;
    private java.awt.Button Calculate;
    public static org.jdesktop.swingx.JXDatePicker Cdate;
    public static javax.swing.JTextField Cid2;
    private javax.swing.JTextField Tid2;
    private javax.swing.JTextField Tid3;
    private javax.swing.JTextField Tid4;
    public static javax.swing.JTextField Tid6;
    private javax.swing.JTextField amount;
    private javax.swing.JComboBox<String> comboeid;
    private javax.swing.JComboBox<String> combovid;
    private javax.swing.JLabel disp0;
    private javax.swing.JLabel disp1;
    private javax.swing.JLabel disp2;
    private javax.swing.JLabel disp3;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}