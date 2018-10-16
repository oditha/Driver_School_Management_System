
package Student.Reports;

import ExtenelClasses.DB;
import com.alee.laf.WebLookAndFeel;
import com.mysql.jdbc.ResultSet;
import java.awt.GraphicsEnvironment;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class TshirtandCapRecords extends javax.swing.JFrame {
static boolean maximized = true;
    public TshirtandCapRecords() {
        initComponents();
        maximizeWindow();
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
        setTitle("T-shirt And Cap records-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("View Exam Dates"), "Tshirt and Cap Records", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Hand Over Date", "Item", "Amount"
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

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jLabel3.setText("From");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 50, 30));

        btnFilter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnFilter.setText("FILTER");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });
        jPanel3.add(btnFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 50, 120, 40));

        webDate1.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webDate1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        webDate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                webDate1MouseEntered(evt);
            }
        });
        jPanel3.add(webDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 240, 30));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jLabel4.setText("To");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 50, 30));

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

        


    }//GEN-LAST:event_btnFilterActionPerformed

    private void webDate1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webDate1MouseEntered

    }//GEN-LAST:event_webDate1MouseEntered

    private void txtFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterKeyReleased

        ResultSet rs=null;
        DefaultTableModel dtm =(DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        try {
            
                if (txtFilter.getText().isEmpty()) {
                
            }else if(checkRegNo.isSelected()){
            
                rs = (ResultSet) DB.search("SELECT students.*,tshirtandcap.* FROM students INNER JOIN tshirtandcap ON tshirtandcap.students_idstudents = students.idstudents WHERE students.RegNo LIKE '"+txtFilter.getText()+"%'");
            
            }else if(checkName.isSelected()){
            
                rs =(ResultSet) DB.search("SELECT students.*,tshirtandcap.* FROM students INNER JOIN tshirtandcap ON tshirtandcap.students_idstudents = students.idstudents WHERE students.FullName LIKE '"+txtFilter.getText()+"%'");
            }else{
            
                rs = (ResultSet) DB.search("SELECT students.*,tshirtandcap.* FROM students INNER JOIN tshirtandcap ON tshirtandcap.students_idstudents = students.idstudents WHERE students.NIC LIKE '"+txtFilter.getText()+"%' ");
            
            }
                while (rs.next()) {                
                
                        Vector v = new Vector();
                        
                        v.add(rs.getString("FullName"));
                        v.add(rs.getString("HandOverDate"));
                        v.add(rs.getString("Item"));
                        v.add(rs.getString("Amount"));
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

    private void txtFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilterActionPerformed


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TshirtandCapRecords().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFilter;
    private com.alee.extended.date.WebDateField webDate;
    private com.alee.extended.date.WebDateField webDate1;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            TshirtandCapRecords.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            TshirtandCapRecords.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }
}
