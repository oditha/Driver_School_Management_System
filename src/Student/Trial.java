package Student;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import ExtenelClasses.dfPrice;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.InputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Trial extends javax.swing.JFrame {

    static boolean maximized = true;
    int studentID;
    boolean txtValidate = false;
    Map<String, String> mp = new HashMap();
    Map<String, String> trialID = new HashMap();

    public Trial() {
        initComponents();
        maximizeWindow();
        chkRN.setSelected(true);
        txtSearch.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        txtShy = new javax.swing.JLabel();
        DateTrial = new com.alee.extended.date.WebDateField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClass = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        chkNic = new javax.swing.JCheckBox();
        chkPP = new javax.swing.JCheckBox();
        chkOldDl = new javax.swing.JCheckBox();
        chkRN = new javax.swing.JCheckBox();
        txtStudentName = new javax.swing.JLabel();
        Photo = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPayments = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExamDate = new javax.swing.JTable();
        btnDelete2 = new javax.swing.JButton();
        txtxamd = new javax.swing.JLabel();
        txtStudentName2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDetails1 = new javax.swing.JTable();
        btnDelete1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Trial Dates-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 20, 670));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Exam Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 120, 40));

        txtShy.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jPanel3.add(txtShy, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 90, 30));

        DateTrial.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        DateTrial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(DateTrial, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 250, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel11.setText("Date");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 80, 30));

        tblClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trial Date", "Class", "Status"
            }
        ));
        jScrollPane2.setViewportView(tblClass);
        if (tblClass.getColumnModel().getColumnCount() > 0) {
            tblClass.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(jCheckBox1));
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 620, 190));

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
        chkNic.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        chkNic.setText("NIC");
        jPanel2.add(chkNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        chkPP.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkPP);
        chkPP.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        chkPP.setText("Passport No");
        jPanel2.add(chkPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        chkOldDl.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkOldDl);
        chkOldDl.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        chkOldDl.setText("OLD DL");
        jPanel2.add(chkOldDl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        chkRN.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkRN);
        chkRN.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        chkRN.setText("Register No");
        jPanel2.add(chkRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtStudentName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtStudentName.setText("Student Name");
        jPanel2.add(txtStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 480, 20));

        Photo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(Photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 90, 110));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 550, 120));

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 120, 40));

        btnClear1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear1.setText("LOAD");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 120, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel8.setText(" LKR");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 40, 30));

        txtPayments.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        txtPayments.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaymentsKeyTyped(evt);
            }
        });
        jPanel3.add(txtPayments, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 220, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel9.setText("Payment ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 90, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel10.setText("Try");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 660, 610));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exam Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblExamDate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "shy", "Date"
            }
        ));
        tblExamDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblExamDateMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblExamDate);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 500, 180));

        btnDelete2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete2.setText("DELETE");
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete2ActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 120, 40));

        txtxamd.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtxamd.setText("Trial Date");
        jPanel4.add(txtxamd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 480, 20));

        txtStudentName2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtStudentName2.setText("Vehicle Class");
        jPanel4.add(txtStudentName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 480, 20));

        tblDetails1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class"
            }
        ));
        jScrollPane3.setViewportView(tblDetails1);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 500, 180));

        btnDelete1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete1.setText("DELETE");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 120, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 560, 600));

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
                genarateTry();
                loadTrialDate();

            } else {

                DefaultTableModel dtm1 = (DefaultTableModel) tblClass.getModel();
                dtm1.setRowCount(0);
                DefaultTableModel dtm2 = (DefaultTableModel) tblExamDate.getModel();
                dtm2.setRowCount(0);
                DefaultTableModel dtm3 = (DefaultTableModel) tblDetails1.getModel();
                dtm3.setRowCount(0);
                txtShy.setText(null);
                DateTrial.setText(null);
                studentID = 0;
                txtStudentName.setText("Student Name");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed

        try {
            DB.idu("UPDATE `newkamal`.`TrialVehicleClasses` SET `isDelete`='0' WHERE (`idTrialClass`='" + trialID.get(tblDetails1.getValueAt(tblDetails1.getSelectedRow(), 0).toString()) + "')");
            NotificationPopup.Delete();
            loadClassess();
        } catch (Exception ex) {
            Logger.getLogger(Trial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDelete2ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed

        try {
            DB.idu("UPDATE `newkamal`.`Trial` SET `isDelete`='0' WHERE (`idTrial`='" + trialID.get(tblExamDate.getValueAt(tblExamDate.getSelectedRow(), 0).toString()) + "')");
            NotificationPopup.Delete();
            loadTrialDate();
        } catch (Exception ex) {
            Logger.getLogger(Trial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        int id = 0;

        String format = new SimpleDateFormat("yyyy/MM/dd").format(new Date());
        System.out.println(mp);
//        
        if (!(tblClass.getRowCount() == 0) && (!txtPayments.getText().isEmpty())) {

            try {

                DB.idu("INSERT INTO `newkamal`.`Trial` (`idstudents`, `Date`, `Shy`) VALUES ('" + studentID + "','" + DateTrial.getText() + "','" + txtShy.getText() + "')");

                ResultSet search = DB.search("SELECT * From Trial Where idstudents = '" + studentID + "' and Date = '" + DateTrial.getText() + "'");
                if (search.next()) {

                    id = search.getInt("idTrial");

                }

                for (int i = 0; i < tblClass.getRowCount(); i++) {

                    System.out.println("id " + tblClass.getValueAt(i, 2).toString());

                    if (tblClass.getValueAt(i, 2).toString().equals("true")) {
                        
                        System.out.println(mp.get(tblClass.getValueAt(i, 1).toString()));
                        
                        DB.idu("INSERT INTO `newkamal`.`TrialVehicleClasses` (`idTrial`, `idVehicleClasses`, `TrialDate`) VALUES ('" + id + "','"
                                + mp.get(tblClass.getValueAt(i, 1).toString()) + "','" + DateTrial.getText() + "')");

                    }

                }

                try {
                    DB.idu("INSERT INTO `newkamal`.`TrialPayment` (`DatePayment`, `Amount`, `Trial_idTrial`) VALUES ('"
                            + format + "', '" + dfPrice.dcf(Double.parseDouble(txtPayments.getText())) + "', '" + id + "')");
                    DB.idu("INSERT INTO `newkamal`.`IncomeExpence` (`Date`, `Description`, `Income`, Expence ) VALUES ('" + format + "', 'Trial fee Payments', '" + txtPayments.getText() + "', '0')");

                    NotificationPopup.save();

                } catch (Exception ex) {
//                    Logger.getLogger(Trial.class.getName()).log(Level.SEVERE, null, ex);
                }

                String idx = null;
                ResultSet r = DB.search("SELECT Max(trialpayment.idTrialPayment) FROM trialpayment");
                if (r.next()) {

                    idx = r.getString("Max(trialpayment.idTrialPayment)");
                    System.out.println(idx);
                }
                InputStream Rp = getClass().getResourceAsStream("/JReport/report4 - Copy - Copy.jrxml");
//                Map<String, Object> map = new HashMap<String, Object>();
//                map.put("payid", idx);
//                System.out.println(map);
//                JasperReport jr = JasperCompileManager.compileReport(Rp);
//                JasperPrint jp = JasperFillManager.fillReport(jr, map, DB.getCon());
//                JasperViewer.viewReport(jp);
//                JasperPrintManager.printReport(jp, true);

                NotificationPopup.save();
                txtSearch.setText(null);
                clearRec();

            } catch (Exception ex) {

                Logger.getLogger(Trial.class.getName()).log(Level.SEVERE, null, ex);

            }
        } else {

            NotificationPopup.fillFeilds();

        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearRec();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblExamDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExamDateMouseClicked

        loadClassess();

    }//GEN-LAST:event_tblExamDateMouseClicked

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed

        if (!DateTrial.getText().isEmpty()) {

            loadCombo();

        }


    }//GEN-LAST:event_btnClear1ActionPerformed

    private void txtPaymentsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentsKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtPaymentsKeyTyped

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.extended.date.WebDateField DateTrial;
    private javax.swing.JLabel Photo;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkNic;
    private javax.swing.JCheckBox chkOldDl;
    private javax.swing.JCheckBox chkPP;
    private javax.swing.JCheckBox chkRN;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblClass;
    private javax.swing.JTable tblDetails1;
    private javax.swing.JTable tblExamDate;
    private javax.swing.JTextField txtPayments;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtShy;
    private javax.swing.JLabel txtStudentName;
    private javax.swing.JLabel txtStudentName2;
    private javax.swing.JLabel txtxamd;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            Trial.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Trial.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void loadCombo() {

        try {

            ResultSet rs = DB.search("Select vc.VehicleClasseName, lc.idVehicleClasses from VehicleClasses vc inner join LicenceCatagory lc on vc.idVehicleClasses = lc.idVehicleClasses where lc.idstudents = '" + studentID + "' ");
            DefaultTableModel dtm = (DefaultTableModel) tblClass.getModel();
            while (rs.next()) {
                System.out.println("ok");

                dtm.addRow(new Object[]{DateTrial.getText(), rs.getString("VehicleClasseName")});
//              
                mp.put(rs.getString("VehicleClasseName"), rs.getString("idVehicleClasses"));

            }

        } catch (Exception ex) {
            Logger.getLogger(Trial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void genarateTry() {

        try {
            int count = 0;
            ResultSet rs = DB.search("SELECT COUNT(*) as try FROM Trial WHERE idstudents = '" + studentID + "' and isDelete = '1' ");
            if (rs.next()) {

                count = rs.getInt("try");
                count++;
                txtShy.setText("" + count);

            }

            if (count == 1) {

                txtPayments.setText("0.00");
                txtPayments.setEditable(false);
            } else {

                txtPayments.setText("");
                txtPayments.setEditable(true);

            }

        } catch (Exception ex) {
            Logger.getLogger(Trial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void clearRec() {

        DefaultTableModel dtm1 = (DefaultTableModel) tblClass.getModel();
        dtm1.setRowCount(0);
        DefaultTableModel dtm2 = (DefaultTableModel) tblExamDate.getModel();
        dtm2.setRowCount(0);
        DefaultTableModel dtm3 = (DefaultTableModel) tblDetails1.getModel();
        dtm3.setRowCount(0);
        txtShy.setText(null);
        DateTrial.setText(null);
        txtSearch.setText(null);
        txtStudentName.setText(null);
        txtSearch.grabFocus();

    }

    private void loadTrialDate() {

        try {
            ResultSet rs = DB.search("Select * from Trial where idstudents = '" + studentID + "' and isDelete = '1' ");
            DefaultTableModel dtm = (DefaultTableModel) tblExamDate.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString("Shy"), rs.getString("Date")});
                trialID.put(rs.getString("Shy"), rs.getString("idTrial"));

            }
        } catch (Exception ex) {
            Logger.getLogger(Trial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void loadClassess() {

        try {
            ResultSet rs = DB.search("SELECT DISTINCT VehicleClasses.VehicleClasseName, TrialVehicleClasses.* FROM VehicleClasses INNER JOIN TrialVehicleClasses ON VehicleClasses.idVehicleClasses = TrialVehicleClasses.idVehicleClasses WHERE TrialVehicleClasses.idTrial = '"
                    + trialID.get(tblExamDate.getValueAt(tblExamDate.getSelectedRow(), 0).toString()) + "' AND TrialVehicleClasses.isDelete = '1'");

            DefaultTableModel dtm = (DefaultTableModel) tblDetails1.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {

                Vector<String> vector = new Vector<String>();

                vector.add(rs.getString("VehicleClasseName"));
//                dtm.addRow(new Object[]{rs.getString("VehicleClasseName")});

                trialID.put(rs.getString("VehicleClasseName"), rs.getString("idTrialClass"));

                dtm.addRow(vector);
            }

        } catch (Exception ex) {
            Logger.getLogger(Trial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
