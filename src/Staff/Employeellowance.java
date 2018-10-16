package Staff;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import ExtenelClasses.dateFormat;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Employeellowance extends javax.swing.JFrame {

    static boolean maximized = true;

    public Employeellowance() {
        initComponents();
        maximizeWindow();
        Loademployee();
        setdate();
        laodtable();
//        fromdate.setEnabled(false);
//        todate.setEnabled(false);
        loadallowencetype();
        loadallowencetble();
        
        
        
    }
    int id;
    int allownceid;
    int shaid;
    String alid;
   String index;
    HashMap<String, String> hm= new HashMap<String, String>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        empbox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        ALLOWNCETYPE = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        type = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        allwncetable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        basic = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        datetxt = new com.alee.extended.date.WebDateField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Staff Allowance-New Kamal Learners | Rikillagaskada");
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
                "id", "Allowance  Date", "Allowance type", "Amount"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 620, 400));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 120, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 680, 610));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Staff Pyment "));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Select Staff");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 30));

        date.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        date.setText("Basic Salary");
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, 30));

        amount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        amount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountKeyTyped(evt);
            }
        });
        jPanel3.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 300, 30));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("SAVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 120, 40));

        empbox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        empbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-" }));
        empbox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                empboxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        empbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empboxActionPerformed(evt);
            }
        });
        jPanel3.add(empbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 330, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Allowance type");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 170, 30));

        ALLOWNCETYPE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-" }));
        ALLOWNCETYPE.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                ALLOWNCETYPEPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        ALLOWNCETYPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALLOWNCETYPEActionPerformed(evt);
            }
        });
        jPanel3.add(ALLOWNCETYPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 330, 30));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("Deductions");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 120, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Allowance type"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        type.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel4.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 420, 30));

        add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel4.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 120, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 34, 120, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Add allowance type");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 30));

        allwncetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Allowence type"
            }
        ));
        allwncetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allwncetableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(allwncetable);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 410, 110));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 480, 280));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Amount");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 30));

        date1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        date1.setText("Date");
        jPanel3.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, 30));

        basic.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        basic.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel3.add(basic, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 300, 30));

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setText("CANCEL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 120, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText(" LKR");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 30, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText(" LKR");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 30, 30));

        datetxt.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        jPanel3.add(datetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 330, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 510, 630));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 20, 630));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if (empbox.getSelectedIndex() != 0) {
            
            if (jButton3.getText().equals("SAVE")) {
                
                try {
                    
                    DB.idu(" INSERT INTO `newkamal`.`staff_has_allowence` ( `Amount`, `date`,  `Staff_idStaff`, `Allowence_idAllowence`) VALUES ('" + amount.getText() + "', '" + datetxt.getText() + "', '" + id + "' ,'" + allownceid + "') ");
                    
                   //DB.idu("INSERT INTO `newkamal`.`incomeexpence` (`Date`, `Description`, `Income`, `Expence`) VALUES ( '" + datetxt.getText() + "', '" + "staff allowance-" + empbox.getSelectedItem().toString() + "', '" + 0 + "', '" + amount.getText() + "')");
                    
                    amount.setText(null);
                    empbox.setSelectedIndex(0);
                    ALLOWNCETYPE.setSelectedIndex(0);
                     laodtable();
                    
                    NotificationPopup.save();
                    
                } catch (Exception e) {
                    
                    e.printStackTrace();
                    
                }
                
            } else if (jButton3.getText().equals("UPDATE")) {
                
                try {
                    DB.idu("UPDATE `newkamal`.`staff_has_allowence` SET  `Amount`='" + amount.getText() + "', `Allowence_idAllowence`='" + allownceid + "'   WHERE `Staff_idStaff`='" + id + "' AND `idStaffAllowence`='" + shaid + "' ");
                    
                    laodtable();
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }
            
        }
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void empboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empboxActionPerformed
        
   

    }//GEN-LAST:event_empboxActionPerformed

    private void ALLOWNCETYPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALLOWNCETYPEActionPerformed
       
    }//GEN-LAST:event_ALLOWNCETYPEActionPerformed

    private void amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_amountKeyTyped

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        if (add.getText().equals("ADD")) {
            try {
                DB.idu("INSERT INTO `newkamal`.`allowence` ( `AllowenceName`) VALUES ( '" + type.getText() + "')");
                type.setText(null);
                
                loadallowencetble();
            } catch (Exception ex) {
                Logger.getLogger(Employeellowance.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (add.getText().equals("UPDATE")) {
            try {
                int r = allwncetable.getSelectedRow();
                DB.idu("UPDATE `newkamal`.`allowence` SET `AllowenceName`='" + type.getText() + "' WHERE (`idAllowence`='" + allwncetable.getValueAt(r, 0).toString() + "')");
                // loadallowencetype();
                loadallowencetble();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        loadallowencetype();
        

    }//GEN-LAST:event_addActionPerformed

    private void allwncetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allwncetableMouseClicked
        
        int r = allwncetable.getSelectedRow();
        
        alid = (String) allwncetable.getValueAt(r, 0);
        
        try {
            ResultSet rs = DB.search("SELECT * FROM `allowence` WHERE idAllowence='" + alid + "'");
            while (rs.next()) {                
                type.setText(rs.getString("AllowenceName"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        add.setText("UPDATE");
        

    }//GEN-LAST:event_allwncetableMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        if (empbox.getSelectedIndex()!=0) {
            
            Employeedeductions ed = new Employeedeductions();
        
        ed.empbox.setSelectedItem(index);
        ed.empbox.setEnabled(false);
        ed.setVisible(true);
        
            
            
            
        }else{
        
        JOptionPane.showMessageDialog(rootPane, "please selecet employee");
        
        
        }
        
        
        
        
        
        

    }//GEN-LAST:event_jButton5ActionPerformed

    private void amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyReleased
        
        Double sal = 0.0;
        
        Double amt = 0.0;
        sal = Double.parseDouble(basic.getText());
        amt = Double.parseDouble(amount.getText());
        
        if (amt > sal) {
            
        }
        

    }//GEN-LAST:event_amountKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        int r=jTable1.getSelectedRow();
        
        String id=(String) jTable1.getValueAt(r, 0);
        
        
        try {
            DB.idu("UPDATE staff_has_allowence SET isDelete='"+0+"' WHERE idStaffAllowence='"+id+"'");
            laodcurrentmonthtable();
            NotificationPopup.Delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void ALLOWNCETYPEPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_ALLOWNCETYPEPopupMenuWillBecomeInvisible
        try {
            ResultSet rs = DB.search("SELECT * FROM `allowence` WHERE AllowenceName='" + ALLOWNCETYPE.getSelectedItem().toString() + "'");
            while (rs.next()) {
                allownceid = rs.getInt("idAllowence");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ALLOWNCETYPEPopupMenuWillBecomeInvisible

    private void empboxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_empboxPopupMenuWillBecomeInvisible
         String s1[] = empbox.getSelectedItem().toString().split("-");
        basic.setText(hm.get(s1[1]));
        System.out.println(s1);
        try {
            
            ResultSet rs = DB.search("SELECT * FROM `staff` WHERE  nic='" + s1[1] + "' AND IsActive='" + 1 + "' ");
            
            if (rs.next()) {

                //empbox.addItem(rs.getString("name") + "-" + rs.getString("nic"));
                id = rs.getInt("idStaff");
                System.out.println(id);
                
           
            }
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        loademppayment();
        loadbasic();
       
        
        laodcurrentmonthtable();
        index=empbox.getSelectedItem().toString();
        System.out.println(hm);
    }//GEN-LAST:event_empboxPopupMenuWillBecomeInvisible
    
    public static void main(String args[]) {
        
        WebLookAndFeel.install();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employeellowance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ALLOWNCETYPE;
    private javax.swing.JButton add;
    private javax.swing.JTable allwncetable;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField basic;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private com.alee.extended.date.WebDateField datetxt;
    private javax.swing.JComboBox<String> empbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {
            
            Employeellowance.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Employeellowance.this.setMaximizedBounds(gv.getMaximumWindowBounds());
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
                
                hm.put(rs.getString("nic"), rs.getString("Basic Salary"));
                empbox.addItem(rs.getString("name") + "-" + rs.getString("nic"));
                System.out.println(rs.getString("Basic Salary"));
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

        try {
            ResultSet rs=DB.search("SELECT * FROM allowence INNER JOIN staff_has_allowence ON staff_has_allowence.Allowence_idAllowence = allowence.idAllowence INNER JOIN staff ON staff_has_allowence.Staff_idStaff = staff.idStaff   Where  staff_has_allowence.isDelete='1' AND staff.IsActive='"+1+"'  AND date LIKE '"+dateFormat.MonthOnly()+"%'");
            DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0 );
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("idStaffAllowence"));
                v.add(rs.getString("name"));
                v.add(rs.getString("nic"));
                v.add(rs.getString("date"));
              
                v.add(rs.getString("AllowenceName"));
                v.add(rs.getString("amount"));
                dtm.addRow(v);
                
            }
        
        
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void loademppayment() {

//        try {
//            ResultSet rs=DB.search("SELECT * FROM allowence INNER JOIN staff_has_allowence ON staff_has_allowence.Allowence_idAllowence = allowence.idAllowence INNER JOIN staff ON staff_has_allowence.Staff_idStaff = staff.idStaff  WHERE staff.idStaff='"+id+"' AND staff_has_allowence.isDelete='"+1+"' ");
//            DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
//            dtm.setRowCount(0 );
//            while (rs.next()) {                
//                Vector v=new Vector();
//                v.add(rs.getString("idStaffAllowence"));
//                v.add(rs.getString("name"));
//                v.add(rs.getString("nic"));
//                v.add(rs.getString("date"));
//                v.add(rs.getString("AllowenceName"));
//             
//                v.add(rs.getString("amount"));
//                dtm.addRow(v);
//                
//            }
//        
//        
//        
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
    
    private void loadallowencetype() {
        DefaultComboBoxModel dcb = (DefaultComboBoxModel) ALLOWNCETYPE.getModel();
        
        try {
            ResultSet rs = DB.search("SELECT * FROM `allowence` WHERE isDelete='" + 1 + "'");

            // Vector v=new Vector();
            ALLOWNCETYPE.removeAllItems();
            ALLOWNCETYPE.addItem("--Select--");
            
            while (rs.next()) {                
                
                ALLOWNCETYPE.addItem(rs.getString("AllowenceName"));
                
            }
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
    }
    
    private void loadallowencetble() {
        
        DefaultTableModel dtm = (DefaultTableModel) allwncetable.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = DB.search("SELECT * FROM `allowence`  WHERE isDelete='" + 1 + "'");
            
            while (rs.next()) {                
                Vector v = new Vector();
                v.add(rs.getString("idAllowence"));
                v.add(rs.getString("AllowenceName"));
                dtm.addRow(v);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    private void loadbasic() {
        
        
        
    }
    
    private void laodcurrentmonthtable() {
        
        try {
            
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            
            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staff_has_allowence ON staff_has_allowence.Staff_idStaff = staff.idStaff INNER JOIN allowence ON staff_has_allowence.Allowence_idAllowence = allowence.idAllowence   WHERE staff.idStaff ='" + id + "' AND date LIKE '" + dateFormat.MonthOnly() + "%' AND  staff_has_allowence.isDelete='" + 1 + "'");
            dtm.setRowCount(0);
            
            while (rs.next()) {                
                
             
                
                
                
                Vector v = new Vector();
                v.add(rs.getString("idStaffAllowence"));
                v.add(rs.getString("date"));
                v.add(rs.getString("AllowenceName"));
                
                v.add(rs.getString("Amount"));
                
                dtm.addRow(v);




                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
