package Staff;

import ExtenelClasses.DB;
import ExtenelClasses.EncodeDecodeImage;
import ExtenelClasses.NotificationPopup;
//import Student.NewJFrame;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class registerEmployee extends javax.swing.JFrame {

    static boolean maximized = true;

    public registerEmployee() {
        initComponents();
        maximizeWindow();
        tableload();
    }
    int r;
    String id;
    String path = null;
    String encoder;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tb = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        searchtxt = new javax.swing.JTextField();
        save1 = new javax.swing.JButton();
        nic = new javax.swing.JRadioButton();
        dl = new javax.swing.JRadioButton();
        pass = new javax.swing.JRadioButton();
        delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        val = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        add1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        add2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Fullname = new javax.swing.JTextField();
        identiry = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        DrivingLicence = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PassNo = new javax.swing.JTextField();
        Nic = new javax.swing.JTextField();
        ep = new javax.swing.JPanel();
        epf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        etf = new javax.swing.JTextField();
        cancel1 = new javax.swing.JButton();
        doj = new com.alee.extended.date.WebDateField();
        jLabel15 = new javax.swing.JLabel();
        position = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        phone = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        ConatctMobile = new javax.swing.JTextField();
        ConatctHome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dd = new javax.swing.JTextField();
        mm = new javax.swing.JComboBox<>();
        yy = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        save2 = new javax.swing.JButton();

        tb.setText("jLabel17");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Staff Register-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff ID", "Nic", "Full Name", "Contact No", "ETF", "EPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 640, 280));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 420, 30));

        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
        });
        jPanel3.add(searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 340, 30));

        save1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        save1.setText("SAVE");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jPanel3.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, 120, 40));

        nic.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(nic);
        nic.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        nic.setText("Nic");
        nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicActionPerformed(evt);
            }
        });
        jPanel3.add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        dl.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(dl);
        dl.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        dl.setText("Driving Licence");
        dl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlActionPerformed(evt);
            }
        });
        jPanel3.add(dl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        pass.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(pass);
        pass.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        pass.setText("Passport No");
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 630, 110));

        delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, 120, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 120, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 710, 500));

        val.setBackground(new java.awt.Color(255, 255, 255));
        val.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N
        val.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("Date of Birth");
        val.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel5.setText("Address Line 1");
        val.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 200, 30));

        add1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        val.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 340, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel6.setText("Address Line 2");
        val.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 200, 30));

        add2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        val.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 340, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel7.setText("City");
        val.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 200, 30));

        city.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        val.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 340, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel8.setText("LKR");
        val.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 30, 30));

        salary.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        salary.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        salary.setToolTipText("");
        val.add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 310, 30));

        save.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        val.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 640, 120, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel2.setText("Fullname");
        val.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, 30));

        Fullname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        val.add(Fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 340, 30));

        identiry.setBackground(new java.awt.Color(255, 255, 255));
        identiry.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel12.setText("Driving Licence");
        identiry.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, 30));

        DrivingLicence.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        DrivingLicence.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DrivingLicenceKeyReleased(evt);
            }
        });
        identiry.add(DrivingLicence, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 340, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel1.setText("Passport No");
        identiry.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel11.setText("Nic");
        identiry.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 30));

        PassNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        PassNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassNoActionPerformed(evt);
            }
        });
        PassNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PassNoKeyReleased(evt);
            }
        });
        identiry.add(PassNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 340, 30));

        Nic.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Nic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NicFocusLost(evt);
            }
        });
        Nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NicKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NicKeyTyped(evt);
            }
        });
        identiry.add(Nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 340, 30));

        val.add(identiry, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 500, 130));

        ep.setBackground(new java.awt.Color(255, 255, 255));
        ep.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        epf.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ep.add(epf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel9.setText("Epf No");
        ep.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 50, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel10.setText("Etf No");
        ep.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 30));

        etf.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ep.add(etf, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 140, 30));

        val.add(ep, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 500, -1));

        cancel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancel1.setText("CANCEL");
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });
        val.add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 640, 120, 40));

        doj.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        doj.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        val.add(doj, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 340, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel15.setText("Position");
        val.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 130, 30));

        position.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        val.add(position, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 340, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel16.setText("Date of join");
        val.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, 30));

        phone.setBackground(new java.awt.Color(255, 255, 255));
        phone.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel14.setText("Contact No (Mobile)");
        phone.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 30));

        ConatctMobile.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ConatctMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConatctMobileActionPerformed(evt);
            }
        });
        ConatctMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ConatctMobileKeyTyped(evt);
            }
        });
        phone.add(ConatctMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 340, 30));

        ConatctHome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ConatctHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConatctHomeActionPerformed(evt);
            }
        });
        ConatctHome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ConatctHomeKeyTyped(evt);
            }
        });
        phone.add(ConatctHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 340, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel4.setText("Contact No (Home)");
        phone.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 30));

        val.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 500, 110));

        dd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddActionPerformed(evt);
            }
        });
        val.add(dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 80, 30));

        mm.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        mm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmActionPerformed(evt);
            }
        });
        val.add(mm, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 80, 30));

        yy.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        val.add(yy, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 70, 30));

        jLabel17.setText("YYYY");
        val.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, 30));

        jLabel18.setText("DD");
        val.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, 30));

        jLabel19.setText("MM");
        val.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel20.setText("Basic Salary");
        val.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 200, 30));

        jPanel1.add(val, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 530, 690));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 20, 600));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel13.setText("Photo");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 30));

        photo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 190, 180));

        save2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        save2.setText("SELECT");
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });
        jPanel4.add(save2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 150, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 680, 190));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        boolean b = false;
        java.awt.Component[] cp = val.getComponents();
        for (java.awt.Component c : cp) {
            if (c instanceof JTextField) {

                if (((JTextField) c).getText().isEmpty()) {

                    b = true;
                    NotificationPopup.fillFeilds();
                    break;

                } else {

                    b = false;

                }

            }
        }

        if (b == false) {
            if (save.getText().equals("SAVE")) {

                
                try {
                    DB.idu("INSERT INTO `newkamal`.`staff` ( `photo`, `name`, `nic`, `passportNo`, `DrivingLicenceNo`, `Address1`, `Address2`, `city`, `Contact1`, `contact2`, `Basic Salary`, `EtfNo`, `EpfNo`, `IsActive`,DOB,joiningDate,position) VALUES ( '" + path + "', '"
                            + Fullname.getText() + "', '" + Nic.getText() + "', '" + PassNo.getText() + "', '" + DrivingLicence.getText() + "', '" + add1.getText() + "', '" + add2.getText() + "', '" + city.getText() + "', '" + ConatctHome.getText() + "','" + ConatctMobile.getText() + "', '" + salary.getText() + "', '" + etf.getText() + "', '" + epf.getText() + "', '" + 1 + "','" + dd.getText() + "/" + mm.getSelectedItem() + "/" + yy.getText() + "','" + doj.getText() + "','" + position.getText() + "')");

                    path = null;

                    clearfields();
                    tableload();
                    NotificationPopup.save();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (save.getText().equals("UPDATE")) {

                //JOptionPane.showConfirmDialog(rootPane, "else");
                try {
                    DB.idu("UPDATE `staff` SET  `photo`='" + path + "' ,`name`='" + Fullname.getText() + "', `nic`='" + Nic.getText() + "', `passportNo`='" + PassNo.getText() + "', `DrivingLicenceNo`='" + DrivingLicence.getText() + "', `Address1`='" + add1.getText() + "', `Address2`='" + add2.getText() + "', `city`='" + city.getText() + "', `Contact1`='" + ConatctMobile.getText() + "', `contact2`='" + ConatctHome.getText() + "', `Basic Salary`='" + salary.getText() + "', `EtfNo`='" + etf.getText() + "', `EpfNo`='" + epf.getText() + "', DOB='" + dd.getText() + "/" + mm.getSelectedItem().toString() + "/" + yy.getText() + "',joiningDate='" + doj.getText() + "',position='" + position.getText() + "' WHERE `idStaff`='" + id + "'    ");
                    path = null;
                    clearfields();
                    tableload();
                    NotificationPopup.save();

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }
        }

    }//GEN-LAST:event_saveActionPerformed

    private void ConatctHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConatctHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConatctHomeActionPerformed

    private void NicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NicFocusLost
        DrivingLicence.grabFocus();
    }//GEN-LAST:event_NicFocusLost

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int r = jTable1.getSelectedRow();

        id = jTable1.getValueAt(r, 0).toString();

        try {

            ResultSet rs = DB.search("SELECT * FROM staff WHERE idStaff='" + id + "'");
                save.setText("UPDATE");

            while (rs.next()) {

                Nic.setText(rs.getString("nic"));
                DrivingLicence.setText(rs.getString("DrivingLicenceNo"));
                PassNo.setText(rs.getString("passportNo"));
                Fullname.setText(rs.getString("name"));
                ConatctMobile.setText(rs.getString("Contact1"));
                ConatctHome.setText(rs.getString("contact2"));
                add1.setText(rs.getString("Address1"));
                add2.setText(rs.getString("Address2"));
                city.setText(rs.getString("city"));
                salary.setText(rs.getString("Basic Salary"));
                etf.setText(rs.getString("EtfNo"));
                epf.setText(rs.getString("EpfNo"));
                String s = rs.getString("DOB");
                System.out.println("date" + s);

                String s1[] = s.split("/");

                System.out.println("split" + s1[0]);

                dd.setText(s1[0]);
                mm.setSelectedItem(s1[1]);
                yy.setText(s1[2]);
                doj.setText(rs.getString("joiningDate"));
                position.setText("position");

                path = rs.getString("photo");


                try {

                    encoder = EncodeDecodeImage.encoder(path);
                    ImageIcon decoder = EncodeDecodeImage.decoder(encoder);
                    photo.setIcon(decoder);

                } catch (Exception e) {
                }

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

// JFileChooser fc = new JFileChooser();
//        int showDialog = fc.showDialog(null, "Open");
//        File sf = fc.getSelectedFile();
//        path = sf.getAbsolutePath();
//        path = path.replace('\\', '/');
//        System.out.println(path);
//
//        encoder = EncodeDecodeImage.encoder(path);
//        ImageIcon decoder = EncodeDecodeImage.decoder(encoder);
//        photo.setIcon(decoder);
    }//GEN-LAST:event_jTable1MouseClicked

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save1ActionPerformed

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        clearfields();
    }//GEN-LAST:event_cancel1ActionPerformed

    private void NicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NicKeyReleased
        try {
            ResultSet rs = DB.search("SELECT * FROM staff WHERE NIC ='" + Nic.getText() + "' AND IsActive='" + 1 + "'");

            while (rs.next()) {

//                Nic.setText(rs.getString("nic"));
                DrivingLicence.setText(rs.getString("DrivingLicenceNo"));
                PassNo.setText(rs.getString("passportNo"));
                Fullname.setText(rs.getString("name"));
                ConatctMobile.setText(rs.getString("Contact1"));
                ConatctHome.setText(rs.getString("contact2"));
                add1.setText(rs.getString("Address1"));
                add2.setText(rs.getString("Address2"));
                city.setText(rs.getString("city"));
                salary.setText(rs.getString("Basic Salary"));
                etf.setText(rs.getString("EtfNo"));
                epf.setText(rs.getString("EpfNo"));
                String s1[] = rs.getString("DOB").split(".");
                dd.setText(s1[0]);
                mm.setSelectedItem(s1[1]);
                yy.setText(s1[2]);
                doj.setText(rs.getString("joiningDate"));
                position.setText(rs.getString("position"));
                save.setText("UPDATE");

                //------------------------------photo--------////
                path = rs.getString("photo");
                String encoder = EncodeDecodeImage.encoder(path);
                ImageIcon decoder = EncodeDecodeImage.decoder(encoder);
                photo.setIcon(decoder);

            }

        } catch (Exception e) {

            e.printStackTrace();
        }

    }//GEN-LAST:event_NicKeyReleased

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        int r = jTable1.getSelectedRow();

        String nic = (String) jTable1.getValueAt(r, 1);

        try {
            DB.idu("UPDATE `newkamal`.`staff` SET  `IsActive`='0' WHERE nic='" + nic + "'");
        } catch (Exception e) {
        }


    }//GEN-LAST:event_deleteActionPerformed

    private void ConatctMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConatctMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConatctMobileActionPerformed

    private void ConatctMobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConatctMobileKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) || ConatctMobile.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_ConatctMobileKeyTyped

    private void ConatctHomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConatctHomeKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) || ConatctHome.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_ConatctHomeKeyTyped

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed

        path = null;

        JFileChooser fc = new JFileChooser();
        int showDialog = fc.showDialog(null, "Open");
        File sf = fc.getSelectedFile();
        path = sf.getAbsolutePath();
        path = path.replace('\\', '/');
        System.out.println(path);

