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
import javax.swing.table.DefaultTableModel;

public class Employeedeductions extends javax.swing.JFrame {

    static boolean maximized = true;

    public Employeedeductions() {
        initComponents();
        maximizeWindow();
        Loademployee();
        setdate();
      laodtable();
//        fromdate.setEnabled(false);
//        todate.setEnabled(false);
        loadallowencetype();
        searchdate();
    }
    int id;
    int allownceid;
    String month;
    String index;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        empbox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        current = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        datetxt12 = new com.alee.extended.date.WebDateField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Kamal- Staff Deduction Payments");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Staff Pyment ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 120, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Allowance  Date", "Allowance type", "Amount"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 620, 400));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 680, 550));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENTER Staff Deductions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("Select Staff");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 30));

        date.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        date.setText("Date");
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 170, 30));

        type.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel3.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 330, 30));

        amount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        amount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountKeyTyped(evt);
            }
        });
        jPanel3.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 300, 30));

        save.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel3.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 120, 40));

        empbox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        empbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-" }));
        empbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empboxActionPerformed(evt);
            }
        });
        jPanel3.add(empbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 330, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel10.setText("Deduction Type");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, 30));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("Create Salary");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 120, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENTER Staff Pyment ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Amount");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel7.setText("Basic Salary");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, 30));

        salary.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        salary.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 230, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel11.setText("Current Month Deductions");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 180, 30));

        current.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        current.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(current, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 230, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("LKR");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 100, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("LKR");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 100, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 470, 180));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel9.setText("Amount");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("LKR");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 30, 30));

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setText("CANCEL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 120, 40));

        datetxt12.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        jPanel3.add(datetxt12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 330, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 510, 550));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 20, 600));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        if (empbox.getSelectedIndex() != 0) {
            if (save.getText().equals("SAVE")) {

                try {

                   ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN deduction ON deduction.Staff_idStaff = staff.idStaff WHERE date='" + datetxt12.getText() + "' AND staff.idStaff='" + id + "' AND type='" + type.getText() + "' AND amount='" + amount.getText() + "' ");
                   if (!rs.next()) {

                        DB.idu("INSERT INTO `newkamal`.`deduction` (`amount`, `date`, `type`, `Staff_idStaff`) VALUES ('" + amount.getText() + "', '" + datetxt12.getText()  + "', '" + type.getText() + "' , '" + id + "')");

                      //  DB.idu("INSERT INTO `newkamal`.`incomeexpence` (`Date`, `Description`, `Income`, `Expence`) VALUES ( '" + datetxt1.getText() + "', '" + " rereduction-" + empbox.getSelectedItem().toString() + "', '" + 0 + "', '" + amount.getText() + "')");

                        amount.setText(null);
                        type.setText(null);
                       // empbox.setSelectedIndex(0);
                       // laodtable();
                        
                       loadmaintable();
                       searchdate();
                        NotificationPopup.save();
                    }
                } catch (Exception e) {

                    e.printStackTrace();

                }

            } else if (save.getText().equals("UPDATE")) {

                try {

                    DB.idu("UPDATE `newkamal`.`deduction` SET  `amount`='" + amount.getText() + "', `date`='" + dateFormat.setDateFull(datetxt12.getText()) + "', `type`='" + type.getText() + "', `Staff_idStaff`='" + id + "' WHERE iddeduction='" + allownceid + "'");

                } catch (Exception e) {

                    e.printStackTrace();

                }

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
      
        
        if (empbox.getSelectedIndex()==0) {
           // laodtable();
            salary.setText(""+0.0);
            current.setText(""+0.0);
        }else{
         loademppayment();
        searchdate();
        loadmaintable();
        index=empbox.getSelectedItem().toString();
        
        }
        
        
       
    }//GEN-LAST:event_empboxActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_amountKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        if (empbox.getSelectedIndex()!=0) {
            
          salary salary1 = new salary();
            
            salary1.empbox1.setSelectedItem(index);
            
            salary1.setVisible(true);
            
            
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        
        int r=jTable1.getSelectedRow();
        
        String id=(String) jTable1.getValueAt(r, 0);
        
        try {
            DB.idu("UPDATE deduction SET isDelete='" + 0 + "' WHERE iddeduction='" + id + "'");
           
            NotificationPopup.Delete();
            searchdate();
            loadmaintable();
        } catch (Exception e) {
            e.printStackTrace();

        }


    }//GEN-LAST:event_deleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employeedeductions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField current;
    private javax.swing.JLabel date;
    private com.alee.extended.date.WebDateField datetxt12;
    private javax.swing.JButton delete;
    public static javax.swing.JComboBox<String> empbox;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField salary;
    private javax.swing.JButton save;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            Employeedeductions.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Employeedeductions.this.setMaximizedBounds(gv.getMaximumWindowBounds());
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

        datetxt12.setText(simpleDateFormat.format(date));

    }

    private void laodtable() {

        try {
            ResultSet rs = DB.search("SELECT * FROM deduction INNER JOIN staff ON deduction.Staff_idStaff = staff.idStaff Where  deduction .isDelete='1' AND staff.IsActive='" + 1 + "'   AND date='"+dateFormat.MonthOnly()+"%' ");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("iddeduction"));
                v.add(rs.getString("name"));
                v.add(rs.getString("nic"));
                v.add(rs.getString("date"));

                v.add(rs.getString("type"));
                v.add(rs.getString("amount"));
                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loademppayment() {

//        try {
//            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN deduction ON deduction.Staff_idStaff = staff.idStaff WHERE staff.idStaff='" + id + "' AND deduction.isDelete='" + "1" + "'  AND staff.IsActive='" + 1 + "'  ");
//            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//            dtm.setRowCount(0);
//            while (rs.next()) {
//                Vector v = new Vector();
//                v.add(rs.getString("iddeduction"));
//                v.add(rs.getString("name"));
//                v.add(rs.getString("nic"));
//                v.add(rs.getString("date"));
//                v.add(rs.getString("type"));
//                v.add(rs.getString("amount"));
//
//                dtm.addRow(v);
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    private void loadallowencetype() {

        try {
            ResultSet rs = DB.search("SELECT * FROM `allowence` WHERE isDelete='" + 1 + "'");

            while (rs.next()) {

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void searchdate() {

        java.util.Date date = new java.util.Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/");

        month = dateFormat.MonthOnly();

        try {
            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN deduction ON deduction.Staff_idStaff = staff.idStaff WHERE IsActive='" + 1 + "' AND isDelete='" + 1 + "' AND Staff_idStaff='" + id + "' ");

            while (rs.next()) {
                salary.setText(rs.getString("Basic Salary"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ResultSet rs1 = DB.search("SELECT SUM(amount) AS a1 FROM staff INNER JOIN deduction ON deduction.Staff_idStaff = staff.idStaff WHERE idStaff='" + id + "' AND isDelete='" + 1 + "' AND date LIKE '"+dateFormat.MonthOnly()+"%'");
            while (rs1.next()) {
                current.setText(rs1.getString("a1"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadmaintable() {
  try {
            
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            
            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN deduction ON deduction.Staff_idStaff = staff.idStaff  WHERE staff.idStaff ='" + id + "' AND date LIKE '" + dateFormat.MonthOnly() + "%' AND  `deduction` .isDelete='" + 1 + "'");
            dtm.setRowCount(0);
            while (rs.next()) {                
                
                Vector v = new Vector();
                v.add(rs.getString("iddeduction"));
                v.add(rs.getString("date"));
                v.add(rs.getString("type"));
                
                v.add(rs.getString("amount"));
                dtm.addRow(v);
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }     
    
    
    
    
    
    
    
    
    }
}
