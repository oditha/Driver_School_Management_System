package Student.Reports;

import ExtenelClasses.DB;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ViewLicenDetails extends javax.swing.JFrame {

    ResultSet rs;

    static boolean maximized = true;
     public static String DL = null;
    public static Map mp = new HashMap<String, String>();

    public ViewLicenDetails() {
        initComponents();
        maximizeWindow();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        typeCombo = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        licenTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View License details-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Type");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, 20));

        typeCombo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        typeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Temporary", "Original" }));
        typeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboActionPerformed(evt);
            }
        });
        jPanel1.add(typeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 390, 30));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        licenTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DL No", "DL Type", "Student ID", "Issue Date", "Expir Date", "Class"
            }
        ));
        licenTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                licenTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(licenTable);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 1170, 410));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 1280, 500));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void typeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) licenTable.getModel();
        dtm.setRowCount(0);

        try {
            if (typeCombo.getSelectedIndex() == 1) {

//                rs = DB.search("SELECT * FROM DLDetails WHERE DLType='Tempory'");
                rs = DB.search("SELECT students.FullName, dldetails.* FROM dldetails INNER JOIN students ON dldetails.idstudents = students.idstudents WHERE dldetails.DLType='Tempory'");

            } else if (typeCombo.getSelectedIndex() == 2) {

                rs = DB.search("SELECT students.FullName, dldetails.* FROM dldetails INNER JOIN students ON dldetails.idstudents = students.idstudents WHERE dldetails.DLType='Genuine'");
            }

            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString("DLNo"), rs.getString("DLType"), rs.getString("FullName"), rs.getString("IssueDate"), rs.getString("ExpireDate"), rs.getString("DLClasses")});
                mp.put(rs.getString("DLNo"), rs.getString("DLImage"));

                // DLNo, IssueDate, ExpireDate, DLType, idstudents, isDelete
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_typeComboActionPerformed

    private void licenTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_licenTableMouseClicked
        
         DL = licenTable.getValueAt(licenTable.getSelectedRow(), 0).toString();
        new DLImagePreview2().setVisible(true);
        
    }//GEN-LAST:event_licenTableMouseClicked

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLicenDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable licenTable;
    private javax.swing.JComboBox<String> typeCombo;
    // End of variables declaration//GEN-END:variables

    private void maximizeWindow() {

        if (maximized) {

            ViewLicenDetails.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ViewLicenDetails.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }
}
