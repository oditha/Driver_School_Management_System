package Student.Reports;

import ExtenelClasses.DB;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ViewStudentAttendence extends javax.swing.JFrame {

    ResultSet rs;
    static boolean maximized = true;

    public ViewStudentAttendence() {
        initComponents();
        maximizeWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        ComboType = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        attendenceTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        comboDate = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Student Attendence-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 120, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Class Type");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 30));

        ComboType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ComboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Theory Class", "Machinecal Class", "Simulator Practice", "Vehicle Training - Motor Bike", "Vehicle Training - Three Wheeler", "Vehicle Training - Van", "Vehicle Training- Bus" }));
        ComboType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTypeActionPerformed(evt);
            }
        });
        jPanel1.add(ComboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 290, 30));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Student Attendence", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        attendenceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIC", "Reg. No", "Name"
            }
        ));
        jScrollPane2.setViewportView(attendenceTable);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 1090, 380));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1150, 450));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Class Date");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 90, 30));

        comboDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comboDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDateActionPerformed(evt);
            }
        });
        jPanel1.add(comboDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 290, 30));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ComboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTypeActionPerformed

        ResultSet search = null;
        comboDate.removeAllItems();

        try {

            switch (ComboType.getSelectedIndex()) {
                case 1:
                    search = DB.search("select DISTINCT date from TheoryClass");
                    break;
                case 2:
                    search = DB.search("select DISTINCT date from MachinecalClass");
                    break;
                case 4:
                    search = DB.search("select DISTINCT date from VehicleTraining Where Type = 'Moter Bike'");
                    break;
                case 3:
                    search = DB.search("select DISTINCT date from SimulatorPractice");
                    break;
                case 5:
                    search = DB.search("select DISTINCT date from VehicleTraining Where Type = 'Three Wheeler'");
                    break;
                case 6:
                    search = DB.search("select DISTINCT date from VehicleTraining Where Type = 'Van'");
                    break;
                case 7:
                    search = DB.search("select DISTINCT date from VehicleTraining Where Type = 'Bus'");
                    break;

                default:
                    break;
            }

            while (search.next()) {

                comboDate.addItem(search.getString("date"));

            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    }//GEN-LAST:event_ComboTypeActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        ResultSet search = null;
        DefaultTableModel dtm = (DefaultTableModel) attendenceTable.getModel();
        dtm.setRowCount(0);
        try {
            switch (ComboType.getSelectedIndex()) {
                case 1:
                    search = DB.search("select tc.*, s.* from TheoryClass tc inner join students s on tc.idstudents = s.idstudents where tc.date = '" + comboDate.getSelectedItem() + "'");
                    break;
                case 2:
                    search = DB.search("select tc.*, s.* from MachinecalClass tc inner join students s on tc.idstudents = s.idstudents where tc.date = '" + comboDate.getSelectedItem() + "'");
                    break;
                case 4:
                    search = DB.search("select tc.*, s.* from VehicleTraining tc inner join students s on tc.idstudents = s.idstudents where tc.date = '" + comboDate.getSelectedItem() + "' AND tc.Type = 'Moter Bike'  ");
                    break;
                case 3:
                    search = DB.search("select tc.*, s.* from SimulatorPractice tc inner join students s on tc.idstudents = s.idstudents where tc.date = '" + comboDate.getSelectedItem() + "'");
                    break;
                case 5:
                    search = DB.search("select tc.*, s.* from VehicleTraining tc inner join students s on tc.idstudents = s.idstudents where tc.date = '" + comboDate.getSelectedItem() + "' AND tc.Type = 'Three Wheeler'");
                    break;
                case 6:
                    search = DB.search("select tc.*, s.* from VehicleTraining tc inner join students s on tc.idstudents = s.idstudents where tc.date = '" + comboDate.getSelectedItem() + "' AND tc.Type = 'Van'");
                    break;
                case 7:
                    search = DB.search("select tc.*, s.* from VehicleTraining tc inner join students s on tc.idstudents = s.idstudents where tc.date = '" + comboDate.getSelectedItem() + "' AND tc.Type = 'Bus'");
                    break;

                default:
                    break;
            }
//            
//            Vehicle Training - Motor Bike
//Vehicle Training - Three Wheeler
//Vehicle Training - Van
//Vehicle Training- Bus

            while (search.next()) {

                dtm.addRow(new Object[]{search.getString("NIC"), search.getString("Regno"), search.getString("FullName")});

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_searchBtnActionPerformed

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked

    }//GEN-LAST:event_searchBtnMouseClicked

    private void comboDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDateActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudentAttendence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboType;
    private javax.swing.JTable attendenceTable;
    private javax.swing.JComboBox<String> comboDate;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables

    private void maximizeWindow() {
        if (maximized) {

            ViewStudentAttendence.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ViewStudentAttendence.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }
}