//        encoder = EncodeDecodeImage.encoder(path);
//        ImageIcon decoder = EncodeDecodeImage.decoder(encoder);
//        photo.setIcon(decoder);
        try {
            BufferedImage imageIcon = ImageIO.read(new File(path));
            photo.setIcon(new ImageIcon(imageIcon.getScaledInstance(160, 190, Image.SCALE_SMOOTH)));
        } catch (IOException ex) {
//            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
ex.printStackTrace();

        }
    }//GEN-LAST:event_save2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int row = jTable1.getSelectedRow();
        String nic = jTable1.getValueAt(row, 1).toString();

        try {
            DB.idu("UPDATE staff SET IsActive='" + 0 + "' WHERE nic='" + nic + "'");
            tableload();
            clearfields();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void DrivingLicenceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DrivingLicenceKeyReleased
        try {
            ResultSet rs = DB.search("SELECT * FROM staff WHERE DrivingLicenceNo ='" + DrivingLicence.getText() + "' AND IsActive='" + 1 + "'");

            while (rs.next()) {

//                Nic.setText(rs.getString("nic"));
                Nic.setText(rs.getString("nic"));
                PassNo.setText(rs.getString("passportNo"));
                Fullname.setText(rs.getString("name"));
                ConatctMobile.setText(rs.getString("Contact1"));
                ConatctHome.setText(rs.getString("contact2"));
                add1.setText(rs.getString("Address1"));
                add2.setText(rs.getString("Address2"));
                city.setText(rs.getString("city"));
                salary.setText(rs.getString("Basic Salary"));
                etf.setText(rs.getString("EtfNo"));
                epf.setText(rs.getString("EpfNo"));
                String s1[] = rs.getString("DOB").split(".");
                dd.setText(s1[0]);
                mm.setSelectedItem(s1[1]);
                yy.setText(s1[2]);
                doj.setText(rs.getString("joiningDate"));
                position.setText(rs.getString("position"));
                save.setText("UPDATE");

                //------------------------------photo--------////
                path = rs.getString("photo");
                String encoder = EncodeDecodeImage.encoder(path);
                ImageIcon decoder = EncodeDecodeImage.decoder(encoder);
                photo.setIcon(decoder);

            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_DrivingLicenceKeyReleased

    private void PassNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassNoKeyReleased
        try {
            ResultSet rs = DB.search("SELECT * FROM staff WHERE passportNo ='" + PassNo.getText() + "' AND IsActive='" + 1 + "'");

            while (rs.next()) {

//                Nic.setText(rs.getString("nic"));
                Nic.setText(rs.getString("nic"));
                DrivingLicence.setText(rs.getString("DrivingLicenceNo"));
                Fullname.setText(rs.getString("name"));
                ConatctMobile.setText(rs.getString("Contact1"));
                ConatctHome.setText(rs.getString("contact2"));
                add1.setText(rs.getString("Address1"));
                add2.setText(rs.getString("Address2"));
                city.setText(rs.getString("city"));
                salary.setText(rs.getString("Basic Salary"));
                etf.setText(rs.getString("EtfNo"));
                epf.setText(rs.getString("EpfNo"));
                String s1[] = rs.getString("DOB").split(".");
                dd.setText(s1[0]);
                mm.setSelectedItem(s1[1]);
                yy.setText(s1[2]);
                doj.setText(rs.getString("joiningDate"));
                position.setText(rs.getString("position"));
                save.setText("UPDATE");

                //------------------------------photo--------////
                path = rs.getString("photo");
                String encoder = EncodeDecodeImage.encoder(path);
                ImageIcon decoder = EncodeDecodeImage.decoder(encoder);
                photo.setIcon(decoder);

                for (int i = 0; i < s1.length; i++) {
                    System.out.println(s1[i]);
                }

            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_PassNoKeyReleased

    private void nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicActionPerformed
        tableload();
    }//GEN-LAST:event_nicActionPerformed

    private void dlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlActionPerformed

        tableload();


    }//GEN-LAST:event_dlActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        tableload();
    }//GEN-LAST:event_passActionPerformed

    private void PassNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassNoActionPerformed

    private void mmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mmActionPerformed

    private void ddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddActionPerformed

    private void NicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NicKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_NicKeyTyped

    private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyReleased
     ResultSet rs = null;

        try {
            if (nic.isSelected()) {
                rs = DB.search("SELECT * FROM staff WHERE NIC LIKE '" + searchtxt.getText() + "%' AND IsActive='" + 1 + "' ");

            } else if (dl.isSelected()) {
                rs = DB.search("SELECT * FROM staff WHERE DrivingLicenceNo Like '" + searchtxt.getText() + "%' AND IsActive='" + 1 + "'");
            } else if (pass.isSelected()) {
                rs = DB.search("SELECT * FROM staff WHERE passportNo LIKE '" + searchtxt.getText() + "%' AND IsActive='" + 1 + "'");
            }

            //  rs=DB.search("SELECT * FROM staff WHERE NIC ='"+searchtxt.getText()+"' ");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("idStaff"));
                v.add(rs.getString("nic"));
                v.add(rs.getString("name"));
                v.add(rs.getString("Contact1"));
                v.add(rs.getString("EtfNo"));
                v.add(rs.getString("EpfNo"));

                dtm.addRow(v);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_searchtxtKeyReleased

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConatctHome;
    private javax.swing.JTextField ConatctMobile;
    private javax.swing.JTextField DrivingLicence;
    private javax.swing.JTextField Fullname;
    private javax.swing.JTextField Nic;
    private javax.swing.JTextField PassNo;
    private javax.swing.JTextField add1;
    private javax.swing.JTextField add2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel1;
    private javax.swing.JTextField city;
    private javax.swing.JTextField dd;
    private javax.swing.JButton delete;
    private javax.swing.JRadioButton dl;
    private com.alee.extended.date.WebDateField doj;
    private javax.swing.JPanel ep;
    private javax.swing.JTextField epf;
    private javax.swing.JTextField etf;
    private javax.swing.JPanel identiry;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> mm;
    private javax.swing.JRadioButton nic;
    private javax.swing.JRadioButton pass;
    private javax.swing.JPanel phone;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField position;
    private javax.swing.JTextField salary;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JButton save2;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JLabel tb;
    private javax.swing.JPanel val;
    private javax.swing.JTextField yy;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            registerEmployee.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            registerEmployee.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void clearfields() {

        java.awt.Component[] cp = val.getComponents();
        for (java.awt.Component c : cp) {
            if (c instanceof JTextField) {

                ((JTextField) c).setText(null);

            }
        }
        java.awt.Component[] cp1 = ep.getComponents();
        for (java.awt.Component c : cp1) {
            if (c instanceof JTextField) {

                ((JTextField) c).setText(null);

            }
        }

        java.awt.Component[] cp2 = identiry.getComponents();
        for (java.awt.Component c : cp2) {
            if (c instanceof JTextField) {

                ((JTextField) c).setText(null);

            }
        }
        java.awt.Component[] cp4 = phone.getComponents();
        for (java.awt.Component c : cp4) {
            if (c instanceof JTextField) {

                ((JTextField) c).setText(null);

            }
        }
        photo.setIcon(null);
        searchtxt.setText(null);
        save.setText("SAVE");

    }

    private void tableload() {

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

        try {
            ResultSet rs = DB.search("SELECT * FROM staff WHERE IsActive='" + 1 + "'");
            while (rs.next()) {
                path = rs.getString("photo");
                Vector v = new Vector();

                v.add(rs.getString("idStaff"));
                v.add(rs.getString("nic"));
                v.add(rs.getString("name"));
                v.add(rs.getString("Contact1"));
                v.add(rs.getString("EtfNo"));
                v.add(rs.getString("EpfNo"));
//                String encoder = EncodeDecodeImage.encoder(path);
//        ImageIcon decoder = EncodeDecodeImage.decoder(encoder);
//               v.add(decoder);

                try {

                    encoder = EncodeDecodeImage.encoder(path);
                    ImageIcon decoder = EncodeDecodeImage.decoder(encoder);
                    tb.setIcon(decoder);

                } catch (Exception e) {
                }

                dtm.addRow(v);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
