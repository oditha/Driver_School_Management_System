
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

public class HireVehicle extends javax.swing.JFrame {
static boolean maximized = true;
boolean b=false;
    public HireVehicle() {
        initComponents();
        maximizeWindow();
        laodCustom();
        loadVehicle();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtHireDays = new javax.swing.JTextField();
        txtStartMileage = new javax.swing.JTextField();
        txtHireAmount = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        comboVehicle = new javax.swing.JComboBox<>();
        startDate = new com.alee.extended.date.WebDateField();
        btnSave = new javax.swing.JButton();
        comboCustom = new javax.swing.JComboBox<>();
        txtExPrice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtHireLimit = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtAdvance = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHire = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        comboFilter = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        checkDate = new javax.swing.JCheckBox();
        webDate = new com.alee.extended.date.WebDateField();
        btnDate = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Vehicle Hire-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hire Vehicle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel7.setText("Select Vehicle");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 90, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel8.setText("Select Customer ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 110, 20));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel16.setText("Start Date");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 70, 20));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel15.setText("Hire Days");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 90, 20));

        txtHireDays.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtHireDays.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHireDaysKeyTyped(evt);
            }
        });
        jPanel2.add(txtHireDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 280, 30));

        txtStartMileage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStartMileage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStartMileageFocusLost(evt);
            }
        });
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
        jPanel2.add(txtStartMileage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 280, 30));

        txtHireAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtHireAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHireAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHireAmountActionPerformed(evt);
            }
        });
        txtHireAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHireAmountKeyTyped(evt);
            }
        });
        jPanel2.add(txtHireAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 280, 30));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("CLEAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 100, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel11.setText("Hire Amount ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 90, 20));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel12.setText("LKR");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 40, 20));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel13.setText("Extra Milage Price");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 120, 20));

        comboVehicle.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(comboVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 280, 30));

        startDate.setBorder(null);
        startDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        startDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(startDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 280, 30));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 100, 40));

        comboCustom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(comboCustom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 280, 30));

        txtExPrice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtExPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtExPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExPriceKeyTyped(evt);
            }
        });
        jPanel2.add(txtExPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 280, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel14.setText("             Advance");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 120, 20));

        txtHireLimit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtHireLimit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHireLimitKeyTyped(evt);
            }
        });
        jPanel2.add(txtHireLimit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 280, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel17.setText("Hire Start Milage");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 120, 20));

        txtAdvance.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAdvance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAdvance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAdvanceKeyTyped(evt);
            }
        });
        jPanel2.add(txtAdvance, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 280, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel18.setText("Mileage Limit");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 90, 20));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel19.setText("KM");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 40, 20));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel20.setText("KM");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 40, 20));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel21.setText("LKR");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 40, 20));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel22.setText("LKR");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 40, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 470, 570));

        tableHire.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer", "Vehicle", "Hire Amount", "Advance", "Mileage Limit", "Start Mileage", "Start Date", "Hire Days"
            }
        ));
        jScrollPane1.setViewportView(tableHire);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 730, 380));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Filter By");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 60, 20));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton2.setText("Customer");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

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
        jPanel3.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        comboFilter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select All" }));
        jPanel3.add(comboFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 310, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("FILTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 120, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 390, 150));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkDate.setBackground(new java.awt.Color(255, 255, 255));
        checkDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkDate.setText("Filter By Date");
        checkDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDateActionPerformed(evt);
            }
        });
        jPanel4.add(checkDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        webDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel4.add(webDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 230, 30));

        btnDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDate.setText("FILTER");
        btnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateActionPerformed(evt);
            }
        });
        jPanel4.add(btnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 120, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 90, 300, 150));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 20, 590));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        DateFormat df=new SimpleDateFormat("yyyy/MM/dd");   
        String getVehicle=(String) comboVehicle.getSelectedItem();
        String getCustom=(String) comboCustom.getSelectedItem();
        String getcusID=null;
        String getvehId=null;
        validateTxt();
         if (startDate.getDate()==null) {
            NotificationPopup.fillFeilds();
        }else{
             if (b == false) {
                 try {
                  String DateStart=df.format(startDate.getDate());
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
                         String insert="INSERT INTO hirevehicle(HireDate,HireDays,HireStartMilage,HireMilageLimit,idCustomer,idVehicle,HireAdvance,HireAmount,ExtraMileagePrice)"
                                 + " VALUES('"+DateStart+"','"+txtHireDays.getText()+"','"+txtStartMileage.getText()+"','"+txtHireLimit.getText()+"','"+getcusID+"','"+getvehId+"','"+txtAdvance.getText()+"','"+txtHireAmount.getText()+"','"+txtExPrice.getText()+"')";
                         DB.idu(insert);
                         
                         String insert_2="INSERT INTO incomeexpence(Date,Description,Income,Expence) VALUES('"+DateStart+"','Hire Advance','"+txtAdvance.getText()+"','0') ";
                         DB.idu(insert_2);
                     }
                     tableLoad();
                     clearField();
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
             }else{
                  NotificationPopup.fillFeilds();
             }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        clearField();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtHireAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHireAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHireAmountActionPerformed

    private void txtStartMileageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartMileageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartMileageActionPerformed

    private void txtHireDaysKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHireDaysKeyTyped
            char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtHireDaysKeyTyped

    private void txtHireAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHireAmountKeyTyped
            char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtHireAmountKeyTyped

    private void txtExPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExPriceKeyTyped
                    char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtExPriceKeyTyped

    private void txtStartMileageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartMileageKeyTyped
                    char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtStartMileageKeyTyped

    private void txtHireLimitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHireLimitKeyTyped
                    char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtHireLimitKeyTyped

    private void txtAdvanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdvanceKeyTyped
                            char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtAdvanceKeyTyped

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
                ResultSet rs=DB.search("SELECT v.*,c.*,hv.* FROM vehicle v INNER JOIN hirevehicle hv ON v.idVehicle=hv.idVehicle INNER JOIN customer c ON c.idCustomer=hv.idCustomer WHERE VehicleNumber='"+s[0]+"' ");
                DefaultTableModel dtm=(DefaultTableModel) tableHire.getModel();
                dtm.setRowCount(0);
                while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("CustomerName"));
                v.add(rs.getString("VehicleNumber"));
                v.add(rs.getString("HireAmount"));
                v.add(rs.getString("HireAdvance"));
                v.add(rs.getString("HireMilageLimit"));
                v.add(rs.getString("HireStartMilage"));
                v.add(rs.getString("HireDate"));
                v.add(rs.getString("HireDays"));
                dtm.addRow(v);
               }
              }else{
                  String selectCustomer=(String) comboFilter.getSelectedItem();
                  String[] s=selectCustomer.split(" ");
                  ResultSet rs=DB.search("SELECT v.*,c.*,hv.* FROM vehicle v INNER JOIN hirevehicle hv ON v.idVehicle=hv.idVehicle INNER JOIN customer c ON c.idCustomer=hv.idCustomer WHERE CustomerNIC='"+s[0]+"' ");
                DefaultTableModel dtm=(DefaultTableModel) tableHire.getModel();
                dtm.setRowCount(0);
                while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("CustomerName"));
                v.add(rs.getString("VehicleNumber"));
                v.add(rs.getString("HireAmount"));
                v.add(rs.getString("HireAdvance"));
                v.add(rs.getString("HireMilageLimit"));
                v.add(rs.getString("HireStartMilage"));
                v.add(rs.getString("HireDate"));
                v.add(rs.getString("HireDays"));
                dtm.addRow(v);
               }
              }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            ResultSet rs=DB.search("SELECT v.*,c.*,hv.* FROM vehicle v INNER JOIN hirevehicle hv ON v.idVehicle=hv.idVehicle INNER JOIN customer c ON c.idCustomer=hv.idCustomer WHERE HireDate='"+getDate+"' ");
                DefaultTableModel dtm=(DefaultTableModel) tableHire.getModel();
                dtm.setRowCount(0);
                while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("CustomerName"));
                v.add(rs.getString("VehicleNumber"));
                v.add(rs.getString("HireAmount"));
                v.add(rs.getString("HireAdvance"));
                v.add(rs.getString("HireMilageLimit"));
                v.add(rs.getString("HireStartMilage"));
                v.add(rs.getString("HireDate"));
                v.add(rs.getString("HireDays"));
                dtm.addRow(v);
               }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDateActionPerformed

    private void txtStartMileageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStartMileageFocusLost
        txtHireLimit.grabFocus();
    }//GEN-LAST:event_txtStartMileageFocusLost


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HireVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDate;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkDate;
    private javax.swing.JComboBox<String> comboCustom;
    private javax.swing.JComboBox<String> comboFilter;
    private javax.swing.JComboBox<String> comboVehicle;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.alee.extended.date.WebDateField startDate;
    private javax.swing.JTable tableHire;
    private javax.swing.JTextField txtAdvance;
    private javax.swing.JTextField txtExPrice;
    private javax.swing.JTextField txtHireAmount;
    private javax.swing.JTextField txtHireDays;
    private javax.swing.JTextField txtHireLimit;
    private javax.swing.JTextField txtStartMileage;
    private com.alee.extended.date.WebDateField webDate;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            HireVehicle.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            HireVehicle.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

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

    private void laodCustom() {
            try {
            ResultSet rs=DB.search("SELECT * FROM customer WHERE isDelete LIKE '1' ");
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
    
    private void clearField(){
        comboCustom.setSelectedIndex(0);
        comboVehicle.setSelectedIndex(0);
        startDate.setDate(null);
        java.awt.Component[] cp = jPanel2.getComponents();
        for (java.awt.Component c : cp) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText(null);
            }
        }
    }

    private void tableLoad() {
       try {
            ResultSet rs=DB.search("SELECT v.*,c.*,hv.* FROM vehicle v INNER JOIN hirevehicle hv ON v.idVehicle=hv.idVehicle INNER JOIN customer c ON c.idCustomer=hv.idCustomer  ORDER BY HireDate DESC");
            DefaultTableModel dtm=(DefaultTableModel) tableHire.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("CustomerName"));
                v.add(rs.getString("VehicleNumber"));
                v.add(rs.getString("HireAmount"));
                v.add(rs.getString("HireAdvance"));
                v.add(rs.getString("HireMilageLimit"));
                v.add(rs.getString("HireStartMilage"));
                v.add(rs.getString("HireDate"));
                v.add(rs.getString("HireDays"));
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
}
