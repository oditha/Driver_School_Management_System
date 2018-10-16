
package RentandHire;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import Student.*;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static sun.net.www.MimeTable.loadTable;

public class RentVehicle extends javax.swing.JFrame {
static boolean maximized = true;
boolean b=false;
    public RentVehicle() {
        initComponents();
        maximizeWindow();
        laodCustom();
        loadVehicle();
        setText();
        tableLoad();
        setEnabled();
    
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        comboVehicle = new javax.swing.JComboBox<>();
        dateStart = new com.alee.extended.date.WebDateField();
        dateEnd = new com.alee.extended.date.WebDateField();
        btnSave = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtExAmount = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtMonMileage = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtStartMileage = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        comboCustom = new javax.swing.JComboBox<>();
        txtAdvance = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRentVehicle = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        webDate = new com.alee.extended.date.WebDateField();
        checkDate = new javax.swing.JCheckBox();
        btnDate = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        comboFilter = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Vehicle Rent-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rent Vehicle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel7.setText("Select Vehicle");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 20));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel16.setText("Rent Start Date");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 110, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel9.setText("Rent End Date");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, 20));

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 100, 40));

        comboVehicle.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(comboVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 270, 30));

        dateStart.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dateStart.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        dateStart.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(dateStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 270, 30));

        dateEnd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dateEnd.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        dateEnd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(dateEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 270, 30));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 100, 40));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel15.setText("Rent Amount");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 20));

        txtAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmountKeyTyped(evt);
            }
        });
        jPanel2.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 270, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel11.setText("Price Extra Mileage");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 130, 20));

        txtExAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtExAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtExAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExAmountKeyTyped(evt);
            }
        });
        jPanel2.add(txtExAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 270, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel13.setText("Monthly Mileage Limit");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 180, 20));

        txtMonMileage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMonMileage.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMonMileage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonMileageActionPerformed(evt);
            }
        });
        txtMonMileage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMonMileageKeyTyped(evt);
            }
        });
        jPanel2.add(txtMonMileage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 270, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel12.setText("Start Mileage");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 130, 20));

        txtStartMileage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStartMileage.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtStartMileage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartMileageActionPerformed(evt);
            }
        });
        txtStartMileage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStartMileageKeyTyped(evt);
            }
        });
        jPanel2.add(txtStartMileage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 270, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel14.setText("Select Customer ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 110, 20));

        comboCustom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(comboCustom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 270, 30));

        txtAdvance.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAdvance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAdvance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdvanceActionPerformed(evt);
            }
        });
        jPanel2.add(txtAdvance, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 270, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("KM");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 30, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel4.setText("Advance");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 70, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel5.setText("LKR");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 30, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel6.setText("LKR");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 30, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel8.setText("LKR");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 30, 20));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel17.setText("KM");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 30, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 500, 580));

        tableRentVehicle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer", "Vehicle", "Rent Amount", "Advance", "Mileage Limit", "Start Mileage", "Start Date", "End Date"
            }
        ));
        tableRentVehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRentVehicleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableRentVehicle);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 730, 410));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        webDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(webDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 250, 30));

        checkDate.setBackground(new java.awt.Color(255, 255, 255));
        checkDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkDate.setText("Filter By Start Date");
        checkDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDateActionPerformed(evt);
            }
        });
        jPanel3.add(checkDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDate.setText("FILTER");
        btnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateActionPerformed(evt);
            }
        });
        jPanel3.add(btnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 130, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 60, 360, 140));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Filter By");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Vehicle");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton2.setText("Customer");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        comboFilter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select All" }));
        jPanel4.add(comboFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 290, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("FILTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 120, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 340, 140));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 20, 590));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtStartMileageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartMileageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartMileageActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearField();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        DateFormat df=new SimpleDateFormat("yyyy/MM/dd");   
        String getVehicle=(String) comboVehicle.getSelectedItem();
        String getCustom=(String) comboCustom.getSelectedItem();
        String getcusID=null;
        String getvehId=null;
        validateTxt();
        if (dateStart.getDate()==null) {
            NotificationPopup.fillFeilds();
        }else if (dateEnd.getDate()==null) {
             NotificationPopup.fillFeilds();
        }else{
            
            if (b == false) {
                try {
                  String DateStart=df.format(dateStart.getDate());
                  String DateEnd=df.format(dateEnd.getDate());
                  String[] getVehicleId=getVehicle.split(" ");
                  ResultSet rs=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+getVehicleId[0]+"' ");
                  while (rs.next()) {
                      getvehId=rs.getString("idVehicle");
                  }
                  
                  String[] getCustomId=getCustom.split(" ");
                  ResultSet rs1=DB.search("SELECT * FROM customer WHERE CustomerNIC='"+getCustomId[0]+"' ");
                  while (rs1.next()) {
                      getcusID=rs1.getString("idCustomer");

                  }
                    if (btnSave.getText().equals("SAVE")) {
                          String insert="INSERT INTO rentvehicle(RentStartDate,RentEndingDate,RentAmount,Advance,MonthlyMilageLimit,StartMilage,ExtraMileCost,idVehicle,idCustomer)"
                                        + "VALUES('"+DateStart+"','"+DateEnd+"','"+txtAmount.getText()+"','"+txtAdvance.getText()+"','"+txtMonMileage.getText()+"','"+txtStartMileage.getText()+"','"+txtExAmount.getText()+"','"+getvehId+"','"+getcusID+"')";
                          DB.idu(insert);
                          
                          String insert_2="INSERT INTO incomeexpence(Date,Description,Income,Expence) VALUES('"+DateStart+"','rent Advance','"+txtAdvance.getText()+"','0') ";
                          DB.idu(insert_2);
                    }

                  
                  tableLoad();
                  setText();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                 NotificationPopup.fillFeilds();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void txtAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyTyped
            char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtAmountKeyTyped

    private void txtExAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExAmountKeyTyped
              char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtExAmountKeyTyped

    private void txtStartMileageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartMileageKeyTyped
            char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtStartMileageKeyTyped

    private void txtMonMileageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonMileageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonMileageActionPerformed

    private void txtMonMileageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMonMileageKeyTyped
                    char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtMonMileageKeyTyped

    private void tableRentVehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRentVehicleMouseClicked
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
//        String getVehId=null;
//        try {
//            int x=tableRentVehicle.getSelectedRow();
//            String s=(tableRentVehicle.getModel().getValueAt(x,1).toString());
//            ResultSet rs=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+s+"' ");
//            while (rs.next()) {                
//                getVehId=rs.getString("idVehicle");
//            }
//            ResultSet rs1=DB.search("SELECT v.*,c.*,rv.* FROM vehicle v INNER JOIN rentvehicle rv ON v.idVehicle=rv.idVehicle INNER JOIN customer c ON c.idCustomer=rv.idCustomer WHERE rv.idVehicle='"+getVehId+"' ");
//            if (rs1.next()) {
//                String s1=rs1.getString("CustomerNIC");
//                String s2=rs1.getString("CustomerName");
//                comboCustom.setSelectedItem(s1+" ("+s2+")");
//                String s3=rs1.getString("VehicleNumber");
//                String s4=rs1.getString("model");
//                comboVehicle.setSelectedItem(s3+" ("+s4+")");
//                String s5=rs1.getString("RentAmount");
//                txtAmount.setText(s5);
//                String ss=rs1.getString("Advance");
//                txtAdvance.setText(ss);
//                String s6=rs1.getString("ExtraMileCost");
//                txtExAmount.setText(s6);
//                String s7=rs1.getString("MonthlyMilageLimit");
//                txtMonMileage.setText(s7);
//                String s8=rs1.getString("StartMilage");
//                txtStartMileage.setText(s8);
//                String s9=rs1.getString("RentStartDate");
//                dateStart.setDate(sdf.parse(s9));
//                String s10=rs1.getString("RentEndingDate");
//                dateEnd.setDate(sdf.parse(s10));
//                btnSave.setText("UPDATE");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_tableRentVehicleMouseClicked

    private void checkDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDateActionPerformed
        if (checkDate.isSelected()) {
            webDate.setEnabled(true);
            btnDate.setEnabled(true);
            jRadioButton1.setSelected(true);
            comboFilter.setSelectedIndex(0);
            tableLoad();

        }else{
            tableLoad();
            setEnabled();
        }
    }//GEN-LAST:event_checkDateActionPerformed

    private void btnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateActionPerformed
        try {
            DateFormat df=new SimpleDateFormat("yyyy/MM/dd");
            String getDate=df.format(webDate.getDate());
            ResultSet rs=DB.search("SELECT v.*,c.*,rv.* FROM vehicle v INNER JOIN rentvehicle rv ON v.idVehicle=rv.idVehicle INNER JOIN customer c ON c.idCustomer=rv.idCustomer WHERE RentStartDate='"+getDate+"' ");
            DefaultTableModel dtm=(DefaultTableModel) tableRentVehicle.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("CustomerName"));
                v.add(rs.getString("VehicleNumber"));
                v.add(rs.getString("RentAmount"));
                v.add(rs.getString("Advance"));
                v.add(rs.getString("MonthlyMilageLimit"));
                v.add(rs.getString("StartMilage"));
                v.add(rs.getString("RentStartDate"));
                v.add(rs.getString("RentEndingDate"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDateActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
            comboFilter.removeAllItems();
            comboFilter.addItem("Select All");
            try {
            ResultSet rs=DB.search("SELECT * FROM customer");
            while (rs.next()) {                
                String getNic=rs.getString("CustomerNIC");
                String getName=rs.getString("CustomerName");
                comboFilter.addItem(getNic+" ("+getName+")");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        comboFilter.removeAllItems();
        comboFilter.addItem("Select All");
        try {
            ResultSet rs=DB.search("SELECT * FROM vehicle");
            while (rs.next()) {
                String getVehicleNo=rs.getString("VehicleNumber");
                String getVehicleModel=rs.getString("model");
                
              
                comboFilter.addItem(getVehicleNo+" ("+getVehicleModel+")");
        
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String getVehId=null;
        try {
            if (comboFilter.getSelectedIndex()==0) {
                tableLoad();
            }else{
                if (jRadioButton1.isSelected()) {
                  String selectVehicle=(String) comboFilter.getSelectedItem();
                  String[] s=selectVehicle.split(" ");
                  ResultSet rs1=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+s+"' ");
                  while (rs1.next()) {                
                  getVehId=rs1.getString("idVehicle");
                 }
            ResultSet rs=DB.search("SELECT v.*,c.*,rv.* FROM vehicle v INNER JOIN rentvehicle rv ON v.idVehicle=rv.idVehicle INNER JOIN customer c ON c.idCustomer=rv.idCustomer WHERE VehicleNumber='"+s[0]+"' ");
            DefaultTableModel dtm=(DefaultTableModel) tableRentVehicle.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("CustomerName"));
                v.add(rs.getString("VehicleNumber"));
                v.add(rs.getString("RentAmount"));
                v.add(rs.getString("MonthlyMilageLimit"));
                v.add(rs.getString("StartMilage"));
                v.add(rs.getString("RentStartDate"));
                v.add(rs.getString("RentEndingDate"));
                dtm.addRow(v);
            }
             }else{
                
            String selectCustomer=(String) comboFilter.getSelectedItem();
            String[] s=selectCustomer.split(" ");
            ResultSet rs=DB.search("SELECT v.*,c.*,rv.* FROM vehicle v INNER JOIN rentvehicle rv ON v.idVehicle=rv.idVehicle INNER JOIN customer c ON c.idCustomer=rv.idCustomer WHERE CustomerNIC='"+s[0]+"' ");
            DefaultTableModel dtm=(DefaultTableModel) tableRentVehicle.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("CustomerName"));
                v.add(rs.getString("VehicleNumber"));
                v.add(rs.getString("RentAmount"));
                v.add(rs.getString("MonthlyMilageLimit"));
                v.add(rs.getString("StartMilage"));
                v.add(rs.getString("RentStartDate"));
                v.add(rs.getString("RentEndingDate"));
                dtm.addRow(v);
            }
                
                }
                
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAdvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdvanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdvanceActionPerformed


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDate;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkDate;
    private javax.swing.JComboBox<String> comboCustom;
    private javax.swing.JComboBox<String> comboFilter;
    private javax.swing.JComboBox<String> comboVehicle;
    private com.alee.extended.date.WebDateField dateEnd;
    private com.alee.extended.date.WebDateField dateStart;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableRentVehicle;
    private javax.swing.JTextField txtAdvance;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtExAmount;
    private javax.swing.JTextField txtMonMileage;
    private javax.swing.JTextField txtStartMileage;
    private com.alee.extended.date.WebDateField webDate;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            RentVehicle.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            RentVehicle.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void laodCustom() {
        try {
            ResultSet rs=DB.search("SELECT * FROM customer");
            while (rs.next()) {                
                String getNic=rs.getString("CustomerNIC");
                String getName=rs.getString("CustomerName");
                comboCustom.addItem(getNic+" ("+getName+")");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadVehicle() {
          try {
            ResultSet rs=DB.search("SELECT * FROM vehicle");
            while (rs.next()) {
                String getVehicleNo=rs.getString("VehicleNumber");
                String getVehicleModel=rs.getString("model");
                
                comboVehicle.addItem(getVehicleNo+" ("+getVehicleModel+")");
                comboFilter.addItem(getVehicleNo+" ("+getVehicleModel+")");
        
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
      private void validateTxt(){
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
      
      private void setText(){
          try {
                comboCustom.setSelectedIndex(0);
          comboVehicle.setSelectedIndex(0);
          txtAmount.setText("");
          txtAdvance.setText("");
          txtExAmount.setText("");
          txtMonMileage.setText("");
          txtStartMileage.setText("");
          dateStart.setDate(null);
          dateEnd.setDate(null);
          } catch (Exception e) {
          }
      }

    private void tableLoad() {
        try {
            ResultSet rs=DB.search("SELECT v.*,c.*,rv.* FROM vehicle v INNER JOIN rentvehicle rv ON v.idVehicle=rv.idVehicle INNER JOIN customer c ON c.idCustomer=rv.idCustomer  ORDER BY RentStartDate DESC");
            DefaultTableModel dtm=(DefaultTableModel) tableRentVehicle.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("CustomerName"));
                v.add(rs.getString("VehicleNumber"));
                v.add(rs.getString("RentAmount"));
                v.add(rs.getString("Advance"));
                v.add(rs.getString("MonthlyMilageLimit"));
                v.add(rs.getString("StartMilage"));
                v.add(rs.getString("RentStartDate"));
                v.add(rs.getString("RentEndingDate"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setEnabled() {
        webDate.setEnabled(false);
        btnDate.setEnabled(false);
    }

    private void clearField(){
        dateStart.setDate(null);
        dateEnd.setDate(null);
        java.awt.Component[] cp = jPanel2.getComponents();
        for (java.awt.Component c : cp) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText(null);
            }
        }
    }

}
