
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

public class VehicleService extends javax.swing.JFrame {
static boolean maximized = true;
boolean b = false;
    public VehicleService() {
        initComponents();
        maximizeWindow();
        autoSetDate();
        setVehicle();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtServiceName = new javax.swing.JTextField();
        comboVehicleNo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtBillNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtServiceMileage = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        setDate = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPartName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableService = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        comboPaymentType = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnClearSelected = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCostPerParts = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtWorkerCost = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vehicle Service-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1350, 690));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicle Service", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16)), "Vehicle Service", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel1.setText("Vehicle No");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 20));

        txtServiceName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtServiceName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtServiceNameFocusLost(evt);
            }
        });
        txtServiceName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServiceNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtServiceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 380, 30));

        comboVehicleNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboVehicleNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboVehicleNoFocusLost(evt);
            }
        });
        comboVehicleNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVehicleNoActionPerformed(evt);
            }
        });
        jPanel2.add(comboVehicleNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 380, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("Service Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, 20));

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
        jPanel2.add(txtBillNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 380, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel4.setText("Bill No");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, 20));

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 210, 120, 40));

        txtServiceMileage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtServiceMileage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtServiceMileageFocusLost(evt);
            }
        });
        txtServiceMileage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServiceMileageActionPerformed(evt);
            }
        });
        txtServiceMileage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtServiceMileageKeyTyped(evt);
            }
        });
        jPanel2.add(txtServiceMileage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 350, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel11.setText("Next Service Mileage");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, 20));

        setDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setDate.setText("set date here");
        jPanel2.add(setDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 80, 20));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel19.setText("Date");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 50, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel2.setText("Part Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 120, 20));

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
        jPanel3.add(txtPartName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 390, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel5.setText("Unit Price");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 120, 20));

        txtUnitPrice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtUnitPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
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
        jPanel3.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 390, 30));

        txtQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtQty.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
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
        jPanel3.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 390, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel13.setText("LKR");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, 20));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel16.setText("Qty");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 120, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 540, 170));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel12.setText("KM");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 30, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 1110, 260));

        tableService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle No", "Service Name", "Bill No", "Date", "Next Service Mileage", "Part Name", "Unit Price", "Qty", "Total"
            }
        ));
        jScrollPane1.setViewportView(tableService);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 1110, 170));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel9.setText("Payment Type");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, 120, 20));

        comboPaymentType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboPaymentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Cheque" }));
        jPanel1.add(comboPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 410, 30));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 640, 120, 40));

        btnClearSelected.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnClearSelected.setText("CLEAR SELECTED");
        btnClearSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSelectedActionPerformed(evt);
            }
        });
        jPanel1.add(btnClearSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 150, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("CLEAR TABLE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 120, 30));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 640, 120, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel7.setText("Cost Per Parts");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 120, 20));

        txtCostPerParts.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCostPerParts.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(txtCostPerParts, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 410, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel8.setText("Worker Cost");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 120, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel10.setText("Sub Total");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 120, 20));

        txtSubTotal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSubTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 410, 30));

        txtWorkerCost.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWorkerCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtWorkerCost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtWorkerCostMouseClicked(evt);
            }
        });
        txtWorkerCost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWorkerCostKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWorkerCostKeyTyped(evt);
            }
        });
        jPanel4.add(txtWorkerCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 410, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel6.setText("LKR");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, 20));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel14.setText("LKR");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, 20));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel15.setText("LKR");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 630, 150));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtServiceNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServiceNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServiceNameActionPerformed

    private void txtPartNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPartNameActionPerformed

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
           String getServiceId=null;
           DefaultTableModel dtm=(DefaultTableModel) tableService.getModel();
           int x=tableService.getRowCount();
           try {
            validateTxt();
               if (b == false) {
                if (x !=0) {  
                String[] getVehicleId=getVehicle.split(" ");
                ResultSet rs1=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+getVehicleId[0]+"' ");
                while (rs1.next()) {
                    getId=rs1.getString("idVehicle");
                }
                String insert_2="INSERT INTO vehicleservice(ServiceName,BillNo,idVehicle,NextServiceMilage,Date,costPerPart,workerFee,PaymentType) VALUES('"+txtServiceName.getText()+"','"+txtBillNo.getText()+"','"+getId+"','"+txtServiceMileage.getText()+"','"+setDate.getText()+"','"+txtCostPerParts.getText()+"','"+txtWorkerCost.getText()+"','"+comboPaymentType.getSelectedItem()+"') ";
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
                      String s9 = dtm.getValueAt(i, 8).toString();
                                            
                      ResultSet rs2=DB.search("SELECT * FROM vehicleservice ORDER BY idVehicleService DESC LIMIT 1;");
                      if (rs2.next()) {
                          getServiceId=rs2.getString("idVehicleService");
                     }
                      
                      String insert_1="INSERT INTO servicespirepart(PartName,UnitPrice,QTY,SubTotal,idVehicleService) VALUES('"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+getServiceId+"') ";
                      DB.idu(insert_1);
                   }   
                    if (comboPaymentType.getSelectedIndex()==0) {
                         String insert_3="INSERT INTO incomeexpence(Date,Description,Income,Expence) VALUES('"+setDate.getText()+"','Vehicle Service','0','"+txtSubTotal.getText()+"') ";
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
              
              DefaultTableModel dtm=(DefaultTableModel)tableService.getModel();
              String getVehicle=(String) comboVehicleNo.getSelectedItem();
              String[] s=getVehicle.split(" ");
              String getVehicleId=s[0];
              Vector v = new Vector();
              v.add(getVehicleId);
              v.add(txtServiceName.getText());
              v.add(txtBillNo.getText());
              v.add(setDate.getText());
              v.add(txtServiceMileage.getText());
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

    private void txtServiceMileageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServiceMileageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServiceMileageActionPerformed

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

    private void txtServiceMileageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServiceMileageKeyTyped
               char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtServiceMileageKeyTyped

    private void btnClearSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSelectedActionPerformed
            Double sum=null;
            int selectedRow = tableService.getSelectedRow();
            DefaultTableModel dtm=(DefaultTableModel) tableService.getModel();
            dtm.removeRow(selectedRow);
            txtWorkerCost.setText("0.00");
            
            int x=tableService.getRowCount();
            if (x==0) {
                txtCostPerParts.setText("0.00"); 
                txtSubTotal.setText("0.00");
           }else{
                sum=0.00;
                for (int i = 0; i < dtm.getRowCount(); i++) {                   
                String s1 = dtm.getValueAt(i, 8).toString();
                Double getsum=Double.parseDouble(s1);
                sum=getsum+sum;
                txtCostPerParts.setText(df.dcf(sum)); 
                txtSubTotal.setText(df.dcf(sum));
           }
            }
    }//GEN-LAST:event_btnClearSelectedActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel dtm=(DefaultTableModel) tableService.getModel();
        dtm.setRowCount(0);
        txtCostPerParts.setText("0.00");
        txtWorkerCost.setText("0.00");
        txtSubTotal.setText("0.00");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtWorkerCostKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWorkerCostKeyReleased
            Double getPartCost=Double.parseDouble(txtCostPerParts.getText());
            Double getWorkerCost=Double.parseDouble(txtWorkerCost.getText());
            Double sum=getPartCost+getWorkerCost;
            txtSubTotal.setText(""+sum);
    }//GEN-LAST:event_txtWorkerCostKeyReleased

    private void txtWorkerCostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWorkerCostMouseClicked
        txtWorkerCost.setText("");
    }//GEN-LAST:event_txtWorkerCostMouseClicked

    private void txtServiceNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtServiceNameFocusLost
        txtBillNo.grabFocus();
    }//GEN-LAST:event_txtServiceNameFocusLost

    private void txtBillNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBillNoFocusLost
        txtServiceMileage.grabFocus();
    }//GEN-LAST:event_txtBillNoFocusLost

    private void txtServiceMileageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtServiceMileageFocusLost
        txtPartName.grabFocus();
    }//GEN-LAST:event_txtServiceMileageFocusLost

    private void comboVehicleNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboVehicleNoFocusLost
        
    }//GEN-LAST:event_comboVehicleNoFocusLost

    private void comboVehicleNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVehicleNoActionPerformed
        //txtServiceName.grabFocus();
    }//GEN-LAST:event_comboVehicleNoActionPerformed

    private void txtPartNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPartNameFocusLost
        
    }//GEN-LAST:event_txtPartNameFocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            clearField();
    }//GEN-LAST:event_jButton3ActionPerformed


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClearSelected;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboPaymentType;
    private javax.swing.JComboBox<String> comboVehicleNo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel setDate;
    private javax.swing.JTable tableService;
    private javax.swing.JTextField txtBillNo;
    private javax.swing.JTextField txtCostPerParts;
    private javax.swing.JTextField txtPartName;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtServiceMileage;
    private javax.swing.JTextField txtServiceName;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtUnitPrice;
    private javax.swing.JTextField txtWorkerCost;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            VehicleService.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            VehicleService.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
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
            
     private void clearField(){
           comboVehicleNo.setSelectedIndex(0);
           comboPaymentType.setSelectedIndex(0);
           txtCostPerParts.setText("0.00");
           txtWorkerCost.setText("0.00");
           txtSubTotal.setText("0.00");
           DefaultTableModel dtm=(DefaultTableModel) tableService.getModel();
           dtm.setRowCount(0);
           
        java.awt.Component[] cp = jPanel3.getComponents();
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
        autoSetDate();
       }       
}
