
package Student.Reports;

import ExtenelClasses.DB;
import MainMenu.*;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ViewExamAttendnce extends javax.swing.JFrame {
static boolean maximized = true;
    public ViewExamAttendnce() {
        initComponents();
        maximizeWindow();
//        enabledate();
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
        webDate = new com.alee.extended.date.WebDateField();
        btnFilter = new javax.swing.JButton();
        txtFilter = new javax.swing.JTextField();
        checkRegNo = new javax.swing.JCheckBox();
        checkName = new javax.swing.JCheckBox();
        checkNic = new javax.swing.JCheckBox();
        checkDateFilter = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Exam Attendence-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("View Exam Dates"), "View Exam Attendnce", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "ExamDate", "Type"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 1240, 470));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filter By", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        webDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(webDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 240, 30));

        btnFilter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnFilter.setText("FILTER");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });
        jPanel3.add(btnFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 120, 40));

        txtFilter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilterKeyReleased(evt);
            }
        });
        jPanel3.add(txtFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 330, 30));

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
        jPanel3.add(checkRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 80, -1));

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
        jPanel3.add(checkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 70, -1));

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
        jPanel3.add(checkNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

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
        jPanel3.add(checkDateFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1240, 110));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1320, 680));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
//                       if (checkDateFilter.isSelected()) {
//            webDate.setEnabled(true);
//            webDate1.setEnabled(true);
//            btnFilter.setEnabled(true);
//        } else {
//
//            enabledate();
//        }
        try {
            
            if (webDate.getText().isEmpty()) {
                
            }else if(checkDateFilter.isSelected()){
            
                DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                
              ResultSet  rs = DB.search("SELECT examdayattendece.*,students.* FROM students INNER JOIN examdayattendece ON examdayattendece.idstudents = students.idstudents WHERE examdayattendece.ExamDate = '"+webDate.getText()+"'");
            
              DefaultTableModel dtm =(DefaultTableModel) jTable1.getModel();
              dtm.setRowCount(0);
              
                while (rs.next()) {
                    
                    Vector v = new Vector();
                    
                    v.add(rs.getString("idstudents"));
                    v.add(rs.getString("FullName"));
                    v.add(rs.getString("ExamDate"));
                    v.add(rs.getString("Type"));
                    dtm.addRow(v);
                    
                    
                }
              
            }
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnFilterActionPerformed

    private void txtFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterKeyReleased
     

       ResultSet rs = null;
       DefaultTableModel dtm =(DefaultTableModel) jTable1.getModel();
       dtm.setRowCount(0);
       
        try {
            if (txtFilter.getText().isEmpty()) {
                
             DefaultTableModel dtm1=(DefaultTableModel)jTable1.getModel();
            }else if(checkRegNo.isSelected()){
            
                rs=DB.search("SELECT examdayattendece.*,students.* FROM students INNER JOIN examdayattendece ON examdayattendece.idstudents = students.idstudents  WHERE students.RegNo LIKE   '"+txtFilter.getText()+"%'");
            }else if(checkNic.isSelected()){
            
                rs=DB.search("SELECT examdayattendece.*,students.* FROM students INNER JOIN examdayattendece ON examdayattendece.idstudents = students.idstudents WHERE students.NIC LIKE '"+txtFilter.getText()+"%'");
            }else{
            
                rs=DB.search("SELECT examdayattendece.*,students.* FROM students INNER JOIN examdayattendece ON examdayattendece.idstudents = students.idstudents WHERE students.FullName LIKE '"+txtFilter.getText()+"%'");
            }
                while (rs.next()) {
                   // System.out.println("ss");
                    Vector v = new Vector();
                    v.add(rs.getString("idstudents"));
                    v.add(rs.getString("FullName"));
                    v.add(rs.getString("ExamDate"));
                    v.add(rs.getString("Type"));
                    dtm.addRow(v);
                
            }

            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtFilterKeyReleased

    private void checkNicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkNicMouseClicked
        txtFilter.grabFocus();
    }//GEN-LAST:event_checkNicMouseClicked

    private void checkNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkNicActionPerformed

    private void checkNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkNameMouseClicked
        txtFilter.grabFocus();
    }//GEN-LAST:event_checkNameMouseClicked

    private void checkNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkNameActionPerformed

    private void checkRegNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRegNoMouseClicked

    }//GEN-LAST:event_checkRegNoMouseClicked

    private void checkRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRegNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkRegNoActionPerformed

    private void checkDateFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkDateFilterMouseClicked
        webDate.grabFocus();
    }//GEN-LAST:event_checkDateFilterMouseClicked

    private void checkDateFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDateFilterActionPerformed

    }//GEN-LAST:event_checkDateFilterActionPerformed


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewExamAttendnce().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFilter;
    private com.alee.extended.date.WebDateField webDate;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            ViewExamAttendnce.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ViewExamAttendnce.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

//    private void enabledate() {
// 
//        webDate.setEnabled(false);
//        webDate1.setEnabled(false);
//        btnFilter.setEnabled(false);
//        webDate.setText(null);
//        webDate1.setText(null);
//    }
}
