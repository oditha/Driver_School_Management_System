package Student;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class AddExamDayAttendent extends javax.swing.JFrame {

    static boolean maximized = true;

    public AddExamDayAttendent() {
        initComponents();
        maximizeWindow();
        loadCombov2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAtt1 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnFilter1 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Kamal- Add Exam Day Attendent");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableAtt1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exam ID", "Registation No", "Student Name", "Attendence"
            }
        ));
        jScrollPane1.setViewportView(tableAtt1);
        if (tableAtt1.getColumnModel().getColumnCount() > 0) {
            tableAtt1.getColumnModel().getColumn(0).setMinWidth(0);
            tableAtt1.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableAtt1.getColumnModel().getColumn(0).setMaxWidth(0);
            tableAtt1.getColumnModel().getColumn(2).setResizable(false);
            tableAtt1.getColumnModel().getColumn(2).setPreferredWidth(500);
            tableAtt1.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(jComboBox1));
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 900, 370));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 220, 30));

        btnFilter1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnFilter1.setText("FILTER");
        btnFilter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilter1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnFilter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 120, 30));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 120, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("Select Exam Date");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 120, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 1020, 570));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilter1ActionPerformed
        try {
            String getDate = (String) jComboBox2.getSelectedItem();
            ResultSet rs = DB.search("SELECT students.*,studentexam.* FROM students INNER JOIN studentexam ON studentexam.idstudents = students.idstudents WHERE DateExam='" + getDate + "' ");
            DefaultTableModel dtm = (DefaultTableModel) tableAtt1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("idStudentExam"));
                v.add(rs.getString("RegNo"));

                v.add(rs.getString("FullName"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnFilter1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String getStuID = null;
        try {
            DefaultTableModel dtm = (DefaultTableModel) tableAtt1.getModel();
            String getDate = (String) jComboBox2.getSelectedItem();
            for (int i = 0; i < dtm.getRowCount(); i++) {

                String s = dtm.getValueAt(i, 0).toString();
                String s1 = dtm.getValueAt(i, 1).toString();
                String s2 = dtm.getValueAt(i, 2).toString();
                String s3 = dtm.getValueAt(i, 3).toString();

                ResultSet rs = DB.search("SELECT * FROM students WHERE RegNo='" + s1 + "' ");
                while (rs.next()) {
                    getStuID = rs.getString("idstudents");
                }

                String insert = "INSERT INTO examdayattendece(ExamDate,idstudents,Type,IdExam) VALUES('" + getDate + "','" + getStuID + "','" + s3 + "','"+s+"')";
                DB.idu(insert);

            }
            loadCombov2();
            dtm.setRowCount(0);
            NotificationPopup.save();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddExamDayAttendent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilter1;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAtt1;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            AddExamDayAttendent.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            AddExamDayAttendent.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void loadCombo() {
        try {
            ResultSet rs = DB.search("SELECT DISTINCT DateExam FROM studentexam");
            while (rs.next()) {
                String getDate = rs.getString("DateExam");
                jComboBox2.addItem(getDate);
                //jComboBox3.addItem(getDate);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void loadCombov2() {
        try {
            ResultSet rs = DB.search("SELECT DISTINCT DateExam FROM studentexam");
            while (rs.next()) {
                String getDate = rs.getString("DateExam");
                
               ResultSet r = DB.search("SELECT DISTINCT examdayattendece.ExamDate FROM examdayattendece WHERE examdayattendece.ExamDate = '"+getDate+"'");
                if (!r.next()) {
                jComboBox2.addItem(getDate);
                    
                }
                //jComboBox3.addItem(getDate);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
