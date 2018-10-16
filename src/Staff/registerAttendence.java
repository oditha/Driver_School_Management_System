package Staff;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import ExtenelClasses.dateFormat;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class registerAttendence extends javax.swing.JFrame {

    static boolean maximized = true;

    public registerAttendence() {
        initComponents();
        maximizeWindow();
        setdate();
        loademployee();
        loadpresentemployee();
        date12.setText(dateFormat.DateFullCurrent());
        date134.setText(dateFormat.DateFullCurrent());

    }
    boolean flag = false;
    boolean flag1 = false;
    int stfid;
    String nic2[];
    Map<String, Integer> hm = new HashMap();
    Map<String, Integer> hm1 = new HashMap();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        webSpinner1 = new com.alee.laf.spinner.WebSpinner();
        jSpinner1 = new javax.swing.JSpinner();
        webComboBoxUI1 = new com.alee.laf.combobox.WebComboBoxUI();
        webComboBoxUI2 = new com.alee.laf.combobox.WebComboBoxUI();
        webComboBoxUI3 = new com.alee.laf.combobox.WebComboBoxUI();
        a = new javax.swing.JComboBox<>();
        a1 = new javax.swing.JComboBox<>();
        a2 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        date12 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        empbox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        present = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        mm = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        hh = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        date134 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        epmp = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        present1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        intime = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        hh1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        mm1 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();

        a.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        a1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        a2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Staff Attendence");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter IN"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("ADD");
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 120, 40));

        date12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(date12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 420, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Date");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 120, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Emplyee");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 60, 30));

        empbox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        empbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Employee--" }));
        empbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empboxActionPerformed(evt);
            }
        });
        jPanel2.add(empbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 420, 30));

        jLabel6.setText("mm");
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 60, 30));

        jLabel8.setText("Description");
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 120, 30));

        description.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 420, 30));

        present.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "NIC", "Name", "Intime", "Description"
            }
        ));
        jScrollPane3.setViewportView(present);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 510, 180));

        jButton2.setText("SAVE");
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 590, 120, 40));

        mm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mmKeyTyped(evt);
            }
        });
        jPanel2.add(mm, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 90, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("In Time");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 60, 30));

        hh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hhKeyTyped(evt);
            }
        });
        jPanel2.add(hh, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 90, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("hh");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 60, 30));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton1.setText("am");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, 30));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton2.setText("pm");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 640, 640));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 20, 680));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter OUT"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date134.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(date134, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 420, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Date");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 120, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Emplyee");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 60, 20));

        epmp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        epmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Employee--" }));
        epmp.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                epmpPopupMenuWillBecomeVisible(evt);
            }
        });
        epmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epmpActionPerformed(evt);
            }
        });
        jPanel3.add(epmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 420, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Out Time");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 60, 20));

        present1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "NIC", "Name", "Intime", "out time"
            }
        ));
        jScrollPane4.setViewportView(present1);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 510, 180));

        jButton3.setText("ADD");
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 120, 40));

        jButton4.setText("SAVE");
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 590, 120, 40));

        intime.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(intime, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 420, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Intime");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 120, 20));

        hh1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hh1KeyTyped(evt);
            }
        });
        jPanel3.add(hh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 90, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("mm");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 100, 30));

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton4.setText("pm");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 80, 30));

        mm1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mm1KeyTyped(evt);
            }
        });
        jPanel3.add(mm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 100, 30));

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton3.setText("am");
        jPanel3.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 80, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("hh");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 100, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 620, 640));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jRadioButton1.setActionCommand("am");
        jRadioButton2.setActionCommand("pm");

        if (empbox.getSelectedIndex() != 0 && !hh.getText().isEmpty() && !mm.getText().isEmpty()) {

            String s1[] = empbox.getSelectedItem().toString().split("-");

            DefaultTableModel dtm = (DefaultTableModel) present.getModel();
            for (int i = 0; i < present.getRowCount(); i++) {

                String nic = (String) present.getValueAt(i, 1);

                if (s1[1].equals(nic)) {
                    flag = true;
                } else {

                    flag = false;

                }

                try {
                    ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staffattendence ON staffattendence.idStaff = staff.idStaff   WHERE Date='" + dateFormat.DateFullCurrent() + "'");

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            if (flag == false) {

                Vector v = new Vector();
                v.add(dateFormat.DateFullCurrent());
                v.add(s1[1]);
                v.add(s1[0]);
                v.add(hh.getText() + ":" + mm.getText() + " " + buttonGroup1.getSelection().getActionCommand());
                v.add(description.getText());

                dtm.addRow(v);
                // System.out.println(hm.get(s1[1]));

                empbox.setSelectedIndex(0);
                hh.setText(null);
                mm.setText(null);
                description.setText(null);

            } else {

                JOptionPane.showMessageDialog(present, "employee already selected");

            }

        } else {
            JOptionPane.showMessageDialog(present, "please select employee or time");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int r = present.getRowCount();
      
        for (int i = 0; i < r; i++) {

            try {

                String date = present.getValueAt(i, 0).toString();
                String nic = present.getValueAt(i, 1).toString();
                String name = present.getValueAt(i, 2).toString();
                String intime = present.getValueAt(i, 3).toString();
                String description = present.getValueAt(i, 4).toString();

                ResultSet rs = DB.search(" SELECT * FROM staff INNER JOIN staffattendence ON staffattendence.idStaff = staff.idStaff WHERE Date='" + dateFormat.DateFullCurrent() + "' AND staff.nic='" + nic + "' ");
                //JOptionPane.showMessageDialog(present, present.getValueAt(i, 0).toString());
                System.out.println(date);
                if (!rs.next()) {

//                DB.idu("INSERT INTO `staffattendence` ( `Date`, `status`, `idStaff`, `Intime`, `Outtime`) VALUES ('" + date+ "', '" + "Present" + "', '" + hm.get(nic) + "', '" + intime + "', '" + "0" + "'");
                    DB.idu("INSERT INTO `newkamal`.`staffattendence` ( `Date`, `status`, `idStaff`, `Intime`, `Outtime`) VALUES ('" + dateFormat.DateFullCurrent() + "', '" + "Present" + "', '" + hm.get(nic) + "', '" + intime + "', '" + "0" + "')");

                    NotificationPopup.save();
                    loadpresentemployee();

                } else {

                    JOptionPane.showMessageDialog(present, "attendence alredy marked For " + name);

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        DefaultTableModel dtm = (DefaultTableModel) present.getModel();
        dtm.setRowCount(0);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void empboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empboxActionPerformed
        String s1[] = empbox.getSelectedItem().toString().split("-");


    }//GEN-LAST:event_empboxActionPerformed

    private void epmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epmpActionPerformed
       
    }//GEN-LAST:event_epmpActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jRadioButton3.setActionCommand("am");
        jRadioButton4.setActionCommand("pm");
        if (epmp.getSelectedIndex() != 0 && !hh1.getText().isEmpty() && !mm1.getText().isEmpty()) {

            String s1[] = epmp.getSelectedItem().toString().split("-");

            DefaultTableModel dtm = (DefaultTableModel) present1.getModel();
            for (int i = 0; i < present1.getRowCount(); i++) {

                String nic = (String) present1.getValueAt(i, 1);

                if (s1[1].equals(nic)) {
                    flag1 = true;
                } else {

                    flag1 = false;

                }
                
                
                

            }
            
            
          
            
            
            
            if (flag1 == false) {

                Vector v = new Vector();
                v.add(dateFormat.DateFullCurrent());
                v.add(s1[1]);
                v.add(s1[0]);
                v.add(intime.getText());
                v.add(hh1.getText() + ":" + mm1.getText() + " " + buttonGroup2.getSelection().getActionCommand());
                v.add(description.getText());

                dtm.addRow(v);
                System.out.println(hm.get(s1[1]));

                hh1.setText(null);
                mm1.setText(null);
                intime.setText(null);

            } else {

                JOptionPane.showMessageDialog(present, "employee already selected");

            }

        } else {
            JOptionPane.showMessageDialog(present, "please select employee or time");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) present1.getModel();
        for (int i = 0; i < present1.getRowCount(); i++) {

            String date = present1.getValueAt(i, 0).toString();
            String nic = present1.getValueAt(i, 1).toString();
            String outtime = present1.getValueAt(i, 4).toString();

            try {
                DB.idu("UPDATE `newkamal`.`staffattendence` SET Outtime='" + outtime + "' WHERE Date='" + dateFormat.DateFullCurrent() + "' AND idStaff='" + hm1.get(nic) + "'");

                loadpresentemployee();

                NotificationPopup.save();
                // leavereg();
            } catch (Exception e) {

                e.printStackTrace();

            }

        }
        dtm.setRowCount(0);


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void hhKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hhKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) || (hh.getText().length() == 2)) {
            evt.consume();
        }
    }//GEN-LAST:event_hhKeyTyped

    private void mmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mmKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) || (mm.getText().length() == 2)) {
            evt.consume();
        }
    }//GEN-LAST:event_mmKeyTyped

    private void hh1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hh1KeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) || (hh1.getText().length() == 2)) {
            evt.consume();
        }
    }//GEN-LAST:event_hh1KeyTyped

    private void mm1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mm1KeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) || (mm1.getText().length() == 2)) {
            evt.consume();
        }
    }//GEN-LAST:event_mm1KeyTyped

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void epmpPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_epmpPopupMenuWillBecomeVisible
      
         java.util.Date date = new java.util.Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        date12.setText(dateFormat.DateFullCurrent());
        date134.setText(dateFormat.DateFullCurrent());

        String s2[] = epmp.getSelectedItem().toString().split("-");
