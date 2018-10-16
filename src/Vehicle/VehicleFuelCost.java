
package Vehicle;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import ExtenelClasses.df;
import MainMenu.*;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VehicleFuelCost extends javax.swing.JFrame {
static boolean maximized = true;
boolean b = false;
    public VehicleFuelCost() {
        initComponents();
        maximizeWindow();
        dateEnable();
        setVehicle();
        setTableDetails();
        setTotal();
        autoSetDate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLitter = new javax.swing.JTextField();
        comboVehicleNo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtFuelType = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLiterAmount = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        setDate = new com.alee.extended.date.WebDateField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        comboSelectVehicle = new javax.swing.JComboBox<>();
        checkboxDiesel = new javax.swing.JCheckBox();
        checkboxAll = new javax.swing.JCheckBox();
        checkboxPetrol = new javax.swing.JCheckBox();
        toDate = new com.alee.extended.date.WebDateField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        checkboxDateFilter = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        btnFilter = new javax.swing.JButton();
        fromDate1 = new com.alee.extended.date.WebDateField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableFuel = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtTotalCost = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vehicle Fuel Cost-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Fuel Cost", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("LKR");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 50, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel2.setText("Vehicle No");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("Fuel Type");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel4.setText("Amount");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, 20));

        txtLitter.setEditable(false);
        txtLitter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtLitter.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLitter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLitterFocusLost(evt);
            }
        });
        txtLitter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLitterKeyTyped(evt);
            }
        });
        jPanel2.add(txtLitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 380, 30));

        comboVehicleNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboVehicleNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Vehicle--" }));
        comboVehicleNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVehicleNoActionPerformed(evt);
            }
        });
        jPanel2.add(comboVehicleNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 380, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel5.setText("Litter");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 100, 20));

        txtAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmountKeyTyped(evt);
            }
        });
        jPanel2.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 380, 30));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 120, 40));

        txtFuelType.setEditable(false);
        txtFuelType.setBackground(new java.awt.Color(255, 255, 255));
        txtFuelType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFuelType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuelTypeActionPerformed(evt);
            }
        });
        jPanel2.add(txtFuelType, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 380, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel20.setText("Date");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 50, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel10.setText("Cost Per Litter");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, 20));

        txtLiterAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtLiterAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLiterAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLiterAmountKeyPressed(evt);
            }
        });
        jPanel2.add(txtLiterAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 380, 30));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("LKR");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 50, 20));

        setDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        setDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDateActionPerformed(evt);
            }
        });
        jPanel2.add(setDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 380, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 570, 510));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("To");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 80, 20));

        comboSelectVehicle.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboSelectVehicle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Vehicle--" }));
        comboSelectVehicle.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboSelectVehiclePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        comboSelectVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSelectVehicleActionPerformed(evt);
            }
        });
        jPanel3.add(comboSelectVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 380, 30));

        checkboxDiesel.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkboxDiesel);
        checkboxDiesel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkboxDiesel.setText("Diesel");
        checkboxDiesel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxDieselActionPerformed(evt);
            }
        });
        jPanel3.add(checkboxDiesel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        checkboxAll.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkboxAll);
        checkboxAll.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkboxAll.setSelected(true);
        checkboxAll.setText("All");
        checkboxAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxAllActionPerformed(evt);
            }
        });
        jPanel3.add(checkboxAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        checkboxPetrol.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkboxPetrol);
        checkboxPetrol.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkboxPetrol.setText("Petrol");
        checkboxPetrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxPetrolActionPerformed(evt);
            }
        });
        jPanel3.add(checkboxPetrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        toDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        toDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        toDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toDateActionPerformed(evt);
            }
        });
        jPanel3.add(toDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 160, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Select Vehicle");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("From");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 80, 20));

        checkboxDateFilter.setBackground(new java.awt.Color(255, 255, 255));
        checkboxDateFilter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkboxDateFilter.setText("Filter By Date");
        checkboxDateFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxDateFilterActionPerformed(evt);
            }
        });
        jPanel3.add(checkboxDateFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jSeparator1.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 380, 20));

        btnFilter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnFilter.setText("FILTER");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });
        jPanel3.add(btnFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 120, 30));

        fromDate1.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        fromDate1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fromDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromDate1ActionPerformed(evt);
            }
        });
        jPanel3.add(fromDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 160, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 570, 250));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 20, 530));

        tableFuel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle No", "Date", "Fuel Type", "Litter", "Amount"
            }
        ));
        tableFuel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFuelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableFuel);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 570, 240));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Total Cost");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 610, 70, 20));

        txtTotalCost.setEditable(false);
        txtTotalCost.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTotalCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCostActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 600, 150, 30));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        if (setDate.getDate() == null) {
            NotificationPopup.fillFeilds();
        }else if (toDate.getDate() == null) {
            NotificationPopup.fillFeilds();
        }else{
            ResultSet rs=null;
            DateFormat df=new SimpleDateFormat("yyyy/MM/dd");
            String getFromDate=df.format(setDate.getDate());
            String getToDate=df.format(toDate.getDate());
            try {
              if (comboSelectVehicle.getSelectedIndex() == 0) {
                if (checkboxAll.isSelected()) {
                      rs=DB.search("SELECT v.*,fc.* FROM vehicle v INNER JOIN fuelcost fc ON v.idVehicle=fc.idVehicle WHERE Date BETWEEN '"+getFromDate+"' AND '"+getToDate+"' ");
                }else if (checkboxPetrol.isSelected()) {
                      rs=DB.search("SELECT v.*,fc.* FROM vehicle v INNER JOIN fuelcost fc ON v.idVehicle=fc.idVehicle WHERE fuleType LIKE 'Petrol' AND (Date BETWEEN '"+getFromDate+"' AND '"+getToDate+"') ");
                }else{
                      rs=DB.search("SELECT v.*,fc.* FROM vehicle v INNER JOIN fuelcost fc ON v.idVehicle=fc.idVehicle WHERE fuleType LIKE 'Diesel' AND (Date BETWEEN '"+getFromDate+"' AND '"+getToDate+"') ");
                }
            }else{
                  String selectVehicle=(String) comboSelectVehicle.getSelectedItem();
                  String[] s=selectVehicle.split(" ");
                  rs=DB.search("SELECT v.*,fc.* FROM vehicle v INNER JOIN fuelcost fc ON v.idVehicle=fc.idVehicle WHERE VehicleNumber='"+s[0]+"' AND (Date BETWEEN '"+getFromDate+"' AND '"+getToDate+"') ");
                  }
                       DefaultTableModel dtm=(DefaultTableModel) tableFuel.getModel();
                      dtm.setRowCount(0);
                      while (rs.next()) {                
                          Vector v=new Vector();
                          v.add(rs.getString("VehicleNumber"));
                          v.add(rs.getString("Date"));
                          v.add(rs.getString("fuleType"));
                          v.add(rs.getString("Qty"));
                          v.add(rs.getString("Amount"));
                          dtm.addRow(v);
                      }
            } catch (Exception e) {
               e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnFilterActionPerformed

    private void checkboxAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxAllActionPerformed
        if (checkboxAll.isSelected()) {
            try {
              if (checkboxAll.isSelected()) {
                comboSelectVehicle.removeAllItems();
                comboSelectVehicle.addItem("--Select Vehicle--");
                ResultSet rs=DB.search("SELECT * FROM vehicle ");
              while (rs.next()) {                
                String getVehicleNo=rs.getString("VehicleNumber");
                String getVehicleModel=rs.getString("model");
                
                comboSelectVehicle.addItem(getVehicleNo+" ("+getVehicleModel+")");
                setTableDetails();
            }
                setTotal();
              }
        } catch (Exception e) { 
            e.printStackTrace();
        }
            
        }
    }//GEN-LAST:event_checkboxAllActionPerformed

    private void toDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toDateActionPerformed

    private void setDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setDateActionPerformed

    private void checkboxDateFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxDateFilterActionPerformed
            dateEnable();
    }//GEN-LAST:event_checkboxDateFilterActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String getVehicle=(String) comboVehicleNo.getSelectedItem();
        String getId=null;
        
        validateTxt();
        try {
            if (b == false) {
                if (btnSave.getText().equals("SAVE")) {
                  String[] getVehicleId=getVehicle.split(" ");
                  ResultSet rs=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+getVehicleId[0]+"' ");
                  while (rs.next()) {
                      getId=rs.getString("idVehicle");
                  }
                    String insert_1="INSERT INTO fuelcost(Date,Amount,idVehicle,Qty) VALUES('"+setDate.getText()+"','"+txtAmount.getText()+"','"+getId+"','"+txtLitter.getText()+"') ";
                    DB.idu(insert_1);
                    
                    String insert_2="INSERT INTO incomeexpence(Date,Description,Income,Expence) VALUES('"+setDate.getText()+"','Fuel Cost','0','"+txtAmount.getText()+"') ";
                    DB.idu(insert_2);
                }else{
                    
                }

                setTableDetails();
                setTotal();
                clearTxt();
            }else{
                NotificationPopup.fillFeilds();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtFuelTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuelTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFuelTypeActionPerformed

    private void comboVehicleNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVehicleNoActionPerformed
        String getVehicle=(String) comboVehicleNo.getSelectedItem();
        String getId=null;
        
        if (comboVehicleNo.getSelectedIndex()!=0) {
            try {
                String[] getVehicleFuel=getVehicle.split(" ");
                ResultSet rs=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+getVehicleFuel[0]+"' ");
                while (rs.next()) {
                    getId=rs.getString("fuleType");
                    txtFuelType.setText(getId);
                    txtAmount.grabFocus();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_comboVehicleNoActionPerformed

    private void checkboxPetrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxPetrolActionPerformed
          try {
              if (checkboxPetrol.isSelected()) {
                comboSelectVehicle.removeAllItems();
                comboSelectVehicle.addItem("--Select Vehicle--");
                ResultSet rs=DB.search("SELECT * FROM vehicle WHERE fuleType LIKE 'Petrol' ");
                //ResultSet rs=DB.search("SELECT v.*,f.* FROM vehicle v INNER JOIN fuelcost f ON v.idVehicle=f.idVehicle WHERE fuleType LIKE 'Petrol' ");
                while (rs.next()) {                
                String getVehicleNo=rs.getString("VehicleNumber");
                String getVehicleModel=rs.getString("model");
                comboSelectVehicle.addItem(getVehicleNo+" ("+getVehicleModel+")");
                                
            }
            ResultSet rs1=DB.search("SELECT v.*,fc.* FROM vehicle v INNER JOIN fuelcost fc ON v.idVehicle=fc.idVehicle WHERE fuleType LIKE 'Petrol' ORDER BY Date DESC");
            DefaultTableModel dtm=(DefaultTableModel) tableFuel.getModel();
            dtm.setRowCount(0);
            while (rs1.next()) {                
                Vector v=new Vector();
                v.add(rs1.getString("VehicleNumber"));
                v.add(rs1.getString("Date"));
                v.add(rs1.getString("fuleType"));
                v.add(rs1.getString("Qty"));
                v.add(rs1.getString("Amount"));
                dtm.addRow(v);
            }
                setTotal();
              }
        } catch (Exception e) { 
            e.printStackTrace();
        }
    }//GEN-LAST:event_checkboxPetrolActionPerformed

    private void checkboxDieselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxDieselActionPerformed
            try {
              if (checkboxDiesel.isSelected()) {
                comboSelectVehicle.removeAllItems();
                comboSelectVehicle.addItem("--Select Vehicle--");
                ResultSet rs=DB.search("SELECT * FROM vehicle WHERE fuleType LIKE 'Diesel' ");
              while (rs.next()) {                
                String getVehicleNo=rs.getString("VehicleNumber");
                String getVehicleModel=rs.getString("model");
                
                comboSelectVehicle.addItem(getVehicleNo+" ("+getVehicleModel+")");
            }
            ResultSet rs1=DB.search("SELECT v.*,fc.* FROM vehicle v INNER JOIN fuelcost fc ON v.idVehicle=fc.idVehicle WHERE fuleType LIKE 'Diesel' ORDER BY Date DESC");
            DefaultTableModel dtm=(DefaultTableModel) tableFuel.getModel();
            dtm.setRowCount(0);
            while (rs1.next()) {                
                Vector v=new Vector();
                v.add(rs1.getString("VehicleNumber"));
                v.add(rs1.getString("Date"));
                v.add(rs1.getString("fuleType"));
                v.add(rs1.getString("Qty"));
                v.add(rs1.getString("Amount"));
                dtm.addRow(v);
            }
                setTotal();
              }
        } catch (Exception e) { 
            e.printStackTrace();
        }
    }//GEN-LAST:event_checkboxDieselActionPerformed

    private void comboSelectVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSelectVehicleActionPerformed

    }//GEN-LAST:event_comboSelectVehicleActionPerformed

    private void comboSelectVehiclePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboSelectVehiclePopupMenuWillBecomeInvisible
        if (comboSelectVehicle.getSelectedIndex() != 0) {
        String selectVehicle=(String) comboSelectVehicle.getSelectedItem();
        String[] s=selectVehicle.split(" ");
        try {
            ResultSet rs2=DB.search("SELECT v.*,fc.* FROM vehicle v INNER JOIN fuelcost fc ON v.idVehicle=fc.idVehicle WHERE VehicleNumber='"+s[0]+"'  ORDER BY Date DESC");
            DefaultTableModel dtm=(DefaultTableModel) tableFuel.getModel();
            dtm.setRowCount(0);
            while (rs2.next()) {                
                Vector v=new Vector();
                v.add(rs2.getString("VehicleNumber"));
                v.add(rs2.getString("Date"));
                v.add(rs2.getString("fuleType"));
                v.add(rs2.getString("Qty"));
                v.add(rs2.getString("Amount"));
                dtm.addRow(v);
            }
            setTotal();
        }
        catch (Exception e) {
        }
        }
    }//GEN-LAST:event_comboSelectVehiclePopupMenuWillBecomeInvisible

    private void tableFuelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFuelMouseClicked
        try {
//            SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
//            DefaultTableModel dtm=(DefaultTableModel) tableFuel.getModel();
//            int x=tableFuel.getSelectedRow();
//            String s=(tableFuel.getModel().getValueAt(x,0).toString());
//            ResultSet rs=DB.search("SELECT v.*,fc.* FROM vehicle v INNER JOIN fuelcost fc ON v.idVehicle=fc.idVehicle WHERE ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tableFuelMouseClicked

    private void txtLitterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLitterFocusLost
        txtAmount.grabFocus();
    }//GEN-LAST:event_txtLitterFocusLost

    private void txtLitterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLitterKeyTyped
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) || txtLitter.getText().length()==10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtLitterKeyTyped

    private void txtAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyTyped
       char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) || txtAmount.getText().length()==10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAmountKeyTyped

    private void txtTotalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCostActionPerformed

    private void txtLiterAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLiterAmountKeyPressed
        DecimalFormat df=new DecimalFormat(".0");
        if (evt.getKeyCode()==10) {
            if (txtAmount.getText().isEmpty()) {
                NotificationPopup.fillFeilds();
            }else{
                Double d1=Double.parseDouble(txtAmount.getText());
                Double d2=Double.parseDouble(txtLiterAmount.getText());
                Double d=d1/d2;
                txtLitter.setText(df.format(d));
            }
        }
    }//GEN-LAST:event_txtLiterAmountKeyPressed

    private void fromDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromDate1ActionPerformed


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleFuelCost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkboxAll;
    private javax.swing.JCheckBox checkboxDateFilter;
    private javax.swing.JCheckBox checkboxDiesel;
    private javax.swing.JCheckBox checkboxPetrol;
    private javax.swing.JComboBox<String> comboSelectVehicle;
    private javax.swing.JComboBox<String> comboVehicleNo;
    private com.alee.extended.date.WebDateField fromDate1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private com.alee.extended.date.WebDateField setDate;
    private javax.swing.JTable tableFuel;
    private com.alee.extended.date.WebDateField toDate;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtFuelType;
    private javax.swing.JTextField txtLiterAmount;
    private javax.swing.JTextField txtLitter;
    private javax.swing.JTextField txtTotalCost;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            VehicleFuelCost.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            VehicleFuelCost.this.setMaximizedBounds(gv.getMaximumWindowBounds());
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
    
    private void dateEnable(){
        if (checkboxDateFilter.isSelected()) {
            setDate.setEnabled(true);
            toDate.setEnabled(true);
            btnFilter.setEnabled(true);
            jLabel8.setEnabled(true);
            jLabel6.setEnabled(true);
        }else{
           
            toDate.setEnabled(false);
            btnFilter.setEnabled(false);
            jLabel8.setEnabled(false);
            jLabel6.setEnabled(false);
            setDate.setDate(null);
            toDate.setDate(null);
        }
    }

    private void setVehicle() {
        try {
            ResultSet rs=DB.search("SELECT * FROM vehicle");
            while (rs.next()) {
                String getVehicleNo=rs.getString("VehicleNumber");
                String getVehicleModel=rs.getString("model");
                
                comboVehicleNo.addItem(getVehicleNo+" ("+getVehicleModel+")");
                comboSelectVehicle.addItem(getVehicleNo+" ("+getVehicleModel+")");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setTableDetails() {
        try {
            ResultSet rs=DB.search("SELECT v.*,fc.* FROM vehicle v INNER JOIN fuelcost fc ON v.idVehicle=fc.idVehicle ORDER BY Date DESC");
            DefaultTableModel dtm=(DefaultTableModel) tableFuel.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("VehicleNumber"));
                v.add(rs.getString("Date"));
                v.add(rs.getString("fuleType"));
                v.add(rs.getString("Qty"));
                v.add(rs.getString("Amount"));
                dtm.addRow(v);
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
      
      private void clearTxt(){
          comboVehicleNo.setSelectedIndex(0);
          txtFuelType.setText("");
          txtLitter.setText("");
          txtAmount.setText("");
      }
      
      private void setTotal(){
                Double sum=0.00;
                for (int i = 0; i < tableFuel.getRowCount(); i++) {
                    double getsum=Double.parseDouble((String) tableFuel.getValueAt(i, 4));
                    sum=getsum+sum;
                    txtTotalCost.setText(df.dcf(sum));
                }
      }
}
