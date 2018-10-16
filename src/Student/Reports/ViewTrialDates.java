
package Student.Reports;

import ExtenelClasses.DB;
import MainMenu.*;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ViewTrialDates extends javax.swing.JFrame {
static boolean maximized = true;
    public ViewTrialDates() {
        initComponents();
        maximizeWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        webDate = new com.alee.extended.date.WebDateField();
        jLabel3 = new javax.swing.JLabel();
        btnFilter = new javax.swing.JButton();
        webDate1 = new com.alee.extended.date.WebDateField();
        jLabel4 = new javax.swing.JLabel();
        txtFilter = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View trial Dates-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("View Exam Dates"), "View Trial Dates", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trial Date", "Student Count"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 1240, 500));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filter By", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        webDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel5.add(webDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 240, 30));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jLabel3.setText("From");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 50, 30));

        btnFilter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnFilter.setText("FILTER");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });
        jPanel5.add(btnFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 120, 40));

        webDate1.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webDate1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        webDate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                webDate1MouseEntered(evt);
            }
        });
        jPanel5.add(webDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 240, 30));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jLabel4.setText("To");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 50, 30));

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
        jPanel5.add(txtFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 330, 30));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1240, 80));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1320, 680));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        try {

            if(webDate.getText().isEmpty() || webDate1.getText().isEmpty()){

            } else{

                DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

                ResultSet rs = DB.search("SELECT DISTINCT trial.Date,COUNT(idTrial) AS ss FROM trial GROUP BY trial.Date BETWEEN '"+webDate.getText()+"' AND '"+webDate1.getText()+"' ");

                DefaultTableModel dtm =(DefaultTableModel)jTable1.getModel();
                dtm.setRowCount(0);

                while (rs.next()) {
                    
                    Vector v = new Vector();
                    v.add(rs.getString("Date"));
                    v.add(rs.getString("ss"));

                    dtm.addRow(v);

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnFilterActionPerformed

    private void webDate1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webDate1MouseEntered

    }//GEN-LAST:event_webDate1MouseEntered

    private void txtFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterActionPerformed

    }//GEN-LAST:event_txtFilterActionPerformed

    private void txtFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterKeyReleased

        ResultSet rs = null;

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

        try {

            if (txtFilter.getText().isEmpty()) {

                DefaultTableModel dtm1 = (DefaultTableModel) jTable1.getModel();
                //dtm1.setRowCount(0);

            }
            else

            rs = DB.search("SELECT students.*, trial.* FROM students INNER JOIN trial ON trial.idstudents = students.idstudents WHERE students.FullName LIKE '"+txtFilter.getText()+"%'");

            while (rs.next()) {

                Vector v = new Vector();

                v.add(rs.getString("FullName"));
                v.add(rs.getString("NIC"));
                v.add(rs.getString("Shy"));
                v.add(rs.getString("Date"));
                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtFilterKeyReleased


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTrialDates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilter;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFilter;
    private com.alee.extended.date.WebDateField webDate;
    private com.alee.extended.date.WebDateField webDate1;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            ViewTrialDates.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ViewTrialDates.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }
}
