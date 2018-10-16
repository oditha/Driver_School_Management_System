
package EMVPayments;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import ExtenelClasses.df;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class EMVPayments extends javax.swing.JFrame {
static boolean maximized = true;
        String getEmvId=null; 
    public EMVPayments() {
        initComponents();
        maximizeWindow();
        fillTable();
        tableDecor();
        loadCombo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtStudentNo = new javax.swing.JLabel();
        txtSetAmount = new javax.swing.JLabel();
        btnFilter = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableView = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" EMV Payments And Details-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMVPayments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saveBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        saveBtn.setText("SAVE");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel3.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 120, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Total Pay");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 60, 20));

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle Class", "Sitted", "Pass", "Payment"
            }
        ));
        tblDetails.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblDetailsKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetails);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 570, 270));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel8.setText("NO of Students");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 100, 20));

        txtStudentNo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtStudentNo.setText("O");
        jPanel3.add(txtStudentNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 130, 40));

        txtSetAmount.setBackground(new java.awt.Color(255, 255, 255));
        txtSetAmount.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSetAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSetAmount.setText("set amount here");
        jPanel3.add(txtSetAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 120, 40));

        btnFilter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnFilter.setText("FILTER");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });
        jPanel3.add(btnFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 120, 30));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Date" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 170, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel9.setText("Trial Dates");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 70, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 630, 510));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Amount", "Sitted", "Pass"
            }
        ));
        jScrollPane2.setViewportView(tableView);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 550, 270));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 300, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel7.setText("Trial Dates");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 20));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("FILTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 120, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 590, 510));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 20, 540));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        DateFormat df=new SimpleDateFormat("yyyy/MM/dd"); 
        //String getTrialDate=df.format(trialDate.getDate());
        String getTrialDate=(String) jComboBox1.getSelectedItem();
        String getVehicleId=null;
        String getVehicleclass=null;
        fillTable();
        try {
            ResultSet rs=DB.search("SELECT COUNT(idstudents) FROM trial where Date='"+getTrialDate+"'");
            if (rs.next()) {
                   int i = rs.getInt(1);
                   txtStudentNo.setText(""+i);
            }
            DefaultTableModel dtm=(DefaultTableModel) tblDetails.getModel();
            Vector v=new Vector();
            for (int i = 0;i< dtm.getRowCount(); i++) {
                String s = dtm.getValueAt(i, 0).toString();
                ResultSet rs1=DB.search("SELECT * FROM vehicleclasses WHERE VehicleClasseName='"+s+"' ");
                if (rs1.next()) {
                    getVehicleId=rs1.getString("idVehicleClasses");
                    getVehicleclass=rs1.getString("VehicleClasseName");
                }
                ResultSet rs2=DB.search("SELECT COUNT(idstudents) FROM trial INNER JOIN trialvehicleclasses ON trial.idTrial=trialvehicleclasses.idTrial WHERE TrialDay='"+getTrialDate+"' AND idVehicleClasses='"+getVehicleId+"' ");
                while (rs2.next()) {
                    int a=rs2.getInt(1);
                    dtm.setValueAt(a, i, 1);
                }
                ResultSet rs3=DB.search("SELECT COUNT(idstudents) FROM trial INNER JOIN trialresult ON trial.idTrial=trialresult.idTrial WHERE Date='"+getTrialDate+"' AND TrialResult LIKE 'PASS' AND VehicleClass='"+getVehicleclass+"' ");
                while(rs3.next()){
                    int x=rs3.getInt(1);
                    dtm.setValueAt(x, i, 2);
                }
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnFilterActionPerformed

    private void tblDetailsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDetailsKeyReleased
        if (evt.getKeyCode()==10) {
                DefaultTableModel dtm=(DefaultTableModel) tblDetails.getModel();
                Double sum=0.00;
                Double getAmount =Double.parseDouble((String) tblDetails.getValueAt(tblDetails.getSelectedRow(), 3));
                
                for (int i = 0; i < dtm.getRowCount(); i++) {                   
                    String s1 = dtm.getValueAt(i, 3).toString(); 
                    Double getsum=Double.parseDouble(s1);
                    sum=getsum+sum;
                    if (sum==0) {
                        txtSetAmount.setText("0.00"); 
                    }else{
                        txtSetAmount.setText(df.dcf(sum));  
                    }                  
                }
        }
    }//GEN-LAST:event_tblDetailsKeyReleased

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        DateFormat df=new SimpleDateFormat("yyyy/MM/dd"); 
        Date d=new Date();
        String date=df.format(d);       
        try {
            if (txtSetAmount.getText().equals("0.00")) {
                NotificationPopup.fillFeilds();
            }else{
                 
                 
                 String getTrialDate=(String) jComboBox1.getSelectedItem();
                 String insert="INSERT INTO emvpayments(DateEmvPayment,PaymentAmount,NoOfStudents) VALUES('"+date+"','"+txtSetAmount.getText()+"','"+txtStudentNo.getText()+"')";
                 DB.idu(insert);
                 
                 String insert_2="INSERT INTO incomeexpence(Date,Description,Income,Expence) VALUES('"+date+"','emvPayment','0','"+txtSetAmount.getText()+"') ";
                 DB.idu(insert_2);
                 
                 ResultSet rs=DB.search("SELECT * FROM emvpayments ORDER BY idEmvPayments DESC LIMIT 1");
                 if (rs.next()) {
                    getEmvId=rs.getString("idEmvPayments");                    
                }
                 DefaultTableModel dtm=(DefaultTableModel) tblDetails.getModel();
                 for (int i = 0; i < dtm.getRowCount(); i++) {
                    String s1=dtm.getValueAt(i, 0).toString();
                    String s2=dtm.getValueAt(i, 1).toString();
                    String s3=dtm.getValueAt(i, 2).toString();
                    String s4=dtm.getValueAt(i, 3).toString();
                    
                    String insert_3="INSERT INTO emvdetails(VehicleCatogory,SittedAmount,PassedAmount,PaidAmount,idEmvPayments) VALUES('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+getEmvId+"')";
                    DB.idu(insert_3);
                }
                 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String getId=null;
            String getDate=(String) jComboBox2.getSelectedItem();
            ResultSet rs=DB.search("SELECT ed.*,ep.* FROM emvdetails ed INNER JOIN emvpayments ep ON ed.idEmvPayments=ep.idEmvPayments WHERE DateEmvPayment='"+getDate+"' ");
            DefaultTableModel dtm=(DefaultTableModel) tableView.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("VehicleCatogory"));
                v.add(rs.getString("PaidAmount"));
                v.add(rs.getString("SittedAmount"));
                v.add(rs.getString("PassedAmount"));
                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EMVPayments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTable tableView;
    private javax.swing.JTable tblDetails;
    private javax.swing.JLabel txtSetAmount;
    private javax.swing.JLabel txtStudentNo;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            EMVPayments.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            EMVPayments.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void fillTable() {
     DefaultTableModel dtm=(DefaultTableModel) tblDetails.getModel();
     dtm.setRowCount(0);
     ResultSet rs1;
     String getVehicleId=null;
    try {
        rs1 = DB.search("SELECT * FROM vehicleclasses");
            while(rs1.next()){
            Vector v=new Vector();
            String getVehicleClass=rs1.getString("VehicleClasseName");
            getVehicleId=rs1.getString("idVehicleClasses");
            v.add(getVehicleClass);
            dtm.addRow(v);
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    dtm.setValueAt("0.00", i, 3);
                }
       }
            txtSetAmount.setText("0.00");
    } catch (Exception ex) {
        ex.printStackTrace();
    }


    }

    private void tableDecor() {
        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tblDetails.getColumnModel().getColumn(3).setCellRenderer(dtcr);
    }

    private void loadCombo() {
        try {
            ResultSet rs=DB.search("SELECT DISTINCT Date FROM trial ORDER BY Date DESC ");
            while (rs.next()) {                
                String getDate=rs.getString("Date");
                jComboBox1.addItem(getDate);
                jComboBox2.addItem(getDate);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
