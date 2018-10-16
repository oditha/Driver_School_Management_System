package Student;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import ExtenelClasses.dfPrice;
import com.alee.laf.WebLookAndFeel;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class DLCatory extends javax.swing.JFrame {

    static boolean maximized = true;
    boolean txtValidate = false;

    int id;

    public DLCatory() {
        initComponents();
        maximizeWindow();
        loadInfoTable();
        tableDecor();
        chkEdit.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        panelTXT = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtClassName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFullPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPartPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        chkEdit = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Driver license Catogory");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1295, 685));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "All details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class Name", "Full price", "Part price", "Description"
            }
        ));
        jScrollPane1.setViewportView(tblDetails);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 680, 520));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 720, 590));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 20, 650));

        panelTXT.setBackground(java.awt.Color.white);
        panelTXT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Catogory details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        panelTXT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel6.setText("Class name");
        panelTXT.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 20));

        txtClassName.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtClassName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClassNameKeyReleased(evt);
            }
        });
        panelTXT.add(txtClassName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 400, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText(" LKR");
        panelTXT.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 30, 30));

        txtFullPrice.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtFullPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFullPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFullPriceKeyTyped(evt);
            }
        });
        panelTXT.add(txtFullPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 370, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel9.setText("Editor price");
        panelTXT.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, 20));

        txtPartPrice.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtPartPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPartPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPartPriceKeyTyped(evt);
            }
        });
        panelTXT.add(txtPartPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 370, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel10.setText("Description");
        panelTXT.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, 20));

        txtDescription.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        panelTXT.add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 400, 30));

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        panelTXT.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 120, 40));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        panelTXT.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 120, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel11.setText("Full price");
        panelTXT.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, 20));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText(" LKR");
        panelTXT.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 30, 30));

        chkEdit.setBackground(new java.awt.Color(255, 255, 255));
        chkEdit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkEdit.setText("Edit");
        panelTXT.add(chkEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, -1));

        jPanel1.add(panelTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 550, 590));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFullPriceKeyTyped

        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }

    }//GEN-LAST:event_txtFullPriceKeyTyped

    private void txtPartPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPartPriceKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtPartPriceKeyTyped

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearFeilds();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        validateFeilds();

        if (txtValidate == false) {

            if (btnSave.getText().equals("SAVE")) {

                try {
                    DB.idu("INSERT INTO `newkamal`.`VehicleClasses` (`VehicleClasseName`, `FullTraningPrice`, `PartTraningPrice`, `Description`) VALUES ('" + txtClassName.getText().toUpperCase() + "', '" + txtFullPrice.getText() + "', '" + txtPartPrice.getText() + "', '" + txtDescription.getText().toUpperCase() + "')");
                    NotificationPopup.save();
                    clearFeilds();
                    loadInfoTable();

                } catch (Exception ex) {
                    Logger.getLogger(DLCatory.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (btnSave.getText().equals("UPDATE")) {

                try {

                    DB.idu("UPDATE `newkamal`.`VehicleClasses` SET `VehicleClasseName` = '" + txtClassName.getText() + "', `FullTraningPrice` = '" + txtFullPrice.getText() + "', `PartTraningPrice` = '" + txtPartPrice.getText() + "' , `Description` = '" + txtDescription.getText() + "' WHERE `idVehicleClasses` = '" + id + "'");
                    NotificationPopup.save();
                    clearFeilds();
                    loadInfoTable();

                } catch (Exception ex) {
                    Logger.getLogger(DLCatory.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        } else {

            NotificationPopup.fillFeilds();

        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtClassNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClassNameKeyReleased

        try {

            ResultSet rs = DB.search("SELECT * FROM newkamal.VehicleClasses WHERE VehicleClasseName = '" + txtClassName.getText() + "'");
            if (rs.next()) {

                id = rs.getInt("idVehicleClasses");
                txtFullPrice.setText(dfPrice.dcf(rs.getDouble("FullTraningPrice")));
                txtPartPrice.setText(dfPrice.dcf(rs.getDouble("PartTraningPrice")));
                txtDescription.setText(rs.getString("Description"));
                btnSave.setText("UPDATE");
                chkEdit.setVisible(true);

            } else {

                if (!chkEdit.isSelected()) {

                    txtFullPrice.setText(null);
                    txtPartPrice.setText(null);
                    txtDescription.setText(null);
                    btnSave.setText("SAVE");
                    chkEdit.setVisible(false);
                }

            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_txtClassNameKeyReleased

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DLCatory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox chkEdit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelTXT;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTextField txtClassName;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtFullPrice;
    private javax.swing.JTextField txtPartPrice;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            DLCatory.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            DLCatory.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void clearFeilds() {
        Component[] cp = panelTXT.getComponents();
        for (Component c : cp) {

            if (c instanceof JTextField) {

                ((JTextField) c).setText(null);

            }

        }

        btnSave.setText("SAVE");
        chkEdit.setVisible(false);
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

    private void loadInfoTable() {

        try {

            ResultSet rs = DB.search("SELECT * FROM newkamal.VehicleClasses ORDER BY VehicleClasseName");
            DefaultTableModel dtm = (DefaultTableModel) tblDetails.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString("VehicleClasseName"), dfPrice.dcf(rs.getDouble("FullTraningPrice")), dfPrice.dcf(rs.getDouble("PartTraningPrice")), rs.getString("Description")});
            }

        } catch (Exception ex) {
            Logger.getLogger(DLCatory.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void tableDecor() {

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tblDetails.getColumnModel().getColumn(1).setCellRenderer(dtcr);
        tblDetails.getColumnModel().getColumn(2).setCellRenderer(dtcr);

    }

}
