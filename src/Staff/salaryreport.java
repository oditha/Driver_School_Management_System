package Staff;

import ExtenelClasses.DB;
import ExtenelClasses.dateFormat;
import MainMenu.*;
import static Staff.viewmonthsalarypopup.dt;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class salaryreport extends javax.swing.JFrame {

    static boolean maximized = true;

    public salaryreport() {
        initComponents();
        maximizeWindow();
        // loadtable();
        //  loadstaff();
        tabledecor();
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
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Month = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Year = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Salary Report-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("salary details"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Nic", "Date", "Basic Salary", "Net Salary Paid", "id"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(5).setMinWidth(0);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 1080, 430));

        jButton3.setText("View");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 480, 80, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 1120, 550));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Search By Date"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel2.setText("Select Month");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "01-January", "02-Febraury", "03-March", "04-April", "05-May", "06-June", "07-July", "08-Augest", "09-Sepember", "10-October", "11-November", "12-December" }));
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
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 80, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 660, 110));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (Month.getSelectedIndex() != 0) {

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            String  date=Year.getValue().toString()+"/"+Month.getSelectedItem().toString().split("-")[0];

            try {

                ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staffsalary ON staffsalary.idStaff = staff.idStaff WHERE staff.IsActive='" + 1 + "' AND  staffsalary.isDelete='" + 1 + "' AND date LIKE '" + date + "%' ");

                while (rs.next()) {

                    Vector v = new Vector();
                    v.add(rs.getString("name"));
                    v.add(rs.getString("nic"));
                    v.add(rs.getString("date"));
                    v.add(rs.getString("Basic Salary"));
                    v.add(rs.getString("NettSalary"));
                    v.add(rs.getString("idStaffSalary"));

                    dtm.addRow(v);

                }

            } catch (Exception e) {

                e.printStackTrace();

            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int r = jTable1.getSelectedRow();

        String id = (String) jTable1.getValueAt(r, 5);
        //JOptionPane.showConfirmDialog(rootPane, id);
        
        
        viewmonthsalarypopup vs = new viewmonthsalarypopup();
        
         String date=Year.getValue().toString()+"/"+Month.getSelectedItem().toString().split("-")[0];
         
         vs.dt=date;
         
         vs.empbox1.setSelectedItem(jTable1.getValueAt(r, 0)+"-"+jTable1.getValueAt(r,1));
         vs.setVisible(true);
         
         /// load allowance-----------------------------------------------------------------------------------------
         
         
         try {

            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staff_has_allowence ON staff_has_allowence.Staff_idStaff = staff.idStaff INNER JOIN allowence ON staff_has_allowence.Allowence_idAllowence = allowence.idAllowence   WHERE nic='"+jTable1.getValueAt(r,1)+"' AND date LIKE '" + date + "%' AND  staff_has_allowence.isDelete='" + 1 + "'");
            DefaultTableModel dtm = (DefaultTableModel) vs.allowance.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {

                Vector v = new Vector();
               
                v.add(rs.getString("date"));
                v.add(rs.getString("AllowenceName"));

                v.add(rs.getString("Amount"));
                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        //load deduction---------------------------------------------------------------
        DefaultTableModel dtm3 = (DefaultTableModel) vs.reduction.getModel();
        dtm3.setRowCount(0);
        
          try {
            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN deduction ON deduction.Staff_idStaff = staff.idStaff WHERE nic='"+jTable1.getValueAt(r,1)+"' AND date LIKE '" + date + "%' ");

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("date"));
                v.add(rs.getString("type"));
                v.add(rs.getString("amount"));
                dtm3.addRow(v);

            }

        } catch (Exception ex) {
            Logger.getLogger(viewmonthsalarypopup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        ------------------load payment
        
        try {
        DefaultTableModel dtm2 = (DefaultTableModel) vs.paymnt.getModel();
        dtm2.setRowCount(0);
            ResultSet rs = DB.search("SELECT * FROM staff  INNER JOIN staffpayment ON staffpayment.idStaff = staff.idStaff WHERE nic='"+jTable1.getValueAt(r,1)+"' AND date LIKE '" + date + "%' ");

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("date"));
                v.add(rs.getString("Description"));
                v.add(rs.getString("amount"));
                dtm2.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ResultSet rs=DB.search("SELECT * FROM staff INNER JOIN staffsalary ON staffsalary.idStaff = staff.idStaff WHERE idStaffSalary='"+id+"'");
       
            while (rs.next()) {     
                
                vs.basic.setText(rs.getString("BasicSalary"));
                vs.totalallowance.setText(rs.getString("TotalAllowence"));
                vs.subtotal.setText(""+(Integer.parseInt(vs.basic.getText())+Integer.parseInt(vs.totalallowance.getText())));
                vs.deduction.setText(rs.getString("TotalDeductions"));
                vs.paymentt.setText(rs.getString("TotalPayments"));
                vs.etf1.setText(rs.getString("Etf"));
                vs.epf1.setText(rs.getString("Epf"));
                vs.sub.setText(rs.getString("Totalreduct"));
                vs.netsalry.setText(rs.getString("NettSalary"));
                
                
                
            }
        
        
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salaryreport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JSpinner Year;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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

            salaryreport.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            salaryreport.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void loadtable() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        try {
            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staffsalary ON staffsalary.idStaff = staff.idStaff");
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("name"));
                v.add(rs.getString("nic"));
                v.add(rs.getString("Date"));
                v.add(rs.getString("BasicSalary"));
                v.add(rs.getString("TotalAllowence"));
                v.add(rs.getString("TotalPayments"));
                v.add(rs.getString("TotalDeductions"));
                v.add(rs.getString("Etf"));
                v.add(rs.getString("Epf"));
                v.add(rs.getString("NettSalary"));
                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadstaff() {

        try {

            ResultSet rs = DB.search("SELECT * FROM `staff` WHERE IsActive='1'");

            while (rs.next()) {

                //    empbox.addItem(rs.getString("name") + "-" + rs.getString("nic"));
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void search() {

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        try {
            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staffsalary ON staffsalary.idStaff = staff.idStaff WHERE staff.idStaff='" + id + "' AND IsActive='" + 1 + "'");
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("name"));
                v.add(rs.getString("nic"));
                v.add(rs.getString("Date"));
                v.add(rs.getString("BasicSalary"));
                v.add(rs.getString("TotalAllowence"));
                v.add(rs.getString("TotalPayments"));
                v.add(rs.getString("TotalDeductions"));
                v.add(rs.getString("Etf"));
                v.add(rs.getString("Epf"));
                v.add(rs.getString("NettSalary"));
                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void tabledecor() {

//    DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
//        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
//        jTable1.getColumnModel().getColumn(3).setCellRenderer(dtcr);
//        jTable1.getColumnModel().getColumn(4).setCellRenderer(dtcr);
//        jTable1.getColumnModel().getColumn(5).setCellRenderer(dtcr);
//        jTable1.getColumnModel().getColumn(6).setCellRenderer(dtcr);
//    
    }
}
