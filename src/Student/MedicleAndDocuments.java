package Student;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import com.alee.laf.WebLookAndFeel;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MedicleAndDocuments extends javax.swing.JFrame {

    static boolean maximized = true;
    int studentID;
    boolean txtValidate = false;
    int reportID;

    public MedicleAndDocuments() {
        initComponents();
        maximizeWindow();
        chkRN.setSelected(true);
        txtSearch.grabFocus();
        btnAdd.setEnabled(false);
        btnSave.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        chkNic = new javax.swing.JCheckBox();
        chkPP = new javax.swing.JCheckBox();
        chkOldDl = new javax.swing.JCheckBox();
        chkRN = new javax.swing.JCheckBox();
        txtStudentName = new javax.swing.JLabel();
        Photo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDocuments = new javax.swing.JTable();
        comboType = new javax.swing.JComboBox<>();
        btnClear2 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtPanel = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtReportNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dateIssue = new com.alee.extended.date.WebDateField();
        jLabel9 = new javax.swing.JLabel();
        dateExpire = new com.alee.extended.date.WebDateField();
        jLabel10 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        comboBloodGroup = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnClear1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtNotes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Documents-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 20, 690));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Documents", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 120, 30));

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Student"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel2.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 390, 30));

        chkNic.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkNic);
        chkNic.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkNic.setText("NIC");
        jPanel2.add(chkNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        chkPP.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkPP);
        chkPP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkPP.setText("Passport No");
        jPanel2.add(chkPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        chkOldDl.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkOldDl);
        chkOldDl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkOldDl.setText("OLD DL");
        jPanel2.add(chkOldDl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        chkRN.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkRN);
        chkRN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkRN.setText("Register No");
        jPanel2.add(chkRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtStudentName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtStudentName.setText("Student Name");
        jPanel2.add(txtStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 480, 20));

        Photo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(Photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 90, 110));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 570, 120));

        tblDocuments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Document", "Date"
            }
        ));
        jScrollPane1.setViewportView(tblDocuments);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 570, 310));

        comboType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "6 Photos,", "Birth Certificate Copy", "NIC Copy", "Old DL Copy" }));
        jPanel3.add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 210, 30));

        btnClear2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear2.setText("CLEAR");
        btnClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, 120, 40));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 120, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 610, 640));

        txtPanel.setBackground(java.awt.Color.white);
        txtPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medicle Certificate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        txtPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        txtPanel.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 120, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Report No");
        txtPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, 20));

        txtReportNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPanel.add(txtReportNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 400, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Issue Date");
        txtPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 20));

        dateIssue.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        dateIssue.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPanel.add(dateIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 400, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Expire Date");
        txtPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, 20));

        dateExpire.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        dateExpire.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPanel.add(dateExpire, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 400, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Blood Group");
        txtPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 90, 20));

        txtHeight.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });
        txtHeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHeightKeyTyped(evt);
            }
        });
        txtPanel.add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 360, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText(" Kg");
        txtPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 40, 20));

        txtWeight.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWeightKeyTyped(evt);
            }
        });
        txtPanel.add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 360, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Weight");
        txtPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 90, 20));

        comboBloodGroup.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboBloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A+", "B+", "AB+", "O+", "A-", "B-", "AB-", "O-" }));
        txtPanel.add(comboBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 400, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Height");
        txtPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 90, 20));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("INCH");
        txtPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 60, 20));

        btnClear1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear1.setText("CLEAR");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });
        txtPanel.add(btnClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 120, 40));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Notes");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 90, 20));

        txtNotes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNotes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNotesKeyTyped(evt);
            }
        });
        jPanel4.add(txtNotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 400, 30));

        txtPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 540, 60));

        jPanel1.add(txtPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 630, 630));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if (!comboType.getSelectedItem().toString().equals("Select")) {

            try {
                DB.idu("INSERT INTO `newkamal`.`Documents` (`DocType`, `Date`, `idstudents`) VALUES ('" + comboType.getSelectedItem().toString() + "', '"
                        + new SimpleDateFormat("yyyy/MM/dd").format(new Date()) + "', '" + studentID + "')");
                fillTable();
                NotificationPopup.save();
                comboType.setSelectedIndex(0);

            } catch (Exception ex) {
                Logger.getLogger(MedicleAndDocuments.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        ResultSet rs = null;

        try {
            if (chkNic.isSelected()) {

                rs = DB.search("SELECT * FROM students WHERE NIC = '" + txtSearch.getText() + "' ");

            } else if (chkOldDl.isSelected()) {

                rs = DB.search("SELECT * FROM students WHERE OldDLNo = '" + txtSearch.getText() + "' ");

            } else if (chkPP.isSelected()) {

                rs = DB.search("SELECT * FROM students WHERE PassportNo = '" + txtSearch.getText() + "' ");

            } else if (chkRN.isSelected()) {

                rs = DB.search("SELECT * FROM students WHERE RegNo = '" + txtSearch.getText() + "' ");

            }

            if (rs.next()) {

                studentID = rs.getInt("idstudents");
                txtStudentName.setText(rs.getString("FullName"));
                try {
                    Photo.setIcon(new ImageIcon(ImageIO.read(new File(rs.getString("Image"))).getScaledInstance(90, 100, Image.SCALE_SMOOTH)));

                } catch (Exception e) {
                }

                btnAdd.setEnabled(true);

                btnSave.setEnabled(true);

                fillTable();
                loadmcDetails();

            } else {

                Photo.setIcon(null);
                btnAdd.setEnabled(false);
                btnSave.setEnabled(false);

                studentID = 0;
                txtStudentName.setText("Student Name");
                comboType.setSelectedIndex(0);
                fillTable();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear2ActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) tblDocuments.getModel();
        dtm.setRowCount(0);
        comboType.setSelectedIndex(0);
        studentID = 0;
        txtStudentName.setText("Student Name");
        txtSearch.setText(null);
        txtSearch.grabFocus();


    }//GEN-LAST:event_btnClear2ActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        clearfeilds();
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void txtHeightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHeightKeyTyped
//        char c = evt.getKeyChar();
//
//        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || txtHeight.getText().length() == 3) {
//
//            evt.consume();
//
//        }
    }//GEN-LAST:event_txtHeightKeyTyped

    private void txtWeightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || txtWeight.getText().length() == 3) {

            evt.consume();

        }
    }//GEN-LAST:event_txtWeightKeyTyped

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed

    }//GEN-LAST:event_txtHeightActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        validateFeilds();
        if (btnSave.getText().equals("SAVE")) {
            if (txtValidate == false) {

                try {
                    DB.idu("INSERT INTO `newkamal`.`medicalReport` (`ReportNo`, `idstudents`, `BloodGroup`, `IssueDate`, `ValidPeriod`, `Weight`, `Height`,SpecialNotMedicle) VALUES ('" + txtReportNo.getText()
                            + "', '" + studentID + "', '" + comboBloodGroup.getSelectedItem().toString() + "', '" + dateIssue.getText() + "', '" + dateExpire.getText() + "', '" + txtWeight.getText() + "', '" + txtHeight.getText() + "','" + txtNotes.getText() + "')");

                    DB.idu("INSERT INTO `newkamal`.`Documents` (`DocType`, `Date`, `idstudents`) VALUES ('Medical Certificate', '"
                            + new SimpleDateFormat("yyyy/MM/dd").format(new Date()) + "', '" + studentID + "')");
                    NotificationPopup.save();
                    clearfeilds();
                    fillTable();
                    txtSearch.grabFocus();
                    btnSave.setEnabled(false);

                } catch (Exception ex) {
                    Logger.getLogger(MedicleAndDocuments.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {

                NotificationPopup.fillFeilds();

            }
        } else if (btnSave.getText().equals("UPDATE")) {

            try {
                DB.idu("UPDATE `newkamal`.`medicalReport` SET `ReportNo`='" + txtReportNo.getText() + "', `BloodGroup`='" + comboBloodGroup.getSelectedItem().toString() + "', `IssueDate`='" + dateIssue.getText() + "', `ValidPeriod`='" + dateExpire.getText() + "', `Weight`='" + txtWeight.getText() + "', `Height`='"
                        + txtHeight.getText() + "' , SpecialNotMedicle = '" + txtNotes.getText() + "' WHERE (`idReport`='" + reportID + "')");
                NotificationPopup.save();
                clearfeilds();
                fillTable();
                txtSearch.grabFocus();
                btnSave.setEnabled(false);
                btnSave.setText("SAVE");
            } catch (Exception ex) {
                Logger.getLogger(MedicleAndDocuments.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        try {
            DB.idu("UPDATE `newkamal`.`Documents` SET `isDelete` = '0' WHERE `idDocuments` = '" + tblDocuments.getValueAt(tblDocuments.getSelectedRow(), 0) + "'");
            NotificationPopup.Delete();
            fillTable();
        } catch (Exception ex) {
            Logger.getLogger(MedicleAndDocuments.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNotesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNotesKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNotesKeyTyped

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicleAndDocuments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Photo;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnClear2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkNic;
    private javax.swing.JCheckBox chkOldDl;
    private javax.swing.JCheckBox chkPP;
    private javax.swing.JCheckBox chkRN;
    private javax.swing.JComboBox<String> comboBloodGroup;
    private javax.swing.JComboBox<String> comboType;
    private com.alee.extended.date.WebDateField dateExpire;
    private com.alee.extended.date.WebDateField dateIssue;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblDocuments;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtNotes;
    private javax.swing.JPanel txtPanel;
    private javax.swing.JTextField txtReportNo;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtStudentName;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            MedicleAndDocuments.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            MedicleAndDocuments.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void fillTable() {

        try {

            ResultSet rs = DB.search("Select * from Documents where idstudents = '" + studentID + "' and isDelete = '1'");
            DefaultTableModel dtm = (DefaultTableModel) tblDocuments.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString("idDocuments"), rs.getString("DocType"), rs.getString("Date")});

            }

        } catch (Exception ex) {
            Logger.getLogger(MedicleAndDocuments.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void clearfeilds() {
        Component[] cp = txtPanel.getComponents();
        for (Component c : cp) {

            if (c instanceof JTextField) {

                ((JTextField) c).setText(null);

            }

        }

        dateIssue.setText(null);
        dateExpire.setText(null);
        comboBloodGroup.setSelectedIndex(0);
        txtNotes.setText(null);

    }

    public void validateFeilds() {

        Component[] cp = txtPanel.getComponents();
        for (Component c : cp) {

            if (c instanceof JTextField) {

                if ((((JTextField) c).getText().isEmpty())) {

                    txtValidate = true;

                    System.out.println(txtValidate);

                    break;

                } else {

                    txtValidate = false;

                }

            }

        }

        txtValidate = comboBloodGroup.getSelectedItem().toString().equals("Select") || dateIssue.getText().isEmpty() || dateExpire.getText().isEmpty();

    }

    private void loadmcDetails() {

        try {
            ResultSet rs = DB.search("SELECT * FROM newkamal.medicalReport WHERE idstudents = '" + studentID + "'");
            if (rs.next()) {

                reportID = rs.getInt("idReport");
                txtReportNo.setText(rs.getString("ReportNo"));
                dateIssue.setText(rs.getString("IssueDate"));
                dateExpire.setText(rs.getString("ValidPeriod"));
                txtHeight.setText(rs.getString("Height"));
                txtWeight.setText(rs.getString("Weight"));
                comboBloodGroup.setSelectedItem(rs.getString("BloodGroup"));
                txtNotes.setText(rs.getString("SpecialNotMedicle"));
                btnSave.setText("UPDATE");

            } else {

                clearfeilds();
                btnSave.setText("SAVE");
                reportID = 0;

            }

        } catch (Exception ex) {
            Logger.getLogger(MedicleAndDocuments.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
