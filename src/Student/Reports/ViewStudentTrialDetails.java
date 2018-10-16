package Student.Reports;

import ExtenelClasses.DB;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ViewStudentTrialDetails extends javax.swing.JFrame {

    static boolean maximized = true;
    ResultSet rs;
    Map <String, String> hm = new HashMap();

    public ViewStudentTrialDetails() {
        initComponents();
        maximizeWindow();
        loadCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentListTable = new javax.swing.JTable();
        searchBtn = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        comboType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Trial Details-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 40, 30));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Trial Day Student List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIC", "Student Name", "Date", "Shy"
            }
        ));
        studentListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentListTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(studentListTable);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 590, 380));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 620, 440));

        searchBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchBtn.setText("SEARCH");
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 120, 30));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 20, 530));

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Trial Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle Class", "Result"
            }
        ));
        jScrollPane3.setViewportView(studentTable);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 500, 380));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 540, 440));

        comboType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel1.add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 280, 30));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        Datechoser();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked

    }//GEN-LAST:event_searchBtnMouseClicked

    private void studentListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentListTableMouseClicked
   
        TableLoad();
        
    }//GEN-LAST:event_studentListTableMouseClicked

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudentTrialDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTable studentListTable;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables

    private void Datechoser() {

        DefaultTableModel dtm = (DefaultTableModel) studentListTable.getModel();
        dtm.setRowCount(0);

        try {
            ResultSet search = DB.search("SELECT s.*, t.* FROM students s INNER JOIN Trial t ON s.idstudents = t.idstudents WHERE t.Date =  '" + comboType.getSelectedItem() + "'");

            while (search.next()) {

                dtm.addRow(new Object[]{search.getString("NIC"), search.getString("FullName"), search.getString("date"), search.getString("Shy")});
                hm.put(search.getString("NIC"), search.getString("idTrial"));
                    
            }

        } catch (Exception e) {
            System.out.println(e);

        }

    }

    public void TableLoad() {
        System.out.println(hm);
        String id = studentListTable.getValueAt(studentListTable.getSelectedRow(), 0).toString();
        System.out.println(id);
        
        DefaultTableModel dtm1 = (DefaultTableModel) studentTable.getModel();
        dtm1.setRowCount(0);
        try {
//            ResultSet srss = DB.search("SELECT * FROM TrialResult where idTrial = '"+hm.get(id)+"' ");
            
            
            ResultSet srs = DB.search("SELECT * FROM TrialResult where idTrial = '"+hm.get(id)+"' ");
            System.out.println(hm.get(id));
            System.out.println(srs);
            while (srs.next()) {
                System.out.println("OK");
                dtm1.addRow(new Object[]{srs.getString("VehicleClass"), srs.getString("TrialResult")});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void maximizeWindow() {
        if (maximized) {

            ViewStudentTrialDetails.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ViewStudentTrialDetails.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void loadCombo() {

        try {
            ResultSet search = DB.search("select DISTINCT Date from Trial ");
            while (search.next()) {

                comboType.addItem(search.getString("Date"));

            }
        } catch (Exception ex) {
            Logger.getLogger(ViewStudentTrialDetails.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
