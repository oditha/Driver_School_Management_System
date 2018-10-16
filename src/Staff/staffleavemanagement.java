package Staff;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import ExtenelClasses.dateFormat;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class staffleavemanagement extends javax.swing.JFrame {

    static boolean maximized = true;

    public staffleavemanagement() {
        initComponents();
        maximizeWindow();
        loademp();
//        fromdate.setEnabled(false);
//        todate.setEnabled(false);
//        loadtavle2();
    }
    Map<String, Integer> hm = new HashMap();
    String id = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        emp = new javax.swing.JComboBox<>();
        Fromdate = new com.alee.extended.date.WebDateField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ltype = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        todate = new com.alee.extended.date.WebDateField();
        jLabel3 = new javax.swing.JLabel();
        emp12 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Staff Leave Management-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Current Month Leave Details"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Nic", "Start Date", "Leave Type", "id"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(4).setMinWidth(0);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(0);
            jTable2.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 630, 400));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 120, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 710, 600));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 20, 610));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Leave Details"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Start  Date");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, 40));

        emp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));
        emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empActionPerformed(evt);
            }
        });
        jPanel2.add(emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 310, 30));

        Fromdate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        Fromdate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(Fromdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 310, 40));

        jLabel4.setText("Select Staff");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 40));

        jLabel1.setText("Leave type");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        ltype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fullday", "halfday", "shortleave" }));
        ltype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ltypeActionPerformed(evt);
            }
        });
        jPanel2.add(ltype, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 310, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 120, 40));

        todate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        todate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(todate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 310, 40));

        jLabel3.setText("To Date");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 40));

        emp12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));
        emp12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp12ActionPerformed(evt);
            }
        });
        jPanel2.add(emp12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 310, 30));

        jLabel5.setText("Acting Employee");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 110, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 510, 500));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empActionPerformed

        String s1[] = emp.getSelectedItem().toString().split("-");
        String nic = s1[1];

        if (emp.getSelectedIndex() == 0) {
            loadtavle2();
        }

        try {
            ResultSet rs = DB.search("SELECT * FROM `staff` WHERE nic='" + s1[1] + "' AND IsActive='1'");

            if (rs.next()) {

                id = rs.getString("idStaff");

                hm.put(id, rs.getInt("idStaff"));

                //  System.out.println(nic+rs.getString("nic"));
                System.out.println(hm.get(rs.getString("nic")));
            }

        } catch (Exception e) {

            e.printStackTrace();

        }
        //  JOptionPane.showMessageDialog(rootPane, id);

        loadtable();

    }//GEN-LAST:event_empActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String s1[] = emp.getSelectedItem().toString().split("-");
        String nic = s1[1];
        try {

            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staffleave ON staffleave.idStaff = staff.idStaff WHERE nic='" + nic + "' AND FromDate='" + Fromdate.getText() + "' ");

            if (!rs.next()) {

                DB.idu("INSERT INTO `newkamal`.`staffleave` (  `FromDate`, `ToDate`, `LeaveType`, `Requested date`, `Active Employee`,  `isDelete`, `idStaff`) VALUES ('" + Fromdate.getText() + "', '" + todate.getText() + "', '" + ltype.getSelectedItem().toString() + "' ,'" + dateFormat.DateFullCurrent() + "','" + emp12.getSelectedItem().toString() + "','" + 1 + "','" + hm.get(id) + "')");
                NotificationPopup.save();
                emp.setSelectedIndex(0);
                emp12.setSelectedIndex(0);
                Fromdate.setText(null);
                todate.setText(null);
                ltype.setSelectedIndex(0);
                loadtable();

            } else {
                System.out.println("leave already exists");
            }
        } catch (Exception e) {

            e.printStackTrace();

        }

        loadtavle2();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void ltypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ltypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ltypeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int r = jTable2.getSelectedRow();

        String s = (String) jTable2.getValueAt(r, 4);

        System.out.println(s);

        try {
            DB.idu("UPDATE staffleave SET isDelete='" + 0 + "' WHERE idStaffLeave='" + s + "' ");
            tablload();
            NotificationPopup.Delete();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked


    }//GEN-LAST:event_jTable2MouseClicked

    private void emp12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp12ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staffleavemanagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.extended.date.WebDateField Fromdate;
    private javax.swing.JComboBox<String> emp;
    private javax.swing.JComboBox<String> emp12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> ltype;
    private com.alee.extended.date.WebDateField todate;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            staffleavemanagement.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            staffleavemanagement.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void loademp() {

        try {
            ResultSet rs = DB.search("SELECT * FROM `staff` WHERE IsActive='" + 1 + "'");

            while (rs.next()) {
                emp.addItem(rs.getString("name") + "-" + rs.getString("nic"));
                emp12.addItem(rs.getString("name") + "-" + rs.getString("nic"));
            }

        } catch (Exception e) {

        }

    }

    private void tablload() {

        try {

            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);

            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staffleave ON staffleave.idStaff = staff.idStaff WHERE staff.idStaff='" + id + "'  AND FromDate like '%" + dateFormat.MonthOnly() + "' AND staffleave.isDelete='" + 1 + "'");

            while (rs.next()) {

                Vector v = new Vector();
                v.add(rs.getString("name"));
                v.add(rs.getString("nic"));
                v.add(rs.getString("FromDate"));
                v.add(rs.getString("LeaveType"));
                v.add(rs.getString("idStaffLeave"));
                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadtavle2() {

    }

    private void loadtable() {

        try {

            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);

            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staffleave ON staffleave.idStaff = staff.idStaff WHERE staff.idStaff='" + id + "'  AND FromDate like '" + dateFormat.MonthOnly() + "%'  AND staffleave.isDelete='" + 1 + "'");

            while (rs.next()) {

                Vector v = new Vector();
                v.add(rs.getString("name"));
                v.add(rs.getString("nic"));
                v.add(rs.getString("FromDate"));
                v.add(rs.getString("LeaveType"));
                v.add(rs.getString("idStaffLeave"));
                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
