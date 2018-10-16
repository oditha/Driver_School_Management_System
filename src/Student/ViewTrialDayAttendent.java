
package Student;

import ExtenelClasses.DB;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ViewTrialDayAttendent extends javax.swing.JFrame {
static boolean maximized = true;

    public ViewTrialDayAttendent() {
        initComponents();
        maximizeWindow();
        loadCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        checkAbsent = new javax.swing.JCheckBox();
        btnFilter2 = new javax.swing.JButton();
        checkPresent = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAtt2 = new javax.swing.JTable();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" View trial Day Attendence-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filter By", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 220, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel2.setText("Select Trial Date");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 20));

        checkAbsent.setBackground(new java.awt.Color(255, 255, 255));
        checkAbsent.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkAbsent.setText("Absent");
        checkAbsent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAbsentActionPerformed(evt);
            }
        });
        jPanel3.add(checkAbsent, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        btnFilter2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnFilter2.setText("FILTER");
        btnFilter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilter2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnFilter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 120, 40));

        checkPresent.setBackground(new java.awt.Color(255, 255, 255));
        checkPresent.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPresent.setText("Present");
        checkPresent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPresentActionPerformed(evt);
            }
        });
        jPanel3.add(checkPresent, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 550, 110));

        tableAtt2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registation No", "Student Name", "Attendence"
            }
        ));
        jScrollPane2.setViewportView(tableAtt2);
        if (tableAtt2.getColumnModel().getColumnCount() > 0) {
            tableAtt2.getColumnModel().getColumn(1).setResizable(false);
            tableAtt2.getColumnModel().getColumn(1).setPreferredWidth(500);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 920, 450));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void checkAbsentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAbsentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAbsentActionPerformed

    private void checkPresentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPresentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPresentActionPerformed

    private void btnFilter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilter2ActionPerformed
        try {
            ResultSet rs=null;
            String getDate=(String) jComboBox3.getSelectedItem();
            DefaultTableModel dtm=(DefaultTableModel) tableAtt2.getModel();
            dtm.setRowCount(0);
            if (checkPresent.isSelected()) {
                rs=DB.search("SELECT students.*,trial.*,trialdayattendece.* FROM students INNER JOIN trial ON trial.idstudents = students.idstudents INNER JOIN trialdayattendece ON students.idstudents=trialdayattendece.idstudents WHERE TrialDate='"+getDate+"' AND Type LIKE 'Present' ");
            }else if (checkAbsent.isSelected()) {
                rs=DB.search("SELECT students.*,trial.*,trialdayattendece.* FROM students INNER JOIN trial ON trial.idstudents = students.idstudents INNER JOIN trialdayattendece ON students.idstudents=trialdayattendece.idstudents WHERE TrialDate='"+getDate+"' AND Type LIKE 'Absent' ");
            }else{
                rs=DB.search("SELECT students.*,trial.*,trialdayattendece.* FROM students INNER JOIN trial ON trial.idstudents = students.idstudents INNER JOIN trialdayattendece ON students.idstudents=trialdayattendece.idstudents WHERE TrialDate='"+getDate+"' ");
            }
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("RegNo"));
                v.add(rs.getString("FullName"));
                v.add(rs.getString("Type"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnFilter2ActionPerformed


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTrialDayAttendent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilter2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkAbsent;
    private javax.swing.JCheckBox checkPresent;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableAtt2;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            ViewTrialDayAttendent.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ViewTrialDayAttendent.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void loadCombo() {
           try {
            ResultSet rs=DB.search("SELECT DISTINCT Date FROM trial ORDER BY Date DESC ");
            while (rs.next()) {                
                String getDate=rs.getString("Date");
                //jComboBox2.addItem(getDate);
                jComboBox3.addItem(getDate);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
