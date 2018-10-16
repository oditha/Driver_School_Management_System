package Student;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class AddTrialResult extends javax.swing.JFrame {

    static boolean maximized = true;
    int studentID;
    String TrialID;
    int studentIDadd;
    String TrialIDadd;

    HashMap<String, Integer> resultadd = new HashMap();
    HashMap<String, Integer> resultView = new HashMap();

    public AddTrialResult() {
        initComponents();
        maximizeWindow();
        chkRN2.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAddResult = new javax.swing.JTable();
        btnSave1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtSearchadd = new javax.swing.JTextField();
        chkNic2 = new javax.swing.JCheckBox();
        chkPP2 = new javax.swing.JCheckBox();
        chkOldDl2 = new javax.swing.JCheckBox();
        chkRN2 = new javax.swing.JCheckBox();
        txtStudentNameAdd = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        comboTrailAddd = new javax.swing.JComboBox<>();
        btnAddResult = new javax.swing.JButton();
        Photo1 = new javax.swing.JLabel();
        btnClear2 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pass", "Fail" }));

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Kamal- Trial Results");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAddResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Class", "Result"
            }
        ));
        tblAddResult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAddResultKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblAddResult);
        if (tblAddResult.getColumnModel().getColumnCount() > 0) {
            tblAddResult.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(jComboBox1));
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 600, 360));

        btnSave1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave1.setText("SAVE");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 600, 120, 40));

        jPanel6.setBackground(java.awt.Color.white);
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Student"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearchadd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSearchadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchaddKeyReleased(evt);
            }
        });
        jPanel6.add(txtSearchadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 380, 30));

        chkNic2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(chkNic2);
        chkNic2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkNic2.setText("NIC");
        jPanel6.add(chkNic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        chkPP2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(chkPP2);
        chkPP2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkPP2.setText("Passport No");
        jPanel6.add(chkPP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        chkOldDl2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(chkOldDl2);
        chkOldDl2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkOldDl2.setText("OLD DL");
        jPanel6.add(chkOldDl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        chkRN2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(chkRN2);
        chkRN2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkRN2.setText("Register No");
        jPanel6.add(chkRN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtStudentNameAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtStudentNameAdd.setText("Student Name");
        jPanel6.add(txtStudentNameAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 480, 20));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Trial Date");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 30));

        jPanel6.add(comboTrailAddd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 270, 30));

        btnAddResult.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAddResult.setText("ADD");
        btnAddResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddResultActionPerformed(evt);
            }
        });
        jPanel6.add(btnAddResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 120, 30));

        Photo1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel6.add(Photo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 90, 110));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 600, 170));

        btnClear2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear2.setText("CLEAR");
        btnClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear2ActionPerformed(evt);
            }
        });
        jPanel4.add(btnClear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 600, 120, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1320, 660));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchaddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchaddKeyReleased
        ResultSet rs = null;

        try {
            if (chkNic2.isSelected()) {

                rs = DB.search("SELECT * FROM students WHERE NIC = '" + txtSearchadd.getText() + "' ");

            } else if (chkOldDl2.isSelected()) {

                rs = DB.search("SELECT * FROM students WHERE OldDLNo = '" + txtSearchadd.getText() + "' ");

            } else if (chkPP2.isSelected()) {

                rs = DB.search("SELECT * FROM students WHERE PassportNo = '" + txtSearchadd.getText() + "' ");

            } else if (chkRN2.isSelected()) {

                rs = DB.search("SELECT * FROM students WHERE RegNo = '" + txtSearchadd.getText() + "' ");

            }

            if (rs.next()) {

                studentIDadd = rs.getInt("idstudents");
                txtStudentNameAdd.setText(rs.getString("FullName"));

                try {
                    Photo1.setIcon(new ImageIcon(ImageIO.read(new File(rs.getString("Image"))).getScaledInstance(90, 100, Image.SCALE_SMOOTH)));

                } catch (Exception e) {
                }

                loadTrialDateAdd();

            } else {

                studentIDadd = 0;
                txtStudentNameAdd.setText("Student Name");
                clearADD();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchaddKeyReleased

    private void btnAddResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddResultActionPerformed

        try {

            ResultSet rs = DB.search("Select tv.*, vc.* from TrialVehicleClasses tv inner join VehicleClasses vc on tv.idVehicleClasses = vc.idVehicleClasses where tv.idTrial = '"
                    + resultadd.get(comboTrailAddd.getSelectedItem().toString()) + "' AND tv.isDelete = '1' ");
            DefaultTableModel dtm = (DefaultTableModel) tblAddResult.getModel();

            dtm.setRowCount(0);

            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString("TrialDate"), rs.getString("VehicleClasseName")});

            }

        } catch (Exception ex) {
            Logger.getLogger(AddTrialResult.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAddResultActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed

        for (int i = 0; i < tblAddResult.getRowCount(); i++) {

            try {
                DB.idu("INSERT INTO `newkamal`.`TrialResult` (`VehicleClass`, `TrialResult`, `idTrial`, `TrialDay`) VALUES ('"
                        + tblAddResult.getValueAt(i, 1) + "','" + tblAddResult.getValueAt(i, 2)
                        + "','" + resultadd.get(tblAddResult.getValueAt(i, 0).toString()) + "','" + tblAddResult.getValueAt(i, 0) + "')");

            } catch (Exception ex) {
                Logger.getLogger(AddTrialResult.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        NotificationPopup.save();
        clearADD();
        txtSearchadd.grabFocus();
        txtSearchadd.setText(null);

    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear2ActionPerformed
        clearADD();
        txtSearchadd.setText(null);
    }//GEN-LAST:event_btnClear2ActionPerformed

    private void tblAddResultKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAddResultKeyReleased
       
    }//GEN-LAST:event_tblAddResultKeyReleased

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTrialResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Photo1;
    private javax.swing.JButton btnAddResult;
    private javax.swing.JButton btnClear2;
    private javax.swing.JButton btnSave1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chkNic2;
    private javax.swing.JCheckBox chkOldDl2;
    private javax.swing.JCheckBox chkPP2;
    private javax.swing.JCheckBox chkRN2;
    private javax.swing.JComboBox<String> comboTrailAddd;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAddResult;
    private javax.swing.JTextField txtSearchadd;
    private javax.swing.JLabel txtStudentNameAdd;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            AddTrialResult.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            AddTrialResult.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void loadTrialDateAdd() {

        try {
            ResultSet rs = DB.search("SELECT * FROM Trial WHERE idstudents = '" + studentIDadd + "' AND isDelete = '1' ");
            while (rs.next()) {

                comboTrailAddd.addItem(rs.getString("Date"));
                resultadd.put(rs.getString("Date"), rs.getInt("idTrial"));

            }
            System.out.println(resultadd);
        } catch (Exception ex) {
            Logger.getLogger(AddTrialResult.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void clearADD() {
        comboTrailAddd.removeAllItems();
        DefaultTableModel model = (DefaultTableModel) tblAddResult.getModel();
        model.setRowCount(0);
        resultadd.clear();
    }

}
