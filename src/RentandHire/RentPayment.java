
package RentandHire;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import Student.*;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static sun.net.www.MimeTable.loadTable;

public class RentPayment extends javax.swing.JFrame {
static boolean maximized = true;
boolean b=false;
    public RentPayment() {
        initComponents();
        maximizeWindow();
        autoSetDate();
        setVehicle();
        tableLoad();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        txtDriveMileage = new javax.swing.JTextField();
        txtstartMilage = new javax.swing.JTextField();
        txtCustom = new javax.swing.JTextField();
        txtNetAmount = new javax.swing.JTextField();
        txtRentPayment = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        setDate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEndMileage = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboVehicle = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtOtherPay = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        monthlyLimit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAdvance = new javax.swing.JTextField();
        txtExPayment = new javax.swing.JTextField();
        txtIssueDate = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRentPayment = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rent Payment-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rent Payement", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 320, 120, 40));

        txtDriveMileage.setEditable(false);
        txtDriveMileage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDriveMileage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDriveMileageFocusLost(evt);
            }
        });
        txtDriveMileage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDriveMileageActionPerformed(evt);
            }
        });
        jPanel2.add(txtDriveMileage, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 320, 30));

        txtstartMilage.setEditable(false);
        txtstartMilage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtstartMilage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtstartMilageFocusLost(evt);
            }
        });
        jPanel2.add(txtstartMilage, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 320, 30));

        txtCustom.setEditable(false);
        txtCustom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txtCustom, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 320, 30));

        txtNetAmount.setEditable(false);
        txtNetAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNetAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNetAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNetAmountActionPerformed(evt);
            }
        });
        jPanel2.add(txtNetAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 320, 30));

        txtRentPayment.setEditable(false);
        txtRentPayment.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtRentPayment.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRentPayment.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRentPaymentFocusLost(evt);
            }
        });
        jPanel2.add(txtRentPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 320, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel1.setText("Vehicle");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 70, 20));

        setDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setDate.setText("set date here");
        jPanel2.add(setDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 90, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel4.setText("Month Start Mileage");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel6.setText("Rent Payment");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 90, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel7.setText("Extra Milage Price");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 120, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel9.setText("Net Total");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 60, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel11.setText("Customer");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 90, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel10.setText("Month Ending Mileage");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, 20));

        txtEndMileage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEndMileage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEndMileageFocusLost(evt);
            }
        });
        txtEndMileage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndMileageActionPerformed(evt);
            }
        });
        txtEndMileage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEndMileageKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEndMileageKeyTyped(evt);
            }
        });
        jPanel2.add(txtEndMileage, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 320, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("          Date");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 70, 20));

        comboVehicle.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboVehicle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Vehicle" }));
        comboVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVehicleActionPerformed(evt);
            }
        });
        jPanel2.add(comboVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 320, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel8.setText("Other Payment");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, 20));

        txtOtherPay.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtOtherPay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtOtherPay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOtherPayFocusLost(evt);
            }
        });
        txtOtherPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtherPayActionPerformed(evt);
            }
        });
        txtOtherPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOtherPayKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOtherPayKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOtherPayKeyTyped(evt);
            }
        });
        jPanel3.add(txtOtherPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 320, 30));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel22.setText("LKR");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 520, 50));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel12.setText("Driven Mileage");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 100, 20));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel13.setText("Driven Limit");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 100, 20));

        monthlyLimit.setEditable(false);
        monthlyLimit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(monthlyLimit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 320, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel2.setText("Adavnce");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 70, 20));

        txtAdvance.setEditable(false);
        txtAdvance.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAdvance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(txtAdvance, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 320, 30));

        txtExPayment.setEditable(false);
        txtExPayment.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtExPayment.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtExPayment.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtExPaymentFocusLost(evt);
            }
        });
        jPanel2.add(txtExPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 320, 30));

        txtIssueDate.setEditable(false);
        txtIssueDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txtIssueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 320, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel15.setText("KM");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 30, 20));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel16.setText("Issue Date");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, 20));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel18.setText("KM");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 30, 20));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel19.setText("KM");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 30, 20));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel20.setText("KM");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 30, 20));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel21.setText("LKR");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 250, 30, 20));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel17.setText("LKR");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 50, -1, 20));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel23.setText("LKR");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 150, -1, 20));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel24.setText("LKR");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 100, -1, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 1090, 390));

        tableRentPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle", "Customer", "Start Mileage", "Driven Mileage", "Driven Limit", "Rent Amount", "Extra Mileage Price", "Net Total", "Date"
            }
        ));
        tableRentPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRentPaymentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableRentPayment);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 1090, 240));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDriveMileageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDriveMileageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDriveMileageActionPerformed

    private void txtEndMileageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndMileageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndMileageActionPerformed

    private void txtNetAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNetAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNetAmountActionPerformed

    private void txtstartMilageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtstartMilageFocusLost
        //txtEndMileage.grabFocus();
    }//GEN-LAST:event_txtstartMilageFocusLost

    private void txtEndMileageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEndMileageFocusLost
        monthlyLimit.grabFocus();
    }//GEN-LAST:event_txtEndMileageFocusLost

    private void txtDriveMileageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDriveMileageFocusLost
        //txtRentPayment.grabFocus();
    }//GEN-LAST:event_txtDriveMileageFocusLost

    private void txtRentPaymentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRentPaymentFocusLost
        //txtExPayment.grabFocus();
    }//GEN-LAST:event_txtRentPaymentFocusLost

    private void txtExPaymentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtExPaymentFocusLost
        //txtOtherPay.grabFocus();
    }//GEN-LAST:event_txtExPaymentFocusLost

    private void comboVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVehicleActionPerformed
        String getvehId=null;
        String getVehicle=(String) comboVehicle.getSelectedItem();
        try {
             String[] getVehicleId=getVehicle.split(" ");
                  ResultSet rs=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+getVehicleId[0]+"' ");
                  while (rs.next()) {
                      getvehId=rs.getString("idVehicle");
                  }
            ResultSet rs1=DB.search("SELECT v.*,rv.*,c.* FROM vehicle v INNER JOIN rentvehicle rv ON v.idVehicle=rv.idVehicle INNER JOIN customer c ON c.idCustomer=rv.idCustomer  WHERE rv.idVehicle='"+getvehId+"' AND rv.isDelete='1' ");
            if (rs1.next()) {
                String s1=rs1.getString("CustomerName");
                txtCustom.setText(s1);
                String s2=rs1.getString("StartMilage");
                txtstartMilage.setText(s2);
                String s3=rs1.getString("RentAmount");
                txtRentPayment.setText(s3);
                String s4=rs1.getString("Advance");
                txtAdvance.setText(s4);
                String s5=rs1.getString("MonthlyMilageLimit");
                monthlyLimit.setText(s5);
                String s6=rs1.getString("RentStartDate");
                txtIssueDate.setText(s6);
                
                txtEndMileage.grabFocus();
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_comboVehicleActionPerformed

    private void txtEndMileageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEndMileageKeyReleased
        String getvehId=null;
        String getMonthLimit=null;
        String getExCost=null;
        Double d1=null;
        Double d2=null;
        String getVehicle=(String) comboVehicle.getSelectedItem();
        if (evt.getKeyCode()==10) {
            try {
                  String[] getVehicleId=getVehicle.split(" ");
                  ResultSet rs=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+getVehicleId[0]+"' ");
                  while (rs.next()) {
                      getvehId=rs.getString("idVehicle");
                  }
               ResultSet rs1=DB.search("SELECT * FROM rentvehicle WHERE  idVehicle='"+getvehId+"' "); 
                if (rs1.next()) {
                    getMonthLimit=rs1.getString("MonthlyMilageLimit");
                    getExCost=rs1.getString("ExtraMileCost");
                    d1=Double.parseDouble(getMonthLimit);
                    d2=Double.parseDouble(getExCost);
                    
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            Double d6=Double.parseDouble(txtstartMilage.getText());
            Double d7=Double.parseDouble(txtEndMileage.getText());
            Double d8=d7-d6;
            txtDriveMileage.setText(""+d8);
            txtOtherPay.grabFocus();
                Double d3=Double.parseDouble(txtDriveMileage.getText());
                if (d1<d3) {
                    Double d4=d3-d1;
                    Double d5=d4*d2;
                    txtExPayment.setText(""+d5);

                }else{
                    txtExPayment.setText("0");
                    
                }
                Double dd1=Double.parseDouble(txtRentPayment.getText());
                Double dd=Double.parseDouble(txtAdvance.getText());
                Double ddd=dd1-dd;
                Double dd2=Double.parseDouble(txtExPayment.getText());
                Double dd3=ddd+dd2;
                txtNetAmount.setText(""+dd3);
        }
    }//GEN-LAST:event_txtEndMileageKeyReleased

    private void txtOtherPayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOtherPayFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOtherPayFocusLost

    private void txtOtherPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtherPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOtherPayActionPerformed

    private void txtOtherPayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOtherPayKeyReleased
        if (evt.getKeyCode()==10) {
            Double getnetamount=Double.parseDouble(txtNetAmount.getText());
            Double getOtherAmount=Double.parseDouble(txtOtherPay.getText());
            Double sum=getnetamount+getOtherAmount;
            txtNetAmount.setText(""+sum);
        }
    }//GEN-LAST:event_txtOtherPayKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        String getvehId=null;
        String getRentId=null;
        try {
            validateTxt();
            if (b == false) {
               String getVehicle=(String) comboVehicle.getSelectedItem();
               String[] getVehicleId=getVehicle.split(" ");
               ResultSet rs=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+getVehicleId[0]+"' ");
                while (rs.next()) {
                     getvehId=rs.getString("idVehicle");
                }
                
               ResultSet rs1=DB.search("SELECT * FROM rentvehicle WHERE idVehicle='"+getvehId+"'");
               while (rs1.next()) {                
                 getRentId=rs1.getString("idRent");

            }
               if (txtOtherPay.getText().isEmpty()) {
                       String insert="INSERT INTO rentpayments(PaymentDate,MonthStartMilage,MonthEndingMilage,DrivenKM,RentPayment,ExtraMilagePayment,OtherPayments,totalPayment,idRent)"
                       + " VALUES('"+setDate.getText()+"','"+txtstartMilage.getText()+"','"+txtEndMileage.getText()+"','"+txtDriveMileage.getText()+"','"+txtRentPayment.getText()+"','"+txtExPayment.getText()+"','0','"+txtNetAmount.getText()+"','"+getRentId+"')";
                       DB.idu(insert);
              }else{
                       String insert="INSERT INTO rentpayments(PaymentDate,MonthStartMilage,MonthEndingMilage,DrivenKM,RentPayment,ExtraMilagePayment,OtherPayments,totalPayment,idRent)"
                       + " VALUES('"+setDate.getText()+"','"+txtstartMilage.getText()+"','"+txtEndMileage.getText()+"','"+txtDriveMileage.getText()+"','"+txtRentPayment.getText()+"','"+txtExPayment.getText()+"','"+txtOtherPay.getText()+"','"+txtNetAmount.getText()+"','"+getRentId+"')";
                       DB.idu(insert);                   

               }
               
               String update="UPDATE rentvehicle SET isDelete='0' WHERE idVehicle='"+getvehId+"' ";
               DB.idu(update);
              
               
               String insert_2="INSERT INTO incomeexpence(Date,Description,Income,Expence) VALUES('"+setDate.getText()+"','rent payment','"+txtNetAmount.getText()+"','0') ";
               DB.idu(insert_2);
               
               tableLoad();
            }else{
                NotificationPopup.fillFeilds();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tableRentPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRentPaymentMouseClicked
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
//        String getRentId=null;
//        String getVehId=null;
//        try {
//            int x=tableRentPayment.getSelectedRow();
//            String ss1=(tableRentPayment.getModel().getValueAt(x,0).toString());
//            String ss2=(tableRentPayment.getModel().getValueAt(x,2).toString());
//            ResultSet rs1=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+ss1+"'");
//            while (rs1.next()) {                
//                getVehId=rs1.getString("idVehicle");
//            }
//            ResultSet rs2=DB.search("SELECT v.*,rv.* FROM vehicle v INNER JOIN rentvehicle rv ON v.idVehicle=rv.idVehicle WHERE rv.idVehicle='"+getVehId+"' AND StartMilage='"+ss2+"' ");
//            if (rs2.next()) {
//                getRentId=rs2.getString("idRent");
//            }
//            ResultSet rs3=DB.search("SELECT v.*,rv.*,c.*,rp.* FROM vehicle v INNER JOIN rentvehicle rv ON v.idVehicle=rv.idVehicle INNER JOIN customer c ON c.idCustomer=rv.idCustomer INNER JOIN rentpayments rp ON rv.idRent=rp.RentVehicle_idRent WHERE idRent='"+getRentId+"' ");
//            while (rs3.next()) {                
//                String s0=rs3.getString("VehicleNumber");
//                String s1=rs3.getString("model");
//                comboVehicle.removeAllItems();
//                comboVehicle.addItem(s0+" ("+s1+")");
//                String s2=rs3.getString("CustomerName");
//                txtCustom.setText(s2);
//                String s3=rs3.getString("StartMilage");
//                txtstartMilage.setText(s3);
//                String s4=rs3.getString("MonthEndingMilage");
//                txtEndMileage.setText(s4);
//                String s5=rs3.getString("DrivenKM");
//                txtDriveMileage.setText(s5);
//                String s6=rs3.getString("MonthlyMilageLimit");
//                monthlyLimit.setText(s6);
//                String s7=rs3.getString("RentAmount");
//                txtRentPayment.setText(s7);
//                String s8=rs3.getString("Advance");
//                txtAdvance.setText(s8);
//                String s9=rs3.getString("ExtraMilagePayment");
//                txtExPayment.setText(s9);
//                String s10=rs3.getString("OtherPayments");
//                txtOtherPay.setText(s10);
//                String s11=rs3.getString("totalPayment");
//                txtNetAmount.setText(s11);
//                String s12=rs3.getString("PaymentDate");
//                setDate.setText(s12);
//                btnSave.setText("UPDATE");
//            }
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_tableRentPaymentMouseClicked

    private void txtOtherPayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOtherPayKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOtherPayKeyPressed

    private void txtEndMileageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEndMileageKeyTyped
                                    char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtEndMileageKeyTyped

    private void txtOtherPayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOtherPayKeyTyped
                                    char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtOtherPayKeyTyped


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboVehicle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monthlyLimit;
    private javax.swing.JLabel setDate;
    private javax.swing.JTable tableRentPayment;
    private javax.swing.JTextField txtAdvance;
    private javax.swing.JTextField txtCustom;
    private javax.swing.JTextField txtDriveMileage;
    private javax.swing.JTextField txtEndMileage;
    private javax.swing.JTextField txtExPayment;
    private javax.swing.JTextField txtIssueDate;
    private javax.swing.JTextField txtNetAmount;
    private javax.swing.JTextField txtOtherPay;
    private javax.swing.JTextField txtRentPayment;
    private javax.swing.JTextField txtstartMilage;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            RentPayment.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            RentPayment.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void autoSetDate() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        Date d=new Date();
        setDate.setText(sdf.format(d));
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

    private void setVehicle() {
        try {
            ResultSet rs=DB.search("SELECT v.*,rv.* FROM vehicle v INNER JOIN rentvehicle rv ON v.idVehicle=rv.idVehicle WHERE isDelete='1' ");
            while (rs.next()) {                
                String getVehicleNo=rs.getString("VehicleNumber");
                String getVehicleModel=rs.getString("model");
                
                comboVehicle.addItem(getVehicleNo+" ("+getVehicleModel+")");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void tableLoad() {
        try {
            
            ResultSet rs=DB.search("SELECT c.*,v.*,rv.*,rp .* FROM customer c INNER JOIN rentvehicle rv ON c.idCustomer=rv.idCustomer INNER JOIN vehicle v ON rv.idVehicle=v.idVehicle INNER JOIN rentpayments rp ON rv.idRent=rp.idRent ORDER BY RentEndingDate DESC");
            DefaultTableModel dtm=(DefaultTableModel) tableRentPayment.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {  
                Vector v=new Vector();
                v.add(rs.getString("VehicleNumber"));
                v.add(rs.getString("CustomerName"));
                v.add(rs.getString("StartMilage"));
                v.add(rs.getString("DrivenKM"));
                v.add(rs.getString("MonthlyMilageLimit"));
                v.add(rs.getString("RentAmount"));
                v.add(rs.getString("ExtraMileCost"));
                v.add(rs.getString("totalPayment"));
                v.add(rs.getString("PaymentDate"));
                dtm.addRow(v);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
