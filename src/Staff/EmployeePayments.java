package Staff;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import ExtenelClasses.dateFormat;
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

public class EmployeePayments extends javax.swing.JFrame {

    static boolean maximized = true;

    public EmployeePayments() {
        initComponents();
        maximizeWindow();
        Loademployee();
        setdate();
        laodtable();
       
        salary.setEditable(false);
        current.setEditable(false);

    }
    int id;
    int payid;
    Double basic = 0.0;
    Double amount1 = 0.0;
    Double currnt = 0.0;
    Double final1 = 0.0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        save = new javax.swing.JButton();
        empbox = new javax.swing.JComboBox<>();
        description = new javax.swing.JTextField();
        date3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        date4 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        current = new javax.swing.JTextField();
        date5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        datetxt = new com.alee.extended.date.WebDateField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Staff Payments-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Staff Payment "));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Select Staff");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 200, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Amount");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, 30));

        amount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountKeyTyped(evt);
            }
        });
        jPanel3.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 310, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("CANCEL");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 120, 40));

        save.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel3.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 120, 40));

        empbox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        empbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-" }));
        empbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empboxActionPerformed(evt);
            }
        });
        jPanel3.add(empbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 330, 30));

        description.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 330, 30));

        date3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        date3.setText("Date");
        jPanel3.add(date3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Amount"));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        date4.setText("Current month deduction");
        jPanel4.add(date4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 30));

        salary.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        salary.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryActionPerformed(evt);
            }
        });
        jPanel4.add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 230, 30));

        current.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        current.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(current, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 230, 30));

        date5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        date5.setText("Basic Salary");
        jPanel4.add(date5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("LKR");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 40, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("LKR");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 40, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 470, 160));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Descriptions");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("LKR");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 40, 30));

        datetxt.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        datetxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(datetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 330, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 510, 550));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        boolean b = false;
        java.awt.Component[] cp = jPanel3.getComponents();
        for (java.awt.Component c : cp) {
            if (c instanceof JTextField) {

                if (((JTextField) c).getText().isEmpty()) {

                    b = true;
                    NotificationPopup.fillFeilds();
                    break;

                } else {

                    b = false;

                }

            }
        }

        if (empbox.getSelectedIndex() != 0) {
           val();

            if (!b) {

//                if (basic >= final1) {

                    try {

                       // ResultSet rs=DB.search("SELECT * FROM staff INNER JOIN staffpayment ON staffpayment.idStaff = staff.idStaff WHERE staff.idStaff='"+id+"' AND date='"+datetxt.getText()+"' AND Description='"+description.getText()+"' AND amount='"+amount.getText()+"' AND isDelete='"+1+"'");
                        
                       //if (!rs.next()) {
                            
                        
                        DB.idu("INSERT INTO staffpayment ( `date`, `Description`, `amount`, `idStaff`, `PaymentType`) VALUES ('" + datetxt.getText() + "', '" + description.getText() + "' ,'" + amount.getText() + "', '" + "" + id + "','" + "cash" + "')   ");
                      //  DB.idu("INSERT INTO `newkamal`.`incomeexpence` (`Date`, `Description`, `Income`, `Expence`) VALUES ( '" + datetxt.getText() + "', '" + "staff payment" + empbox.getSelectedItem() + "', '" + 0 + "', '" + amount.getText() + "')");
                        // DB.idu("INSERT INTO `newkamal`.`deduction` (`amount`, `date`, `type`, `Staff_idStaff`) VALUES ('" + amount.getText() + "', '" + datetxt.getText() + "', '" + "payment"+empbox.getSelectedItem()+ description.getText()+"' , '" + id + "')");

                        description.setText(null);
                        amount.setText(null);
                        empbox.setSelectedIndex(0);
                        laodtable();
                        excal();
                        NotificationPopup.save();

                   // }
                } catch (Exception e) {

                        e.printStackTrace();

                    }
//                } else {
//                    JOptionPane.showMessageDialog(rootPane, "morethan basic");
//                }
            }
        }


    }//GEN-LAST:event_saveActionPerformed

    private void empboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empboxActionPerformed

        String s1[] = empbox.getSelectedItem().toString().split("-");

        try {

            ResultSet rs = DB.search("SELECT * FROM `staff` WHERE  nic='" + s1[1] + "' AND IsActive='" + 1 + "' ");

            while (rs.next()) {

                //empbox.addItem(rs.getString("name") + "-" + rs.getString("nic"));
                id = rs.getInt("idStaff");

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        if (empbox.getSelectedIndex() == 0) {

            laodtable();
            current.setText(""+0.0);

        } else {
            loademppayment();

        }

        basicsalary();
        excal();
        val();

    }//GEN-LAST:event_empboxActionPerformed

    private void amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_amountKeyTyped

    private void salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeePayments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField current;
    private javax.swing.JLabel date3;
    private javax.swing.JLabel date4;
    private javax.swing.JLabel date5;
    private com.alee.extended.date.WebDateField datetxt;
    private javax.swing.JTextField description;
    private javax.swing.JComboBox<String> empbox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField salary;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            EmployeePayments.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            EmployeePayments.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void Loademployee() {

        try {

            ResultSet rs = DB.search("SELECT * FROM `staff` WHERE IsActive='1'");

            while (rs.next()) {

                empbox.addItem(rs.getString("name") + "-" + rs.getString("nic"));

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void setdate() {

        java.util.Date date = new java.util.Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        datetxt.setText(simpleDateFormat.format(date));

    }

    private void laodtable() {

//        try {
//            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staffpayment ON staffpayment.idStaff = staff.idStaff WHERE staff.IsActive='" + 1 + "' AND isDelete='" + 1 + "'");
//            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//            dtm.setRowCount(0);
//            while (rs.next()) {
//                Vector v = new Vector();
//                v.add(rs.getString("idStaffPayment"));
//                v.add(rs.getString("name"));
//                v.add(rs.getString("nic"));
//                v.add(rs.getString("date"));
//                v.add(rs.getString("Description"));
//                v.add(rs.getString("amount"));
//                dtm.addRow(v);
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    private void loademppayment() {

//        try {
//            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staffpayment ON staffpayment.idStaff = staff.idStaff WHERE staff.idStaff='" + id + "' AND isDelete='" + 1 + "' ");
//            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//            dtm.setRowCount(0);
//            while (rs.next()) {
//                Vector v = new Vector();
//
//                v.add(rs.getString("idStaffPayment"));
//                v.add(rs.getString("name"));
//                v.add(rs.getString("nic"));
//                v.add(rs.getString("date"));
//                v.add(rs.getString("Description"));
//                v.add(rs.getString("amount"));
//                dtm.addRow(v);
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    private void loadepm() {
//
//        try {
//            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staffpayment ON staffpayment.idStaff = staff.idStaff  WHERE isDelete='" + 1 + "' ");
//            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//            dtm.setRowCount(0);
//            while (rs.next()) {
//                Vector v = new Vector();
//                v.add(rs.getString("name"));
//                v.add(rs.getString("nic"));
//                v.add(rs.getString("date"));
//                v.add(rs.getString("Description"));
//                v.add(rs.getString("amount"));
//                dtm.addRow(v);
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    private void basicsalary() {

        try {
            ResultSet rs = DB.search("SELECT * FROM staff WHERE IsActive='" + 1 + "' and idStaff='" + id + "'");
            while (rs.next()) {

                salary.setText(rs.getString("Basic Salary"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void excal() {

        java.util.Date date = new java.util.Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(".MM.");
        String d = simpleDateFormat.format(date);
        System.out.println(dateFormat.MonthOnly());
        try {
            ResultSet rs = DB.search("SELECT SUM(amount) AS a1 FROM staff INNER JOIN staffpayment ON staffpayment.idStaff = staff.idStaff WHERE isDelete='" + 1 + "' AND date LIKE '" +dateFormat.MonthOnly()+ "%' AND staff.idStaff='"+id+"'");

            while (rs.next()) {

                current.setText(rs.getString("a1"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void val() {

        if (amount.getText().isEmpty()) {
            amount1 = 0.0;
        } else {
            amount1 = Double.parseDouble(amount.getText());
        }
        if (current.getText().isEmpty()) {
            currnt=0.0;
            current.setText(""+currnt);
        }else{
          currnt = Double.parseDouble(current.getText());
        }
        basic = Double.parseDouble(salary.getText());
      
        final1 = currnt + amount1;

//        if (basic <= currnt) {
//            save.setEnabled(false);
//            JOptionPane.showMessageDialog(rootPane, "more than basic");
//        }

    }
}
