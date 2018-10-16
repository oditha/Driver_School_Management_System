package Finance;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CHEQUEDETAILS extends javax.swing.JFrame {

    static boolean maximized = true;

    public CHEQUEDETAILS() {
        initComponents();
        maximizeWindow();
        loadbankacc();
        status.setEnabled(false);
        //bankbalance();
        loadmaintable();
        //setchqamount();
        //setchqqty();
        jLabel1.setVisible(false);
    }
    int bankid;
    String bankname;
    String acno;
    String cheqNo;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        webDateField1 = new com.alee.extended.date.WebDateField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chqno = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        bankacc = new javax.swing.JComboBox<>();
        payeename = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        bankbalance = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pendingcheque = new javax.swing.JTextField();
        noofchq = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        duedate1 = new com.alee.extended.date.WebDateField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Cheque Details-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Payment History"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cheque No", "Bank ", "Payee", "Amount", "Due Date", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 640, 340));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Search By Status"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Paid" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 250, 30));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("SEARCH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 120, 40));

        webDateField1.setText("webDateField1");
        webDateField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel5.add(webDateField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 160, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 650, 90));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 120, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 710, 590));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("ENTER BANK  DETAILS"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox1.setText("jCheckBox1");
        jPanel3.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Bank Account");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 200, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Cheaque No");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 200, 30));

        chqno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chqno.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        chqno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                chqnoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                chqnoKeyTyped(evt);
            }
        });
        jPanel3.add(chqno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 330, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 120, 40));

        Save.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Save.setText("SAVE");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel3.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 120, 40));

        bankacc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bankacc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));
        bankacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankaccActionPerformed(evt);
            }
        });
        jPanel3.add(bankacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 330, 30));

        payeename.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(payeename, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 330, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Payee Name");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 200, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Due Date");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 200, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Amount");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 200, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Summery"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Bank Balance");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 110, 30));

        bankbalance.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bankbalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        bankbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankbalanceActionPerformed(evt);
            }
        });
        jPanel4.add(bankbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 160, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Pending Checque amount");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 210, 30));

        pendingcheque.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pendingcheque.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(pendingcheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 160, 30));

        noofchq.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        noofchq.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        noofchq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noofchqActionPerformed(evt);
            }
        });
        jPanel4.add(noofchq, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 160, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("No of pending Cheques");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 160, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 470, 140));

        amount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        amount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountKeyTyped(evt);
            }
        });
        jPanel3.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 330, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Status");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 200, 30));

        status.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Paid" }));
        jPanel3.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 330, 30));

        duedate1.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        duedate1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(duedate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 330, 30));

        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 490, 600));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 20, 600));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

        boolean b = false;
        java.awt.Component[] cp = jPanel3.getComponents();
        for (java.awt.Component c : cp) {
            if (c instanceof JTextField) {

                if (((JTextField) c).getText().isEmpty()) {

                    b = true;

                    break;

                } else {

                    b = false;

                }

            }
        }

        if (b == false) {

            if (bankacc.getSelectedIndex() != 0) {
                if (Save.getText().equals("SAVE")) {

                    try {
                        DB.idu("INSERT INTO bankcheque(ChequeNumber, Payee, Amount, DueDate, ChequeStatus, idbankDetails)"
                                + "VALUES ('" + chqno.getText() + "','" + payeename.getText() + "','" + amount.getText() + "','" + duedate1.getText() + "','" + status.getSelectedItem().toString() + "','" + bankid + "')");

                        bankacc.setSelectedIndex(0);
                        chqno.setText(null);
                        payeename.setText(null);
                        amount.setText(null);
                        duedate1.setText(null);
                        NotificationPopup.save();
                        loadmaintable();
                        setchqamount();
                        setchqqty();
                        
                        
                    } catch (Exception e) {
                        System.out.println(e);;
                    }
                } else if (Save.getText().equals("UPDATE")) {
                    try {
                        DB.idu("UPDATE bankcheque SET ChequeNumber='" + chqno.getText() + "', Payee='" + payeename.getText() + "', Amount='" + amount.getText() + "' ,DueDate='" + duedate1.getText() + "',ChequeStatus='" + status.getSelectedItem().toString() + "',idbankDetails='" + bankid + "' WHERE ChequeNumber='" + jLabel1.getText() + "' ");

                        if (status.getSelectedIndex() == 1) {
                            java.util.Date date = new java.util.Date();
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
                            String d1 = simpleDateFormat.format(date);

                            try {
                                DB.idu("INSERT INTO `newkamal`.`incomeexpence` (`Date`, `Description`, `Income`, `Expence`) VALUES ( '" + d1 + "', '" + "cheque payment" + chqno.getText() + "', '" + 0 + "', '" + amount.getText() + "')");
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        setchqqty();
                        bankacc.setSelectedIndex(0);
                        chqno.setText(null);
                        payeename.setText(null);
                        amount.setText(null);
                        duedate1.setText(null);
                        loadmaintable();
                        Save.setText("SAVE");
                        NotificationPopup.save();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            } else {

                JOptionPane.showConfirmDialog(Save, "please select a bank account");

            }
        } else {

            JOptionPane.showMessageDialog(Save, "please fil empty fields");

        }

    }//GEN-LAST:event_SaveActionPerformed

    private void bankbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankbalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankbalanceActionPerformed

    private void bankaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankaccActionPerformed

        String s1[] = bankacc.getSelectedItem().toString().split("-");
        bankname = s1[1];
        acno = s1[0];

        try {

            ResultSet rs = DB.search("SELECT * FROM bankdetails WHERE AccountNumber='" + s1[0] + "'");
            while (rs.next()) {
                bankid = rs.getInt("idbankDetails");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        bankbalance1();
        if (bankacc.getSelectedIndex() == 0) {
            bankbalance();
        }
        setchqamount();
        setchqqty();


    }//GEN-LAST:event_bankaccActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        String status = jComboBox3.getSelectedItem().toString();
        try {
            ResultSet rs = DB.search("SELECT * FROM bankcheque INNER JOIN bankdetails ON bankcheque.idbankDetails = bankdetails.idbankDetails WHERE ChequeStatus='" + status + "' AND bankcheque.isDelete='"+1+"' AND bankdetails.isDelete='"+1+"'");
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("ChequeNumber"));
                v.add(rs.getString("Name"));
                v.add(rs.getString("Payee"));
                v.add(rs.getString("Amount"));

                v.add(rs.getString("DueDate"));
                v.add(rs.getString("ChequeStatus"));
                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int r = jTable1.getSelectedRow();
        String b = (String) jTable1.getValueAt(r, 0);
        jLabel1.setText("" + jTable1.getValueAt(r, 0));
        status.setEnabled(true);
        
        try {

            ResultSet rs = DB.search("SELECT * FROM bankcheque INNER JOIN bankdetails ON bankcheque.idbankDetails = bankdetails.idbankDetails WHERE ChequeNumber='" + b + "' ");

            while (rs.next()) {
               
                bankacc.setSelectedItem(rs.getString("AccountNumber") + "-" + rs.getString("Name"));
                chqno.setText(rs.getString("ChequeNumber"));
                payeename.setText(rs.getString("Payee"));
                amount.setText(""+rs.getDouble("Amount"));
                duedate1.setText(rs.getString("DueDate"));
                status.setSelectedItem(rs.getString("ChequeStatus"));
                Save.setText("UPDATE");
                cheqNo=rs.getString("ChequeNumber");
                

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        bankacc.setSelectedIndex(0);
        chqno.setText(null);
        payeename.setText(null);
        amount.setText(null);
        duedate1.setText(null);
        Save.setText("SAVE");
        loadmaintable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void noofchqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noofchqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noofchqActionPerformed

    private void chqnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chqnoKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }
    }//GEN-LAST:event_chqnoKeyTyped

    private void chqnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chqnoKeyReleased
        try {

            ResultSet rs = DB.search("SELECT * FROM bankcheque INNER JOIN bankdetails ON bankcheque.idbankDetails = bankdetails.idbankDetails WHERE ChequeNumber='" + chqno.getText() + "' ");

            while (rs.next()) {
                bankacc.setSelectedItem(rs.getString("AccountNumber") + "-" + rs.getString("Name"));
                chqno.setText(rs.getString("ChequeNumber"));
                payeename.setText(rs.getString("Payee"));
                amount.setText(rs.getString("Amount"));
                duedate1.setText(rs.getString("DueDate"));
                status.setSelectedItem(rs.getString("ChequeStatus"));
                Save.setText("UPDATE");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_chqnoKeyReleased

    private void amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            
            evt.consume();
            
        }
    }//GEN-LAST:event_amountKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            DB.idu("UPDATE `bankcheque`  SET isDelete='"+0+"' WHERE ChequeNumber='"+cheqNo+"' AND ChequeStatus='"+"Pending"+"'");
            NotificationPopup.Delete();
            loadmaintable();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CHEQUEDETAILS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JTextField amount;
    private javax.swing.JComboBox<String> bankacc;
    private javax.swing.JTextField bankbalance;
    private javax.swing.JTextField chqno;
    private com.alee.extended.date.WebDateField duedate1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField noofchq;
    private javax.swing.JTextField payeename;
    private javax.swing.JTextField pendingcheque;
    private javax.swing.JComboBox<String> status;
    private com.alee.extended.date.WebDateField webDateField1;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            CHEQUEDETAILS.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            CHEQUEDETAILS.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void loadbankacc() {

        try {
            ResultSet rs = DB.search("SELECT * FROM bankdetails WHERE AccountType='" + "Current" + "' AND isDelete='"+1+"'" );
            while (rs.next()) {
                bankacc.addItem(rs.getString("AccountNumber") + "-" + rs.getString("Name"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private void bankbalance() {

        try {
            ResultSet rs = DB.search("SELECT SUM(Deposite)as d1,SUM(Withrawal)as w1 FROM bankhistory INNER JOIN bankdetails ON bankhistory.idbankDetails = bankdetails.idbankDetails WHERE AccountType='" + "Current" + "' AND bankdetails.isDelete='"+1+"'  AND bankdetails.idbankDetails='"+bankid+"'");

            while (rs.next()) {

                double d1 = rs.getDouble("d1");
                double w1 = rs.getDouble("w1");

                bankbalance.setText("" + (d1 - w1));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void bankbalance1() {

        try {
            ResultSet rs = DB.search("SELECT SUM(Deposite)as d1,SUM(Withrawal)as w1 FROM bankhistory INNER JOIN bankdetails ON bankhistory.idbankDetails = bankdetails.idbankDetails WHERE bankhistory.idbankDetails='" + bankid + "'");

            while (rs.next()) {

                double d1 = rs.getDouble("d1");
                double w1 = rs.getDouble("w1");

                bankbalance.setText("" + (d1 - w1));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadmaintable() {

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        try {
            ResultSet rs = DB.search("SELECT * FROM bankcheque INNER JOIN bankdetails ON bankcheque.idbankDetails = bankdetails.idbankDetails WHERE bankcheque.isDelete='"+1+"' AND bankdetails.isDelete='"+1+"'");
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("ChequeNumber"));
                v.add(rs.getString("Name"));
                v.add(rs.getString("Payee"));
                v.add(rs.getString("Amount"));

                v.add(rs.getString("DueDate"));
                v.add(rs.getString("ChequeStatus"));
                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void setchqamount() {

        try {
            ResultSet rs = DB.search("SELECT SUM(Amount) AS S1 FROM bankcheque INNER JOIN bankdetails ON bankcheque.idbankDetails = bankdetails.idbankDetails WHERE ChequeStatus='" + "Pending" + "' AND bankcheque.isDelete='"+1+"' AND bankdetails.isDelete='"+1+"'  AND bankdetails.idbankDetails='"+bankid+"' ");

            while (rs.next()) {

                pendingcheque.setText("" + rs.getDouble("S1"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void setchqqty() {

        try {
            ResultSet rs = DB.search("SELECT COUNT(ChequeStatus) AS S1 FROM bankcheque INNER JOIN bankdetails ON bankcheque.idbankDetails = bankdetails.idbankDetails WHERE ChequeStatus='" + "Pending" + "' AND bankcheque.isDelete='"+1+"' ");

            while (rs.next()) {

                noofchq.setText("" + rs.getInt("S1"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
