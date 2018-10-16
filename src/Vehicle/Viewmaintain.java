
package Vehicle;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import ExtenelClasses.df;
import MainMenu.*;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Viewmaintain extends javax.swing.JFrame {
static boolean maximized = true;
    public Viewmaintain() {
        initComponents();
        maximizeWindow();
        setTable();
        //setCostParts();
        //setWorkerCost();
        setVehicle();
        setEnabled();
        //setTotal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableViewMaintain = new javax.swing.JTable();
        txtCostParts = new javax.swing.JTextField();
        txtWorkerCost = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        webDate = new com.alee.extended.date.WebDateField();
        checkDate = new javax.swing.JCheckBox();
        btnDate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablemaintainparts = new javax.swing.JTable();
        txtTotalCost = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        radioVehicle = new javax.swing.JRadioButton();
        radioGarage = new javax.swing.JRadioButton();
        comboFilter = new javax.swing.JComboBox<>();
        btnFilter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Maintain Details-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableViewMaintain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Garage Name", "Bill No", "Vehicle", "Cost per Parts", "Worker Cost", "Date"
            }
        ));
        jScrollPane1.setViewportView(tableViewMaintain);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 710, 320));

        txtCostParts.setEditable(false);
        txtCostParts.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCostParts.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtCostParts, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 540, 300, 30));

        txtWorkerCost.setEditable(false);
        txtWorkerCost.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWorkerCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtWorkerCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 580, 300, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Total Cost");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 630, 130, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Total Cost Per Parts");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 130, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        webDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(webDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 250, 30));

        checkDate.setBackground(new java.awt.Color(255, 255, 255));
        checkDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkDate.setText("Filter By Date");
        checkDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDateActionPerformed(evt);
            }
        });
        jPanel2.add(checkDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDate.setText("FILTER");
        btnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateActionPerformed(evt);
            }
        });
        jPanel2.add(btnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 130, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 330, 140));

        tablemaintainparts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Part Name", "Unit Price", "Qty", "Total"
            }
        ));
        jScrollPane2.setViewportView(tablemaintainparts);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, 490, 320));

        txtTotalCost.setEditable(false);
        txtTotalCost.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTotalCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtTotalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 620, 300, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Total Worker Cost");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 590, 130, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Filter By");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        radioVehicle.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioVehicle);
        radioVehicle.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioVehicle.setSelected(true);
        radioVehicle.setText("Vehicle");
        radioVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioVehicleActionPerformed(evt);
            }
        });
        jPanel3.add(radioVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        radioGarage.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioGarage);
        radioGarage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioGarage.setText("Garage");
        radioGarage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGarageActionPerformed(evt);
            }
        });
        jPanel3.add(radioGarage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        comboFilter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select All" }));
        comboFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFilterActionPerformed(evt);
            }
        });
        jPanel3.add(comboFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 290, 30));

        btnFilter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnFilter.setText("FILTER");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });
        jPanel3.add(btnFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 120, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 360, 140));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radioGarageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGarageActionPerformed
        try {
            comboFilter.removeAllItems();
            ResultSet rs=DB.search("SELECT DISTINCT garageName FROM vehiclemaintanence");
            comboFilter.addItem("Select All");
            while (rs.next()) { 
                String s=rs.getString("garageName");
                comboFilter.addItem(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_radioGarageActionPerformed

    private void radioVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioVehicleActionPerformed
        comboFilter.removeAllItems();
        comboFilter.addItem("Select All");
        setVehicle();
    }//GEN-LAST:event_radioVehicleActionPerformed

    private void comboFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFilterActionPerformed

    }//GEN-LAST:event_comboFilterActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
           try {
               if (comboFilter.getSelectedIndex()==0) {
                   setTable();
                   DefaultTableModel dtm2=(DefaultTableModel) tablemaintainparts.getModel();
                   dtm2.setRowCount(0);
                   setCostParts();
                   setWorkerCost();
                   setTotal(); 
                   
               }else{
                if (radioVehicle.isSelected()) {
                  String selectVehicle=(String) comboFilter.getSelectedItem();
                  String[] s=selectVehicle.split(" ");
                  ResultSet rs=DB.search("SELECT v.*,vm.* FROM vehicle v INNER JOIN vehiclemaintanence vm ON v.idVehicle=vm.idVehicle WHERE VehicleNumber='"+s[0]+"' ORDER BY MaintainDate DESC");
                  DefaultTableModel dtm=(DefaultTableModel) tableViewMaintain.getModel();
                  dtm.setRowCount(0);
                    while (rs.next()) {                
                      Vector v=new Vector();
                      v.add(rs.getString("garageName"));
                      v.add(rs.getString("BillNo"));
                      v.add(rs.getString("model"));
                      v.add(rs.getString("costPerpart"));
                      v.add(rs.getString("workercost"));
                      v.add(rs.getString("MaintainDate"));
                      dtm.addRow(v);
                    }
                  ResultSet rs2=DB.search("SELECT v.*,vm.*,sm.* FROM vehiclemaintanence vm INNER JOIN spirepartmaintanence sm ON vm.idVehicleMaintanence=sm.idVehicleMaintanence INNER JOIN vehicle v ON v.idVehicle=vm.idVehicle WHERE VehicleNumber='"+s[0]+"' ");
                  DefaultTableModel dtm2=(DefaultTableModel) tablemaintainparts.getModel();
                  dtm2.setRowCount(0);
                      while (rs2.next()) {                
                      Vector v=new Vector();
                      v.add(rs2.getString("PartName"));
                      v.add(rs2.getString("UnitPrice"));
                      v.add(rs2.getString("QTY"));
                      v.add(rs2.getString("SubTotal"));
                      dtm2.addRow(v);
                    }
               }else{
                   String selectGarage=(String) comboFilter.getSelectedItem();
                   ResultSet rs=DB.search("SELECT v.*,vm.* FROM vehicle v INNER JOIN vehiclemaintanence vm ON v.idVehicle=vm.idVehicle WHERE garageName='"+selectGarage+"' ORDER BY MaintainDate DESC");
                   DefaultTableModel dtm=(DefaultTableModel) tableViewMaintain.getModel();
                   dtm.setRowCount(0);
                     while (rs.next()) {                
                       Vector v=new Vector();
                       v.add(rs.getString("garageName"));
                       v.add(rs.getString("BillNo"));
                       v.add(rs.getString("model"));
                       v.add(rs.getString("costPerpart"));
                       v.add(rs.getString("workercost"));
                       v.add(rs.getString("MaintainDate"));
                       dtm.addRow(v);
                     }
                   ResultSet rs2=DB.search("SELECT v.*,vm.*,sm.* FROM vehiclemaintanence vm INNER JOIN spirepartmaintanence sm ON vm.idVehicleMaintanence=sm.idVehicleMaintanence INNER JOIN vehicle v ON v.idVehicle=vm.idVehicle WHERE garageName='"+selectGarage+"' ");
                   DefaultTableModel dtm2=(DefaultTableModel) tablemaintainparts.getModel();
                   dtm2.setRowCount(0);
                      while (rs2.next()) {                
                      Vector v=new Vector();
                      v.add(rs2.getString("PartName"));
                      v.add(rs2.getString("UnitPrice"));
                      v.add(rs2.getString("QTY"));
                      v.add(rs2.getString("SubTotal"));
                      dtm2.addRow(v);
                    }
                }
                setCostParts();
                setWorkerCost();
                setTotal();
          }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnFilterActionPerformed

    private void checkDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDateActionPerformed
        if (checkDate.isSelected()) {
            webDate.setEnabled(true);
            btnDate.setEnabled(true);
            radioVehicle.setSelected(true);
            comboFilter.setSelectedIndex(0);
            setTable();
            setCostParts();
            setWorkerCost();
        }else{
            setEnabled();
        }
    }//GEN-LAST:event_checkDateActionPerformed

    private void btnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateActionPerformed
              try {
                  if (webDate.getDate()==null) {
                      NotificationPopup.fillFeilds();
                  }else{
                   DateFormat df=new SimpleDateFormat("yyyy/MM/dd");
                   String getDate=df.format(webDate.getDate());
                   ResultSet rs=DB.search("SELECT v.*,vm.* FROM vehicle v INNER JOIN vehiclemaintanence vm ON v.idVehicle=vm.idVehicle WHERE MaintainDate='"+getDate+"' ");
                   DefaultTableModel dtm=(DefaultTableModel) tableViewMaintain.getModel();
                   dtm.setRowCount(0);
                     while (rs.next()) {                
                       Vector v=new Vector();
                       v.add(rs.getString("garageName"));
                       v.add(rs.getString("BillNo"));
                       v.add(rs.getString("model"));
                       v.add(rs.getString("costPerpart"));
                       v.add(rs.getString("workercost"));
                       v.add(rs.getString("MaintainDate"));
                       dtm.addRow(v);
                     }
                     setCostParts();
                     setWorkerCost();
                     setTotal();
                  }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDateActionPerformed


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viewmaintain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDate;
    private javax.swing.JButton btnFilter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkDate;
    private javax.swing.JComboBox<String> comboFilter;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radioGarage;
    private javax.swing.JRadioButton radioVehicle;
    private javax.swing.JTable tableViewMaintain;
    private javax.swing.JTable tablemaintainparts;
    private javax.swing.JTextField txtCostParts;
    private javax.swing.JTextField txtTotalCost;
    private javax.swing.JTextField txtWorkerCost;
    private com.alee.extended.date.WebDateField webDate;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            Viewmaintain.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Viewmaintain.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void setTable() {
        try {
            ResultSet rs=DB.search("SELECT v.*,vm.* FROM vehicle v INNER JOIN vehiclemaintanence vm ON v.idVehicle=vm.idVehicle ORDER BY MaintainDate DESC");
            DefaultTableModel dtm=(DefaultTableModel) tableViewMaintain.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("garageName"));
                v.add(rs.getString("BillNo"));
                v.add(rs.getString("model"));
                v.add(rs.getString("costPerpart"));
                v.add(rs.getString("workercost"));
                v.add(rs.getString("MaintainDate"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setCostParts() {
                Double sum=0.00;
                for (int i = 0; i < tableViewMaintain.getRowCount(); i++) {
                    double getsum=Double.parseDouble((String) tableViewMaintain.getValueAt(i, 3));
                    sum=getsum+sum;
                    txtCostParts.setText(df.dcf(sum));
                }
    }

    private void setWorkerCost() {
                Double sum=0.00;
                for (int i = 0; i < tableViewMaintain.getRowCount(); i++) {
                    double getsum=Double.parseDouble((String) tableViewMaintain.getValueAt(i, 4));
                    sum=getsum+sum;
                    txtWorkerCost.setText(df.dcf(sum));
                }
    }

    private void setVehicle() {
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
    }

    private void setEnabled() {
        webDate.setEnabled(false);
        btnDate.setEnabled(false);
    }

    private void setTotal() {
        Double d1=Double.parseDouble(txtCostParts.getText());
        Double d2=Double.parseDouble(txtWorkerCost.getText());
        Double d=d1+d2;
        txtTotalCost.setText(""+d);
    }
}
