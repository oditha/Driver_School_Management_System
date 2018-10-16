package Student;

import ExtenelClasses.DB;
import ExtenelClasses.EncodeDecodeImage;
import ExtenelClasses.NotificationInvalidNumber;
import ExtenelClasses.NotificationPopup;
import ExtenelClasses.df;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class StudentRegistation extends javax.swing.JFrame {

    static boolean maximized = true;
    boolean b = false;
    String path;
    String encoder;

    public StudentRegistation() {
        initComponents();
        maximizeWindow();
        setDate();
        tableDecor();
        setVehicleCategory();
        ResultSet rs = null;
        Loadno();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtPerAddress = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtTPMobile = new javax.swing.JTextField();
        txtNic = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtRegNo = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lablePicture = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btnPayment = new javax.swing.JButton();
        btnCapture = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        nklr = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        comboMonth = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtDOBYear = new javax.swing.JTextField();
        txtDOBDate = new javax.swing.JTextField();
        comboVehicleCat = new javax.swing.JComboBox<>();
        txtSubTotal = new javax.swing.JLabel();
        comboType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudent = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        btnTableClearSelect = new javax.swing.JButton();
        checkFemale = new javax.swing.JRadioButton();
        checkMale = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        btnTableClearAll = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPassportNo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtLPNo = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtOldDL = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        setDate2 = new com.alee.extended.date.WebDateField();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtResAddress = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txtTPBusiness = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtTPHome = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        lableStudentID = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        maxstno = new javax.swing.JLabel();
        maxreg1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Registation-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 420, 30));

        txtPerAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPerAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPerAddressFocusLost(evt);
            }
        });
        jPanel1.add(txtPerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 380, 30));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel21.setText("TP Mobile");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 120, 20));

        txtTPMobile.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTPMobile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTPMobileFocusLost(evt);
            }
        });
        txtTPMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTPMobileKeyTyped(evt);
            }
        });
        jPanel1.add(txtTPMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 380, 30));

        txtNic.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNicKeyReleased(evt);
            }
        });
        jPanel1.add(txtNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 180, 30));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel28.setText("Full Name");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 120, 20));

        txtRegNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtRegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegNoActionPerformed(evt);
            }
        });
        txtRegNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRegNoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRegNoKeyReleased(evt);
            }
        });
        jPanel1.add(txtRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 90, 30));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel29.setText("NIC");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 120, 20));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel30.setText("Student Image");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 100, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(lablePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 190));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 150, 190));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel32.setText("Permanent Address");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 120, 20));

        btnPayment.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPayment.setText("ADD PAYMENT");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });
        jPanel1.add(btnPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 630, 270, 40));

        btnCapture.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCapture.setText("CAPTURE");
        btnCapture.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnCaptureFocusLost(evt);
            }
        });
        btnCapture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaptureActionPerformed(evt);
            }
        });
        jPanel1.add(btnCapture, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 180, 120, 40));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 630, 120, 40));

        nklr.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        nklr.setForeground(new java.awt.Color(255, 0, 51));
        nklr.setText("NKLR -");
        jPanel1.add(nklr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 60, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel18.setText("Month");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 80, 20));

        comboMonth.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel5.add(comboMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 90, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel16.setText("Year");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 50, 20));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel15.setText("Date");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 60, 20));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel17.setText("DOB");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 20));

        txtDOBYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDOBYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDOBYearFocusLost(evt);
            }
        });
        jPanel5.add(txtDOBYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 80, 30));

        txtDOBDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel5.add(txtDOBDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 80, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 510, 50));

        comboVehicleCat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboVehicleCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category" }));
        comboVehicleCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVehicleCatActionPerformed(evt);
            }
        });
        jPanel1.add(comboVehicleCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 180, 30));

        txtSubTotal.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        txtSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSubTotal.setText("0.00");
        jPanel1.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 570, 150, 20));

        comboType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Full Time", "Part Time" }));
        comboType.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboTypePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        comboType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTypeActionPerformed(evt);
            }
        });
        jPanel1.add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 270, 180, 30));

        tableStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle Category", "Type", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableStudent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableStudentKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableStudent);
        if (tableStudent.getColumnModel().getColumnCount() > 0) {
            tableStudent.getColumnModel().getColumn(0).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 550, 160));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel34.setText("Vehicle Category");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 120, 20));

        btnTableClearSelect.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnTableClearSelect.setText("CLEAR SELECTED");
        btnTableClearSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableClearSelectActionPerformed(evt);
            }
        });
        jPanel1.add(btnTableClearSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, 140, 30));

        checkFemale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkFemale);
        checkFemale.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        checkFemale.setText("Famale");
        checkFemale.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                checkFemaleFocusLost(evt);
            }
        });
        jPanel1.add(checkFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        checkMale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkMale);
        checkMale.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        checkMale.setText("Male");
        checkMale.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                checkMaleFocusLost(evt);
            }
        });
        jPanel1.add(checkMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel14.setText("Gender");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 80, 20));

        btnTableClearAll.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnTableClearAll.setText("CLEAR TABLE");
        btnTableClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableClearAllActionPerformed(evt);
            }
        });
        jPanel1.add(btnTableClearAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 120, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel4.setText("Passport No");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 20));

        txtPassportNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPassportNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassportNoKeyReleased(evt);
            }
        });
        jPanel3.add(txtPassportNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, 30));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel25.setText("LP No");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 30));

        txtLPNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtLPNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLPNoFocusLost(evt);
            }
        });
        txtLPNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLPNoKeyReleased(evt);
            }
        });
        jPanel3.add(txtLPNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 150, 30));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel26.setText("Old DL");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 50, 20));

        txtOldDL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtOldDL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOldDLKeyReleased(evt);
            }
        });
        jPanel3.add(txtOldDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 180, 30));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel27.setText("Date");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 120, 30));

        setDate2.setDateFormat(new SimpleDateFormat("dd.MM.yyyy"));
        setDate2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd.MM.yyyy"))));
        jPanel3.add(setDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 180, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 570, 100));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel19.setText("Residental Address");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, 20));

        txtResAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtResAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtResAddressFocusLost(evt);
            }
        });
        jPanel6.add(txtResAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 380, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 600, 60));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTPBusiness.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTPBusiness.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTPBusinessFocusLost(evt);
            }
        });
        txtTPBusiness.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTPBusinessKeyTyped(evt);
            }
        });
        jPanel7.add(txtTPBusiness, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 380, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel20.setText("TP Home");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 20));

        txtTPHome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTPHome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTPHomeFocusLost(evt);
            }
        });
        txtTPHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTPHomeMouseClicked(evt);
            }
        });
        txtTPHome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTPHomeKeyTyped(evt);
            }
        });
        jPanel7.add(txtTPHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 380, 30));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel35.setText("TP Business/Office");
        jPanel7.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 20));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 570, 100));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel24.setText("Student Position");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, 120, 20));

        txtPosition.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 630, 380, 30));

        lableStudentID.setText("jLabel1");
        jPanel1.add(lableStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 110, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel36.setText("Sub Total");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 570, 70, 20));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel37.setText("LKR");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 570, 70, 20));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel38.setText("Type");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 280, 70, 20));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Discount");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, 20));

        txtDiscount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDiscount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiscountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiscountKeyTyped(evt);
            }
        });
        jPanel8.add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 150, 30));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel39.setText("LKR");
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 70, 20));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 490, 290, 70));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel8.setText("Maximum Registerd no");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 150, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel6.setText("Lsat Entered no");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 120, 20));

        maxstno.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        maxstno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(maxstno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 110, 20));

        maxreg1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        maxreg1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(maxreg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 100, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel7.setText("Register No");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 80, 30));

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 630, 120, 40));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();
        String getIdClass = null;
        String getIdStudent = null;
        String getId = null;
        validateTxt();
        if (b == false) {
            if (txtSubTotal.getText().equals("0.00")) {
                NotificationPopup.fillFeilds();
            } else {
                String gen;
                if (checkMale.isSelected()) {
                    gen = "Male";
                } else {
                    gen = "Female";
                }
                String getDob = (txtDOBDate.getText() + "." + comboMonth.getSelectedItem().toString() + "." + txtDOBYear.getText());
                try {
                    String getcategory = comboVehicleCat.getSelectedItem().toString();
                    String getRegNo = txtRegNo.getText();

                    if (btnSave.getText().equals("SAVE")) {
                        String insert_1 = "INSERT INTO students (RegNo,NIC,PassportNo,OldDLNo,FullName,LPNumber,DOB,Gender,AddressPermenent,AddressResident,CourseFee,TpHome,TpBusiness,TpPersonal,Image,RegisterDate,StudentPosition)"
                                + " VALUES ('" + "NKLR-" + txtRegNo.getText().toUpperCase() + "','" + txtNic.getText() + "','" + txtPassportNo.getText() + "','" + txtOldDL.getText() + "','" + txtName.getText() + "','" + txtLPNo.getText() + "','" + 
                                getDob + "','" + gen + "','" + txtPerAddress.getText() + "','" + txtResAddress.getText() + "','" + txtSubTotal.getText() + "','" + txtTPHome.getText() + "','" + txtTPBusiness.getText() + "','" + txtTPMobile.getText() + "','" + path + "','" + setDate2.getText() + "','" + txtPosition.getText() + "') ";

                        DB.idu(insert_1);

                        for (int i = 0; i < dtm.getRowCount(); i++) {
                            String getVehicleCat = (String) tableStudent.getValueAt(i, 0);
                            ResultSet rs1 = DB.search("SELECT * FROM vehicleclasses WHERE VehicleClasseName='" + getVehicleCat + "' ");
                            if (rs1.next()) {
                                getIdClass = rs1.getString("idVehicleClasses");
                                System.out.println("getIdClass = "+ getIdClass);
                            }
                            ResultSet rs2 = DB.search("SELECT * FROM students WHERE RegNo='" + "NKLR-" + txtRegNo.getText() + "' ");
                            if (rs2.next()) {
                                getIdStudent = rs2.getString("idstudents");
                                 System.out.println("getIdStudent = "+ getIdStudent);
                            }
                            String getTotal = dtm.getValueAt(i, 2).toString();
                            String getType = dtm.getValueAt(i, 1).toString();

                            String insert_2 = "INSERT INTO licencecatagory(idstudents,idVehicleClasses,PriceCatogiry,isDelete,Type) VALUES('" + getIdStudent + "','" + getIdClass + "','" + getTotal + "','1','" + getType + "')";
                            DB.idu(insert_2);
                        }
                    } else {
                        int x = tableStudent.getRowCount();
                        if (x == 0) {
                            NotificationPopup.fillFeilds();
                        } else {
                            ResultSet rs1 = DB.search("SELECT * FROM students WHERE TpPersonal='" + txtTPMobile.getText() + "' ");
                            if (rs1.next()) {
                                getIdStudent = rs1.getString("idstudents");
                            }

                            String update_1 = "UPDATE students SET RegNo='" + "NKLR-" + txtRegNo.getText() + "',NIC='" + txtNic.getText() + "',PassportNo='" + txtPassportNo.getText() + "',OldDLNo='" + txtOldDL.getText() + "',LPNumber='" + txtLPNo.getText() + "',"
                                    + "FullName='" + txtName.getText() + "',DOB='" + txtDOBDate.getText() + "." + comboMonth.getSelectedItem() + "." + txtDOBYear.getText() + "',Gender='" + gen + "',AddressPermenent='" + txtPerAddress.getText() + "',AddressResident='" + txtResAddress.getText() + "',CourseFee='" + txtSubTotal.getText() + "',"
                                    + "TpHome='" + txtTPHome.getText() + "',TpBusiness='" + txtTPBusiness.getText() + "',TpPersonal='" + txtTPMobile.getText() + "',Image='" + path + "',RegisterDate='" + setDate2.getText() + "',StudentPosition='" + txtPosition.getText() + "' WHERE idstudents='" + lableStudentID.getText() + "' ";
                            DB.idu(update_1);

                            String delete = "DELETE FROM licencecatagory WHERE idstudents='" + lableStudentID.getText() + "' ";
                            DB.idu(delete);

                            try {
                                for (int i = 0; i < dtm.getRowCount(); i++) {
                                    String getVehicleCat = (String) tableStudent.getValueAt(i, 0);
                                    ResultSet rs2 = DB.search("SELECT * FROM vehicleclasses WHERE VehicleClasseName='" + getVehicleCat + "' ");
                                    if (rs2.next()) {
                                        getIdClass = rs2.getString("idVehicleClasses");
                                    }
                                    ResultSet rs3 = DB.search("SELECT * FROM students WHERE RegNo='" + txtRegNo.getText() + "' ");
                                    if (rs3.next()) {
                                        getIdStudent = rs3.getString("idstudents");
                                    }
                                    String getTotal = dtm.getValueAt(i, 2).toString();
                                    String getType = dtm.getValueAt(i, 1).toString();

                                    String insert_2 = "INSERT INTO licencecatagory(idstudents,idVehicleClasses,PriceCatogiry,isDelete,Type) VALUES('" + getIdStudent + "','" + getIdClass + "','" + getTotal + "','1','" + getType + "')";
                                    DB.idu(insert_2);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

//                     for (int i = 0; i < dtm.getRowCount(); i++) {
//                           String getTotal=dtm.getValueAt(i, 4).toString();
//                           String getType=dtm.getValueAt(i, 1).toString();
//                           
//                      String getVehicleCat=(String) tableStudent.getValueAt(i, 0);
//                      ResultSet rs2=DB.search("SELECT * FROM vehicleclasses WHERE VehicleClasseName='"+getVehicleCat+"' ");
//                      if (rs2.next()) {
//                          getIdClass=rs2.getString("idVehicleClasses");                       
//                      }  
//                      ResultSet rs3=DB.search("SELECT * FROM licencecatagory WHERE idVehicleClasses='"+getIdClass+"' ");
//                         if (rs3.next()) {
//                             getId=rs3.getString("idClass");
//                             
//                        String update_2="UPDATE licencecatagory SET idstudents='"+getIdStudent+"',idVehicleClasses='"+getIdClass+"',PriceCatogiry='"+getTotal+"',Type='"+getType+"' WHERE idClass='"+getId+"' ";
//                        DB.idu(update_2);
//                        
//                         }
//                     
//                     }
                        }

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            NotificationPopup.save();
            clearField();
            Loadno();
        } else {
            NotificationPopup.fillFeilds();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        //txtPerAddress.grabFocus();
    }//GEN-LAST:event_txtNameFocusLost

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        PaymentsUdaya pu = new PaymentsUdaya();
        pu.setVisible(true);
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void comboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTypeActionPerformed


    }//GEN-LAST:event_comboTypeActionPerformed

    private void txtTPBusinessFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTPBusinessFocusLost
        txtPosition.grabFocus();

    }//GEN-LAST:event_txtTPBusinessFocusLost

    private void txtPerAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPerAddressFocusLost
        // txtResAddress.grabFocus();
    }//GEN-LAST:event_txtPerAddressFocusLost

    private void btnCaptureFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnCaptureFocusLost

    }//GEN-LAST:event_btnCaptureFocusLost

    private void btnTableClearSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableClearSelectActionPerformed
        int selectedRow = tableStudent.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();
        dtm.removeRow(selectedRow);
        try {
            String getIdClass = null;
            String getIdStudent = null;
            String getId = null;

            if (btnSave.getText().equals("UPDATE")) {
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    String getTotal = dtm.getValueAt(i, 2).toString();
                    String getType = dtm.getValueAt(i, 1).toString();

                    String getVehicleCat = (String) tableStudent.getValueAt(i, 0);
                    ResultSet rs2 = DB.search("SELECT * FROM vehicleclasses WHERE VehicleClasseName='" + getVehicleCat + "' ");
                    if (rs2.next()) {
                        getIdClass = rs2.getString("idVehicleClasses");
                    }
                    ResultSet rs3 = DB.search("SELECT * FROM licencecatagory WHERE idVehicleClasses='" + getIdClass + "' ");
                    if (rs3.next()) {
                        getId = rs3.getString("idClass");

                        String delete = "DELETE FROM licencecatagory WHERE idClass='" + getId + "' ";
                        DB.idu(delete);

                    }

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        int x = tableStudent.getRowCount();
        if (x == 0) {
            txtSubTotal.setText("0.00");
        } else {
            Double sum = 0.00;
            for (int i = 0; i < dtm.getRowCount(); i++) {
                String s1 = dtm.getValueAt(i, 2).toString();
                Double getsum = Double.parseDouble(s1);
                sum = getsum + sum;
                txtSubTotal.setText(df.dcf(sum));
            }
        }
    }//GEN-LAST:event_btnTableClearSelectActionPerformed

    private void comboVehicleCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVehicleCatActionPerformed

    }//GEN-LAST:event_comboVehicleCatActionPerformed

    private void txtTPMobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTPMobileKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || txtTPMobile.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTPMobileKeyTyped

    private void txtTPBusinessKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTPBusinessKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || txtTPBusiness.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTPBusinessKeyTyped

    private void tableStudentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableStudentKeyReleased
//        if (evt.getKeyCode()==10) {
//            Double getAmount =Double.parseDouble((String) tableStudent.getValueAt(tableStudent.getSelectedRow(), 2));
//            Double getDiscount =Double.parseDouble((String) tableStudent.getValueAt(tableStudent.getSelectedRow(), 3));
////            double getTotal=100-getDiscount;
////            double getNetTotal=(getTotal*getAmount)/100;
//            double getNetTotal=getAmount-getDiscount;
//            tableStudent.setValueAt(getNetTotal, tableStudent.getSelectedRow(), 3);
//            
//                DefaultTableModel dtm=(DefaultTableModel) tableStudent.getModel();
//                Double sum=0.00;
//                for (int i = 0; i < dtm.getRowCount(); i++) {                   
//                    String s1 = dtm.getValueAt(i, 3).toString();
//                    Double getsum=Double.parseDouble(s1);
//                    sum=getsum+sum;
//                    txtSubTotal.setText(df.dcf(sum));                    
//                }                       
//        }
    }//GEN-LAST:event_tableStudentKeyReleased

    private void btnTableClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableClearAllActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();
        dtm.setRowCount(0);
        txtSubTotal.setText("0.00");

        try {
            String getIdClass = null;
            String getIdStudent = null;
            String getId = null;

            if (btnSave.getText().equals("UPDATE")) {
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    String getTotal = dtm.getValueAt(i, 2).toString();
                    String getType = dtm.getValueAt(i, 1).toString();

                    String getVehicleCat = (String) tableStudent.getValueAt(i, 0);
                    ResultSet rs2 = DB.search("SELECT * FROM vehicleclasses WHERE VehicleClasseName='" + getVehicleCat + "' ");
                    if (rs2.next()) {
                        getIdClass = rs2.getString("idVehicleClasses");
                    }
                    ResultSet rs3 = DB.search("SELECT * FROM licencecatagory WHERE idVehicleClasses='" + getIdClass + "' ");
                    if (rs3.next()) {
                        getId = rs3.getString("idClass");

                        String delete = "DELETE FROM licencecatagory WHERE idClass='" + getId + "' ";
                        DB.idu(delete);

                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnTableClearAllActionPerformed

    private void txtTPMobileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTPMobileFocusLost
//        if (txtTPMobile.getText().isEmpty()) {
//            txtTPMobile.grabFocus();
//            NotificationInvalidNumber.noty();
//        } else if (txtTPMobile.getText().length() != 10) {
//            txtTPMobile.grabFocus();
//            NotificationInvalidNumber.noty();
//        } else {
            txtTPHome.grabFocus();
//        }

    }//GEN-LAST:event_txtTPMobileFocusLost

    private void checkMaleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_checkMaleFocusLost
//        checkFemale.grabFocus();
    }//GEN-LAST:event_checkMaleFocusLost

    private void checkFemaleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_checkFemaleFocusLost
        //txtPerAddress.grabFocus();
    }//GEN-LAST:event_checkFemaleFocusLost

    private void txtResAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtResAddressFocusLost
        txtTPMobile.grabFocus();
    }//GEN-LAST:event_txtResAddressFocusLost

    private void txtRegNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegNoKeyReleased
        try {
            ResultSet rs = DB.search("SELECT st.*,lc.* FROM students st INNER JOIN licencecatagory lc ON st.idstudents=lc.idstudents WHERE RegNo='" + "NKLR-" + txtRegNo.getText() + "' ");
            if (rs.next()) {
                lableStudentID.setText(rs.getString("idstudents"));
                String s1 = rs.getString("NIC");
                txtNic.setText(s1);
                String s2 = rs.getString("PassportNo");
                txtPassportNo.setText(s2);
                String s3 = rs.getString("OldDLNo");
                txtOldDL.setText(s3);
                String s4 = rs.getString("FullName");
                txtName.setText(s4);
                String s5 = rs.getString("LPNumber");
                txtLPNo.setText(s5);
                String s6 = rs.getString("AddressPermenent");
                txtPerAddress.setText(s6);
                String s7 = rs.getString("AddressResident");
                txtResAddress.setText(s7);
                String s8 = rs.getString("CourseFee");
                txtSubTotal.setText(s8);
                String s9 = rs.getString("TpHome");
                txtTPHome.setText(s9);
                String s10 = rs.getString("TpBusiness");
                txtTPBusiness.setText(s10);
                String s11 = rs.getString("TpPersonal");
                txtTPMobile.setText(s11);
                String s12 = rs.getString("RegisterDate");
                setDate2.setText(s12);
                String s13 = rs.getString("Gender");
                if (s13.equals("Male")) {
                    checkMale.setSelected(true);
                    checkFemale.setSelected(false);
                } else {
                    checkFemale.setSelected(true);
                    checkMale.setSelected(false);
                }
                String s14 = rs.getString("DOB");
                System.out.println("DOB " + s14);
                String[] s = s14.split("\\.");
                String ss = s[1];
                System.out.println(s[0]);

                txtDOBDate.setText(s[0]);
                comboMonth.setSelectedItem(s[1]);
                txtDOBYear.setText(s[2]);

                txtPosition.setText(rs.getString("StudentPosition"));
                btnSave.setText("UPDATE");

                setCatagory();

                path = rs.getString("Image");

                String encoder = EncodeDecodeImage.encoder(path);
                ImageIcon decoder = EncodeDecodeImage.decoder(encoder);
                lablePicture.setIcon(decoder);

                ResultSet rs2 = DB.search("SELECT st.*,vc.*,lc.* FROM students st INNER JOIN licencecatagory lc ON st.idstudents=lc.idstudents INNER JOIN vehicleclasses vc ON lc.idVehicleClasses=vc.idVehicleClasses WHERE RegNo='" + "NKLR-" + txtRegNo.getText() + "' ");
                DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();
                dtm.setRowCount(0);
                String getType = rs.getString("Type");
                while (rs2.next()) {
                    Vector v = new Vector();
                    v.add(rs2.getString("VehicleClasseName"));
                    v.add(rs2.getString("Type"));
                    if (rs2.getString("Type").equals("Part Time")) {
                        v.add(rs2.getString("PartTraningPrice"));
                    } else {
                        v.add(rs2.getString("FullTraningPrice"));
                    }
//                if (rs2.getString("Type").equals("Part Time")) {
//                    Double d1=Double.parseDouble(rs2.getString("PartTraningPrice"));
//                    Double d2=Double.parseDouble(rs2.getString("PriceCatogiry"));
//                    Double d=d1-d2;
//                    String setDis=d.toString();
//                    v.add(setDis);
//               }else{
//                    Double d1=Double.parseDouble(rs2.getString("FullTraningPrice"));
//                    Double d2=Double.parseDouble(rs2.getString("PriceCatogiry"));
//                    Double d=d1-d2;
//                    String setDis=d.toString();
//                    v.add(setDis);
//              }
//                v.add(rs2.getString("PriceCatogiry"));
                    dtm.addRow(v);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtRegNoKeyReleased

    private void txtNicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicKeyReleased
        try {
            ResultSet rs = DB.search("SELECT st.*,lc.* FROM students st INNER JOIN licencecatagory lc ON st.idstudents=lc.idstudents WHERE NIC='" + txtNic.getText() + "' ");
            if (rs.next()) {
                lableStudentID.setText(rs.getString("idstudents"));
                String s1 = rs.getString("RegNo");
                txtRegNo.setText(s1);
                String s2 = rs.getString("PassportNo");
                txtPassportNo.setText(s2);
                String s3 = rs.getString("OldDLNo");
                txtOldDL.setText(s3);
                String s4 = rs.getString("FullName");
                txtName.setText(s4);
                String s5 = rs.getString("LPNumber");
                txtLPNo.setText(s5);
                String s6 = rs.getString("AddressPermenent");
                txtPerAddress.setText(s6);
                String s7 = rs.getString("AddressResident");
                txtResAddress.setText(s7);
                String s8 = rs.getString("CourseFee");
                txtSubTotal.setText(s8);
                String s9 = rs.getString("TpHome");
                txtTPHome.setText(s9);
                String s10 = rs.getString("TpBusiness");
                txtTPBusiness.setText(s10);
                String s11 = rs.getString("TpPersonal");
                txtTPMobile.setText(s11);
                String s12 = rs.getString("RegisterDate");
                setDate2.setText(s12);
                String s13 = rs.getString("Gender");
                if (s13.equals("Male")) {
                    checkMale.setSelected(true);
                    checkFemale.setSelected(false);
                } else {
                    checkFemale.setSelected(true);
                    checkMale.setSelected(false);
                }
                txtPosition.setText(rs.getString("StudentPosition"));
                btnSave.setText("UPDATE");

                setCatagory();

                path = rs.getString("Image");

                String encoder = EncodeDecodeImage.encoder(path);
                ImageIcon decoder = EncodeDecodeImage.decoder(encoder);
                lablePicture.setIcon(decoder);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtNicKeyReleased

    private void txtPassportNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassportNoKeyReleased
        try {
            ResultSet rs = DB.search("SELECT st.*,lc.* FROM students st INNER JOIN licencecatagory lc ON st.idstudents=lc.idstudents WHERE PassportNo='" + txtPassportNo.getText() + "' ");
            if (rs.next()) {
                lableStudentID.setText(rs.getString("idstudents"));
                String s1 = rs.getString("RegNo");
                txtRegNo.setText(s1);
                String s2 = rs.getString("NIC");
                txtNic.setText(s2);
                String s3 = rs.getString("OldDLNo");
                txtOldDL.setText(s3);
                String s4 = rs.getString("FullName");
                txtName.setText(s4);
                String s5 = rs.getString("LPNumber");
                txtLPNo.setText(s5);
                String s6 = rs.getString("AddressPermenent");
                txtPerAddress.setText(s6);
                String s7 = rs.getString("AddressResident");
                txtResAddress.setText(s7);
                String s8 = rs.getString("CourseFee");
                txtSubTotal.setText(s8);
                String s9 = rs.getString("TpHome");
                txtTPHome.setText(s9);
                String s10 = rs.getString("TpBusiness");
                txtTPBusiness.setText(s10);
                String s11 = rs.getString("TpPersonal");
                txtTPMobile.setText(s11);
                String s12 = rs.getString("RegisterDate");
                setDate2.setText(s12);
                String s13 = rs.getString("Gender");
                System.out.println(s13);
                if (s13.equals("Male")) {
                    checkMale.setSelected(true);
                    checkFemale.setSelected(false);
                } else {
                    checkFemale.setSelected(true);
                    checkMale.setSelected(false);
                }
                txtPosition.setText(rs.getString("StudentPosition"));
                btnSave.setText("UPDATE");

                setCatagory();

                path = rs.getString("Image");

                String encoder = EncodeDecodeImage.encoder(path);
                ImageIcon decoder = EncodeDecodeImage.decoder(encoder);
                lablePicture.setIcon(decoder);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtPassportNoKeyReleased

    private void txtOldDLKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOldDLKeyReleased
        try {
            ResultSet rs = DB.search("SELECT st.*,lc.* FROM students st INNER JOIN licencecatagory lc ON st.idstudents=lc.idstudents WHERE OldDLNo='" + txtOldDL.getText() + "' ");
            if (rs.next()) {
                lableStudentID.setText(rs.getString("idstudents"));
                String s1 = rs.getString("RegNo");
                txtRegNo.setText(s1);
                String s2 = rs.getString("NIC");
                txtNic.setText(s2);
                String s3 = rs.getString("PassportNo");
                txtPassportNo.setText(s3);
                String s4 = rs.getString("FullName");
                txtName.setText(s4);
                String s5 = rs.getString("LPNumber");
                txtLPNo.setText(s5);
                String s6 = rs.getString("AddressPermenent");
                txtPerAddress.setText(s6);
                String s7 = rs.getString("AddressResident");
                txtResAddress.setText(s7);
                String s8 = rs.getString("CourseFee");
                txtSubTotal.setText(s8);
                String s9 = rs.getString("TpHome");
                txtTPHome.setText(s9);
                String s10 = rs.getString("TpBusiness");
                txtTPBusiness.setText(s10);
                String s11 = rs.getString("TpPersonal");
                txtTPMobile.setText(s11);
                String s12 = rs.getString("RegisterDate");
                setDate2.setText(s12);
                String s13 = rs.getString("Gender");
                System.out.println(s13);
                if (s13.equals("Male")) {
                    checkMale.setSelected(true);
                    checkFemale.setSelected(false);
                } else {
                    checkFemale.setSelected(true);
                    checkMale.setSelected(false);
                }
                txtPosition.setText(rs.getString("StudentPosition"));
                btnSave.setText("UPDATE");

                setCatagory();

                path = rs.getString("Image");

                String encoder = EncodeDecodeImage.encoder(path);
                ImageIcon decoder = EncodeDecodeImage.decoder(encoder);
                lablePicture.setIcon(decoder);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtOldDLKeyReleased

    private void txtRegNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegNoKeyPressed

    private void txtTPHomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTPHomeKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || txtTPHome.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTPHomeKeyTyped

    private void txtTPHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTPHomeMouseClicked

    }//GEN-LAST:event_txtTPHomeMouseClicked

    private void txtTPHomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTPHomeFocusLost
        if (txtTPHome.getText().isEmpty()) {
            txtTPBusiness.grabFocus();
        } else if (txtTPHome.getText().length() != 10) {
            txtTPHome.grabFocus();
            NotificationInvalidNumber.noty();
        } else {
            txtTPBusiness.grabFocus();
        }

    }//GEN-LAST:event_txtTPHomeFocusLost

    private void btnCaptureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaptureActionPerformed
        JFileChooser fc = new JFileChooser();
        int showDialog = fc.showDialog(null, "open");
        File sf = fc.getSelectedFile();
        path = sf.getAbsolutePath();
        path = path.replace('\\', '/');
        System.out.println(path);

        encoder = EncodeDecodeImage.encoder(path);
        ImageIcon decoder = EncodeDecodeImage.decoder(encoder);
        lablePicture.setIcon(decoder);


    }//GEN-LAST:event_btnCaptureActionPerformed

    private void txtDOBYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDOBYearFocusLost
        txtPerAddress.grabFocus();
    }//GEN-LAST:event_txtDOBYearFocusLost

    private void txtLPNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLPNoKeyReleased
        try {
            ResultSet rs = DB.search("SELECT st.*,lc.* FROM students st INNER JOIN licencecatagory lc ON st.idstudents=lc.idstudents WHERE LPNumber='" + txtLPNo.getText() + "' ");
            if (rs.next()) {
                lableStudentID.setText(rs.getString("idstudents"));
                String s1 = rs.getString("RegNo");
                txtRegNo.setText(s1);
                String s2 = rs.getString("NIC");
                txtNic.setText(s2);
                String s3 = rs.getString("PassportNo");
                txtPassportNo.setText(s3);
                String s4 = rs.getString("FullName");
                txtName.setText(s4);
                String s5 = rs.getString("OldDLNo");
                txtOldDL.setText(s5);
                String s6 = rs.getString("AddressPermenent");
                txtPerAddress.setText(s6);
                String s7 = rs.getString("AddressResident");
                txtResAddress.setText(s7);
                String s8 = rs.getString("CourseFee");
                txtSubTotal.setText(s8);
                String s9 = rs.getString("TpHome");
                txtTPHome.setText(s9);
                String s10 = rs.getString("TpBusiness");
                txtTPBusiness.setText(s10);
                String s11 = rs.getString("TpPersonal");
                txtTPMobile.setText(s11);
                String s12 = rs.getString("RegisterDate");
                setDate2.setText(s12);
                String s13 = rs.getString("Gender");
                System.out.println(s13);
                if (s13.equals("Male")) {
                    checkMale.setSelected(true);
                    checkFemale.setSelected(false);
                } else {
                    checkFemale.setSelected(true);
                    checkMale.setSelected(false);
                }
                txtPosition.setText(rs.getString("StudentPosition"));
                btnSave.setText("UPDATE");

                setCatagory();

                path = rs.getString("Image");

                String encoder = EncodeDecodeImage.encoder(path);
                ImageIcon decoder = EncodeDecodeImage.decoder(encoder);
                lablePicture.setIcon(decoder);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtLPNoKeyReleased

    private void txtLPNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLPNoFocusLost
        txtName.grabFocus();
    }//GEN-LAST:event_txtLPNoFocusLost

    private void txtDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountKeyReleased
        DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();

        if (txtDiscount.getText().isEmpty()) {
            Double sum = 0.00;
            for (int i = 0; i < dtm.getRowCount(); i++) {
                String s1 = dtm.getValueAt(i, 2).toString();
                Double getsum = Double.parseDouble(s1);
                sum = getsum + sum;
                txtSubTotal.setText(df.dcf(sum));
            }
        } else {
            Double sum = 0.00;
            for (int i = 0; i < dtm.getRowCount(); i++) {
                String s1 = dtm.getValueAt(i, 2).toString();
                Double getsum = Double.parseDouble(s1);
                sum = getsum + sum;
                Double dis = Double.parseDouble(txtDiscount.getText());
                Double d = sum - dis;
                txtSubTotal.setText(df.dcf(d));
            }
        }

    }//GEN-LAST:event_txtDiscountKeyReleased

    private void txtDiscountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDiscountKeyTyped

    private void txtRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegNoActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearField();
    }//GEN-LAST:event_btnClearActionPerformed

    private void comboTypePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboTypePopupMenuWillBecomeInvisible
        String getCategory = (String) comboVehicleCat.getSelectedItem();
        String getType = (String) comboType.getSelectedItem();
        DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();
        ResultSet rs = null;
        try {
            if (comboVehicleCat.getSelectedIndex() == 0) {
                NotificationPopup.fillFeilds();
                comboType.setSelectedIndex(0);
            } else if (comboType.getSelectedIndex() == 1) {
                rs = DB.search("SELECT * FROM vehicleclasses WHERE VehicleClasseName='" + getCategory + "' ");
                if (rs.next()) {
                    Vector v = new Vector();
                    v.add(getCategory);
                    v.add(getType);
                    v.add(rs.getString("FullTraningPrice"));
//                  v.add("0");
//                  v.add(rs.getString("FullTraningPrice"));
                    dtm.addRow(v);

                    Double sum = Double.parseDouble(txtSubTotal.getText());
                    Double getsum = Double.parseDouble(rs.getString("FullTraningPrice"));
                    sum = getsum + sum;
                    txtSubTotal.setText(df.dcf(sum));

                }

            } else if (comboType.getSelectedIndex() == 2) {
                rs = DB.search("SELECT * FROM vehicleclasses WHERE VehicleClasseName='" + getCategory + "' ");
                if (rs.next()) {
                    Vector v = new Vector();
                    v.add(getCategory);
                    v.add(getType);
                    v.add(rs.getString("PartTraningPrice"));
//                  v.add("0");
//                  v.add(rs.getString("PartTraningPrice"));
                    dtm.addRow(v);

                    Double sum = Double.parseDouble(txtSubTotal.getText());
                    Double getsum = Double.parseDouble(rs.getString("PartTraningPrice"));
                    sum = getsum + sum;
                    txtSubTotal.setText(df.dcf(sum));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_comboTypePopupMenuWillBecomeInvisible

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapture;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnTableClearAll;
    private javax.swing.JButton btnTableClearSelect;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton checkFemale;
    private javax.swing.JRadioButton checkMale;
    private javax.swing.JComboBox<String> comboMonth;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JComboBox<String> comboVehicleCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lablePicture;
    private javax.swing.JLabel lableStudentID;
    private javax.swing.JLabel maxreg1;
    private javax.swing.JLabel maxstno;
    private javax.swing.JLabel nklr;
    private com.alee.extended.date.WebDateField setDate2;
    private javax.swing.JTable tableStudent;
    private javax.swing.JTextField txtDOBDate;
    private javax.swing.JTextField txtDOBYear;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtLPNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNic;
    private javax.swing.JTextField txtOldDL;
    private javax.swing.JTextField txtPassportNo;
    private javax.swing.JTextField txtPerAddress;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtRegNo;
    private javax.swing.JTextField txtResAddress;
    private javax.swing.JLabel txtSubTotal;
    private javax.swing.JTextField txtTPBusiness;
    private javax.swing.JTextField txtTPHome;
    private javax.swing.JTextField txtTPMobile;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            StudentRegistation.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            StudentRegistation.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void setDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date d = new Date();
        setDate2.setText(sdf.format(d));
        //jLabel31.setText("0.00");
    }

    private void invalidNumber() {
        if (txtTPHome.getText().length() != 10) {
            NotificationInvalidNumber.noty();
        } else if (txtTPMobile.getText().length() != 10) {
            NotificationInvalidNumber.noty();
        } else if (txtTPBusiness.getText().length() != 10) {
            NotificationInvalidNumber.noty();
        }
    }

    private void tableDecor() {

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tableStudent.getColumnModel().getColumn(2).setCellRenderer(dtcr);
        //tableStudent.getColumnModel().getColumn(3).setCellRenderer(dtcr);
        //tableStudent.getColumnModel().getColumn(4).setCellRenderer(dtcr);

    }

    private void validateTxt() {
        java.awt.Component[] cp = jPanel1.getComponents();
        for (java.awt.Component c : cp) {
            if (c instanceof JTextField) {
                if (((JTextField) c).getText().isEmpty()) {
                    b = true;
                    break;
                } else {
                    b = false;
                }
            }
        }

        java.awt.Component[] cp1 = jPanel5.getComponents();
        for (java.awt.Component c1 : cp1) {
            if (c1 instanceof JTextField) {
                if (((JTextField) c1).getText().isEmpty()) {
                    b = true;
                    break;
                } else {
                    b = false;
                }
            }
        }
    }

    private void setVehicleCategory() {
        try {
            ResultSet rs = DB.search("SELECT * FROM vehicleclasses");
            while (rs.next()) {
                String getCategory = rs.getString("VehicleClasseName");
                comboVehicleCat.addItem(getCategory);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearField() {
        lablePicture.setIcon(null);
        txtDOBDate.setText("");
        comboMonth.setSelectedIndex(0);
        txtDOBYear.setText("");
        checkFemale.setSelected(false);
        checkMale.setSelected(false);
        txtTPHome.setText("");
        txtTPBusiness.setText("");
        txtSubTotal.setText("0.00");
        txtDiscount.setText("");
        comboVehicleCat.setSelectedIndex(0);
        comboType.setSelectedIndex(0);
        btnSave.setText("SAVE");
        
        
        DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();
        dtm.setRowCount(0);

        java.awt.Component[] cp = jPanel1.getComponents();
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
        java.awt.Component[] cp2 = jPanel5.getComponents();
        for (java.awt.Component c2 : cp2) {
            if (c2 instanceof JTextField) {
                ((JTextField) c2).setText(null);
            }
        }
        java.awt.Component[] cp3 = jPanel6.getComponents();
        for (java.awt.Component c3 : cp3) {
            if (c3 instanceof JTextField) {
                ((JTextField) c3).setText(null);
            }
        }
        txtTPBusiness.setText("");
        setDate();
    }

    private void setCatagory() {
        try {
            ResultSet rs = DB.search("SELECT st.*,lc.* FROM students st INNER JOIN licencecatagory lc ON st.idstudents=lc.idstudents WHERE RegNo='" + txtRegNo.getText() + "' ");
            if (rs.next()) {
                ResultSet rs2 = DB.search("SELECT st.*,vc.*,lc.* FROM students st INNER JOIN licencecatagory lc ON st.idstudents=lc.idstudents INNER JOIN vehicleclasses vc ON lc.idVehicleClasses=vc.idVehicleClasses WHERE RegNo='" + txtRegNo.getText() + "' ");
                DefaultTableModel dtm = (DefaultTableModel) tableStudent.getModel();
                dtm.setRowCount(0);
                String getType = rs.getString("Type");
                while (rs2.next()) {
                    Vector v = new Vector();
                    v.add(rs2.getString("VehicleClasseName"));
                    v.add(rs2.getString("Type"));
                    if (rs2.getString("Type").equals("Part Time")) {
                        v.add(rs2.getString("PartTraningPrice"));
                    } else {
                        v.add(rs2.getString("FullTraningPrice"));
                    }
//                if (rs2.getString("Type").equals("Part Time")) {
//                    Double d1=Double.parseDouble(rs2.getString("PartTraningPrice"));
//                    Double d2=Double.parseDouble(rs2.getString("PriceCatogiry"));
//                    Double d=(d1-d2)/d1*100;
//                    String setDis=d.toString();
//                    v.add(setDis);
//               }else{
//                    Double d1=Double.parseDouble(rs2.getString("FullTraningPrice"));
//                    Double d2=Double.parseDouble(rs2.getString("PriceCatogiry"));
//                    Double d=(d1-d2)/d1*100;
//                    String setDis=d.toString();
//                    v.add(setDis);
//              }
//                v.add(rs2.getString("PriceCatogiry"));
                    dtm.addRow(v);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void Loadno() {

        try {

            ResultSet rs = DB.search("SELECT * FROM `students`ORDER BY students.idstudents DESC LIMIT 1");
            while (rs.next()) {
                //System.out.println(rs.getString("idstudents"));
                maxreg1.setText(rs.getString("RegNo"));
                //maxstno.setText(rs.getString("idstudents"));
            }

            ResultSet rs2 = DB.search("SELECT * FROM `students`");

            // ArrayList al = new ArrayList();
            Map<String, Integer> tm = new TreeMap<String, Integer>();
            while (rs2.next()) {
                tm.put(rs2.getString("RegNo"), rs2.getInt("idstudents"));

            }
            String k = null;
            //you entered Map<Long, String> entry
            for (Map.Entry<String, Integer> entry : tm.entrySet()) {

                k = entry.getKey();

            }

            maxstno.setText(k);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
