package Student.Reports;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ViewExamResult extends javax.swing.JFrame {

    static boolean maximized = true;
    int studentID;

    public ViewExamResult() {
        initComponents();
        maximizeWindow();
        chkRN.setSelected(true);
        txtSearch.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        chkNic = new javax.swing.JCheckBox();
        chkPP = new javax.swing.JCheckBox();
        chkOldDl = new javax.swing.JCheckBox();
        chkRN = new javax.swing.JCheckBox();
        txtStudentName = new javax.swing.JLabel();
        Photo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetails1 = new javax.swing.JTable();
        DateExamDay = new com.alee.extended.date.WebDateField();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtStudentCount = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exam Result-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        buttonGroup1.add(chkNic);
        chkNic.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkNic.setText("NIC");
        jPanel2.add(chkNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        chkPP.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkPP);
        chkPP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkPP.setText("Passport No");
        jPanel2.add(chkPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        chkOldDl.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkOldDl);
        chkOldDl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkOldDl.setText("OLD DL");
        jPanel2.add(chkOldDl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

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

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 600, 120));

        tblDetails1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Reg No", "Name", "Type", "Marks", "Result", "Marks H"
            }
        ));
        jScrollPane2.setViewportView(tblDetails1);
        if (tblDetails1.getColumnModel().getColumnCount() > 0) {
            tblDetails1.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblDetails1.getColumnModel().getColumn(1).setPreferredWidth(70);
            tblDetails1.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 600, 370));

        DateExamDay.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        DateExamDay.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(DateExamDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 180, 30));

        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel3.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 110, 30));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 110, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Exam Date");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 30));

        txtStudentCount.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel3.add(txtStudentCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 90, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Student Count");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 590, 130, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 640, 650));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        fillDetailstable();


    }//GEN-LAST:event_btnSearchActionPerformed

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

                fillTable();

            } else {

                DefaultTableModel dtm = (DefaultTableModel) tblDetails1.getModel();
                dtm.setRowCount(0);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        try {
            DB.idu("UPDATE `newkamal`.`ExamResult` SET `isDelete`='0' WHERE (`idExamResult`='" + tblDetails1.getValueAt(tblDetails1.getSelectedRow(), 0) + "')");
            NotificationPopup.Delete();
            fillDetailstable();
        } catch (Exception ex) {
            Logger.getLogger(ViewExamResult.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewExamResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.extended.date.WebDateField DateExamDay;
    private javax.swing.JLabel Photo;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkNic;
    private javax.swing.JCheckBox chkOldDl;
    private javax.swing.JCheckBox chkPP;
    private javax.swing.JCheckBox chkRN;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDetails1;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtStudentCount;
    private javax.swing.JLabel txtStudentName;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            ViewExamResult.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ViewExamResult.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void fillTable() {

        try {
            ResultSet rs = DB.search("SELECT er.*, se.ShyExam, se.ExamType, s.RegNo, s.FullName FROM StudentExam se INNER JOIN ExamResult er ON er.idStudentExam = se.idStudentExam INNER JOIN students s ON se.idstudents = s.idstudents where s.idstudents = '" + studentID + "' and er.isDelete = '1'");
            System.out.println("in");
            DefaultTableModel dtm = (DefaultTableModel) tblDetails1.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {
                System.out.println("OK");
                dtm.addRow(new Object[]{rs.getString("idExamResult"), rs.getString("RegNo"), rs.getString("FullName"), rs.getString("ExamType"), rs.getString("Marks"), rs.getString("OverollResult"), rs.getString("Marks2")});

            }
             int rowCount = tblDetails1.getRowCount();
            System.out.println(rowCount);
            txtStudentCount.setText("" + rowCount);
        } catch (Exception ex) {
            Logger.getLogger(ViewExamResult.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void fillDetailstable() {

        try {
            ResultSet rs = DB.search("SELECT er.*, se.ShyExam, se.ExamType, s.RegNo, s.FullName FROM StudentExam se INNER JOIN ExamResult er ON er.idStudentExam = se.idStudentExam INNER JOIN students s ON se.idstudents = s.idstudents WHERE se.DateExam = '" + DateExamDay.getText() + "' AND er.isDelete ='1' ");

            DefaultTableModel dtm = (DefaultTableModel) tblDetails1.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString("idExamResult"), rs.getString("RegNo"), rs.getString("FullName"), rs.getString("ExamType"), rs.getString("Marks"), rs.getString("OverollResult"), rs.getString("Marks2")});

            }

            int rowCount = tblDetails1.getRowCount();
            System.out.println(rowCount);
            txtStudentCount.setText("" + rowCount);
        } catch (Exception ex) {
            Logger.getLogger(ViewExamResult.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
