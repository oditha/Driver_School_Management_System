
package Vehicle;

import ExtenelClasses.DB;
import ExtenelClasses.EncodeDecodeImage;
import ExtenelClasses.NotificationPopup;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InsuranceClaim extends javax.swing.JFrame {
static boolean maximized = true;
boolean b=false;
String path1;
String path2;
String path3;
String path4;
String path5;
String path6;
String encoder;
String encoder1;
String encoder2;
String encoder3;
String encoder4;
String encoder5;
String encoder6;
    public InsuranceClaim() {
        initComponents();
        maximizeWindow();
        setVehicle();
        autoSetDate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        comboVehicle1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtInsCompany = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIssueClaim = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRepireCost = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        setDate = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtReqAmount = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        webDate = new com.alee.extended.date.WebDateField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lable1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lable2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lable3 = new javax.swing.JLabel();
        btnSelect3 = new javax.swing.JButton();
        btnSelect2 = new javax.swing.JButton();
        btnSelect1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lable4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lable5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lable6 = new javax.swing.JLabel();
        btnSelect6 = new javax.swing.JButton();
        btnSelect4 = new javax.swing.JButton();
        btnSelect5 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        comboDate = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        comboVehicle2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Insurance Claim-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboVehicle1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboVehicle1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Vehicle" }));
        comboVehicle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVehicle1ActionPerformed(evt);
            }
        });
        jPanel2.add(comboVehicle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 280, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel4.setText("Insurance Company");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, 20));

        txtInsCompany.setEditable(false);
        txtInsCompany.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txtInsCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 280, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel6.setText("Issue Claim");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 120, 20));

        txtIssueClaim.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtIssueClaim.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIssueClaim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIssueClaimActionPerformed(evt);
            }
        });
        txtIssueClaim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIssueClaimKeyTyped(evt);
            }
        });
        jPanel2.add(txtIssueClaim, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 240, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel8.setText("Repire Cost");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, 20));

        txtRepireCost.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtRepireCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRepireCost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRepireCostKeyTyped(evt);
            }
        });
        jPanel2.add(txtRepireCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 240, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel7.setText("Description");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, 20));

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 280, 100));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel5.setText("LKR");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 70, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel10.setText("LKR");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 70, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel9.setText("Date of accident");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 110, 20));

        setDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setDate.setText("set Date here");
        jPanel2.add(setDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 80, 20));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 120, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Request Amount");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, 20));

        txtReqAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtReqAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtReqAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtReqAmountKeyTyped(evt);
            }
        });
        jPanel2.add(txtReqAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 240, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel11.setText("LKR");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 70, 20));

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 120, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel12.setText("Select Vehicle");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 20));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel14.setText("Date");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 70, 20));

        webDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(webDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 280, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 470, 570));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "After Accident", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(lable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 110));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 110));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(lable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 110));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 200, 110));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(lable3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 110));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 200, 110));

        btnSelect3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSelect3.setText("SELECT");
        btnSelect3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelect3ActionPerformed(evt);
            }
        });
        jPanel3.add(btnSelect3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 120, 30));

        btnSelect2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSelect2.setText("SELECT");
        btnSelect2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelect2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnSelect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 120, 30));

        btnSelect1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSelect1.setText("SELECT");
        btnSelect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelect1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnSelect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 120, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 720, 200));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Before Accident", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(lable4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 110));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 200, 110));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(lable5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 110));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 200, 110));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(lable6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 110));

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 200, 110));

        btnSelect6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSelect6.setText("SELECT");
        btnSelect6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelect6ActionPerformed(evt);
            }
        });
        jPanel5.add(btnSelect6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 120, 30));

        btnSelect4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSelect4.setText("SELECT");
        btnSelect4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelect4ActionPerformed(evt);
            }
        });
        jPanel5.add(btnSelect4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 120, 30));

        btnSelect5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSelect5.setText("SELECT");
        btnSelect5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelect5ActionPerformed(evt);
            }
        });
        jPanel5.add(btnSelect5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 120, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 720, 210));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filter By", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Date--" }));
        comboDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDateActionPerformed(evt);
            }
        });
        jPanel11.add(comboDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 200, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("Select Date");
        jPanel11.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 90, 20));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel13.setText("Select Vehicle");
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 20));

        comboVehicle2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboVehicle2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Vehicle--" }));
        comboVehicle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVehicle2ActionPerformed(evt);
            }
        });
        jPanel11.add(comboVehicle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 260, 30));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 720, 120));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIssueClaimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIssueClaimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIssueClaimActionPerformed

    private void txtIssueClaimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIssueClaimKeyTyped
                            char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtIssueClaimKeyTyped

    private void txtRepireCostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRepireCostKeyTyped
                            char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtRepireCostKeyTyped

    private void btnSelect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelect1ActionPerformed
        JFileChooser fc=new JFileChooser();
        int showDialog=fc.showDialog(null, "open");
        File sf=fc.getSelectedFile();
        path1 =sf.getAbsolutePath();
        path1=path1.replace('\\', '/');
        
        encoder =EncodeDecodeImage.encoder(path1);
        ImageIcon decoder=EncodeDecodeImage.decoder(encoder);
        lable1.setIcon(decoder);
    }//GEN-LAST:event_btnSelect1ActionPerformed

    private void btnSelect2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelect2ActionPerformed
        JFileChooser fc=new JFileChooser();
        int showDialog=fc.showDialog(null, "open");
        File sf=fc.getSelectedFile();
        path2 =sf.getAbsolutePath();
        path2=path2.replace('\\', '/');
        
        encoder =EncodeDecodeImage.encoder(path2);
        ImageIcon decoder=EncodeDecodeImage.decoder(encoder);
        lable2.setIcon(decoder);
    }//GEN-LAST:event_btnSelect2ActionPerformed

    private void btnSelect3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelect3ActionPerformed
        JFileChooser fc=new JFileChooser();
        int showDialog=fc.showDialog(null, "open");
        File sf=fc.getSelectedFile();
        path3 =sf.getAbsolutePath();
        path3=path3.replace('\\', '/');
        
        encoder =EncodeDecodeImage.encoder(path3);
        ImageIcon decoder=EncodeDecodeImage.decoder(encoder);
        lable3.setIcon(decoder);
    }//GEN-LAST:event_btnSelect3ActionPerformed

    private void btnSelect4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelect4ActionPerformed
        JFileChooser fc=new JFileChooser();
        int showDialog=fc.showDialog(null, "open");
        File sf=fc.getSelectedFile();
        path4 =sf.getAbsolutePath();
        path4=path4.replace('\\', '/');
        
        encoder =EncodeDecodeImage.encoder(path4);
        ImageIcon decoder=EncodeDecodeImage.decoder(encoder);
        lable4.setIcon(decoder);
    }//GEN-LAST:event_btnSelect4ActionPerformed

    private void btnSelect5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelect5ActionPerformed
        JFileChooser fc=new JFileChooser();
        int showDialog=fc.showDialog(null, "open");
        File sf=fc.getSelectedFile();
        path5 =sf.getAbsolutePath();
        path5=path5.replace('\\', '/');
        
        encoder =EncodeDecodeImage.encoder(path5);
        ImageIcon decoder=EncodeDecodeImage.decoder(encoder);
        lable5.setIcon(decoder);
    }//GEN-LAST:event_btnSelect5ActionPerformed

    private void btnSelect6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelect6ActionPerformed
        JFileChooser fc=new JFileChooser();
        int showDialog=fc.showDialog(null, "open");
        File sf=fc.getSelectedFile();
        path6 =sf.getAbsolutePath();
        path6=path6.replace('\\', '/');
        
        encoder =EncodeDecodeImage.encoder(path6);
        ImageIcon decoder=EncodeDecodeImage.decoder(encoder);
        lable6.setIcon(decoder);
    }//GEN-LAST:event_btnSelect6ActionPerformed

    private void txtReqAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReqAmountKeyTyped
                                    char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtReqAmountKeyTyped

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String getVehicle=(String) comboVehicle1.getSelectedItem();
        String getVehicle1=(String) comboVehicle2.getSelectedItem();
        String getId=null;
        String getId1=null;
        String getInsId=null;
        String getClaimId=null;
        try {
            validateTxt();
            if (b==false) {
                if (txtDescription.getText().isEmpty()) {
                    NotificationPopup.fillFeilds();
                }else{
                   DateFormat df=new SimpleDateFormat("yyyy/MM/dd");
                   String getDate=df.format(webDate.getDate());
                    if (btnSave.getText().equals("SAVE")) {
                         String[] getVehicleId=getVehicle.split(" ");
                         ResultSet rs=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+getVehicleId[0]+"' ");
                         while (rs.next()) {
                            getId=rs.getString("idVehicle");
                        }
                        ResultSet rs1=DB.search("SELECT * FROM vehicleinsurance WHERE idVehicle='"+getId+"' ");
                        while (rs1.next()) {                        
                           getInsId=rs1.getString("idVehicleInsurance");
                        }
                        DB.idu("INSERT INTO insuranceclaim(date,RequestAmount,PaidtAmount,RepireCost,DateAccident,Description,idVehicle,idVehicleInsurance) VALUES('"+setDate.getText()+"','"+txtReqAmount.getText()+"','"+txtIssueClaim.getText()+"','"+txtRepireCost.getText()+"','"+getDate+"','"+txtDescription.getText()+"','"+getId+"','"+getInsId+"') ");
                    
                        ResultSet rs2=DB.search("SELECT * FROM insuranceclaim ORDER BY idInsuranceClaim DESC LIMIT 1 ");
                        while (rs2.next()) {                        
                           getClaimId=rs2.getString("idInsuranceClaim");                       
                        }
                        DB.idu("INSERT INTO vehicleinsurance_has_insuranceclaim(idVehicleInsurance,idInsuranceClaim,Image1,Image2,Image3,Image4,Image5,Image6) VALUES('"+getInsId+"','"+getClaimId+"','"+path1+"','"+path2+"','"+path3+"','"+path4+"','"+path5+"','"+path6+"') ");
                        
                        String insert_2="INSERT INTO incomeexpence(Date,Description,Income,Expence) VALUES('"+setDate.getText()+"','Insurance Claim','"+txtIssueClaim.getText()+"','0') ";
                        DB.idu(insert_2);
                    }else{
//                         String[] getVehicleId1=getVehicle1.split(" ");
//                         ResultSet rs=DB.search("SELECT * FROM vehicle WHERE VehicleNumber='"+getVehicleId1[0]+"' ");
//                         while (rs.next()) {
//                            getId1=rs.getString("idVehicle");
//                        }
//                        DB.idu("UPDATE insuranceclaim SET RequestAmount='"+txtReqAmount.getText()+"',PaidtAmount='"+txtIssueClaim.getText()+"',RepireCost='"+txtRepireCost.getText()+"',Description='"+txtDescription.getText()+"' WHERE date='"+comboDate.getSelectedItem()+"' AND idVehicle='"+getId1+"' ");
                    }

                    
                }
                clear();
            }else{
                NotificationPopup.fillFeilds();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void comboVehicle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVehicle1ActionPerformed
        String getVehicleNo=(String) comboVehicle1.getSelectedItem();
        String getCompany=null;
        if (comboVehicle1.getSelectedIndex()!=0) {
            try {
                String[] getVehicleId=getVehicleNo.split(" ");
                ResultSet rs=DB.search("SELECT v.*,vi.* FROM vehicle v INNER JOIN vehicleinsurance vi ON v.idVehicle=vi.idVehicle WHERE VehicleNumber='"+getVehicleId[0]+"' ");
                while (rs.next()) {
                    getCompany=rs.getString("company");
                }
                txtInsCompany.setText(getCompany);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            txtInsCompany.setText("");
        }
    }//GEN-LAST:event_comboVehicle1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void comboVehicle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVehicle2ActionPerformed
        String getVehicleNo=(String) comboVehicle2.getSelectedItem();
        String getDate=null;
        if (comboVehicle2.getSelectedIndex()!=0) {
            try {
                String[] getVehicleId=getVehicleNo.split(" ");
                ResultSet rs=DB.search("SELECT v.*,ic.* FROM vehicle v INNER JOIN insuranceclaim ic ON v.idVehicle=ic.idVehicle WHERE VehicleNumber='"+getVehicleId[0]+"' ORDER BY date DESC");
                comboDate.removeAllItems();
                comboDate.addItem("--Select Date--");
                while (rs.next()) {
                     getDate=rs.getString("date");

                     comboDate.addItem(getDate);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            comboDate.removeAllItems();
            comboDate.addItem("--Select Date--");
        }
        
    }//GEN-LAST:event_comboVehicle2ActionPerformed

    private void comboDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDateActionPerformed
        DateFormat df=new SimpleDateFormat("yyyy/MM/dd");
        if (comboDate.getSelectedIndex()!=0) {
            try {
                ResultSet rs=DB.search("SELECT v.*,vi.*,ic.*,vhi.* FROM vehicle v INNER JOIN vehicleinsurance vi ON v.idVehicle=vi.idVehicle INNER JOIN insuranceclaim ic ON vi.idVehicleInsurance=ic.idVehicleInsurance INNER JOIN vehicleinsurance_has_insuranceclaim vhi ON ic.idInsuranceClaim=vhi.idInsuranceClaim WHERE date='"+comboDate.getSelectedItem()+"' ");
                if (rs.next()) {
                    String s1=rs.getString("VehicleNumber");
                    String s2=rs.getString("model");
                    comboVehicle1.setSelectedItem(s1+" ("+s2+")");
                    txtReqAmount.setText(rs.getString("RequestAmount"));
                    txtIssueClaim.setText(rs.getString("PaidtAmount"));
                    txtRepireCost.setText(rs.getString("RepireCost"));
                    txtDescription.setText(rs.getString("Description"));
                    webDate.setDate(df.parse(rs.getString("DateAccident")));
                    setDate.setText(rs.getString("date"));
                    
                   // btnSave.setText("UPDATE");
                    
                 path1=rs.getString("Image1");
                 path2=rs.getString("Image2");
                 path3=rs.getString("Image3");
                 path4=rs.getString("Image4");
                 path5=rs.getString("Image5");
                 path6=rs.getString("Image6");
                 
                 String encoder1=EncodeDecodeImage.encoder(path1);
                 ImageIcon decoder1=EncodeDecodeImage.decoder(encoder1);
                 lable1.setIcon(decoder1);
                 
                 String encoder2 =EncodeDecodeImage.encoder(path2);
                 ImageIcon decoder2=EncodeDecodeImage.decoder(encoder2);
                 lable2.setIcon(decoder2);
                 
                 String encoder3=EncodeDecodeImage.encoder(path3);
                 ImageIcon decoder3=EncodeDecodeImage.decoder(encoder3);
                 lable3.setIcon(decoder3);
                 
                 String encoder4=EncodeDecodeImage.encoder(path4);
                 ImageIcon decoder4=EncodeDecodeImage.decoder(encoder4);
                 lable4.setIcon(decoder4);
                 
                 String encoder5=EncodeDecodeImage.encoder(path5);
                 ImageIcon decoder5=EncodeDecodeImage.decoder(encoder5);
                 lable5.setIcon(decoder5);
                 
                 String encoder6=EncodeDecodeImage.encoder(path6);
                 ImageIcon decoder6=EncodeDecodeImage.decoder(encoder6);
                 lable6.setIcon(decoder6);
                 
                 
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_comboDateActionPerformed


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsuranceClaim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSelect1;
    private javax.swing.JButton btnSelect2;
    private javax.swing.JButton btnSelect3;
    private javax.swing.JButton btnSelect4;
    private javax.swing.JButton btnSelect5;
    private javax.swing.JButton btnSelect6;
    private javax.swing.JComboBox<String> comboDate;
    private javax.swing.JComboBox<String> comboVehicle1;
    private javax.swing.JComboBox<String> comboVehicle2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lable1;
    private javax.swing.JLabel lable2;
    private javax.swing.JLabel lable3;
    private javax.swing.JLabel lable4;
    private javax.swing.JLabel lable5;
    private javax.swing.JLabel lable6;
    private javax.swing.JLabel setDate;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtInsCompany;
    private javax.swing.JTextField txtIssueClaim;
    private javax.swing.JTextField txtRepireCost;
    private javax.swing.JTextField txtReqAmount;
    private com.alee.extended.date.WebDateField webDate;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            InsuranceClaim.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            InsuranceClaim.this.setMaximizedBounds(gv.getMaximumWindowBounds());
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
        
        java.awt.Component[] cp1 =jPanel3.getComponents();
        for (java.awt.Component c1 : cp1) {
             if (c1 instanceof JLabel) {
                if (((JLabel) c1).getIcon()==null) {
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
            ResultSet rs=DB.search("SELECT * FROM vehicle");
            while (rs.next()) {
                String getVehicleNo=rs.getString("VehicleNumber");
                String getVehicleModel=rs.getString("model");
                
                comboVehicle1.addItem(getVehicleNo+" ("+getVehicleModel+")");
                comboVehicle2.addItem(getVehicleNo+" ("+getVehicleModel+")");
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
    
    private void clear(){
//        btnSave.setText("SAVE");
        autoSetDate();
        comboVehicle1.setSelectedIndex(0);
        txtDescription.setText("");
        lable1.setText(null);
        lable2.setText(null);
        lable3.setText(null);
        lable4.setText(null);
        lable5.setText(null);
        lable6.setText(null);
        java.awt.Component[] cp = jPanel2.getComponents();
        for (java.awt.Component c : cp) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText(null);
            }
        }
    }
}
