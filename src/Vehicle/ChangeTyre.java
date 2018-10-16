
package Vehicle;

import ExtenelClasses.DB;
import MainMenu.*;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ChangeTyre extends javax.swing.JFrame {
static boolean maximized = true;
boolean b=false;
    public ChangeTyre() {
        initComponents();
        maximizeWindow();
        loadVehicle1();
        
        laodTable1();
        laodTable2();
        
        autoSetDate();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        setDate1 = new javax.swing.JLabel();
        comboType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtStartMileage1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSave1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        comboVehcle1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtVehicleNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        txtStartMileage2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        setDate2 = new javax.swing.JLabel();
        btnSave2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtEndMileage = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTyre2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboVehicle2 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableTyre1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        comboVehicle3 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Tyre-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Tyre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDate1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setDate1.setText("set date here");
        jPanel2.add(setDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 90, 20));

        comboType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Front", "Rear", "Front Left", "Front Right", "Rear Left", "Rear Right" }));
        jPanel2.add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 320, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel4.setText("Type");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 90, 20));

        txtAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmountKeyTyped(evt);
            }
        });
        jPanel2.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 320, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel5.setText("Amount");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 90, 20));

        txtStartMileage1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStartMileage1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStartMileage1KeyTyped(evt);
            }
        });
        jPanel2.add(txtStartMileage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 320, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel6.setText("Start Mileage");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 90, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel8.setText("Date");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 70, 20));

        btnSave1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave1.setText("SAVE");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 120, 40));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel13.setText("Select Vehicle");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 90, 20));

        comboVehcle1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(comboVehcle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 320, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 540, 290));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Replace Tyre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel7.setText("Vehicle No");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 80, 20));

        txtVehicleNo.setEditable(false);
        txtVehicleNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtVehicleNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 320, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel9.setText("Type");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 80, 20));

        txtType.setEditable(false);
        txtType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 320, 30));

        txtStartMileage2.setEditable(false);
        txtStartMileage2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStartMileage2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStartMileage2KeyTyped(evt);
            }
        });
        jPanel3.add(txtStartMileage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 320, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel10.setText("Start Mileage");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 90, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel11.setText("Date");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 80, 20));

        setDate2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setDate2.setText("set date here");
        jPanel3.add(setDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 90, 20));

        btnSave2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave2.setText("SAVE");
        btnSave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 120, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel12.setText("End Mileage");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 80, 20));

        txtEndMileage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEndMileage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEndMileageKeyTyped(evt);
            }
        });
        jPanel3.add(txtEndMileage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 320, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 540, 290));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 20, 700));

        tableTyre2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle No", "Type", "Amount", "Start Mileage", "End Mileage", "Date"
            }
        ));
        jScrollPane1.setViewportView(tableTyre2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 630, 190));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("Select Vehicle");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 90, 20));

        comboVehicle2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboVehicle2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select All" }));
        comboVehicle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVehicle2ActionPerformed(evt);
            }
        });
        jPanel4.add(comboVehicle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 320, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Select Vehicle");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 90, 20));

        jComboBox4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel5.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 320, 30));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 630, 60));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle No", "Type", "Amount", "Start Mileage", "Date"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 630, 240));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Select Vehicle");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 90, 20));

        jComboBox5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel6.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 320, 30));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Select Vehicle");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 90, 20));

        jComboBox6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel7.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 320, 30));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 630, 60));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle No", "Type", "Amount", "Start Mileage", "Date"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 630, 240));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 630, 60));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle No", "Type", "Amount", "Start Mileage", "Date"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 630, 240));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 630, 60));

        tableTyre1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle No", "Type", "Amount", "Start Mileage", "Date"
            }
        ));
        tableTyre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTyre1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tableTyre1);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 630, 220));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboVehicle3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboVehicle3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select All" }));
        comboVehicle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVehicle3ActionPerformed(evt);
            }
        });
        jPanel8.add(comboVehicle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 320, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel17.setText("Select Vehicle");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 90, 20));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 630, 60));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyTyped
                    char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtAmountKeyTyped

    private void txtStartMileage1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartMileage1KeyTyped
                   char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtStartMileage1KeyTyped

    private void txtStartMileage2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartMileage2KeyTyped
                    char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtStartMileage2KeyTyped

    private void txtEndMileageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEndMileageKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndMileageKeyTyped

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        String getVehId=null;
        validateTxt1();
        try {
            if (b==false) {
                  String selectVehicle=(String) comboVehcle1.getSelectedItem();
                  String[] s=selectVehicle.split(" ");
                  ResultSet rs=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+s[0]+"' ");
                  while (rs.next()) {                
                  getVehId=rs.getString("idVehicle");
                 }
                  DB.idu("INSERT INTO Vehicletyre(Type,StartMileage,AddDate,Amount,idVehicle,isDelete) VALUES('"+comboType.getSelectedItem()+"','"+txtStartMileage1.getText()+"','"+setDate1.getText()+"','"+txtAmount.getText()+"','"+getVehId+"','1') ");
            }
            laodTable1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void tableTyre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTyre1MouseClicked
        try {
           int i=tableTyre1.getSelectedRow();
           String s=(String) tableTyre1.getValueAt(i, 1);
           String s1=(String) tableTyre1.getValueAt(i, 0);
           ResultSet rs=DB.search("SELECT v.*,vt.* FROM vehicle v INNER JOIN Vehicletyre vt ON v.idVehicle=vt.idVehicle WHERE Type='"+s+"' AND v.VehicleNumber='"+s1+"' ");
            if (rs.next()) {
                String VehNo=rs.getString("VehicleNumber");
                String VehModel=rs.getString("model");
                txtVehicleNo.setText(VehNo+" ("+VehModel+")");
                txtType.setText(rs.getString("Type"));
                txtStartMileage2.setText(rs.getString("StartMileage"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tableTyre1MouseClicked

    private void btnSave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave2ActionPerformed
        String getVehId=null;
        validate();
        try {
            String selectVehicle=txtVehicleNo.getText();
            String[] s=selectVehicle.split(" ");
            ResultSet rs=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+s[0]+"' ");
               while (rs.next()) {                
                  getVehId=rs.getString("idVehicle");
               } 
            DB.idu("UPDATE Vehicletyre SET EndMileage='"+txtEndMileage.getText()+"',RemoveDate='"+setDate2.getText()+"',isDelete='0' WHERE Vehicletyre.idVehicle='"+getVehId+"' AND Type='"+txtType.getText()+"' ");
            laodTable1();
            laodTable2();
            clearField();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSave2ActionPerformed

    private void comboVehicle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVehicle2ActionPerformed
        String getVehId=null;
        try {
            if (comboVehicle2.getSelectedIndex()==0) {
                laodTable1();
            }else{
                  String selectVehicle=(String) comboVehicle2.getSelectedItem();
                  String[] s=selectVehicle.split(" ");
                  ResultSet rs=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+s[0]+"' ");
                  while (rs.next()) {                
                  getVehId=rs.getString("idVehicle");
                 }
                  ResultSet rs1=DB.search("SELECT v.*,vt.* FROM vehicle v INNER JOIN Vehicletyre vt ON v.idVehicle=vt.idVehicle WHERE vt.idVehicle='"+getVehId+"' AND isDelete LIKE '1' ");
                  DefaultTableModel dtm=(DefaultTableModel) tableTyre1.getModel();
                  dtm.setRowCount(0);
                  while (rs1.next()) {                
                    Vector v=new Vector();
                    v.add(rs1.getString("VehicleNumber"));
                    v.add(rs1.getString("Type"));
                    v.add(rs1.getString("Amount"));
                    v.add(rs1.getString("StartMileage"));
                    v.add(rs1.getString("AddDate"));
                    dtm.addRow(v);
            }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_comboVehicle2ActionPerformed

    private void comboVehicle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVehicle3ActionPerformed
          String getVehId=null;
          try {
            if (comboVehicle3.getSelectedIndex()==0) {
                laodTable2();
            }else{
                  String selectVehicle=(String) comboVehicle3.getSelectedItem();
                  String[] s=selectVehicle.split(" ");
                  ResultSet rs=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+s[0]+"' ");
                  while (rs.next()) {                
                  getVehId=rs.getString("idVehicle");
                 }
                  ResultSet rs1=DB.search("SELECT v.*,vt.* FROM vehicle v INNER JOIN Vehicletyre vt ON v.idVehicle=vt.idVehicle WHERE vt.idVehicle='"+getVehId+"' AND isDelete LIKE '0' ");
                  DefaultTableModel dtm=(DefaultTableModel) tableTyre2.getModel();
                  dtm.setRowCount(0);
                  while (rs1.next()) {                
                    Vector v=new Vector();
                    v.add(rs1.getString("VehicleNumber"));
                    v.add(rs1.getString("Type"));
                    v.add(rs1.getString("Amount"));
                    v.add(rs1.getString("StartMileage"));
                    v.add(rs1.getString("EndMileage"));
                    v.add(rs1.getString("RemoveDate"));
                    dtm.addRow(v);
               }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_comboVehicle3ActionPerformed


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeTyre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnSave2;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JComboBox<String> comboVehcle1;
    private javax.swing.JComboBox<String> comboVehicle2;
    private javax.swing.JComboBox<String> comboVehicle3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel setDate1;
    private javax.swing.JLabel setDate2;
    private javax.swing.JTable tableTyre1;
    private javax.swing.JTable tableTyre2;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtEndMileage;
    private javax.swing.JTextField txtStartMileage1;
    private javax.swing.JTextField txtStartMileage2;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtVehicleNo;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            ChangeTyre.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ChangeTyre.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

        private void validateTxt1(){
        java.awt.Component[] cp =jPanel2.getComponents();
        for (java.awt.Component c : cp) {
             if (c instanceof JTextField) {
                if (((JTextField) c).getText().isEmpty()) {
                    b = true;
                    break;
                }else{
                b=false;              
                }
            }
        }
      }
        
        private void validateTxt2(){
        java.awt.Component[] cp =jPanel3.getComponents();
        for (java.awt.Component c : cp) {
             if (c instanceof JTextField) {
                if (((JTextField) c).getText().isEmpty()) {
                    b = true;
                    break;
                }else{
                b=false;              
                }
            }
        }
      }   

    private void loadVehicle1() {
        try {
            ResultSet rs=DB.search("SELECT * FROM vehicle");
            while (rs.next()) {
                String getVehicleNo=rs.getString("VehicleNumber");
                String getVehicleModel=rs.getString("model");
                
                comboVehcle1.addItem(getVehicleNo+" ("+getVehicleModel+")");
                comboVehicle2.addItem(getVehicleNo+" ("+getVehicleModel+")");
                comboVehicle3.addItem(getVehicleNo+" ("+getVehicleModel+")");
        
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void autoSetDate() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        Date d=new Date();
        setDate1.setText(sdf.format(d));
        setDate2.setText(sdf.format(d));
    }

    private void laodTable1() {
        try {
            ResultSet rs=DB.search("SELECT v.*,vt.* FROM vehicle v INNER JOIN Vehicletyre vt ON v.idVehicle=vt.idVehicle WHERE isDelete LIKE '1' ");
            DefaultTableModel dtm=(DefaultTableModel) tableTyre1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("VehicleNumber"));
                v.add(rs.getString("Type"));
                v.add(rs.getString("Amount"));
                v.add(rs.getString("StartMileage"));
                v.add(rs.getString("AddDate"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void laodTable2() {
        try {
            ResultSet rs=DB.search("SELECT v.*,vt.* FROM vehicle v INNER JOIN Vehicletyre vt ON v.idVehicle=vt.idVehicle WHERE isDelete LIKE '0' ");
            DefaultTableModel dtm=(DefaultTableModel) tableTyre2.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("VehicleNumber"));
                v.add(rs.getString("Type"));
                v.add(rs.getString("Amount"));
                v.add(rs.getString("StartMileage"));
                v.add(rs.getString("EndMileage"));
                v.add(rs.getString("RemoveDate"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }  
       private void clearField(){
       java.awt.Component[] cp = jPanel3.getComponents();
        for (java.awt.Component c : cp) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText(null);
            }
          }
        }
    
}
