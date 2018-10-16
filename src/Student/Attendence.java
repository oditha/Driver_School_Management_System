package Student;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Attendence extends javax.swing.JFrame {

    static boolean maximized = true;
    int studentID;
    String Date;
    String ImagePath;

    public Attendence() {
        initComponents();
        maximizeWindow();
        setDate();
        chkRN.setSelected(true);
        txtSearch.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        chkNic = new javax.swing.JCheckBox();
        chkPP = new javax.swing.JCheckBox();
        chkOldDl = new javax.swing.JCheckBox();
        chkRN = new javax.swing.JCheckBox();
        Photo = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtDateandTime = new javax.swing.JLabel();
        btnMechanical = new javax.swing.JButton();
        btnSimulator = new javax.swing.JButton();
        btnVehicle = new javax.swing.JButton();
        btnTheoryClass = new javax.swing.JButton();
        ComboVehicle = new javax.swing.JComboBox<String>();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSimulaor = new javax.swing.JTable();
        btnDeleteSimu = new javax.swing.JButton();
        SimulatorCount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMechanical = new javax.swing.JTable();
        btnDeleteMechanicle = new javax.swing.JButton();
        MechanicleCOunt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblTheory = new javax.swing.JTable();
        btnDeleteTheory = new javax.swing.JButton();
        TheoryCount = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblMoterBike22 = new javax.swing.JTable();
        btnMB = new javax.swing.JButton();
        moterbikeCount = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblThreeWheeler = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        threewhelercount = new javax.swing.JLabel();
        btnTW = new javax.swing.JButton();
        BusCount = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblBus = new javax.swing.JTable();
        btnBus = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblVan = new javax.swing.JTable();
        vanCount = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnVan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Kamal-Student Attendance");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Attendance", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Student"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel2.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 390, 30));

        chkNic.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkNic);
        chkNic.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        chkNic.setText("NIC");
        jPanel2.add(chkNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        chkPP.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkPP);
        chkPP.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        chkPP.setText("Passport No");
        jPanel2.add(chkPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        chkOldDl.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkOldDl);
        chkOldDl.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        chkOldDl.setText("OLD DL");
        jPanel2.add(chkOldDl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        chkRN.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkRN);
        chkRN.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        chkRN.setText("Register No");
        jPanel2.add(chkRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        Photo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(Photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 90, 110));

        txtStudentName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtStudentName.setText("Student Name");
        jPanel2.add(txtStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 390, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 560, 120));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Mark Attendance"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDateandTime.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtDateandTime.setText("Date and Time");
        jPanel3.add(txtDateandTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 480, 20));

        btnMechanical.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnMechanical.setText("Mechanical Class ");
        btnMechanical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMechanicalActionPerformed(evt);
            }
        });
        jPanel3.add(btnMechanical, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 220, -1));

        btnSimulator.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnSimulator.setText("Simulator Class");
        btnSimulator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimulatorActionPerformed(evt);
            }
        });
        jPanel3.add(btnSimulator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 220, -1));

        btnVehicle.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnVehicle.setText("Vehicle Traning");
        btnVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehicleActionPerformed(evt);
            }
        });
        jPanel3.add(btnVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 220, -1));

        btnTheoryClass.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnTheoryClass.setText("Theory Class");
        btnTheoryClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTheoryClassActionPerformed(evt);
            }
        });
        jPanel3.add(btnTheoryClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 220, -1));

        ComboVehicle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Moter Bike A", "Moter Bike A1", "Three Wheeler", "Van", "Bus" }));
        jPanel3.add(ComboVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 220, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 750, 120));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(java.awt.Color.white);
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Simiulator"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSimulaor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date"
            }
        ));
        jScrollPane3.setViewportView(tblSimulaor);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 280, 130));

        btnDeleteSimu.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnDeleteSimu.setText("Delete record");
        btnDeleteSimu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSimuActionPerformed(evt);
            }
        });
        jPanel6.add(btnDeleteSimu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 180, 30));

        SimulatorCount.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        SimulatorCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SimulatorCount.setText("0");
        jPanel6.add(SimulatorCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 50, 40));

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel2.setText("Days");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 40, 20));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 420, 210));

        jPanel7.setBackground(java.awt.Color.white);
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Mechanical"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMechanical.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date"
            }
        ));
        jScrollPane4.setViewportView(tblMechanical);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 280, 130));

        btnDeleteMechanicle.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnDeleteMechanicle.setText("Delete record");
        btnDeleteMechanicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMechanicleActionPerformed(evt);
            }
        });
        jPanel7.add(btnDeleteMechanicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 160, 30));

        MechanicleCOunt.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        MechanicleCOunt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MechanicleCOunt.setText("0");
        jPanel7.add(MechanicleCOunt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 50, 40));

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel5.setText("Days");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 40, 20));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, 420, 210));

        jPanel8.setBackground(java.awt.Color.white);
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Theory"));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTheory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date"
            }
        ));
        jScrollPane5.setViewportView(tblTheory);

        jPanel8.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 280, 130));

        btnDeleteTheory.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnDeleteTheory.setText("Delete record");
        btnDeleteTheory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTheoryActionPerformed(evt);
            }
        });
        jPanel8.add(btnDeleteTheory, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 180, 30));

        TheoryCount.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        TheoryCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TheoryCount.setText("0");
        jPanel8.add(TheoryCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 50, 40));

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel3.setText("Days");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 40, 20));

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 410, 210));

        jPanel9.setBackground(java.awt.Color.white);
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Vehicle"));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMoterBike22.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date - Moter Bike"
            }
        ));
        jScrollPane6.setViewportView(tblMoterBike22);

        jPanel9.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 280, 130));

        btnMB.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnMB.setText("Delete record");
        btnMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMBActionPerformed(evt);
            }
        });
        jPanel9.add(btnMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 160, 30));

        moterbikeCount.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        moterbikeCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moterbikeCount.setText("0");
        jPanel9.add(moterbikeCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 50, 50));

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel8.setText("Days");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 40, 20));

        tblThreeWheeler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date - Three Wheeler"
            }
        ));
        jScrollPane7.setViewportView(tblThreeWheeler);

        jPanel9.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 280, 130));

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel9.setText("Days");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 40, 20));

        threewhelercount.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        threewhelercount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        threewhelercount.setText("0");
        jPanel9.add(threewhelercount, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 50, 50));

        btnTW.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnTW.setText("Delete record");
        btnTW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTWActionPerformed(evt);
            }
        });
        jPanel9.add(btnTW, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 160, 30));

        BusCount.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        BusCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BusCount.setText("0");
        jPanel9.add(BusCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 150, 50, 50));

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel12.setText("Days");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 170, 40, 20));

        tblBus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date - Bus"
            }
        ));
        jScrollPane8.setViewportView(tblBus);

        jPanel9.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 280, 130));

        btnBus.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnBus.setText("Delete record");
        btnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusActionPerformed(evt);
            }
        });
        jPanel9.add(btnBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 160, 160, 30));

        tblVan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date - Van"
            }
        ));
        jScrollPane9.setViewportView(tblVan);

        jPanel9.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 280, 130));

        vanCount.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        vanCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vanCount.setText("0");
        jPanel9.add(vanCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 50, 50));

        jLabel14.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel14.setText("Days");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, 40, 20));

        btnVan.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnVan.setText("Delete record");
        btnVan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVanActionPerformed(evt);
            }
        });
        jPanel9.add(btnVan, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 160, 30));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 1270, 200));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1340, 510));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        ResultSet rs = null;

        try {
            if (chkNic.isSelected()) {

                rs = DB.search("SELECT * FROM students WHERE NIC = '" + txtSearch.getText() + "' ");

            } else if (chkOldDl.isSelected()) {

                rs = DB.search("SELECT * FROM students WHERE OldDLNo = '" + txtSearch.getText() + "' ");

            } else if (chkPP.isSelected()) {

                rs = DB.search("SELECT * FROM students WHERE PassportNo = '" + txtSearch.getText() + "' ");

            } else if (chkRN.isSelected()) {

                rs = DB.search("SELECT * FROM students WHERE RegNo = '" + txtSearch.getText() + "' ");

            }

            if (rs.next()) {

                studentID = rs.getInt("idstudents");
                txtStudentName.setText(rs.getString("FullName"));
                try {
                    Photo.setIcon(new ImageIcon(ImageIO.read(new File(rs.getString("Image"))).getScaledInstance(90, 100, Image.SCALE_SMOOTH)));

                } catch (Exception e) {
                }
                fillTables();

            } else {

                studentID = 0;
                txtStudentName.setText("Student Name");
                Photo.setIcon(null);
                clearFeilds();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnSimulatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimulatorActionPerformed
        setDate();

        try {

            DB.idu("INSERT INTO `newkamal`.`SimulatorPractice` (`date`, `idstudents`) VALUES ('" + Date + "', '" + studentID + "')");
            NotificationPopup.save();
            clearFeilds();
        } catch (Exception ex) {
            Logger.getLogger(Attendence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSimulatorActionPerformed

    private void btnMechanicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMechanicalActionPerformed
        setDate();

        try {

            DB.idu("INSERT INTO `newkamal`.`MachinecalClass` (`date`, `idstudents`) VALUES ('" + Date + "', '" + studentID + "')");
            NotificationPopup.save();
            clearFeilds();
        } catch (Exception ex) {
            Logger.getLogger(Attendence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMechanicalActionPerformed

    private void btnTheoryClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTheoryClassActionPerformed

        setDate();

        try {

            DB.idu("INSERT INTO `newkamal`.`TheoryClass` (`date`, `idstudents`) VALUES ('" + Date + "', '" + studentID + "')");
            NotificationPopup.save();
            clearFeilds();
        } catch (Exception ex) {
            Logger.getLogger(Attendence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTheoryClassActionPerformed

    private void btnVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehicleActionPerformed
        setDate();

        try {

            switch (ComboVehicle.getSelectedIndex()) {
                case 0:
                    DB.idu("INSERT INTO `newkamal`.`VehicleTraining` (`date`, `idstudents`, `Type`) VALUES ('" + Date + "', '" + studentID + "', 'Moter Bike')");
                    break;
                case 1:
                    DB.idu("INSERT INTO `newkamal`.`VehicleTraining` (`date`, `idstudents`, `Type`) VALUES ('" + Date + "', '" + studentID + "', 'Three Wheeler')");
                    break;
                case 2:
                    DB.idu("INSERT INTO `newkamal`.`VehicleTraining` (`date`, `idstudents`, `Type`) VALUES ('" + Date + "', '" + studentID + "', 'Van')");
                    break;
                case 3:
                    DB.idu("INSERT INTO `newkamal`.`VehicleTraining` (`date`, `idstudents`, `Type`) VALUES ('" + Date + "', '" + studentID + "', 'Bus')");
                    break;
                default:
                    break;
            }

            NotificationPopup.save();
            clearFeilds();
            setDaysCount();
        } catch (Exception ex) {
            Logger.getLogger(Attendence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVehicleActionPerformed

    private void btnDeleteSimuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSimuActionPerformed

        try {

            DB.idu("DELETE FROM `newkamal`.`simulatorpractice` WHERE `date` = '" + tblSimulaor.getValueAt(tblSimulaor.getSelectedRow(), 0) + "' AND idstudents = '" + studentID + "'");
            fillTables();
            NotificationPopup.Delete();
        } catch (Exception ex) {
            Logger.getLogger(Attendence.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDeleteSimuActionPerformed

    private void btnDeleteMechanicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMechanicleActionPerformed
        try {

            DB.idu("DELETE FROM `newkamal`.`vehicletraining` WHERE `date` = '" + tblMechanical.getValueAt(tblMechanical.getSelectedRow(), 0) + "' AND idstudents = '" + studentID + "'");
            fillTables();
            NotificationPopup.Delete();
        } catch (Exception ex) {
            Logger.getLogger(Attendence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteMechanicleActionPerformed

    private void btnDeleteTheoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTheoryActionPerformed
        try {

            DB.idu("DELETE FROM `newkamal`.`TheoryClass` WHERE `date` = '" + tblTheory.getValueAt(tblTheory.getSelectedRow(), 0) + "' AND idstudents = '" + studentID + "'");
            fillTables();
            NotificationPopup.Delete();
        } catch (Exception ex) {
            Logger.getLogger(Attendence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteTheoryActionPerformed

    private void btnMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMBActionPerformed

        try {

            DB.idu("DELETE FROM `newkamal`.`VehicleTraining` WHERE `date` = '" + tblMoterBike22.getValueAt(tblMoterBike22.getSelectedRow(), 0) + "' AND idstudents = '" + studentID + "' AND Type = 'Moter Bike'");
            fillTables();
            NotificationPopup.Delete();
        } catch (Exception ex) {
            Logger.getLogger(Attendence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMBActionPerformed

    private void btnTWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTWActionPerformed
          try {

            DB.idu("DELETE FROM `newkamal`.`VehicleTraining` WHERE `date` = '" + tblThreeWheeler.getValueAt(tblThreeWheeler.getSelectedRow(), 0) + "' AND idstudents = '" + studentID + "' AND Type = 'Three Wheeler'");
            fillTables();
            NotificationPopup.Delete();
        } catch (Exception ex) {
            Logger.getLogger(Attendence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTWActionPerformed

    private void btnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusActionPerformed
         try {

            DB.idu("DELETE FROM `newkamal`.`VehicleTraining` WHERE `date` = '" + tblBus.getValueAt(tblBus.getSelectedRow(), 0) + "' AND idstudents = '" + studentID + "' AND Type = 'Bus'");
            fillTables();
            NotificationPopup.Delete();
        } catch (Exception ex) {
            Logger.getLogger(Attendence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBusActionPerformed

    private void btnVanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVanActionPerformed
          try {

            DB.idu("DELETE FROM `newkamal`.`VehicleTraining` WHERE `date` = '" + tblVan.getValueAt(tblVan.getSelectedRow(), 0) + "' AND idstudents = '" + studentID + "' AND Type = 'Van'");
            fillTables();
            NotificationPopup.Delete();
        } catch (Exception ex) {
            Logger.getLogger(Attendence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVanActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendence().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BusCount;
    private javax.swing.JComboBox<String> ComboVehicle;
    private javax.swing.JLabel MechanicleCOunt;
    private javax.swing.JLabel Photo;
    private javax.swing.JLabel SimulatorCount;
    private javax.swing.JLabel TheoryCount;
    private javax.swing.JButton btnBus;
    private javax.swing.JButton btnDeleteMechanicle;
    private javax.swing.JButton btnDeleteSimu;
    private javax.swing.JButton btnDeleteTheory;
    private javax.swing.JButton btnMB;
    private javax.swing.JButton btnMechanical;
    private javax.swing.JButton btnSimulator;
    private javax.swing.JButton btnTW;
    private javax.swing.JButton btnTheoryClass;
    private javax.swing.JButton btnVan;
    private javax.swing.JButton btnVehicle;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkNic;
    private javax.swing.JCheckBox chkOldDl;
    private javax.swing.JCheckBox chkPP;
    private javax.swing.JCheckBox chkRN;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel moterbikeCount;
    private javax.swing.JTable tblBus;
    private javax.swing.JTable tblMechanical;
    private javax.swing.JTable tblMoterBike22;
    private javax.swing.JTable tblSimulaor;
    private javax.swing.JTable tblTheory;
    private javax.swing.JTable tblThreeWheeler;
    private javax.swing.JTable tblVan;
    private javax.swing.JLabel threewhelercount;
    private javax.swing.JLabel txtDateandTime;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtStudentName;
    private javax.swing.JLabel vanCount;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            Attendence.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Attendence.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void setDate() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        txtDateandTime.setText(sdf.format(new Date()));
        Date = sdf.format(new Date());

    }

    private void clearFeilds() {

        DefaultTableModel dt1 = (DefaultTableModel) tblMechanical.getModel();
        DefaultTableModel dt2 = (DefaultTableModel) tblSimulaor.getModel();
        DefaultTableModel dt3 = (DefaultTableModel) tblTheory.getModel();
        DefaultTableModel dt4 = (DefaultTableModel) tblMoterBike22.getModel();
        DefaultTableModel dt5 = (DefaultTableModel) tblThreeWheeler.getModel();
        DefaultTableModel dt6 = (DefaultTableModel) tblVan.getModel();
        DefaultTableModel dt7 = (DefaultTableModel) tblBus.getModel();

        dt1.setRowCount(0);
        dt2.setRowCount(0);
        dt3.setRowCount(0);
        dt4.setRowCount(0);
        dt5.setRowCount(0);
        dt6.setRowCount(0);
        dt7.setRowCount(0);
        
                    MechanicleCOunt.setText(null);
                    TheoryCount.setText(null);
                    SimulatorCount.setText(null);
                    moterbikeCount.setText(null);
                    threewhelercount.setText(null);
                    BusCount.setText(null);
                    vanCount.setText(null);
            


    }

    private void fillTables() {

        try {
            ResultSet rs1 = DB.search("SELECT * FROM MachinecalClass WHERE idstudents = '" + studentID + "'");
            DefaultTableModel dtm0 = (DefaultTableModel) tblMechanical.getModel();
            dtm0.setRowCount(0);
            while (rs1.next()) {
                dtm0.addRow(new Object[]{rs1.getString("date")});
            }
            
            MechanicleCOunt.setText(""+tblMechanical.getRowCount());

            ResultSet rs2 = DB.search("SELECT * FROM SimulatorPractice WHERE idstudents = '" + studentID + "'");
            DefaultTableModel dtm1 = (DefaultTableModel) tblSimulaor.getModel();
            dtm1.setRowCount(0);
            while (rs2.next()) {
                dtm1.addRow(new Object[]{rs2.getString("Date")});
            }
            
            SimulatorCount.setText(""+tblSimulaor.getRowCount());
            
            ResultSet rs3 = DB.search("SELECT * FROM TheoryClass WHERE idstudents = '" + studentID + "'");
            DefaultTableModel dtm2 = (DefaultTableModel) tblTheory.getModel();
            dtm2.setRowCount(0);
            while (rs3.next()) {
                dtm2.addRow(new Object[]{rs3.getString("date")});
            }

            TheoryCount.setText(""+tblTheory.getRowCount());
            
            ResultSet rs4 = DB.search("SELECT * FROM VehicleTraining WHERE idstudents = '"+studentID+"' AND Type = 'Moter Bike'");
            DefaultTableModel dtm = (DefaultTableModel) tblMoterBike22.getModel();
            dtm.setRowCount(0);
            while (rs4.next()) {
                dtm.addRow(new Object[]{rs4.getString("date")});
            }

            moterbikeCount.setText(""+tblMoterBike22.getRowCount());
            
            ResultSet rs5 = DB.search("SELECT * FROM VehicleTraining WHERE idstudents = '" + studentID + "' AND Type = 'Three Wheeler'");
            DefaultTableModel dtm7 = (DefaultTableModel) tblThreeWheeler.getModel();
            dtm7.setRowCount(0);
            while (rs5.next()) {
                dtm7.addRow(new Object[]{rs5.getString("date")});
            }

            threewhelercount.setText(""+tblThreeWheeler.getRowCount());
            
            ResultSet rs6 = DB.search("SELECT * FROM VehicleTraining WHERE idstudents = '" + studentID + "' AND Type = 'Van'");
            DefaultTableModel dtm8 = (DefaultTableModel) tblVan.getModel();
            dtm8.setRowCount(0);
            while (rs6.next()) {
                dtm8.addRow(new Object[]{rs6.getString("date")});
            }
            
            vanCount.setText(""+tblVan.getRowCount());
            
            ResultSet rs7 = DB.search("SELECT * FROM VehicleTraining WHERE idstudents = '" + studentID + "' AND Type = 'Bus'");
            DefaultTableModel dtm9 = (DefaultTableModel) tblBus.getModel();
            dtm9.setRowCount(0);
            while (rs7.next()) {
                dtm9.addRow(new Object[]{rs7.getString("date")});
            }

            BusCount.setText(""+tblBus.getRowCount());
            
        } catch (Exception ex) {
            Logger.getLogger(Attendence.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void setDaysCount() {
       
        
        
    }

}
