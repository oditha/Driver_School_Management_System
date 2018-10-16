
package Vehicle;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import ExtenelClasses.df;
import MainMenu.*;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VehicleMaintance extends javax.swing.JFrame {
static boolean maximized = true;
boolean b = false;
    public VehicleMaintance() {
        initComponents();
        maximizeWindow();
        setDate();
        setVehicle();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtGarageName = new javax.swing.JTextField();
        comboVehicleNo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtBillNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        setDate = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPartName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMaintain = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        comboPaymentType = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClearSelected = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtWorkerCost = new javax.swing.JTextField();
        txtCostPerParts = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vehicle Maintain-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1350, 690));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicle Service", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16)), "Vehicle Maintain", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel1.setText("Vehicle No");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, 20));

        txtGarageName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtGarageName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGarageNameFocusLost(evt);
            }
        });
        txtGarageName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGarageNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtGarageName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 420, 30));

        comboVehicleNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboVehicleNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboVehicleNoFocusLost(evt);
            }
        });
        jPanel2.add(comboVehicleNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 420, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("Garage Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 20));

        txtBillNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBillNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBillNoFocusLost(evt);
            }
        });
        txtBillNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillNoActionPerformed(evt);
            }
        });
        jPanel2.add(txtBillNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 420, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel4.setText("Bill No");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, 20));

        setDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setDate.setText("set date here");
        jPanel2.add(setDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 120, 20));

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 210, 120, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel12.setText("Date");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 70, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel2.setText("Part Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 20));

        txtPartName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPartName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPartNameFocusLost(evt);
            }
        });
        txtPartName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPartNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtPartName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 390, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel5.setText("Unit Price");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, 20));

        txtUnitPrice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtUnitPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtUnitPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUnitPriceFocusLost(evt);
            }
        });
        txtUnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPriceActionPerformed(evt);
            }
        });
        txtUnitPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnitPriceKeyTyped(evt);
            }
        });
        jPanel3.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 390, 30));

        txtQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtQty.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtyFocusLost(evt);
            }
        });
        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQtyKeyTyped(evt);
            }
        });
        jPanel3.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 390, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel13.setText("Qty");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 20));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel14.setText("LKR");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 540, 180));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 1110, 260));

        tableMaintain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle No", "Garage Name", "Bill No", "Date", "Part Name", "Unit Price", "Qty", "Total"
            }
        ));
        jScrollPane1.setViewportView(tableMaintain);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 1110, 170));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel9.setText("Payment Type");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, 120, 20));

        comboPaymentType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboPaymentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Cheque" }));
        jPanel1.add(comboPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 420, 30));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 640, 120, 40));

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 640, 120, 40));

        btnClearSelected.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnClearSelected.setText("CLEAR SELECTED");
        btnClearSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSelectedActionPerformed(evt);
            }
        });
        jPanel1.add(btnClearSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 180, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("CLEAR ALL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 120, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel7.setText("Cost Per Parts");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel8.setText("Worker Cost");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 120, 20));

        txtWorkerCost.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWorkerCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtWorkerCost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtWorkerCostMouseClicked(evt);
            }
        });
        txtWorkerCost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWorkerCostKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWorkerCostKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWorkerCostKeyTyped(evt);
            }
        });
        jPanel4.add(txtWorkerCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 420, 30));

        txtCostPerParts.setEditable(false);
        txtCostPerParts.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCostPerParts.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(txtCostPerParts, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 420, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel10.setText("Sub Total");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 120, 20));

        txtSubTotal.setEditable(false);
        txtSubTotal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSubTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 420, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 570, 150));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel11.setText("LKR");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 600, -1, 20));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel15.setText("LKR");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 500, -1, 20));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel16.setText("LKR");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 550, -1, 20));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtGarageNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGarageNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGarageNameActionPerformed

    private void txtPartNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPartNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPartNameActionPerformed

    private void txtBillNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBillNoActionPerformed

    private void txtUnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPriceActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String getVehicle=(String) comboVehicleNo.getSelectedItem();
        String getId=null;   
        String getMainId=null;
        DefaultTableModel dtm=(DefaultTableModel) tableMaintain.getModel();
        int x=tableMaintain.getRowCount();
        try {
                validateTxt();
                if (b == false) {
                if (x != 0) {
                   String[] getVehicleId=getVehicle.split(" "); 
                   ResultSet rs1=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+getVehicleId[0]+"' ");
                   while (rs1.next()) {
                     getId=rs1.getString("idVehicle");
                   } 
                    String insert_2="INSERT INTO vehiclemaintanence(garageName,costPerpart,workercost,PaymentType,idVehicle,BillNo,MaintainDate) VALUES('"+txtGarageName.getText()+"','"+txtCostPerParts.getText()+"','"+txtWorkerCost.getText()+"','"+comboPaymentType.getSelectedItem()+"','"+getId+"','"+txtBillNo.getText()+"','"+setDate.getText()+"') ";
                    DB.idu(insert_2);
                    for (int i = 0; i < dtm.getRowCount(); i++) {
                      String s1 = dtm.getValueAt(i, 0).toString();
                      String s2 = dtm.getValueAt(i, 1).toString();
                      String s3 = dtm.getValueAt(i, 2).toString();
                      String s4 = dtm.getValueAt(i, 3).toString();
                      String s5 = dtm.getValueAt(i, 4).toString();
                      String s6 = dtm.getValueAt(i, 5).toString();
                      String s7 = dtm.getValueAt(i, 6).toString();
                      String s8 = dtm.getValueAt(i, 7).toString();
                      
                      ResultSet rs2=DB.search("SELECT * FROM vehiclemaintanence ORDER BY idVehicleMaintanence DESC LIMIT 1;");
                        if (rs2.next()) {
                            getMainId=rs2.getString("idVehicleMaintanence");
                        }                      
                      String insert_1="INSERT INTO spirepartmaintanence(PartName,UnitPrice,QTY,SubTotal,idVehicleMaintanence) VALUES('"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+getMainId+"')";
                      DB.idu(insert_1);
                    }
                    if (comboPaymentType.getSelectedIndex()==0) {
                         String insert_3="INSERT INTO incomeexpence(Date,Description,Income,Expence) VALUES('"+setDate.getText()+"','Vehicle Maintain','0','"+txtSubTotal.getText()+"') ";
                         DB.idu(insert_3);
                    }
                    }else{
                        NotificationPopup.fillFeilds();
                    }    
                     clearField();
                }else{
                    NotificationPopup.fillFeilds();
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
            validateTxt();
            if (b == false) {
            if (txtPartName.getText().isEmpty()) {
                NotificationPopup.fillFeilds();
            }else if (txtUnitPrice.getText().isEmpty()) {
                NotificationPopup.fillFeilds();
            }else if (txtQty.getText().isEmpty()) {
                NotificationPopup.fillFeilds();
            }else{
              Double d1=Double.parseDouble(txtUnitPrice.getText());
              Double d2=Double.parseDouble(txtQty.getText());    
              int x=Integer.parseInt(txtUnitPrice.getText());
              int y=Integer.parseInt(txtQty.getText());
                
              DefaultTableModel dtm=(DefaultTableModel)tableMaintain.getModel();
              String getVehicle=(String) comboVehicleNo.getSelectedItem();
              String[] s=getVehicle.split(" ");
              String getVehicleId=s[0];
              Vector v = new Vector();
              v.add(getVehicleId);
              v.add(txtGarageName.getText());
              v.add(txtBillNo.getText());
              v.add(setDate.getText());
              v.add(txtPartName.getText());
              v.add(txtUnitPrice.getText());
              v.add(txtQty.getText());
              v.add(x*y);
              dtm.addRow(v);
              
              Double sum=Double.parseDouble(txtCostPerParts.getText());
              Double getsum=d1*d2;
              sum=getsum+sum;
              txtCostPerParts.setText(df.dcf(sum));
              
              Double sum1=Double.parseDouble(txtSubTotal.getText());
              Double getsum1=d1*d2;
              sum1=getsum1+sum1;
              txtSubTotal.setText(df.dcf(sum1));
              
              txtUnitPrice.setText("");
              txtQty.setText("");
              txtPartName.setText("");
              txtPartName.grabFocus();
            }  
             }else{
                  NotificationPopup.fillFeilds();
             }              
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSelectedActionPerformed
            Double sum=null;
            
            int selectedRow = tableMaintain.getSelectedRow();
            DefaultTableModel dtm=(DefaultTableModel) tableMaintain.getModel();
            dtm.removeRow(selectedRow);
            txtWorkerCost.setText("0.00");
            
            int x=tableMaintain.getRowCount();
            if (x==0) {
                txtCostPerParts.setText("0.00"); 
                txtSubTotal.setText("0.00");
            }else{
                sum=0.00;
                for (int i = 0; i < dtm.getRowCount(); i++) {                   
                String s1 = dtm.getValueAt(i, 7).toString();
                Double getsum=Double.parseDouble(s1);
                sum=getsum+sum;
                txtCostPerParts.setText(df.dcf(sum));
                txtSubTotal.setText(df.dcf(sum));
           }
            }
    }//GEN-LAST:event_btnClearSelectedActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel dtm=(DefaultTableModel) tableMaintain.getModel();
        dtm.setRowCount(0);
        txtCostPerParts.setText("0.00");
        txtWorkerCost.setText("0.00");
        txtSubTotal.setText("0.00");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboVehicleNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboVehicleNoFocusLost
        //txtGarageName.grabFocus();
    }//GEN-LAST:event_comboVehicleNoFocusLost

    private void txtGarageNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGarageNameFocusLost
        //txtBillNo.grabFocus();
    }//GEN-LAST:event_txtGarageNameFocusLost

    private void txtBillNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBillNoFocusLost
        txtPartName.grabFocus();
    }//GEN-LAST:event_txtBillNoFocusLost

    private void txtPartNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPartNameFocusLost
        //txtUnitPrice.grabFocus();   
    }//GEN-LAST:event_txtPartNameFocusLost

    private void txtUnitPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnitPriceFocusLost
        //txtQty.grabFocus();
    }//GEN-LAST:event_txtUnitPriceFocusLost

    private void txtQtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtyFocusLost
        //txtCostPerParts.grabFocus();
    }//GEN-LAST:event_txtQtyFocusLost

    private void txtWorkerCostKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWorkerCostKeyPressed

    }//GEN-LAST:event_txtWorkerCostKeyPressed

    private void txtWorkerCostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWorkerCostMouseClicked
        txtWorkerCost.setText("");
    }//GEN-LAST:event_txtWorkerCostMouseClicked

    private void txtWorkerCostKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWorkerCostKeyReleased
            Double getPartCost=Double.parseDouble(txtCostPerParts.getText());
            Double getWorkerCost=Double.parseDouble(txtWorkerCost.getText());
            Double sum=getPartCost+getWorkerCost;
            txtSubTotal.setText(""+sum);
    }//GEN-LAST:event_txtWorkerCostKeyReleased

    private void txtUnitPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnitPriceKeyTyped
               char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUnitPriceKeyTyped

    private void txtQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyTyped
                char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtQtyKeyTyped

    private void txtWorkerCostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWorkerCostKeyTyped
                char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtWorkerCostKeyTyped

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
          clearField();
    }//GEN-LAST:event_btnClearActionPerformed


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleMaintance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearSelected;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboPaymentType;
    private javax.swing.JComboBox<String> comboVehicleNo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel setDate;
    private javax.swing.JTable tableMaintain;
    private javax.swing.JTextField txtBillNo;
    private javax.swing.JTextField txtCostPerParts;
    private javax.swing.JTextField txtGarageName;
    private javax.swing.JTextField txtPartName;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtUnitPrice;
    private javax.swing.JTextField txtWorkerCost;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            VehicleMaintance.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            VehicleMaintance.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }
    
    private void setDate() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        Date d=new Date();
        setDate.setText(sdf.format(d));
    }

    private void setVehicle() {
                try {
            ResultSet rs=DB.search("SELECT * FROM vehicle");
            while (rs.next()) {
                String getVehicleNo=rs.getString("VehicleNumber");
                String getVehicleModel=rs.getString("model");
                
                comboVehicleNo.addItem(getVehicleNo+" ("+getVehicleModel+")");
                txtSubTotal.setText("0.00");
                txtCostPerParts.setText("0.00");
                txtWorkerCost.setText("0.00");
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
        
        private void clearField(){
           comboVehicleNo.setSelectedIndex(0);
           comboPaymentType.setSelectedIndex(0);
           txtCostPerParts.setText("0.00");
           txtWorkerCost.setText("0.00");
           txtSubTotal.setText("0.00");
           DefaultTableModel dtm=(DefaultTableModel) tableMaintain.getModel();
           dtm.setRowCount(0);
           
        java.awt.Component[] cp = jPanel1.getComponents();
        for (java.awt.Component c : cp) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText(null);
            }
        }
        java.awt.Component[] cp1 = jPanel2.getComponents();
        for (java.awt.Component c1 : cp1) {
            if (c1 instanceof JTextField) {
                ((JTextField) c1).setText(null);
            }
        }
        setDate();
       }
}
