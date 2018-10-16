
package RentandHire;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import Student.*;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class RegisterCustomers extends javax.swing.JFrame {
static boolean maximized = true;
boolean b=false;
    public RegisterCustomers() {
        initComponents();
        maximizeWindow();
        loadtable();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtFilter = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCustomNic = new javax.swing.JTextField();
        txtCustomName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtContact1 = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtContact2 = new javax.swing.JTextField();
        txtContact3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDLNo = new javax.swing.JTextField();
        lableCusId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Custom Register-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 20, 530));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Customers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIC", "Name", "DL No", "Contact 1", "Contact 2", "Contact 3"
            }
        ));
        tableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustomer);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 490, 300));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("NIC");
        jPanel3.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton2.setText("Name");
        jPanel3.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Filter By");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 20));

        txtFilter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilterKeyReleased(evt);
            }
        });
        jPanel3.add(txtFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 250, 30));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 480, 80));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 120, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 530, 520));

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Customers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel7.setText("NIC");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 50, 20));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel16.setText("Contact 1");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 80, 20));

        txtCustomNic.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCustomNic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomNicKeyReleased(evt);
            }
        });
        jPanel2.add(txtCustomNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 340, 30));

        txtCustomName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txtCustomName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 340, 30));

        txtAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 340, 30));

        txtContact1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtContact1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContact1KeyTyped(evt);
            }
        });
        jPanel2.add(txtContact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 340, 30));

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 120, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel11.setText("Address");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 70, 20));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 120, 40));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel10.setText("Name");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 90, 20));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel15.setText("Contact 3");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel9.setText("Contact 2");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 20));

        txtContact2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtContact2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContact2ActionPerformed(evt);
            }
        });
        txtContact2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContact2KeyTyped(evt);
            }
        });
        jPanel5.add(txtContact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 340, 30));

        txtContact3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtContact3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContact3KeyTyped(evt);
            }
        });
        jPanel5.add(txtContact3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 340, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 490, 110));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel2.setText("DL No");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 50, 20));

        txtDLNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txtDLNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 340, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 520, 510));

        lableCusId.setText("jLabel1");
        jPanel1.add(lableCusId, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 100, -1));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtContact2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContact2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContact2ActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtContact1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContact1KeyTyped
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) || txtContact1.getText().length()==10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtContact1KeyTyped

    private void txtContact2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContact2KeyTyped
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) || txtContact2.getText().length()==10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtContact2KeyTyped

    private void txtContact3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContact3KeyTyped
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) || txtContact3.getText().length()==10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtContact3KeyTyped

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        validateTxt();
        if (b == false) {
            try {
                if (btnSave.getText().equals("SAVE")) {
                     String insert_1="INSERT INTO customer(CustomerNIC,CustomerName,DLNo,CustomerContactNo1,CustomerContactNo2,CustomerContactNo3,CustomerAddress)"
                                     + " VALUES('"+txtCustomNic.getText()+"','"+txtCustomName.getText()+"','"+txtDLNo.getText()+"','"+txtContact1.getText()+"','"+txtContact2.getText()+"','"+txtContact3.getText()+"','"+txtAddress.getText()+"') ";
                     DB.idu(insert_1);
                }else{
                    DB.idu("UPDATE customer SET CustomerNIC='"+txtCustomNic.getText()+"',CustomerName='"+txtCustomName.getText()+"',DLNo='"+txtDLNo.getText()+"',CustomerContactNo1='"+txtContact1.getText()+"',CustomerContactNo2='"+txtContact2.getText()+"',CustomerContactNo3='"+txtContact3.getText()+"',CustomerAddress='"+txtAddress.getText()+"' WHERE idCustomer='"+lableCusId.getText()+"' ");
                }
                clearField();
               loadtable();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }else{
            NotificationPopup.fillFeilds();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearField();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerMouseClicked
        try {
            int i=tableCustomer.getSelectedRow();
            String s=(String) tableCustomer.getValueAt(i, 0);
            ResultSet rs=DB.search("SELECT * FROM customer WHERE CustomerNIC='"+s+"' ");
            if (rs.next()) {
                lableCusId.setText(rs.getString("idCustomer"));
                String s1=rs.getString("CustomerNIC");
                txtCustomNic.setText(s1);
                String s2=rs.getString("CustomerName");
                txtCustomName.setText(s2);
                String s3=rs.getString("DLNo");
                txtDLNo.setText(s3);
                String s4=rs.getString("CustomerContactNo1");
                txtContact1.setText(s4);
                String s5=rs.getString("CustomerContactNo2");
                txtContact2.setText(s5);
                String s6=rs.getString("CustomerContactNo3");
                txtContact3.setText(s6);
                String s7=rs.getString("CustomerAddress");
                txtAddress.setText(s7);
                btnSave.setText("UPDATE");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tableCustomerMouseClicked

    private void txtFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterKeyReleased
        try {
            ResultSet rs=null;
            DefaultTableModel dtm=(DefaultTableModel) tableCustomer.getModel();
            dtm.setRowCount(0);
            if (txtFilter.getText().isEmpty()) {
                loadtable();
            }else if (jRadioButton1.isSelected()) {
               rs=DB.search("SELECT * FROM customer WHERE CustomerNIC LIKE '"+txtFilter.getText()+"%' ");
            }else{
                rs=DB.search("SELECT * FROM customer WHERE CustomerName LIKE '"+txtFilter.getText()+"%' ");
            }
                while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("CustomerNIC"));
                v.add(rs.getString("CustomerName"));
                v.add(rs.getString("DLNo"));
                v.add(rs.getString("CustomerContactNo1"));
                v.add(rs.getString("CustomerContactNo2"));
                v.add(rs.getString("CustomerContactNo3"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtFilterKeyReleased

    private void txtCustomNicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomNicKeyReleased
        try {
            ResultSet rs=DB.search("SELECT * FROM customer WHERE CustomerNIC='"+txtCustomNic.getText()+"' ");
            if (rs.next()) {
                lableCusId.setText(rs.getString("idCustomer"));
                String s1=rs.getString("CustomerNIC");
                txtCustomNic.setText(s1);
                String s2=rs.getString("CustomerName");
                txtCustomName.setText(s2);
                String s3=rs.getString("DLNo");
                txtDLNo.setText(s3);
                String s4=rs.getString("CustomerContactNo1");
                txtContact1.setText(s4);
                String s5=rs.getString("CustomerContactNo2");
                txtContact2.setText(s5);
                String s6=rs.getString("CustomerContactNo3");
                txtContact3.setText(s6);
                String s7=rs.getString("CustomerAddress");
                txtAddress.setText(s7);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtCustomNicKeyReleased

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (txtCustomNic.getText().isEmpty()) {
                
            }else{
                DB.idu("UPDATE customer SET isDelete='0' WHERE  idCustomer='"+lableCusId.getText()+"' ");
            }
            clearField();
            loadtable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterCustomers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lableCusId;
    private javax.swing.JTable tableCustomer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact1;
    private javax.swing.JTextField txtContact2;
    private javax.swing.JTextField txtContact3;
    private javax.swing.JTextField txtCustomName;
    private javax.swing.JTextField txtCustomNic;
    private javax.swing.JTextField txtDLNo;
    private javax.swing.JTextField txtFilter;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            RegisterCustomers.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            RegisterCustomers.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

      private void validateTxt(){
        java.awt.Component[] cp =jPanel2.getComponents();
        for (java.awt.Component c : cp) {
             if (c instanceof JTextField) {
                if (((JTextField) c).getText().isEmpty()) {
                    b = true;
                    break;
                }else{
                b=false;              
                }
            }
        }
        
      }

    private void loadtable() {
        try {
            DefaultTableModel dtm=(DefaultTableModel) tableCustomer.getModel();
            dtm.setRowCount(0);
            ResultSet rs=DB.search("SELECT * FROM customer WHERE isDelete LIKE '1' ");
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("CustomerNIC"));
                v.add(rs.getString("CustomerName"));
                v.add(rs.getString("DLNo"));
                v.add(rs.getString("CustomerContactNo1"));
                v.add(rs.getString("CustomerContactNo2"));
                v.add(rs.getString("CustomerContactNo3"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        private void clearField(){
       java.awt.Component[] cp = jPanel2.getComponents();
        for (java.awt.Component c : cp) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText(null);
            }
        }
        txtContact2.setText("");
        txtContact3.setText("");
        btnSave.setText("SAVE");
        }
}
