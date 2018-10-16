
package Vehicle;

import ExtenelClasses.DB;
import ExtenelClasses.EncodeDecodeImage;
import ExtenelClasses.NotificationInvalidNumber;
import ExtenelClasses.NotificationPopup;
import MainMenu.*;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class VehicleRegister extends javax.swing.JFrame {
static boolean maximized = true;
boolean b = false;
String path;
String encoder;
    public VehicleRegister() {
        initComponents();
        maximizeWindow();
        autoSetDate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        comboFuelType = new javax.swing.JComboBox<>();
        txtChassiNo = new javax.swing.JTextField();
        txtEngineNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        setDate = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSpecialNote1 = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtVehicleNo = new javax.swing.JTextField();
        sadsada = new javax.swing.JPanel();
        lablePicture = new javax.swing.JLabel();
        btnCapture = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        txtInsHotline = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txInsName = new javax.swing.JTextField();
        txtPolicyNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        insExpireDate = new com.alee.extended.date.WebDateField();
        insIssueDate = new com.alee.extended.date.WebDateField();
        txInsAmount = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtRevNo = new javax.swing.JTextField();
        txtRevAmount = new javax.swing.JTextField();
        revExpireDate = new com.alee.extended.date.WebDateField();
        revIssueDate = new com.alee.extended.date.WebDateField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtSpcialNote2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lableVehId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vehicle Registation-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicle Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboFuelType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboFuelType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Petrol", "Diesel" }));
        jPanel2.add(comboFuelType, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 400, 30));

        txtChassiNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txtChassiNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 400, 30));

        txtEngineNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txtEngineNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 400, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel2.setText("Fuel Type");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 80, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel4.setText("Engine No");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 80, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel6.setText("Model");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 80, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel7.setText("Chassis No");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, 20));

        setDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setDate.setText("set date here");
        jPanel2.add(setDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 80, 20));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel19.setText("Date");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 50, 20));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel5.setText("Special Note");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, 20));

        txtSpecialNote1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel5.add(txtSpecialNote1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 400, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 500, 60));

        txtModel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 400, 30));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("Vehicle No");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 20));

        txtVehicleNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVehicleNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVehicleNoKeyReleased(evt);
            }
        });
        jPanel7.add(txtVehicleNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 400, 30));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 520, 70));

        sadsada.setBackground(new java.awt.Color(255, 255, 255));
        sadsada.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        sadsada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        sadsada.add(lablePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 110));

        jPanel2.add(sadsada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 200, 110));

        btnCapture.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCapture.setText("CAPTURE");
        btnCapture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaptureActionPerformed(evt);
            }
        });
        jPanel2.add(btnCapture, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 120, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 550, 600));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 20, 520));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicle Insurance", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtInsHotline.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtInsHotline.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtInsHotlineFocusLost(evt);
            }
        });
        txtInsHotline.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInsHotlineKeyTyped(evt);
            }
        });
        jPanel3.add(txtInsHotline, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 420, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel8.setText("Name");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 120, 20));

        txInsName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txInsName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 420, 30));

        txtPolicyNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPolicyNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPolicyNoKeyReleased(evt);
            }
        });
        jPanel3.add(txtPolicyNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 420, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel1.setText("Expire");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 70, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel9.setText("Policy No");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 120, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel10.setText("Hotline");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 120, 20));

        insExpireDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        insExpireDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(insExpireDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 160, 30));

        insIssueDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        insIssueDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(insIssueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 160, 30));

        txInsAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txInsAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txInsAmountKeyTyped(evt);
            }
        });
        jPanel3.add(txInsAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 420, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel12.setText("Amount");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 120, 20));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel18.setText("Issue");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 120, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel20.setText("LKR");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 40, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 630, 290));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Revenue Licence", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRevNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtRevNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRevNoKeyReleased(evt);
            }
        });
        jPanel4.add(txtRevNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 420, 30));

        txtRevAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtRevAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRevAmountKeyTyped(evt);
            }
        });
        jPanel4.add(txtRevAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 420, 30));

        revExpireDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        revExpireDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel4.add(revExpireDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 160, 30));

        revIssueDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        revIssueDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel4.add(revIssueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 160, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel13.setText("Expire");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 120, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel14.setText("Revenue No");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 120, 20));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel15.setText("Amount");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 120, 20));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel17.setText("Issue");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 120, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel16.setText("Special Note");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, 20));

        txtSpcialNote2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel6.add(txtSpcialNote2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 420, 30));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 600, 50));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel11.setText("LKR");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 40, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 630, 210));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 590, 120, 40));

        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCancel.setText("CLEAR");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 590, 120, 40));

        lableVehId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lableVehId.setText("jLabel1");
        jPanel1.add(lableVehId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 120, 20));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        DateFormat df=new SimpleDateFormat("yyyy/MM/dd");        
        validateTxt();

        if (b == false) {
            try {
              String getId=null;
              if (btnSave.getText().equals("SAVE")) {
                 String insert_1="INSERT INTO vehicle(VehicleNumber,model,fuleType,EngineNo,ChassisNo,VehicleSpeciallNote,VehicleRegDate,Image) VALUES('"+txtVehicleNo.getText()+"','"+txtModel.getText()+"','"+comboFuelType.getSelectedItem()+"','"+txtEngineNo.getText()+"','"+txtChassiNo.getText()+"','"+txtSpecialNote1.getText()+"','"+setDate.getText()+"','"+path+"') ";
                 DB.idu(insert_1);
                 
                 ResultSet rs=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+txtVehicleNo.getText()+"' ");
                 while (rs.next()) {
                    getId=rs.getString("idVehicle");
                }            
                 String DateIssueIns=df.format(insIssueDate.getDate());
                 String DateExpireIns=df.format(insExpireDate.getDate());
                 
                 String insert_2="INSERT INTO vehicleinsurance(company,PolicyNo,DateIssue,DateExpire,hotline,idVehicle,amount) VALUES('"+txInsName.getText()+"','"+txtPolicyNo.getText()+"','"+DateIssueIns+"','"+DateExpireIns+"','"+txtInsHotline.getText()+"','"+getId+"','"+txInsAmount.getText()+"') ";
                 DB.idu(insert_2);
                 
                 String DateIssueRev=df.format(revIssueDate.getDate());
                 String DateExpireRev=df.format(revExpireDate.getDate());
                 
                 String insert_3="INSERT INTO revnuelicence(RevNumber,RevIssueDate,RevExpireDate,RevSpecialNote,Fee,idVehicle) VALUES('"+txtRevNo.getText()+"','"+DateIssueRev+"','"+DateExpireRev+"','"+txtSpcialNote2.getText()+"','"+txtRevAmount.getText()+"','"+getId+"') ";
                 DB.idu(insert_3);
                 
               }else{
                 String update_1="UPDATE vehicle SET VehicleNumber='"+txtVehicleNo.getText()+"',model='"+txtModel.getText()+"',fuleType='"+comboFuelType.getSelectedItem()+"',EngineNo='"+txtEngineNo.getText()+"',ChassisNo='"+txtChassiNo.getText()+"',VehicleSpeciallNote='"+txtSpecialNote1.getText()+"',VehicleRegDate='"+setDate.getText()+"',Image='"+path+"' WHERE idVehicle='"+lableVehId.getText()+"' "; 
                 DB.idu(update_1);
                 
                 String DateIssueIns=df.format(insIssueDate.getDate());
                 String DateExpireIns=df.format(insExpireDate.getDate());
                 String update_2="UPDATE vehicleinsurance SET company='"+txInsName.getText()+"',PolicyNo='"+txtPolicyNo.getText()+"',DateIssue='"+DateIssueIns+"',DateExpire='"+DateExpireIns+"',hotline='"+txtInsHotline.getText()+"',amount='"+txInsAmount.getText()+"' WHERE vehicleinsurance.idVehicle='"+lableVehId.getText()+"' "; 
                 DB.idu(update_2);
                 
                 String DateIssueRev=df.format(revIssueDate.getDate());
                 String DateExpireRev=df.format(revExpireDate.getDate());
                 String update_3="UPDATE revnuelicence SET RevNumber='"+txtRevNo.getText()+"',RevIssueDate='"+DateIssueRev+"',RevExpireDate='"+DateExpireRev+"',RevSpecialNote='"+txtSpcialNote2.getText()+"',Fee='"+txtRevAmount.getText()+"' WHERE revnuelicence.idVehicle='"+lableVehId.getText()+"' "; 
                 DB.idu(update_3);
                 clearField();
              }
            } catch (Exception e) {
                e.printStackTrace();
            }
            clearField();
        }else{
            NotificationPopup.fillFeilds();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtInsHotlineFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInsHotlineFocusLost
        if (txtInsHotline.getText().isEmpty()) {
            txtInsHotline.grabFocus();
        }else if (txtInsHotline.getText().length()!=10) {
            txtInsHotline.grabFocus();
            NotificationInvalidNumber.noty();
        }
    }//GEN-LAST:event_txtInsHotlineFocusLost

    private void txtInsHotlineKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInsHotlineKeyTyped
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) || txtInsHotline.getText().length()==10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtInsHotlineKeyTyped

    private void txtVehicleNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleNoKeyReleased
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        try {
            ResultSet rs=DB.search("SELECT v.*,vi.*,rl.* FROM vehicle v INNER JOIN vehicleinsurance vi ON vi.idVehicle=v.idVehicle INNER JOIN revnuelicence rl ON rl.idVehicle=v.idVehicle WHERE VehicleNumber='"+txtVehicleNo.getText()+"' ");
            //ResultSet rs=DB.search("select * from vehicle where VehicleNumber='"+txtVehicleNo.getText()+"' ");
            if (rs.next()) {
                lableVehId.setText(rs.getString("idVehicle"));
                String s1=rs.getString("EngineNo");
                txtEngineNo.setText(s1);
                String s2=rs.getString("ChassisNo");
                txtChassiNo.setText(s2);
                String s3=rs.getString("VehicleSpeciallNote");
                txtSpecialNote1.setText(s3);
                String s4=rs.getString("model");
                txtModel.setText(s4);
                String s5=rs.getString("fuleType");
                comboFuelType.setSelectedItem(s5);
                String s6=rs.getString("VehicleRegDate");
                setDate.setText(s6);
                String s7=rs.getString("company");
                txInsName.setText(s7);
                String s8=rs.getString("PolicyNo");
                txtPolicyNo.setText(s8);
                String s9=rs.getString("hotline");
                txtInsHotline.setText(s9);
                String s10=rs.getString("amount");
                txInsAmount.setText(s10);
                String s11=rs.getString("DateIssue");
                insIssueDate.setDate(sdf.parse(s11));
                String s12=rs.getString("DateExpire");
                insExpireDate.setDate(sdf.parse(s12));
                String s13=rs.getString("RevNumber");
                txtRevNo.setText(s13);
                String s14=rs.getString("Fee");
                txtRevAmount.setText(s14);
                String s15=rs.getString("RevSpecialNote");
                txtSpcialNote2.setText(s15);
                String s16=rs.getString("RevIssueDate");
                revIssueDate.setDate(sdf.parse(s16));
                String s17=rs.getString("RevExpireDate");
                revExpireDate.setDate(sdf.parse(s17));
                
                btnSave.setText("UPDATE");
                
                path=rs.getString("Image");
                 
                 String encoder=EncodeDecodeImage.encoder(path);
                 ImageIcon decoder=EncodeDecodeImage.decoder(encoder);
                 lablePicture.setIcon(decoder);
 
            }else{
//                clearField();
//                btnSave.setText("SAVE");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtVehicleNoKeyReleased

    private void txtPolicyNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPolicyNoKeyReleased
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        try {
            ResultSet rs=DB.search("SELECT v.*,vi.*,rl.* FROM vehicle v INNER JOIN vehicleinsurance vi ON vi.idVehicle = v.idVehicle INNER JOIN revnuelicence rl ON rl.idVehicle = v.idVehicle WHERE PolicyNo='"+txtPolicyNo.getText()+"' ");
            if (rs.next()) {
                String s1=rs.getString("EngineNo");
                txtEngineNo.setText(s1);
                String s2=rs.getString("ChassisNo");
                txtChassiNo.setText(s2);
                String s3=rs.getString("VehicleSpeacelNote");
                txtSpecialNote1.setText(s3);
                String s4=rs.getString("model");
                txtModel.setText(s4);
                String s5=rs.getString("fuleType");
                comboFuelType.setSelectedItem(s5);
                String s6=rs.getString("VehicleRegDate");
                setDate.setText(s6);
                String s7=rs.getString("company");
                txInsName.setText(s7);
                String s8=rs.getString("VehicleNumber");
                txtVehicleNo.setText(s8);
                String s9=rs.getString("hotline");
                txtInsHotline.setText(s9);
                String s10=rs.getString("amount");
                txInsAmount.setText(s10);
                String s11=rs.getString("DateIssue");
                insIssueDate.setDate(sdf.parse(s11));
                String s12=rs.getString("DateExpire");
                insExpireDate.setDate(sdf.parse(s12));
                String s13=rs.getString("RevNumber");
                txtRevNo.setText(s13);
                String s14=rs.getString("Fee");
                txtRevAmount.setText(s14);
                String s15=rs.getString("RevSpecialNote");
                txtSpcialNote2.setText(s15);
                String s16=rs.getString("RevIssueDate");
                revIssueDate.setDate(sdf.parse(s16));
                String s17=rs.getString("RevExpireDate");
                revExpireDate.setDate(sdf.parse(s17));
                
                btnSave.setText("UPDATE");
                
                 path=rs.getString("Image");
                 
                 String encoder=EncodeDecodeImage.encoder(path);
                 ImageIcon decoder=EncodeDecodeImage.decoder(encoder);
                 lablePicture.setIcon(decoder);
 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtPolicyNoKeyReleased

    private void txtRevNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRevNoKeyReleased
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        try {
            ResultSet rs=DB.search("SELECT v.*,vi.*,rl.* FROM vehicle v INNER JOIN vehicleinsurance vi ON vi.idVehicle = v.idVehicle INNER JOIN revnuelicence rl ON rl.idVehicle = v.idVehicle WHERE RevNumber='"+txtRevNo.getText()+"' ");
            if (rs.next()) {
                String s1=rs.getString("EngineNo");
                txtEngineNo.setText(s1);
                String s2=rs.getString("ChassisNo");
                txtChassiNo.setText(s2);
                String s3=rs.getString("VehicleSpeacelNote");
                txtSpecialNote1.setText(s3);
                String s4=rs.getString("model");
                txtModel.setText(s4);
                String s5=rs.getString("fuleType");
                comboFuelType.setSelectedItem(s5);
                String s6=rs.getString("VehicleRegDate");
                setDate.setText(s6);
                String s7=rs.getString("company");
                txInsName.setText(s7);
                String s8=rs.getString("VehicleNumber");
                txtVehicleNo.setText(s8);
                String s9=rs.getString("hotline");
                txtInsHotline.setText(s9);
                String s10=rs.getString("amount");
                txInsAmount.setText(s10);
                String s11=rs.getString("DateIssue");
                insIssueDate.setDate(sdf.parse(s11));
                String s12=rs.getString("DateExpire");
                insExpireDate.setDate(sdf.parse(s12));
                String s13=rs.getString("PolicyNo");
                txtPolicyNo.setText(s13);
                String s14=rs.getString("Fee");
                txtRevAmount.setText(s14);
                String s15=rs.getString("RevSpecialNote");
                txtSpcialNote2.setText(s15);
                String s16=rs.getString("RevIssueDate");
                revIssueDate.setDate(sdf.parse(s16));
                String s17=rs.getString("RevExpireDate");
                revExpireDate.setDate(sdf.parse(s17));
                
                btnSave.setText("UPDATE");
                
                 path=rs.getString("Image");
                 
                 String encoder=EncodeDecodeImage.encoder(path);
                 ImageIcon decoder=EncodeDecodeImage.decoder(encoder);
                 lablePicture.setIcon(decoder);
 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtRevNoKeyReleased

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clearField();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txInsAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txInsAmountKeyTyped
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txInsAmountKeyTyped

    private void txtRevAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRevAmountKeyTyped
                char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRevAmountKeyTyped

    private void btnCaptureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaptureActionPerformed
        JFileChooser fc=new JFileChooser();
        int showDialog=fc.showDialog(null, "open");
        File sf=fc.getSelectedFile();
        path =sf.getAbsolutePath();
        path=path.replace('\\', '/');
        
        encoder =EncodeDecodeImage.encoder(path);
        ImageIcon decoder=EncodeDecodeImage.decoder(encoder);
        lablePicture.setIcon(decoder);
    }//GEN-LAST:event_btnCaptureActionPerformed


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCapture;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboFuelType;
    private com.alee.extended.date.WebDateField insExpireDate;
    private com.alee.extended.date.WebDateField insIssueDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lablePicture;
    private javax.swing.JLabel lableVehId;
    private com.alee.extended.date.WebDateField revExpireDate;
    private com.alee.extended.date.WebDateField revIssueDate;
    private javax.swing.JPanel sadsada;
    private javax.swing.JLabel setDate;
    private javax.swing.JTextField txInsAmount;
    private javax.swing.JTextField txInsName;
    private javax.swing.JTextField txtChassiNo;
    private javax.swing.JTextField txtEngineNo;
    private javax.swing.JTextField txtInsHotline;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPolicyNo;
    private javax.swing.JTextField txtRevAmount;
    private javax.swing.JTextField txtRevNo;
    private javax.swing.JTextField txtSpcialNote2;
    private javax.swing.JTextField txtSpecialNote1;
    private javax.swing.JTextField txtVehicleNo;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            VehicleRegister.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            VehicleRegister.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void autoSetDate() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd");
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
        java.awt.Component[] cp1 =jPanel3.getComponents();
        for (java.awt.Component c1 : cp1) {
             if (c1 instanceof JTextField) {
                if (((JTextField) c1).getText().isEmpty()) {
                    b = true;
                    break;
                }else{
                b=false;              
                }
            }
        }
        java.awt.Component[] cp2 =jPanel4.getComponents();
        for (java.awt.Component c2 : cp2) {
             if (c2 instanceof JTextField) {
                if (((JTextField) c2).getText().isEmpty()) {
                    b = true;
                    break;
                }else{
                b=false;              
                }
            }
        }
      }
          
       private void clearField(){
           lablePicture.setText(null);
           comboFuelType.setSelectedIndex(0);
           txtModel.setText("");
           insExpireDate.setDate(null);
           insIssueDate.setDate(null);
           revIssueDate.setDate(null);
           revExpireDate.setDate(null);
           txtSpecialNote1.setText("");
           txtSpcialNote2.setText("");
           btnSave.setText("SAVE");
           
        java.awt.Component[] cp = jPanel2.getComponents();
        for (java.awt.Component c : cp) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText(null);
            }
        }
        java.awt.Component[] cp1 = jPanel3.getComponents();
        for (java.awt.Component c1 : cp1) {
            if (c1 instanceof JTextField) {
                ((JTextField) c1).setText(null);
            }
        }
        java.awt.Component[] cp2 = jPanel4.getComponents();
        for (java.awt.Component c2 : cp2) {
            if (c2 instanceof JTextField) {
                ((JTextField) c2).setText(null);
            }
        }
        txtVehicleNo.setText("");
        autoSetDate();
       } 
}
