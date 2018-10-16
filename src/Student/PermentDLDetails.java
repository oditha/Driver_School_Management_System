package Student;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import com.alee.laf.WebLookAndFeel;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PermentDLDetails extends javax.swing.JFrame {

    static boolean maximized = true;
    int studentID;
    boolean txtValidate = false;
    String path = null;
    public static String DL = null;
    public static Map mp = new HashMap<String, String>();

    public PermentDLDetails() {
        initComponents();
        maximizeWindow();
        fillTable();
        chkRN.setSelected(true);
        txtSearch.grabFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        panelTXT = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtDlNo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        chkNic = new javax.swing.JCheckBox();
        chkPP = new javax.swing.JCheckBox();
        chkOldDl = new javax.swing.JCheckBox();
        chkRN = new javax.swing.JCheckBox();
        txtStudentName = new javax.swing.JLabel();
        Photo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateExpire = new com.alee.extended.date.WebDateField();
        dateIssue1 = new com.alee.extended.date.WebDateField();
        DLImage = new javax.swing.JLabel();
        txtClasses = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDLDetails = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Kamal-Perment Driver License");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 20, 620));

        panelTXT.setBackground(java.awt.Color.white);
        panelTXT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Driver License Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        panelTXT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Issue Date");
        panelTXT.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Expire Date");
        panelTXT.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 90, 30));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("SELECT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelTXT.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 120, 40));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("SAVE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panelTXT.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 120, 40));

        txtDlNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelTXT.add(txtDlNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 400, 30));

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

        panelTXT.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 550, 120));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("DL No");
        panelTXT.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, 30));

        dateExpire.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        dateExpire.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelTXT.add(dateExpire, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 400, 30));

        dateIssue1.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        dateIssue1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelTXT.add(dateIssue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 400, 30));

        DLImage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        DLImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTXT.add(DLImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 290, 160));

        txtClasses.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelTXT.add(txtClasses, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 400, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Classes");
        panelTXT.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 90, 30));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelTXT.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 120, 40));

        jPanel1.add(panelTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 580, 630));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDLDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DL No", "Isuue Date", "Expore Date", "Classes"
            }
        ));
        tblDLDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDLDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDLDetails);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 550, 540));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 610, 630));

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
                updateTable();

            } else {

                studentID = 0;
                txtStudentName.setText("Student Name");
                updateTable();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        validateFeilds();
        if (txtValidate == false) {

            try {
                DB.idu("INSERT INTO `newkamal`.`DLDetails` (`DLNo`, `IssueDate`, `ExpireDate`, `DLType`, `idstudents`,DLImage, DLClasses) VALUES ('"
                        + txtDlNo.getText() + "', '" + dateIssue1.getText() + "', '" + dateExpire.getText() + "', 'Genuine', '" + studentID + "','" + path + "','" + txtClasses.getText() + "')");
                clearFeilds();
                NotificationPopup.save();
                txtSearch.grabFocus();
                updateTable();
            } catch (Exception ex) {
                Logger.getLogger(PermentDLDetails.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            NotificationPopup.fillFeilds();

        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearFeilds();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        JFileChooser fc = new JFileChooser();
        int showDialog = fc.showDialog(null, "Open");
        File sf = fc.getSelectedFile();
        path = sf.getAbsolutePath();
        path = path.replace('\\', '/');
        System.out.println(path);
        try {
            DLImage.setIcon(new ImageIcon(ImageIO.read(new File(path)).getScaledInstance(290, 160, Image.SCALE_SMOOTH)));
        } catch (IOException ex) {
            Logger.getLogger(PermentDLDetails.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void tblDLDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDLDetailsMouseClicked

        DL = tblDLDetails.getValueAt(tblDLDetails.getSelectedRow(), 0).toString();
        new DLImagePreview().setVisible(true);

    }//GEN-LAST:event_tblDLDetailsMouseClicked

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PermentDLDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DLImage;
    private javax.swing.JLabel Photo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkNic;
    private javax.swing.JCheckBox chkOldDl;
    private javax.swing.JCheckBox chkPP;
    private javax.swing.JCheckBox chkRN;
    private com.alee.extended.date.WebDateField dateExpire;
    private com.alee.extended.date.WebDateField dateIssue1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelTXT;
    private javax.swing.JTable tblDLDetails;
    private javax.swing.JTextField txtClasses;
    private javax.swing.JTextField txtDlNo;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtStudentName;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            PermentDLDetails.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            PermentDLDetails.this.setMaximizedBounds(gv.getMaximumWindowBounds());
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

        txtValidate = dateExpire.getText().isEmpty() || dateIssue1.getText().isEmpty();

    }

    private void clearFeilds() {
        Component[] cp = panelTXT.getComponents();
        for (Component c : cp) {

            if (c instanceof JTextField) {

                ((JTextField) c).setText(null);

            }

        }

        dateExpire.setText(null);
        dateIssue1.setText(null);
        txtSearch.grabFocus();
        DLImage.setIcon(null);

    }

    private void updateTable() {

        try {
            ResultSet rs = DB.search("Select * from DLDetails where idstudents= '" + studentID + "' and isDelete = '1' and DLType = 'Genuine'");

            DefaultTableModel dtm = (DefaultTableModel) tblDLDetails.getModel();
            dtm.setRowCount(0);

            tblDLDetails.setRowHeight(0, 70);
            while (rs.next()) {
                mp.put(rs.getString("DLNo"), rs.getString("DLImage"));

                dtm.addRow(new Object[]{rs.getString("DLNo"), rs.getString("IssueDate"), rs.getString("ExpireDate"),rs.getString("DLClasses")});
            }

        } catch (Exception ex) {
            Logger.getLogger(PermentDLDetails.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void fillTable() {

        try {
            ResultSet rs = DB.search("Select * from DLDetails where isDelete = '1' and DLType = 'Genuine'");

            DefaultTableModel dtm = (DefaultTableModel) tblDLDetails.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString("DLNo"), rs.getString("IssueDate"), rs.getString("ExpireDate")});
            }

        } catch (Exception ex) {
            Logger.getLogger(PermentDLDetails.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
