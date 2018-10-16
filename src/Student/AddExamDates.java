package Student;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import ExtenelClasses.dfPrice;
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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddExamDates extends javax.swing.JFrame {

    static boolean maximized = true;
    int studentID;
    boolean txtValidate = false;

    public AddExamDates() {
        initComponents();
        maximizeWindow();
        chkRN.setSelected(true);
        txtSearch.grabFocus();
        radioWritten.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        panelTXT = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        chkNic = new javax.swing.JCheckBox();
        chkPP = new javax.swing.JCheckBox();
        chkOldDl = new javax.swing.JCheckBox();
        chkRN = new javax.swing.JCheckBox();
        txtStudentName = new javax.swing.JLabel();
        Photo = new javax.swing.JLabel();
        txTry = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DateExam = new com.alee.extended.date.WebDateField();
        jLabel9 = new javax.swing.JLabel();
        radioOral = new javax.swing.JRadioButton();
        radioWritten = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txtPayments = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Assign exam date-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 20, 660));

        panelTXT.setBackground(java.awt.Color.white);
        panelTXT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Exam Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        panelTXT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Type");
        panelTXT.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 90, 30));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("CLEAR");
        panelTXT.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 120, 40));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        panelTXT.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, 120, 40));

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Student"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel2.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 380, 30));

        chkNic.setBackground(new java.awt.Color(255, 255, 255));
        chkNic.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        chkNic.setText("NIC");
        jPanel2.add(chkNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        chkPP.setBackground(new java.awt.Color(255, 255, 255));
        chkPP.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        chkPP.setText("Passport No");
        jPanel2.add(chkPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        chkOldDl.setBackground(new java.awt.Color(255, 255, 255));
        chkOldDl.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        chkOldDl.setText("OLD DL");
        jPanel2.add(chkOldDl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        chkRN.setBackground(new java.awt.Color(255, 255, 255));
        chkRN.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        chkRN.setText("Register No");
        jPanel2.add(chkRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtStudentName.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        txtStudentName.setText("Student Name");
        jPanel2.add(txtStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 480, 20));

        Photo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(Photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 90, 110));

        panelTXT.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 540, 120));

        txTry.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txTry.setText(" ");
        panelTXT.add(txTry, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 90, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setText("Exam Date");
        panelTXT.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 80, 30));

        DateExam.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        DateExam.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelTXT.add(DateExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 400, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText("Try");
        panelTXT.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 90, 20));

        radioOral.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioOral);
        radioOral.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        radioOral.setText("Oral Test");
        panelTXT.add(radioOral, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        radioWritten.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioWritten);
        radioWritten.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        radioWritten.setText("Written Test");
        panelTXT.add(radioWritten, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setText(" LKR");
        panelTXT.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 40, 30));

        txtPayments.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaymentsActionPerformed(evt);
            }
        });
        txtPayments.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaymentsKeyTyped(evt);
            }
        });
        panelTXT.add(txtPayments, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 360, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel12.setText("Payment");
        panelTXT.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 100, 30));

        jPanel1.add(panelTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 650, 620));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exam Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Type", "Lite V. Marks", "Hevy V. Marks"
            }
        ));
        jScrollPane1.setViewportView(tblDetails);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 530, 480));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 120, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 590, 610));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

                ValidateResults();

            } else {

                clearFeilds();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        validateFeilds();
        String ExamType = null;
        String txtPaymentsDate = new SimpleDateFormat("dd.MM.yyy").format(new Date());

        if (radioWritten.isSelected()) {

            ExamType = "Written Test";

        } else if (radioOral.isSelected()) {

            ExamType = "Oral Test";

        }

        if (rootPaneCheckingEnabled) {

        }

        if (txtValidate == false) {

            try {
                DB.idu("INSERT INTO `newkamal`.`StudentExam` (`DateExam`, `ShyExam`, `idstudents`, `ExamType`) VALUES ('" + DateExam.getText()
                        + "', '" + txTry.getText() + "', '" + studentID + "', '" + ExamType + "')");

                ResultSet search = DB.search("SELECT Max(studentexam.idStudentExam) FROM studentexam");
                search.next();
                DB.idu("INSERT INTO `newkamal`.`examPayment` (`Date`, `Amount`, `idStudentExam`) VALUES ('"
                        + txtPaymentsDate + "', '" + dfPrice.dcf(Double.parseDouble(txtPayments.getText())) + "', '" + search.getString("Max(studentexam.idStudentExam)") + "')");
                DB.idu("INSERT INTO `newkamal`.`IncomeExpence` (`Date`, `Description`, `Income`) VALUES ('" + txtPaymentsDate + "', 'Exam fee Payments', '" + txtPayments.getText() + "')");

                NotificationPopup.save();

                //fillTable();
//                if (Integer.parseInt(txTry.getText()) > 1) {
//                    
//                    new ExamPayment().setVisible(true);
//
//                }
                clearFeilds();
                txtSearch.setText(null);
            } catch (Exception ex) {
                Logger.getLogger(AddExamDates.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            NotificationPopup.fillFeilds();

        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            DB.idu("UPDATE `newkamal`.`StudentExam` SET `Stat`='0' WHERE (`idStudents`='" + studentID + "' AND DateExam = '"
                    + tblDetails.getValueAt(tblDetails.getSelectedRow(), 0).toString() + "')");
            fillTable("1");
            NotificationPopup.Delete();
        } catch (Exception ex) {
            Logger.getLogger(AddExamDates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtPaymentsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentsKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtPaymentsKeyTyped

    private void txtPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaymentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentsActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddExamDates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.extended.date.WebDateField DateExam;
    private javax.swing.JLabel Photo;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkNic;
    private javax.swing.JCheckBox chkOldDl;
    private javax.swing.JCheckBox chkPP;
    private javax.swing.JCheckBox chkRN;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelTXT;
    private javax.swing.JRadioButton radioOral;
    private javax.swing.JRadioButton radioWritten;
    private javax.swing.JTable tblDetails;
    private javax.swing.JLabel txTry;
    public javax.swing.JTextField txtPayments;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtStudentName;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            AddExamDates.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            AddExamDates.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    public void validateFeilds() {

        Component[] cp = panelTXT.getComponents();
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

//        txtValidate = comboType.getSelectedItem().equals("Select") || DateExam.getText().isEmpty();
    }

    private void clearFeilds() {
        Component[] cp = panelTXT.getComponents();
        for (Component c : cp) {

            if (c instanceof JTextField) {

                ((JTextField) c).setText(null);

            }

        }

        txTry.setText(null);
        txtStudentName.setText("Student Name");
        DateExam.setText(null);
        studentID = 0;
        DefaultTableModel dtm = (DefaultTableModel) tblDetails.getModel();
        dtm.setRowCount(0);

//        comboType.setSelectedItem("Select");
    }

    private void genarateTry() {

        try {
            ResultSet rs = DB.search("SELECT COUNT(*) AS X FROM StudentExam WHERE idstudents = '" + studentID + "' AND Stat = '1' ");
            rs.next();
            int i = Integer.parseInt(rs.getString("X"));
            i++;
            txTry.setText("" + i);
        } catch (Exception ex) {
            Logger.getLogger(AddExamDates.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void fillTable(String s) {

        System.out.println(studentID);
        System.out.println(s);
        try {
            ResultSet rs = DB.search("SELECT DISTINCT examresult.Marks, examresult.Marks2, studentexam.ExamType, studentexam.DateExam, studentexam.ShyExam FROM studentexam INNER JOIN examresult ON examresult.idStudentExam = studentexam.idStudentExam WHERE studentexam.idstudents = '" + studentID + "' AND studentexam.Stat = '1'");
            DefaultTableModel dtm = (DefaultTableModel) tblDetails.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString("DateExam"), rs.getString("ExamType"), rs.getString("Marks"), rs.getString("Marks2")});

            }

        } catch (Exception ex) {
            Logger.getLogger(AddExamDates.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void ValidateResults() {

        try {
            ResultSet search = DB.search("SELECT examresult.idExamResult, examresult.OverollResult FROM examresult INNER JOIN studentexam ON examresult.idStudentExam = studentexam.idStudentExam WHERE studentexam.idstudents = '" + studentID + "' ORDER BY examresult.idExamResult DESC");

            if (search.first()) {

                switch (search.getString("OverollResult")) {
                    case "PASS":
                        int flag = JOptionPane.showConfirmDialog(null, "Student has been passed previous Exam. Do you want to continue?");
                        if (flag == 0) {

                            genarateTry();
                            fillTable("2");

                        } else {

                            txTry.setText(null);
                            txtSearch.grabFocus();
                            txtSearch.setText(null);
                            clearFeilds();

                        }
                        break;
                    case "REPEAT":
                        genarateTry();
                        fillTable("3M");
                        break;
                    case "ABSENT":
                        genarateTry();
                        fillTable("4M");
                        break;
                }

            }

        } catch (Exception ex) {
            Logger.getLogger(AddExamDates.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (txTry.getText()==null) {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Use Exam Bulk Enter to add Exam Date First Time", "Error", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);

            if (showConfirmDialog == 0) {

                clearFeilds();
                txtSearch.grabFocus();
                txtSearch.setText(null);

            } else {
                txtSearch.setText(null);

                clearFeilds();
                txtSearch.grabFocus();

            }
        }

    }
}
