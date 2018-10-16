
package Vehicle;

import ExtenelClasses.DB;
import MainMenu.*;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ViewVehicleDetails extends javax.swing.JFrame {
static boolean maximized = true;
    public ViewVehicleDetails() {
        initComponents();
        maximizeWindow();
        tableLoad();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableViewVehicle = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        checkVehicleNo = new javax.swing.JCheckBox();
        checkPolicyNo = new javax.swing.JCheckBox();
        checkRevenueNo = new javax.swing.JCheckBox();
        txtFilter = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Vehicle Details-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableViewVehicle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle No ", "Model", "Fuel Type", "Insurance Company", "Policy No", "Insurance Fee", "Issue Date", "Expire Date", "Revenue No", "Revenue Fee", "Issue Date", "Expire Date"
            }
        ));
        jScrollPane1.setViewportView(tableViewVehicle);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 1300, 340));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FIlter By", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkVehicleNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkVehicleNo);
        checkVehicleNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkVehicleNo.setSelected(true);
        checkVehicleNo.setText("Vehicle No");
        checkVehicleNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkVehicleNoActionPerformed(evt);
            }
        });
        jPanel2.add(checkVehicleNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        checkPolicyNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkPolicyNo);
        checkPolicyNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkPolicyNo.setText("Policy No");
        jPanel2.add(checkPolicyNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        checkRevenueNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkRevenueNo);
        checkRevenueNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkRevenueNo.setText("Revenue No");
        jPanel2.add(checkRevenueNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

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
        jPanel2.add(txtFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 370, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 550, 120));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkVehicleNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkVehicleNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkVehicleNoActionPerformed

    private void txtFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterKeyReleased
        ResultSet rs=null;
        DefaultTableModel dtm=(DefaultTableModel) tableViewVehicle.getModel();
        dtm.setRowCount(0);
        try {
            if (txtFilter.getText().isEmpty()) {
                tableLoad();
            }else if (checkVehicleNo.isSelected()) {
                rs=DB.search("SELECT v.*,ins.*,rev.* FROM vehicle v INNER JOIN vehicleinsurance ins ON v.idVehicle=ins.idVehicle INNER JOIN revnuelicence rev ON v.idVehicle=rev.idVehicle WHERE VehicleNumber LIKE '"+txtFilter.getText()+"%' ");
            }else if (checkPolicyNo.isSelected()) {
                rs=DB.search("SELECT v.*,ins.*,rev.* FROM vehicle v INNER JOIN vehicleinsurance ins ON v.idVehicle=ins.idVehicle INNER JOIN revnuelicence rev ON v.idVehicle=rev.idVehicle WHERE PolicyNo LIKE '"+txtFilter.getText()+"%' ");
            }else{
                rs=DB.search("SELECT v.*,ins.*,rev.* FROM vehicle v INNER JOIN vehicleinsurance ins ON v.idVehicle=ins.idVehicle INNER JOIN revnuelicence rev ON v.idVehicle=rev.idVehicle WHERE RevNumber LIKE '"+txtFilter.getText()+"%' ");
            }
                while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("VehicleNumber"));
                v.add(rs.getString("model"));
                v.add(rs.getString("fuleType"));
                v.add(rs.getString("company"));
                v.add(rs.getString("PolicyNo"));
                v.add(rs.getString("amount"));
                v.add(rs.getString("DateIssue"));
                v.add(rs.getString("DateExpire"));
                v.add(rs.getString("RevNumber"));
                v.add(rs.getString("Fee"));
                v.add(rs.getString("RevIssueDate"));
                v.add(rs.getString("RevExpireDate"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtFilterKeyReleased

    private void txtFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilterActionPerformed


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVehicleDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkPolicyNo;
    private javax.swing.JCheckBox checkRevenueNo;
    private javax.swing.JCheckBox checkVehicleNo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableViewVehicle;
    private javax.swing.JTextField txtFilter;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            ViewVehicleDetails.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ViewVehicleDetails.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void tableLoad() {
        try {
            ResultSet rs=DB.search("SELECT v.*,ins.*,rev.* FROM vehicle v INNER JOIN vehicleinsurance ins ON v.idVehicle=ins.idVehicle INNER JOIN revnuelicence rev ON v.idVehicle=rev.idVehicle");
            DefaultTableModel dtm=(DefaultTableModel) tableViewVehicle.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("VehicleNumber"));
                v.add(rs.getString("model"));
                v.add(rs.getString("fuleType"));
                v.add(rs.getString("company"));
                v.add(rs.getString("PolicyNo"));
                v.add(rs.getString("amount"));
                v.add(rs.getString("DateIssue"));
                v.add(rs.getString("DateExpire"));
                v.add(rs.getString("RevNumber"));
                v.add(rs.getString("Fee"));
                v.add(rs.getString("RevIssueDate"));
                v.add(rs.getString("RevExpireDate"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