//intime.setText(null);

        try {
            ResultSet rs = DB.search("SELECT * FROM staffattendence INNER JOIN staff ON staffattendence.idStaff = staff.idStaff WHERE staffattendence.`status`='Present' AND staffattendence.Date='" + dateFormat.DateFullCurrent() + "' AND staffattendence.isDelete='1' AND staff.nic='" + s2[1] + "' ");
            //ResultSet rs=DB.search("SELECT * FROM staff INNER JOIN staffattendence ON staffattendence.idStaff = staff.idStaff WHERE staffattendence.`status` = '"+"Present"+"' AND staffattendence.Date='"+date134.getText()+"' AND isDelete='"+1+"'");

            while (rs.next()) {
                System.out.println(rs.getString("Intime"));
                intime.setText(rs.getString("Intime"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
    }//GEN-LAST:event_epmpPopupMenuWillBecomeVisible

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerAttendence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> a;
    private javax.swing.JComboBox<String> a1;
    private javax.swing.JComboBox<String> a2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField date12;
    private javax.swing.JTextField date134;
    private javax.swing.JTextField description;
    private javax.swing.JComboBox<String> empbox;
    private javax.swing.JComboBox<String> epmp;
    private javax.swing.JTextField hh;
    private javax.swing.JTextField hh1;
    private javax.swing.JTextField intime;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField mm;
    private javax.swing.JTextField mm1;
    private javax.swing.JTable present;
    private javax.swing.JTable present1;
    private com.alee.laf.combobox.WebComboBoxUI webComboBoxUI1;
    private com.alee.laf.combobox.WebComboBoxUI webComboBoxUI2;
    private com.alee.laf.combobox.WebComboBoxUI webComboBoxUI3;
    private com.alee.laf.spinner.WebSpinner webSpinner1;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            registerAttendence.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            registerAttendence.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void setdate() {
        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Date date = new java.util.Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.YYYY");
                date12.setText(dateFormat.DateFullCurrent());
                date134.setText(dateFormat.DateFullCurrent());

            }
        });
        t.start();

        date12.setEditable(false);

    }

    private void loademployee() {

        try {

            ResultSet rs = DB.search("SELECT * FROM `staff` WHERE staff.IsActive='1' ");

            while (rs.next()) {

                empbox.addItem(rs.getString("name") + "-" + rs.getString("nic"));
                hm.put(rs.getString("nic"), rs.getInt("idStaff"));

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void loadpresentemployee() {

        try {
        
            ResultSet rs = DB.search("SELECT * FROM staffattendence INNER JOIN staff ON staffattendence.idStaff = staff.idStaff WHERE staffattendence.`status`='Present' AND staffattendence.Date='" + dateFormat.DateFullCurrent() + "' AND staffattendence.isDelete='1' AND Outtime='"+0+"'  ");
          
            epmp.removeAllItems();
            epmp.addItem("-Select Employee-");
            
            
            
            while (rs.next()) {
                
                epmp.addItem(rs.getString("name") + "-" + rs.getString("nic"));
                hm1.put(rs.getString("nic"), rs.getInt("idStaff"));
          
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        intime.setEditable(false);

    }

    private void leavereg() {

        int id;

        try {

            ResultSet rs = DB.search(" SELECT * FROM `staff` WHERE isActive='" + 1 + "' ");//slect staff

            //  ResultSet rs=DB.search(" SELECT * FROM `staffattendence` WHERE DatJI='"+date12.getText()+"'");
            while (rs.next()) {

                id = rs.getInt("idStaff");//staffsn id

                System.out.println("Staff ID " + id);

                try {
                    ResultSet rs2 = DB.search(" SELECT * FROM `staffattendence` WHERE Date='" + dateFormat.DateFullCurrent() + "' and idStaff = '" + id + "'");

                    if (!rs2.first()) {

                        //   DB.idu("INSERT INTO `newkamal`.`staffattendence` ( `Date`, `status`, `idStaff`, `Intime`, `Outtime`) VALUES ('" + dateFormat.DateFullCurrent() + "', '" + "absent" + "', '" + id + "', '" + "0" + "', '" + "0" + "')");
                        try {

                            ResultSet rs3 = DB.search("SELECT * FROM `staffleave` WHERE LeaveDate='" + dateFormat.DateFullCurrent() + "' and idStaff = '" + id + "'");

                            if (!rs3.first()) {

                                DB.idu("INSERT INTO `newkamal`.`staffleave` ( `LeaveDate`, `LeaveType`, `idStaff`) VALUES ( '" + dateFormat.DateFullCurrent() + "', '" + "Fullday" + "', '" + id + "');");

                            } else {

                                System.out.println("leave already exists");

                            }

                        } catch (Exception e) {

                            e.printStackTrace();

                        }

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
