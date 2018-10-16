
package Student.Reports;

import ExtenelClasses.DB;
import MainMenu.*;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.naming.spi.DirStateFactory;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ViewPaymentDetails extends javax.swing.JFrame {
static boolean maximized = true;
    public ViewPaymentDetails() {
        initComponents();
        maximizeWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        webDate = new com.alee.extended.date.WebDateField();
        jLabel3 = new javax.swing.JLabel();
        btnFilter = new javax.swing.JButton();
        webDate1 = new com.alee.extended.date.WebDateField();
        jLabel4 = new javax.swing.JLabel();
        txtFilter = new javax.swing.JTextField();
        checkRegNo = new javax.swing.JCheckBox();
        checkName = new javax.swing.JCheckBox();
        checkNic = new javax.swing.JCheckBox();
        checkDateFilter = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("View Exam Dates"), "View Payment Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "PaymentDate", "Amount", "Description"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 1240, 470));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filter By", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        webDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel4.add(webDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 240, 30));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jLabel3.setText("From");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 50, 30));

        btnFilter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnFilter.setText("FILTER");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });
        jPanel4.add(btnFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 50, 120, 40));

        webDate1.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webDate1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        webDate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                webDate1MouseEntered(evt);
            }
        });
        jPanel4.add(webDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 240, 30));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jLabel4.setText("To");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 50, 30));

        txtFilter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilterActionPerformed(evt);
            }
        });
        txtFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilterKeyReleased(evt);
            }
        });
        jPanel4.add(txtFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 330, 30));

        checkRegNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkRegNo);
        checkRegNo.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        checkRegNo.setSelected(true);
        checkRegNo.setText("Reg No");
        checkRegNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkRegNoMouseClicked(evt);
            }
        });
        checkRegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRegNoActionPerformed(evt);
            }
        });
        jPanel4.add(checkRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 80, -1));

        checkName.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkName);
        checkName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        checkName.setText("Name");
        checkName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkNameMouseClicked(evt);
            }
        });
        checkName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNameActionPerformed(evt);
            }
        });
        jPanel4.add(checkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 70, -1));

        checkNic.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkNic);
        checkNic.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        checkNic.setText("NIC");
        checkNic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkNicMouseClicked(evt);
            }
        });
        checkNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNicActionPerformed(evt);
            }
        });
        jPanel4.add(checkNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        checkDateFilter.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkDateFilter);
        checkDateFilter.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        checkDateFilter.setText("Filter By Date");
        checkDateFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkDateFilterMouseClicked(evt);
            }
        });
        checkDateFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDateFilterActionPerformed(evt);
            }
        });
        jPanel4.add(checkDateFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1240, 110));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1320, 680));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed

        try {
            
                if (webDate.getText().isEmpty() || webDate1.getText().isEmpty()) {
                
            }else{
                
                    
                    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                    
                 ResultSet rs = DB.search("SELECT students.*,studentpayment.* FROM studentpayment INNER JOIN students ON studentpayment.idstudents = students.idstudents WHERE studentpayment.date BETWEEN '"+webDate.getText()+"' AND '"+webDate1 .getText()+"' ");
                
                 DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                 dtm.setRowCount(0);
                    
                    while (rs.next()) {
                        
                        
                     Vector v = new Vector();
                        
                    v.add(rs.getString("FullName"));    
                    v.add(rs.getString("date"));
                    v.add(rs.getString("amount"));
                    v.add(rs.getString("Description"));
                    dtm.addRow(v);
                 
                    }
                }
                    
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnFilterActionPerformed

    private void webDate1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webDate1MouseEntered

    }//GEN-LAST:event_webDate1MouseEntered

    private void txtFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilterActionPerformed

    private void txtFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterKeyReleased
        ResultSet rs=null;
        DefaultTableModel dtm =(DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        try {
            
                if (txtFilter.getText().isEmpty()) {
                    
                        DefaultTableModel dtm1=(DefaultTableModel) jTable1.getModel();
                        dtm1.setRowCount(0);
            }else if (checkRegNo.isSelected()) {
                
                    rs=DB.search("SELECT students.*,studentpayment.* FROM studentpayment INNER JOIN students ON studentpayment.idstudents = students.idstudents WHERE students.RegNo LIKE '"+txtFilter.getText()+"%'");
                
            }else if (checkNic.isSelected()) {
                
                    rs=DB.search("SELECT students.*,studentpayment.* FROM studentpayment INNER JOIN students ON studentpayment.idstudents = students.idstudents WHERE students.NIC LIKE '"+txtFilter.getText()+"%'");
                
            }else {
                    System.out.println("ss");
                    rs=DB.search("SELECT students.*,studentpayment.* FROM studentpayment INNER JOIN students ON studentpayment.idstudents = students.idstudents WHERE students.FullName LIKE '"+txtFilter.getText()+"%'");
            }
            
                while (rs.next()) {  
                    
                    Vector v = new Vector();
                    
                    v.add(rs.getString("FullName"));
                    v.add(rs.getString("date"));
                    v.add(rs.getString("amount"));
                    v.add(rs.getString("Description"));
                    dtm.addRow(v);
                
            }
                
        } catch (Exception e) {
            
            e.printStackTrace();
        }


    }//GEN-LAST:event_txtFilterKeyReleased

    private void checkRegNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRegNoMouseClicked

    }//GEN-LAST:event_checkRegNoMouseClicked

    private void checkRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRegNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkRegNoActionPerformed

    private void checkNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkNameMouseClicked
        txtFilter.grabFocus();
    }//GEN-LAST:event_checkNameMouseClicked

    private void checkNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkNameActionPerformed

    private void checkNicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkNicMouseClicked
        txtFilter.grabFocus();
    }//GEN-LAST:event_checkNicMouseClicked

    private void checkNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkNicActionPerformed

    private void checkDateFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkDateFilterMouseClicked
        webDate.grabFocus();
    }//GEN-LAST:event_checkDateFilterMouseClicked

    private void checkDateFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDateFilterActionPerformed

    }//GEN-LAST:event_checkDateFilterActionPerformed


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPaymentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkDateFilter;
    private javax.swing.JCheckBox checkName;
    private javax.swing.JCheckBox checkNic;
    private javax.swing.JCheckBox checkRegNo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFilter;
    private com.alee.extended.date.WebDateField webDate;
    private com.alee.extended.date.WebDateField webDate1;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            ViewPaymentDetails.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ViewPaymentDetails.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }
}
