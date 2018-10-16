package Student;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import ExtenelClasses.dfPrice;
import com.alee.laf.WebLookAndFeel;
import java.awt.Color;
import java.awt.Component;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class PaymentsUdaya extends javax.swing.JFrame {

    static boolean maximized = true;
    int studentID;
    boolean txtValidate = false;
    int reportID;

    public PaymentsUdaya() {
        initComponents();
        maximizeWindow();
        tableDecor();
        chkRN.setSelected(true);
        txtSearch.grabFocus();
        setdate();
        loadDetails();

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
        jLabel10 = new javax.swing.JLabel();
        txtPayments = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        chkNic = new javax.swing.JCheckBox();
        chkPP = new javax.swing.JCheckBox();
        chkOldDl = new javax.swing.JCheckBox();
        chkRN = new javax.swing.JCheckBox();
        txtStudentName = new javax.swing.JLabel();
        Photo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDate = new com.alee.extended.date.WebDateField();
        txtFee = new javax.swing.JLabel();
        txtTotalPaid = new javax.swing.JLabel();
        txtRemaning = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFee1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Payments-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 20, 530));

        panelTXT.setBackground(java.awt.Color.white);
        panelTXT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        panelTXT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Total Paid");
        panelTXT.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 90, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Remaning");
        panelTXT.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 90, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Payment");
        panelTXT.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 90, 30));

        txtPayments.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPayments.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPayments.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaymentsKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaymentsKeyTyped(evt);
            }
        });
        panelTXT.add(txtPayments, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 400, 30));

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        panelTXT.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 120, 40));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        panelTXT.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 120, 40));

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Student"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
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

        panelTXT.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 570, 120));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Course Fee");
        panelTXT.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 90, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Date");
        panelTXT.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 90, 30));

        txtDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        txtDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelTXT.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 400, 30));

        txtFee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtFee.setForeground(new java.awt.Color(0, 51, 153));
        txtFee.setText("Course Fee");
        panelTXT.add(txtFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 90, 30));

        txtTotalPaid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTotalPaid.setForeground(new java.awt.Color(51, 153, 0));
        txtTotalPaid.setText("Total Paid");
        panelTXT.add(txtTotalPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 90, 30));

        txtRemaning.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtRemaning.setForeground(new java.awt.Color(255, 0, 51));
        txtRemaning.setText("Remaning");
        panelTXT.add(txtRemaning, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 90, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Courses");
        panelTXT.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 100, 30));

        txtFee1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtFee1.setText("Courses");
        panelTXT.add(txtFee1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 400, 30));

        jPanel1.add(panelTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 590, 590));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Description", "Payment Date", "Amount"
            }
        ));
        jScrollPane1.setViewportView(tblDetails);
        if (tblDetails.getColumnModel().getColumnCount() > 0) {
            tblDetails.getColumnModel().getColumn(0).setMinWidth(0);
            tblDetails.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblDetails.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 520, 370));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 120, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 560, 510));

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

                setPayments();
                fillTable();
                setCourse();

            } else {

                studentID = 0;
                txtStudentName.setText("Student Name");
                clearFeilds();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtPaymentsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentsKeyTyped

        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }

    }//GEN-LAST:event_txtPaymentsKeyTyped

    private void txtPaymentsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentsKeyReleased

        double remaning = Double.parseDouble(txtRemaning.getText());
        double payment = Double.parseDouble(txtPayments.getText());

        if (payment > remaning) {

            txtPayments.setBackground(Color.red);

        } else {

            txtPayments.setBackground(Color.WHITE);

        }
    }//GEN-LAST:event_txtPaymentsKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        validateFeilds();
        if (txtValidate == false) {

            try {
                DB.idu("INSERT INTO `newkamal`.`StudentPayment` (`idstudents`, `date`, `amount`, `Description`) VALUES ('" + studentID + "', '" + txtDate.getText()
                        + "', '" + txtPayments.getText() + "', 'Course fee installment')");

                DB.idu("INSERT INTO `newkamal`.`IncomeExpence` (`Date`, `Description`, `Income`) VALUES ('" + txtDate.getText() + "', 'Course fee installment', '" + txtPayments.getText() + "')");

                NotificationPopup.save();
//                String id = null;
//                ResultSet r = DB.search("SELECT Max(studentpayment.idStudentPayment) FROM studentpayment");
//                if (r.next()) {
//
//                    id = r.getString("Max(studentpayment.idStudentPayment)");
//                    System.out.println(id);
//                }
//                InputStream Rp = getClass().getResourceAsStream("/JReport/report2.jasper");
//                Map<String, Object> map = new HashMap<String, Object>();
//                map.put("payid", id);
//                System.out.println(map);
////                JasperReport jr = JasperCompileManager.compileReport(Rp);
//                JasperPrint jp = JasperFillManager.fillReport(Rp, map, DB.getCon());
//                JasperViewer.viewReport(jp);
//                JasperPrintManager.printReport(jp, true);
                clearFeilds();
                fillTable();
                setPayments();
            } catch (Exception ex) {
                Logger.getLogger(PaymentsUdaya.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            NotificationPopup.fillFeilds();

        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearFeilds();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        try {
            DB.idu("UPDATE `newkamal`.`StudentPayment` SET `isDelete` = '0' WHERE `idStudentPayment` = '"
                    + tblDetails.getValueAt(tblDetails.getSelectedRow(), 0) + "';");
            NotificationPopup.Delete();
            setPayments();
            fillTable();
        } catch (Exception ex) {
            Logger.getLogger(PaymentsUdaya.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentsUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Photo;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkNic;
    private javax.swing.JCheckBox chkOldDl;
    private javax.swing.JCheckBox chkPP;
    private javax.swing.JCheckBox chkRN;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelTXT;
    private javax.swing.JTable tblDetails;
    private com.alee.extended.date.WebDateField txtDate;
    private javax.swing.JLabel txtFee;
    private javax.swing.JLabel txtFee1;
    private javax.swing.JTextField txtPayments;
    private javax.swing.JLabel txtRemaning;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtStudentName;
    private javax.swing.JLabel txtTotalPaid;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            PaymentsUdaya.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            PaymentsUdaya.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void setPayments() {

        double fee = 0;
        double totalpaid;
        double remaning;

        try {
            ResultSet rs = DB.search("SELECT `CourseFee` FROM `students` WHERE idstudents = '" + studentID + "'");
            if (rs.next()) {

                txtFee.setText(dfPrice.dcf(rs.getDouble("CourseFee")));
                fee = rs.getDouble("CourseFee");
                System.out.println("Cource fee " + rs.getDouble("CourseFee"));
            }

            ResultSet rs1 = DB.search("SELECT SUM(amount) as sum FROM StudentPayment WHERE idstudents = '" + studentID + "' AND isDelete = '1' ");
            if (rs1.next()) {

                txtTotalPaid.setText(dfPrice.dcf(rs1.getDouble("sum")));
                totalpaid = rs1.getDouble("sum");
                System.out.println("sum " + rs1.getDouble("sum"));
                remaning = fee - totalpaid;
                txtRemaning.setText("" + dfPrice.dcf(remaning));
                System.out.println("Remainig " + remaning);

            } else {

                totalpaid = 0;
                txtRemaning.setText("" + dfPrice.dcf(fee));

            }

        } catch (Exception ex) {
            Logger.getLogger(PaymentsUdaya.class.getName()).log(Level.SEVERE, null, ex);
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

    }

    private void clearFeilds() {

        txtFee.setText(null);
        txtPayments.setText(null);
        txtRemaning.setText(null);
        txtTotalPaid.setText(null);
        txtFee1.setText(null);

    }

    private void fillTable() {

        try {
            ResultSet rs = DB.search("Select * from StudentPayment where idstudents = '" + studentID + "' and isDelete = '1'");
            DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();
            model.setRowCount(0);
            while (rs.next()) {

                model.addRow(new Object[]{rs.getString("idStudentPayment"), rs.getString("Description"), rs.getString("date"), dfPrice.dcf(rs.getDouble("amount"))});

            }
        } catch (Exception ex) {
            Logger.getLogger(PaymentsUdaya.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void tableDecor() {

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tblDetails.getColumnModel().getColumn(3).setCellRenderer(dtcr);

    }

    private void setdate() {
        txtDate.setText(new SimpleDateFormat("yyyy/MM/dd").format(new Date()));

    }

    private void setCourse() {

        try {
            ResultSet search = DB.search("SELECT vehicleclasses.VehicleClasseName FROM licencecatagory INNER JOIN vehicleclasses ON licencecatagory.idVehicleClasses = vehicleclasses.idVehicleClasses WHERE licencecatagory.idstudents = '" + studentID + "'");
            String Course = " ";
            StringBuilder sb = new StringBuilder();
            while (search.next()) {

                Course = sb.append(search.getString("VehicleClasseName") + " ").toString();

            }
            txtFee1.setText(Course);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void loadDetails() {
        String getStudent = null;
        try {
            ResultSet rs = DB.search("SELECT * FROM students ORDER BY idstudents DESC LIMIT 1");
            if (rs.next()) {
                getStudent = rs.getString("idstudents");
                String getID = rs.getString("RegNo");
                String getFee = rs.getString("CourseFee");
                txtSearch.setText(getID);
                txtFee.setText(getFee);
            }

            ResultSet search = DB.search("SELECT vehicleclasses.VehicleClasseName FROM licencecatagory INNER JOIN vehicleclasses ON licencecatagory.idVehicleClasses = vehicleclasses.idVehicleClasses WHERE licencecatagory.idstudents = '" + getStudent + "'");
            String Course = " ";
            StringBuilder sb = new StringBuilder();
            while (search.next()) {

                Course = sb.append(search.getString("VehicleClasseName") + " ").toString();

            }
            txtFee1.setText(Course);
            
            setPayments();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
