package Student.Reports;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import MainMenu.*;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.parser.TokenType;

public class ViewExamPayments extends javax.swing.JFrame {

    static boolean maximized = true;

    public ViewExamPayments() {
        initComponents();
        maximizeWindow();
        enableDate();
        txtFilter.grabFocus();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtFilter = new javax.swing.JTextField();
        checkRegNo = new javax.swing.JCheckBox();
        checkNic = new javax.swing.JCheckBox();
        checkName = new javax.swing.JCheckBox();
        webDate = new com.alee.extended.date.WebDateField();
        checkDateFilter = new javax.swing.JCheckBox();
        btnFilter = new javax.swing.JButton();
        webDate1 = new com.alee.extended.date.WebDateField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Exam Payments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RegNo", "Name", "NIC", "Exam Date", "Payment Date", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 1260, 500));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filter By", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFilter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilterKeyReleased(evt);
            }
        });
        jPanel3.add(txtFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 330, 30));

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
        jPanel3.add(checkRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, -1));

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
        jPanel3.add(checkNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

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
        jPanel3.add(checkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 70, -1));

        webDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(webDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 240, 30));

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
        jPanel3.add(checkDateFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        btnFilter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnFilter.setText("FILTER");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });
        jPanel3.add(btnFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 40, 120, 40));

        webDate1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        webDate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                webDate1MouseEntered(evt);
            }
        });
        jPanel3.add(webDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, 240, 30));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jLabel4.setText("To");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 50, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 1260, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1320, 680));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void txtFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterKeyReleased

        ResultSet rs = null;

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
  
        try {

            if (txtFilter.getText().isEmpty()) {
               
                DefaultTableModel dtm1 = (DefaultTableModel) jTable1.getModel();
                    //dtm1.setRowCount(0);

            } 
            else if (checkNic.isSelected()) {
                
                rs = DB.search("SELECT students.*,studentexam.*,exampayment.*FROM students INNER JOIN studentexam ON studentexam.idstudents = students.idstudents INNER JOIN exampayment ON exampayment.idStudentExam = studentexam.idStudentExam WHERE students.NIC like '" + txtFilter.getText() + "%'");
               
            } else if (checkName.isSelected()) {
                
                rs = DB.search("SELECT students.*,studentexam.*,exampayment.*FROM students INNER JOIN studentexam ON studentexam.idstudents = students.idstudents INNER JOIN exampayment ON exampayment.idStudentExam = studentexam.idStudentExam WHERE students.FullName like'" + txtFilter.getText() + "%'");

            } else {
               
                rs = DB.search("SELECT students.*,studentexam.*,exampayment.*FROM students INNER JOIN studentexam ON studentexam.idstudents = students.idstudents INNER JOIN exampayment ON exampayment.idStudentExam = studentexam.idStudentExam WHERE students.RegNo  LIKE '" + txtFilter.getText() + "%'");
            }
            while (rs.next()) {

                Vector v = new Vector();

                v.add(rs.getString("RegNo"));
                v.add(rs.getString("FullName"));
                v.add(rs.getString("NIC"));
                v.add(rs.getString("DateExam"));
                v.add(rs.getString("exampayment.Date"));
                v.add(rs.getString("exampayment.Amount"));
                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtFilterKeyReleased

    private void checkRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRegNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkRegNoActionPerformed

    private void checkNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkNicActionPerformed

    private void checkNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkNameActionPerformed

    private void checkDateFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDateFilterActionPerformed
        if (checkDateFilter.isSelected()) {
            webDate.setEnabled(true);
            webDate1.setEnabled(true);
            btnFilter.setEnabled(true);
        } else {

            enableDate();
        }
    }//GEN-LAST:event_checkDateFilterActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        try {
            if (webDate.getText().isEmpty() || webDate1.getText().isEmpty() ) {
                NotificationPopup.fillFeilds();
            } else if (checkDateFilter.isSelected()) {

                DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                
                ResultSet rs = DB.search("SELECT students.*,studentexam.*,exampayment.*FROM students INNER JOIN studentexam ON studentexam.idstudents = students.idstudents INNER JOIN exampayment ON exampayment.idStudentExam = studentexam.idStudentExam WHERE exampayment.Date BETWEEN   '" + webDate.getText() + "' AND '" + webDate1.getText() + "' ");

                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);

                while (rs.next()) {
                    Vector v = new Vector();

                    v.add(rs.getString("RegNo"));
                    v.add(rs.getString("FullName"));
                    v.add(rs.getString("NIC"));
                    v.add(rs.getString("DateExam"));
                    v.add(rs.getString("exampayment.Date"));
                    v.add(rs.getString("exampayment.Amount"));
                    dtm.addRow(v);
                }

            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_btnFilterActionPerformed

    private void checkNicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkNicMouseClicked
       txtFilter.grabFocus();
    }//GEN-LAST:event_checkNicMouseClicked

    private void checkNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkNameMouseClicked
       txtFilter.grabFocus();
    }//GEN-LAST:event_checkNameMouseClicked

    private void checkRegNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRegNoMouseClicked
       
    }//GEN-LAST:event_checkRegNoMouseClicked

    private void checkDateFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkDateFilterMouseClicked
     webDate.grabFocus();
    }//GEN-LAST:event_checkDateFilterMouseClicked

    private void webDate1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webDate1MouseEntered
      btnFilter.grabFocus();
    }//GEN-LAST:event_webDate1MouseEntered
    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewExamPayments().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFilter;
    private com.alee.extended.date.WebDateField webDate;
    private com.alee.extended.date.WebDateField webDate1;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            ViewExamPayments.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ViewExamPayments.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void enableDate() {
        webDate.setEnabled(false);
        webDate1.setEnabled(false);
        btnFilter.setEnabled(false);
        webDate.setText(null);
        webDate1.setText(null);

    }
}
