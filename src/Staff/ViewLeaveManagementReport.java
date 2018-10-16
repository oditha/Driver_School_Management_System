package Staff;

import ExtenelClasses.DB;
import ExtenelClasses.dateFormat;

import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ViewLeaveManagementReport extends javax.swing.JFrame {

    static boolean maximized = true;

    public ViewLeaveManagementReport() {
        initComponents();
        maximizeWindow();
//        allattendence();
//        loadstaff();
        Year.setValue(Integer.parseInt(dateFormat.YearOnly()));
    }
    int id;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Month = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Year = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Leave  report-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("view Details"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Nic", "From Date", "To Date", "Leave Type", "Requested Date", "Active Employee"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(400);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 1140, 390));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 1260, 520));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Search By Date"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel2.setText("Select Month");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "01-January", "02-Febraury", "03-March", "04-April", "05-May", "06-June", "07-July", "08-Augest", "09-Sepember", "10-October", "11-November", "12-December", "" }));
        jPanel3.add(Month, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 160, 40));

        jLabel5.setText("Enter Year");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, 40));

        Year.setModel(new javax.swing.SpinnerNumberModel());
        Year.setEditor(new javax.swing.JSpinner.NumberEditor(Year, "0000"));
        jPanel3.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 100, 40));

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 80, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 660, 110));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (Month.getSelectedIndex() != 0) {

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            String date = Year.getValue().toString() + "/" + Month.getSelectedItem().toString().split("-")[0];

            try {
                ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staffleave ON staffleave.idStaff = staff.idStaff  WHERE FromDate LIKE '" + date + "%'   AND staff.isActive='"+1+"' ORDER BY nic  ");
                System.out.println(rs.next());
                while (rs.next()) {

                    

                  
                  

                        Vector v = new Vector();
                        v.add(rs.getString("name"));
                        v.add(rs.getString("nic"));
                        v.add(rs.getString("FromDate"));
                        v.add(rs.getString("ToDate"));
                        v.add(rs.getString("LeaveType"));
                        v.add(rs.getString("Requested date"));
                        v.add(rs.getString("Active Employee"));
                        dtm.addRow(v);

                  

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLeaveManagementReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JSpinner Year;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            ViewLeaveManagementReport.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ViewLeaveManagementReport.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void search() {

        try {
            ResultSet rs = DB.search("SELECT * FROM staffattendence INNER JOIN staff ON staffattendence.idStaff = staff.idStaff WHERE staff.idStaff='" + id + "'");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {

                Vector v = new Vector();
                v.add(rs.getString("name"));
                v.add(rs.getString("nic"));
                v.add(rs.getString("Date"));
                v.add(rs.getString("status"));
                v.add(rs.getString("Intime"));
                v.add(rs.getString("Outtime"));
                v.add(rs.getString("SpecialNote"));
                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void allattendence() {

        try {
            ResultSet rs = DB.search("SELECT * FROM staffattendence INNER JOIN staff ON staffattendence.idStaff = staff.idStaff");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {

                Vector v = new Vector();
                v.add(rs.getString("name"));
                v.add(rs.getString("nic"));
                v.add(rs.getString("Date"));
                v.add(rs.getString("status"));
                v.add(rs.getString("Intime"));
                v.add(rs.getString("Outtime"));
                v.add(rs.getString("SpecialNote"));
                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadstaff() {

//        try {
//
//            ResultSet rs = DB.search("SELECT * FROM `staff` WHERE IsActive='1'");
//
//            while (rs.next()) {
//
//                empbox.addItem(rs.getString("name") + "-" + rs.getString("nic"));
//
//            }
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }
    }
}
