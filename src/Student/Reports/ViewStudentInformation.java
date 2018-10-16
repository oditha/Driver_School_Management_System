package Student.Reports;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import MainMenu.*;
import com.alee.laf.WebLookAndFeel;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ViewStudentInformation extends javax.swing.JFrame {

    static boolean maximized = true;

    private static final int TrialResult_COL = 2;
    private static final int ExamResult_COL = 2;
    
    public ViewStudentInformation() {
        initComponents();
        maximizeWindow();
        //tableLoadStudent();
        tableLoadCatagory();
        setEnable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudent = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCtagory = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        checkLPNo = new javax.swing.JCheckBox();
        txtFilter = new javax.swing.JTextField();
        checkRegNo = new javax.swing.JCheckBox();
        checkNic = new javax.swing.JCheckBox();
        checkName = new javax.swing.JCheckBox();
        checkDeactive = new javax.swing.JCheckBox();
        checkAll = new javax.swing.JCheckBox();
        checkActive = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        checkDateFilter = new javax.swing.JCheckBox();
        webDate = new com.alee.extended.date.WebDateField();
        btnFilter = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableTrial = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableExam = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Information-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reg No", "Name", "NIC", "LP No", "Reg Date", "Address", "Mobile No", "Course Fee"
            }
        ));
        tableStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableStudent);
        if (tableStudent.getColumnModel().getColumnCount() > 0) {
            tableStudent.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 1000, 510));

        tableCtagory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Catagory", "Type", "Total"
            }
        ));
        jScrollPane2.setViewportView(tableCtagory);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 160, 310, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filter By", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkLPNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkLPNo);
        checkLPNo.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        checkLPNo.setText("LP No");
        checkLPNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkLPNoActionPerformed(evt);
            }
        });
        jPanel2.add(checkLPNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

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
        jPanel2.add(txtFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 330, 30));

        checkRegNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkRegNo);
        checkRegNo.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        checkRegNo.setText("Reg No");
        checkRegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRegNoActionPerformed(evt);
            }
        });
        jPanel2.add(checkRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        checkNic.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkNic);
        checkNic.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        checkNic.setText("NIC");
        checkNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNicActionPerformed(evt);
            }
        });
        jPanel2.add(checkNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        checkName.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkName);
        checkName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        checkName.setText("Name");
        checkName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNameActionPerformed(evt);
            }
        });
        jPanel2.add(checkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        checkDeactive.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkDeactive);
        checkDeactive.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkDeactive.setText("Deactive Students");
        checkDeactive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDeactiveActionPerformed(evt);
            }
        });
        jPanel2.add(checkDeactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        checkAll.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkAll);
        checkAll.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkAll.setText("All Students");
        checkAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAllActionPerformed(evt);
            }
        });
        jPanel2.add(checkAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        checkActive.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkActive);
        checkActive.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkActive.setText("Active Students");
        checkActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActiveActionPerformed(evt);
            }
        });
        jPanel2.add(checkActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 400, 130));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkDateFilter.setBackground(new java.awt.Color(255, 255, 255));
        checkDateFilter.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        checkDateFilter.setText("Filter By Date");
        checkDateFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDateFilterActionPerformed(evt);
            }
        });
        jPanel3.add(checkDateFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        webDate.setDateFormat(new SimpleDateFormat("dd.MM.yyyy"));
        webDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        webDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd.MM.yyyy"))));
        jPanel3.add(webDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, 30));

        btnFilter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnFilter.setText("FILTER");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });
        jPanel3.add(btnFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 120, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 410, 120));

        tableTrial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trail Date", "Vehicle Class", "Trial Result"
            }
        ));
        jScrollPane3.setViewportView(tableTrial);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 330, 310, 150));

        tableExam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exam Date", "Exam Type", "Result"
            }
        ));
        jScrollPane4.setViewportView(tableExam);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 510, 310, 160));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        try {
            if (webDate.getDate() == null) {
                NotificationPopup.fillFeilds();
            } else {
                DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
                String getDate = df.format(webDate.getDate());
                ResultSet rs = DB.search("SELECT * FROM students WHERE RegisterDate='" + getDate + "'ORDER BY RegNo ASC ");
                DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();
                dtm.setRowCount(0);
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("RegNo"));
                    v.add(rs.getString("FullName"));
                    v.add(rs.getString("NIC"));
                    v.add(rs.getString("LPNumber"));
                    v.add(rs.getString("RegisterDate"));
                    v.add(rs.getString("AddressPermenent"));
                    v.add(rs.getString("TpPersonal"));
                    v.add(rs.getString("CourseFee"));
                    dtm.addRow(v);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnFilterActionPerformed

    private void checkDateFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDateFilterActionPerformed
        if (checkDateFilter.isSelected()) {
            tableLoadStudent();
            DefaultTableModel dtm2 = (DefaultTableModel) tableCtagory.getModel();
            dtm2.setRowCount(0);
            webDate.setEnabled(true);
            btnFilter.setEnabled(true);
            txtFilter.setText("");
        } else {
            tableLoadStudent();
            setEnable();
            webDate.setDate(null);
        }
    }//GEN-LAST:event_checkDateFilterActionPerformed

    private void checkAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllActionPerformed
        txtFilter.setText("");
        tableLoadStudent();
    }//GEN-LAST:event_checkAllActionPerformed

    private void checkNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNameActionPerformed
        try {
            txtFilter.setText("");
            ResultSet rs = DB.search("SELECT students.*,trial.*,trialresult.* FROM trial INNER JOIN trialresult ON trialresult.idTrial = trial.idTrial INNER JOIN students ON trial.idstudents = students.idstudents WHERE FullName='" + txtFilter.getText() + "'");
            DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();
            //dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("RegNo"));
                v.add(rs.getString("FullName"));
                v.add(rs.getString("NIC"));
                v.add(rs.getString("LPNumber"));
                v.add(rs.getString("RegisterDate"));
                v.add(rs.getString("AddressPermenent"));
                v.add(rs.getString("TpPersonal"));
                v.add(rs.getString("CourseFee"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_checkNameActionPerformed

    private void checkNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNicActionPerformed
        try {
            txtFilter.setText("");
            ResultSet rs = DB.search("SELECT students.*,trial.*,trialresult.* FROM trial INNER JOIN trialresult ON trialresult.idTrial = trial.idTrial INNER JOIN students ON trial.idstudents = students.idstudents WHERE NIC='" + txtFilter.getText() + "'");
            DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();
            //dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("RegNo"));
                v.add(rs.getString("FullName"));
                v.add(rs.getString("NIC"));
                v.add(rs.getString("LPNumber"));
                v.add(rs.getString("RegisterDate"));
                v.add(rs.getString("AddressPermenent"));
                v.add(rs.getString("TpPersonal"));
                v.add(rs.getString("CourseFee"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_checkNicActionPerformed

    private void checkRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRegNoActionPerformed
        try {
            txtFilter.setText("NKLR-");
            ResultSet rs = DB.search("SELECT students.*,trial.*,trialresult.* FROM trial INNER JOIN trialresult ON trialresult.idTrial = trial.idTrial INNER JOIN students ON trial.idstudents = students.idstudents WHERE RegNo='" + txtFilter.getText() + "'");
            DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();
            //dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("RegNo"));
                v.add(rs.getString("FullName"));
                v.add(rs.getString("NIC"));
                v.add(rs.getString("LPNumber"));
                v.add(rs.getString("RegisterDate"));
                v.add(rs.getString("AddressPermenent"));
                v.add(rs.getString("TpPersonal"));
                v.add(rs.getString("CourseFee"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_checkRegNoActionPerformed

    private void txtFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterKeyReleased
        ResultSet rs = null;
        DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();
        dtm.setRowCount(0);
        try {
            if (txtFilter.getText().isEmpty()) {
                tableLoadStudent();
                DefaultTableModel dtm2 = (DefaultTableModel) tableCtagory.getModel();
                dtm2.setRowCount(0);
            } else if (checkRegNo.isSelected()) {
                rs = DB.search("SELECT * FROM students WHERE RegNo LIKE '" + txtFilter.getText() + "%' ");
            } else if (checkNic.isSelected()) {
                rs = DB.search("SELECT * FROM students WHERE NIC LIKE '" + txtFilter.getText() + "%' ");
            } else if (checkName.isSelected()) {
                rs = DB.search("SELECT * FROM students WHERE FullName LIKE '" + txtFilter.getText() + "%' ");
            } else {
                rs = DB.search("SELECT * FROM students WHERE LPNumber LIKE '" + txtFilter.getText() + "%' ");
            }

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("RegNo"));
                v.add(rs.getString("FullName"));
                v.add(rs.getString("NIC"));
                v.add(rs.getString("LPNumber"));
                v.add(rs.getString("RegisterDate"));
                v.add(rs.getString("AddressPermenent"));
                v.add(rs.getString("TpPersonal"));
                v.add(rs.getString("CourseFee"));
                dtm.addRow(v);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtFilterKeyReleased

    private void checkLPNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkLPNoActionPerformed
        try {
            txtFilter.setText("");
            ResultSet rs = DB.search("SELECT students.*,trial.*,trialresult.* FROM trial INNER JOIN trialresult ON trialresult.idTrial = trial.idTrial INNER JOIN students ON trial.idstudents = students.idstudents WHERE LPNumber='" + txtFilter.getText() + "'");
            DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();
            //dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("RegNo"));
                v.add(rs.getString("FullName"));
                v.add(rs.getString("NIC"));
                v.add(rs.getString("LPNumber"));
                v.add(rs.getString("RegisterDate"));
                v.add(rs.getString("AddressPermenent"));
                v.add(rs.getString("TpPersonal"));
                v.add(rs.getString("CourseFee"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_checkLPNoActionPerformed

    private void tableStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStudentMouseClicked
        String getId = null;
        try {
            DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();
            DefaultTableModel dtm2 = (DefaultTableModel) tableCtagory.getModel();
            String getRegNo = (String) dtm.getValueAt(tableStudent.getSelectedRow(), 0);
            ResultSet rs = DB.search("SELECT st.*,lc.* FROM students st INNER JOIN licencecatagory lc ON st.idstudents=lc.idstudents WHERE RegNo='" + getRegNo + "' ");
            if (rs.next()) {
                ResultSet rs1 = DB.search("SELECT * FROM students WHERE RegNo='" + getRegNo + "' ");
                if (rs1.next()) {
                    getId = rs1.getString("RegNo");
                }
                ResultSet rs2 = DB.search("SELECT st.*,vc.*,lc.* FROM students st INNER JOIN licencecatagory lc ON st.idstudents=lc.idstudents INNER JOIN vehicleclasses vc ON lc.idVehicleClasses=vc.idVehicleClasses WHERE RegNo='" + getId + "' ");
                
                dtm2.setRowCount(0);
                String getType = rs.getString("Type");
                while (rs2.next()) {
                    Vector v = new Vector();
                    v.add(rs2.getString("VehicleClasseName"));
                    v.add(rs2.getString("Type"));
                    if (rs2.getString("Type").equals("Part Time")) {
                        v.add(rs2.getString("PartTraningPrice"));
                    } else {
                        v.add(rs2.getString("FullTraningPrice"));
                    }
//                    if (rs2.getString("Type").equals("Part Time")) {
//                        Double d1=Double.parseDouble(rs2.getString("PartTraningPrice"));
//                        Double d2=Double.parseDouble(rs2.getString("PriceCatogiry"));
//                        Double d=(d1-d2)/d1*100;
//                        String setDis=d.toString();
//                        v.add(setDis);
//                    }else{
//                        Double d1=Double.parseDouble(rs2.getString("FullTraningPrice"));
//                        Double d2=Double.parseDouble(rs2.getString("PriceCatogiry"));
//                        Double d=(d1-d2)/d1*100;
//                        String setDis=d.toString();
//                        v.add(setDis);
//                    }
                    v.add(rs2.getString("PriceCatogiry"));
                    dtm2.addRow(v);
                }
            }else{
                dtm2.setRowCount(0);
            }

            ResultSet rs3 = DB.search("SELECT students.*, trial.*,trialresult.* FROM students INNER JOIN trial ON trial.idstudents = students.idstudents INNER JOIN trialresult ON trialresult.idTrial = trial.idTrial WHERE RegNo='" + getRegNo + "' ");
            DefaultTableModel dtm3 = (DefaultTableModel) tableTrial.getModel();
            dtm3.setRowCount(0);
            while (rs3.next()) {
                Vector v1 = new Vector();
                v1.add(rs3.getString("Date"));
                v1.add(rs3.getString("VehicleClass"));
                v1.add(rs3.getString("TrialResult"));
                dtm3.addRow(v1);
            }

         aaa();
            

            ResultSet rs4 = DB.search("SELECT students.*,examresult.*,studentexam.* FROM students INNER JOIN studentexam ON studentexam.idstudents = students.idstudents INNER JOIN examresult ON examresult.idStudentExam = studentexam.idStudentExam WHERE RegNo='" + getRegNo + "' ");
            DefaultTableModel dtm4 = (DefaultTableModel) tableExam.getModel();
            dtm4.setRowCount(0);
            while (rs4.next()) {
                Vector v2 = new Vector();
                v2.add(rs4.getString("DateExam"));
                v2.add(rs4.getString("ExamType"));
                v2.add(rs4.getString("Marks"));
                dtm4.addRow(v2);
            }

            aaa1();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tableStudentMouseClicked

    private void txtFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilterActionPerformed

    private void checkActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActiveActionPerformed
        try {
            txtFilter.setText("");
            ResultSet rs = DB.search("SELECT students.*,trial.*,trialresult.* FROM trial INNER JOIN trialresult ON trialresult.idTrial = trial.idTrial INNER JOIN students ON trial.idstudents = students.idstudents WHERE TrialResult LIKE 'Fail' ");
            DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("RegNo"));
                v.add(rs.getString("FullName"));
                v.add(rs.getString("NIC"));
                v.add(rs.getString("LPNumber"));
                v.add(rs.getString("RegisterDate"));
                v.add(rs.getString("AddressPermenent"));
                v.add(rs.getString("TpPersonal"));
                v.add(rs.getString("CourseFee"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_checkActiveActionPerformed

    private void checkDeactiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDeactiveActionPerformed
        try {
            txtFilter.setText("");
            ResultSet rs = DB.search("SELECT students.*,trial.*,trialresult.* FROM trial INNER JOIN trialresult ON trialresult.idTrial = trial.idTrial INNER JOIN students ON trial.idstudents = students.idstudents WHERE TrialResult LIKE 'Pass' ");
            DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("RegNo"));
                v.add(rs.getString("FullName"));
                v.add(rs.getString("NIC"));
                v.add(rs.getString("LPNumber"));
                v.add(rs.getString("RegisterDate"));
                v.add(rs.getString("AddressPermenent"));
                v.add(rs.getString("TpPersonal"));
                v.add(rs.getString("CourseFee"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_checkDeactiveActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudentInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkActive;
    private javax.swing.JCheckBox checkAll;
    private javax.swing.JCheckBox checkDateFilter;
    private javax.swing.JCheckBox checkDeactive;
    private javax.swing.JCheckBox checkLPNo;
    private javax.swing.JCheckBox checkName;
    private javax.swing.JCheckBox checkNic;
    private javax.swing.JCheckBox checkRegNo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tableCtagory;
    private javax.swing.JTable tableExam;
    private javax.swing.JTable tableStudent;
    private javax.swing.JTable tableTrial;
    private javax.swing.JTextField txtFilter;
    private com.alee.extended.date.WebDateField webDate;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            ViewStudentInformation.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ViewStudentInformation.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void tableLoadStudent() {
        try {
            ResultSet rs = DB.search("SELECT * FROM students ORDER BY RegNo ASC");
            DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("RegNo"));
                v.add(rs.getString("FullName"));
                v.add(rs.getString("NIC"));
                v.add(rs.getString("LPNumber"));
                v.add(rs.getString("RegisterDate"));
                v.add(rs.getString("AddressPermenent"));
                v.add(rs.getString("TpPersonal"));
                v.add(rs.getString("CourseFee"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void tableLoadCatagory() {
    }

    private void setEnable() {
        webDate.setEnabled(false);
        btnFilter.setEnabled(false);
    }
    
    private void aaa(){
        
        try {
            
            
           tableTrial.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public DefaultTableCellRenderer getTableCellRendererComponent(JTable table,Object value, boolean isSelected, boolean hasFocus, int row, int col){
              super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
              
              String status = (String)table.getModel().getValueAt(row, TrialResult_COL);
              
               if ("Pass".equals(status)) {
                    setBackground(Color.GREEN);
                    //setForeground(Color.WHITE);
                } else {
                    setBackground(Color.RED);
                }
                return this;
               
            
            } 
        
            
        });
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
        private void aaa1(){
        
        try {
            
            
           tableExam.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public DefaultTableCellRenderer getTableCellRendererComponent(JTable table,Object value, boolean isSelected, boolean hasFocus, int row, int col){
              super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
              
              String status = (String)table.getModel().getValueAt(row, ExamResult_COL);
              int x=Integer.parseInt(status);
              
               if (x >= 30 ) {
                    setBackground(Color.GREEN);
                    //setForeground(Color.WHITE);
                } else {
                    setBackground(Color.RED);
                }
                return this;
               
            
            } 
        
            
        });
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
