
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

public class VehicleMileage extends javax.swing.JFrame {
static boolean maximized = true;
boolean b = false;
    public VehicleMileage() {
        initComponents();
        maximizeWindow();
        dateEnable();
        setVehicle();
        setTableDetails();
        //setTotal();
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
        setDate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboVehicleNo = new javax.swing.JComboBox<>();
        txtStartMleage = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtFuelType = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEndMliage = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        comboSelectVehicle = new javax.swing.JComboBox<>();
        checkboxDiesel = new javax.swing.JCheckBox();
        checkboxAll = new javax.swing.JCheckBox();
        checkboxPetrol = new javax.swing.JCheckBox();
        toDate = new com.alee.extended.date.WebDateField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fromDate = new com.alee.extended.date.WebDateField();
        checkboxDateFilter = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        btnFilter = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMileage = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtTotalCost = new javax.swing.JTextField();
        lableMileId = new javax.swing.JLabel();

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
        setTitle("Vehicle Mileage-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicle Mileage", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setDate.setText("set date here");
        jPanel2.add(setDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 80, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel2.setText("Vehicle No");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("Fuel Type");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel4.setText("Start Mileage");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, 20));

        comboVehicleNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboVehicleNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Vehicle--" }));
        comboVehicleNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVehicleNoActionPerformed(evt);
            }
        });
        jPanel2.add(comboVehicleNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 410, 30));

        txtStartMleage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStartMleage.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtStartMleage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStartMleageKeyTyped(evt);
            }
        });
        jPanel2.add(txtStartMleage, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 410, 30));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 120, 40));

        txtFuelType.setEditable(false);
        txtFuelType.setBackground(new java.awt.Color(255, 255, 255));
        txtFuelType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFuelType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuelTypeActionPerformed(evt);
            }
        });
        jPanel2.add(txtFuelType, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 410, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel20.setText("Date");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 50, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel10.setText("End Mileage");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, 20));

        txtEndMliage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEndMliage.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEndMliage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEndMliageKeyPressed(evt);
            }
        });
        jPanel2.add(txtEndMliage, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 410, 30));

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

        fromDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        fromDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromDateActionPerformed(evt);
            }
        });
        jPanel3.add(fromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 160, 30));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 570, 250));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 20, 530));

        tableMileage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle No", "Date", "Fuel Type", "Start Mileage(KM)", "End Mileage(KM)"
            }
        ));
        tableMileage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMileageMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableMileage);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 570, 240));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Total KM");
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

        lableMileId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lableMileId.setText("jLabel1");
        jPanel1.add(lableMileId, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 120, 20));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        if (fromDate.getDate() == null) {
            NotificationPopup.fillFeilds();
        }else if (toDate.getDate() == null) {
            NotificationPopup.fillFeilds();
        }else{
            ResultSet rs=null;
            DateFormat df=new SimpleDateFormat("yyyy/MM/dd");
            String getFromDate=df.format(fromDate.getDate());
            String getToDate=df.format(toDate.getDate());
            try {
              if (comboSelectVehicle.getSelectedIndex() == 0) {
                if (checkboxAll.isSelected()) {
                      rs=DB.search("SELECT m.*,v.* FROM mailege m INNER JOIN vehicle v ON m.vehicle_idVehicle = v.idVehicle WHERE Date BETWEEN '"+getFromDate+"' AND '"+getToDate+"' ");
                }else if (checkboxPetrol.isSelected()) {
                      rs=DB.search("SELECT m.*,v.* FROM mailege m INNER JOIN vehicle v ON m.vehicle_idVehicle = v.idVehicle WHERE fuleType LIKE 'Petrol' AND (Date BETWEEN '"+getFromDate+"' AND '"+getToDate+"') ");
                }else{
                      rs=DB.search("SELECT m.*,v.* FROM mailege m INNER JOIN vehicle v ON m.vehicle_idVehicle = v.idVehicle WHERE fuleType LIKE 'Diesel' AND (Date BETWEEN '"+getFromDate+"' AND '"+getToDate+"') ");
                }
            }else{
                  String selectVehicle=(String) comboSelectVehicle.getSelectedItem();
                  String[] s=selectVehicle.split(" ");
                  rs=DB.search("SELECT m.*,v.* FROM mailege m INNER JOIN vehicle v ON m.vehicle_idVehicle = v.idVehicle WHERE VehicleNumber='"+s[0]+"' AND (Date BETWEEN '"+getFromDate+"' AND '"+getToDate+"') ");
                  }
                       DefaultTableModel dtm=(DefaultTableModel) tableMileage.getModel();
                      dtm.setRowCount(0);
                                while (rs.next()) {                
                                   Vector v=new Vector();
                                   v.add(rs.getString("VehicleNumber"));
                                   v.add(rs.getString("Date"));
                                   v.add(rs.getString("fuleType"));
                                   v.add(rs.getString("MailegeStart"));
                                   v.add(rs.getString("MailegeEnd"));
                                   dtm.addRow(v);
            }
                                setTotal();
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

    private void fromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromDateActionPerformed

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
                    String insert_1="INSERT INTO mailege(Date,MailegeStart,MailegeEnd,vehicle_idVehicle) VALUES('"+setDate.getText()+"','"+txtStartMleage.getText()+"','"+txtEndMliage.getText()+"','"+getId+"') ";
                    DB.idu(insert_1);
                    
                }else{
                  String[] getVehicleId=getVehicle.split(" ");
                  ResultSet rs=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+getVehicleId[0]+"' ");
                  while (rs.next()) {
                      getId=rs.getString("idVehicle");
                  }
                    DB.idu("UPDATE mailege SET MailegeStart='"+txtStartMleage.getText()+"',MailegeEnd='"+txtEndMliage.getText()+"',vehicle_idVehicle='"+getId+"' WHERE idMailege='"+lableMileId.getText()+"' ");
                    btnSave.setText("SAVE");
                }   
                setTableDetails();
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
                    txtStartMleage.grabFocus();
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
            ResultSet rs1=DB.search("SELECT m.*,v.* FROM mailege m INNER JOIN vehicle v ON m.vehicle_idVehicle = v.idVehicle WHERE fuleType LIKE 'Petrol' ORDER BY Date DESC");
            DefaultTableModel dtm=(DefaultTableModel) tableMileage.getModel();
            dtm.setRowCount(0);
            while (rs1.next()) {                
                Vector v=new Vector();
                v.add(rs1.getString("VehicleNumber"));
                v.add(rs1.getString("Date"));
                v.add(rs1.getString("fuleType"));
                v.add(rs1.getString("MailegeStart"));
                v.add(rs1.getString("MailegeEnd"));
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
            ResultSet rs1=DB.search("SELECT m.*,v.* FROM mailege m INNER JOIN vehicle v ON m.vehicle_idVehicle = v.idVehicle WHERE fuleType LIKE 'Diesel' ORDER BY Date DESC");
            DefaultTableModel dtm=(DefaultTableModel) tableMileage.getModel();
            dtm.setRowCount(0);
            while (rs1.next()) {                
                Vector v=new Vector();
                v.add(rs1.getString("VehicleNumber"));
                v.add(rs1.getString("Date"));
                v.add(rs1.getString("fuleType"));
                v.add(rs1.getString("MailegeStart"));
                v.add(rs1.getString("MailegeEnd"));
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
            ResultSet rs2=DB.search("SELECT v.*,m.* FROM vehicle v INNER JOIN mailege m ON v.idVehicle=m.vehicle_idVehicle WHERE VehicleNumber='"+s[0]+"'  ORDER BY Date DESC");
            DefaultTableModel dtm=(DefaultTableModel) tableMileage.getModel();
            dtm.setRowCount(0);
            while (rs2.next()) {                
                Vector v=new Vector();
                v.add(rs2.getString("VehicleNumber"));
                v.add(rs2.getString("Date"));
                v.add(rs2.getString("fuleType"));
                v.add(rs2.getString("MailegeStart"));
                v.add(rs2.getString("MailegeEnd"));
                dtm.addRow(v);
            }
            setTotal();
        }
        catch (Exception e) {
        }
        }
    }//GEN-LAST:event_comboSelectVehiclePopupMenuWillBecomeInvisible

    private void tableMileageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMileageMouseClicked
        String getVehModel=null;
        String getMileId=null;
        try {
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
            DefaultTableModel dtm=(DefaultTableModel) tableMileage.getModel();
            int x=tableMileage.getSelectedRow();
            String s1=(tableMileage.getModel().getValueAt(x,0).toString());
            String s2=(tableMileage.getModel().getValueAt(x,1).toString());
            String s3=(tableMileage.getModel().getValueAt(x,2).toString());
            String s4=(tableMileage.getModel().getValueAt(x,3).toString());
            String s5=(tableMileage.getModel().getValueAt(x,4).toString());
            ResultSet rs=DB.search("SELECT v.*,m.* FROM vehicle v INNER JOIN mailege m ON v.idVehicle=m.vehicle_idVehicle WHERE VehicleNumber='"+s1+"' ");
            if (rs.next()) {
                getVehModel=rs.getString("model");
                
            }
            ResultSet rs1=DB.search("SELECT * FROM mailege WHERE MailegeStart='"+s4+"' AND MailegeEnd='"+s5+"' ");
            if (rs1.next()) {
                 getMileId=rs1.getString("idMailege");
                 lableMileId.setText(getMileId);
            }
            comboVehicleNo.setSelectedItem(s1+" ("+getVehModel+")");
            setDate.setText(s2);
            txtFuelType.setText(s3);
            txtStartMleage.setText(s4);
            txtEndMliage.setText(s5);
            btnSave.setText("UPDATE");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tableMileageMouseClicked

    private void txtStartMleageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartMleageKeyTyped
       char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) || txtStartMleage.getText().length()==10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtStartMleageKeyTyped

    private void txtTotalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCostActionPerformed

    private void txtEndMliageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEndMliageKeyPressed
 
    }//GEN-LAST:event_txtEndMliageKeyPressed


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleMileage().setVisible(true);
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
    private com.alee.extended.date.WebDateField fromDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lableMileId;
    private javax.swing.JLabel setDate;
    private javax.swing.JTable tableMileage;
    private com.alee.extended.date.WebDateField toDate;
    private javax.swing.JTextField txtEndMliage;
    private javax.swing.JTextField txtFuelType;
    private javax.swing.JTextField txtStartMleage;
    private javax.swing.JTextField txtTotalCost;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            VehicleMileage.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            VehicleMileage.this.setMaximizedBounds(gv.getMaximumWindowBounds());
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
            fromDate.setEnabled(true);
            toDate.setEnabled(true);
            btnFilter.setEnabled(true);
            jLabel8.setEnabled(true);
            jLabel6.setEnabled(true);
        }else{
            fromDate.setEnabled(false);
            toDate.setEnabled(false);
            btnFilter.setEnabled(false);
            jLabel8.setEnabled(false);
            jLabel6.setEnabled(false);
            fromDate.setDate(null);
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
            ResultSet rs=DB.search("SELECT m.*,v.* FROM mailege m INNER JOIN vehicle v ON m.vehicle_idVehicle = v.idVehicle ORDER BY Date DESC");
            DefaultTableModel dtm=(DefaultTableModel) tableMileage.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("VehicleNumber"));
                v.add(rs.getString("Date"));
                v.add(rs.getString("fuleType"));
                v.add(rs.getString("MailegeStart"));
                v.add(rs.getString("MailegeEnd"));
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
          txtStartMleage.setText("");
          txtEndMliage.setText("");
      }
      
      private void setTotal(){
                Double sum=0.00;
                for (int i = 0; i < tableMileage.getRowCount(); i++) {
                    double getStart=Double.parseDouble((String) tableMileage.getValueAt(i, 4));
                    sum=getStart+sum;
                    txtTotalCost.setText(df.dcf(sum));
                }
      }
}
