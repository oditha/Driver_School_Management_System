package Staff;

import ExtenelClasses.DB;
import ExtenelClasses.EncodeDecodeImage;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GiantReport extends javax.swing.JFrame {

    static boolean maximized = true;

    public GiantReport() {
        initComponents();
        maximizeWindow();
        
    }
    long totaldays = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
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
        doj = new com.alee.extended.date.WebDateField();
        jLabel15 = new javax.swing.JLabel();
        position = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        phone = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        ConatctMobile = new javax.swing.JTextField();
        ConatctHome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        cancel2 = new javax.swing.JButton();
        photo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        todate = new com.alee.extended.date.WebDateField();
        jLabel13 = new javax.swing.JLabel();
        fromdate = new com.alee.extended.date.WebDateField();
        jLabel17 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBLAllowance = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        TOTALAllowance = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TBLDesuction = new javax.swing.JTable();
        TOTALDeductions = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TBLPayments = new javax.swing.JTable();
        TOTALPayments = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TBLSalary = new javax.swing.JTable();
        TotalSalkary = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        TotalEpf = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TotalEtf = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TBLLeave = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        TotlDays = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        TotalFulldays = new javax.swing.JTextField();
        TotalHalfdays = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        TotalshortLeaves = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TBLAttendence = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        TotlDays2 = new javax.swing.JTextField();
        presentDays = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jProgressBar3 = new javax.swing.JProgressBar();

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
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        val.setBackground(new java.awt.Color(255, 255, 255));
        val.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N
        val.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setText("Date of Birth");
        val.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, 30));

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
        jLabel8.setText("Basic Salary");
        val.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 200, 30));

        salary.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        val.add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 340, 30));

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
        val.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 340, 30));

        cancel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancel2.setText("CANCEL");
        cancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel2ActionPerformed(evt);
            }
        });
        val.add(cancel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 640, 120, 40));

        jPanel1.add(val, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, 690));

        photo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 170, 180));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Select Date"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 10, -1, -1));

        todate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        todate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todateActionPerformed(evt);
            }
        });
        jPanel2.add(todate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 270, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("To");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 40, 40));

        fromdate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        jPanel2.add(fromdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 270, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("From");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 40));

        search.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 120, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 360, 180));
        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, -1, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("SALARY"));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Allowances"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBLAllowance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date ", "Type", "Amount"
            }
        ));
        jScrollPane2.setViewportView(TBLAllowance);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, 180));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("TOTAL");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 90, 30));

        TOTALAllowance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTALAllowanceActionPerformed(evt);
            }
        });
        jPanel5.add(TOTALAllowance, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 110, 30));

        jPanel9.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, 250));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Deductions"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBLDesuction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Type", "Amount"
            }
        ));
        jScrollPane3.setViewportView(TBLDesuction);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 230, 180));
        jPanel6.add(TOTALDeductions, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 110, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("TOTAL");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 90, 30));

        jPanel9.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 250, 250));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Payments"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBLPayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Type", "Amount"
            }
        ));
        jScrollPane4.setViewportView(TBLPayments);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 180));
        jPanel7.add(TOTALPayments, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 110, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("TOTAL");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 90, 30));

        jPanel9.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 220, 250));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Salary"));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBLSalary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paid Date", "Etf", "Epf", "Net Salary"
            }
        ));
        jScrollPane6.setViewportView(TBLSalary);

        jPanel8.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 320, 150));

        TotalSalkary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalSalkaryActionPerformed(evt);
            }
        });
        jPanel8.add(TotalSalkary, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 250, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("TOTAL SALARY");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 100, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("TOTAL EPF");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 120, 30));

        TotalEpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalEpfActionPerformed(evt);
            }
        });
        jPanel8.add(TotalEpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 250, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText(" TOTAL ETF");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 120, 30));

        TotalEtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalEtfActionPerformed(evt);
            }
        });
        jPanel8.add(TotalEtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 250, 30));

        jPanel9.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 790, 180));

        jTabbedPane1.addTab("Salary", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Leave Management"));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBLLeave.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Requested Date ", "Leave type", "From ", "To", "Active Employee"
            }
        ));
        jScrollPane8.setViewportView(TBLLeave);

        jPanel10.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 750, 220));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("TOTAL DAYS");
        jPanel10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 30));

        TotlDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotlDaysActionPerformed(evt);
            }
        });
        jPanel10.add(TotlDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 250, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("TOTAL FULLDAYS");
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 120, 30));

        TotalFulldays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalFulldaysActionPerformed(evt);
            }
        });
        jPanel10.add(TotalFulldays, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 250, 30));

        TotalHalfdays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalHalfdaysActionPerformed(evt);
            }
        });
        jPanel10.add(TotalHalfdays, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 250, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("TOTAL HALF DAYS");
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 120, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("TOTAL SHORT LEAVES");
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 150, 30));

        TotalshortLeaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalshortLeavesActionPerformed(evt);
            }
        });
        jPanel10.add(TotalshortLeaves, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 250, 30));

        jProgressBar1.setBackground(new java.awt.Color(0, 153, 204));
        jProgressBar1.setStringPainted(true);
        jPanel10.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        jProgressBar2.setBackground(new java.awt.Color(0, 153, 204));
        jProgressBar2.setStringPainted(true);
        jPanel10.add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        jTabbedPane1.addTab("Leave Mangement", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBLAttendence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Intime ", "Outtime", "Status"
            }
        ));
        jScrollPane7.setViewportView(TBLAttendence);

        jPanel11.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 730, 260));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("TOTAL DAYS");
        jPanel11.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 100, 30));

        TotlDays2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotlDays2ActionPerformed(evt);
            }
        });
        jPanel11.add(TotlDays2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 250, 30));

        presentDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentDaysActionPerformed(evt);
            }
        });
        jPanel11.add(presentDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 250, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("TOTAL PRESENT DAYS");
        jPanel11.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 150, 30));

        jProgressBar3.setStringPainted(true);
        jPanel11.add(jProgressBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 240, 30));

        jTabbedPane1.addTab("Attendence", jPanel11);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 830, 490));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                dob.setText(rs.getString("DOB"));

                doj.setText(rs.getString("joiningDate"));
                position.setText(rs.getString("position"));

                //------------------------------photo--------////
                String path = rs.getString("photo");
                String encoder = EncodeDecodeImage.encoder(path);
                ImageIcon decoder = EncodeDecodeImage.decoder(encoder);
                photo.setIcon(decoder);

            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_DrivingLicenceKeyReleased

    private void PassNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassNoActionPerformed

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

                dob.setText(rs.getString("DOB"));
                doj.setText(rs.getString("joiningDate"));
                position.setText(rs.getString("position"));

                //------------------------------photo--------////
                String path = rs.getString("photo");
                String encoder = EncodeDecodeImage.encoder(path);
                ImageIcon decoder = EncodeDecodeImage.decoder(encoder);
                photo.setIcon(decoder);

            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_PassNoKeyReleased

    private void NicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NicFocusLost
        DrivingLicence.grabFocus();
    }//GEN-LAST:event_NicFocusLost

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

                dob.setText(rs.getString("DOB"));
                doj.setText(rs.getString("joiningDate"));
                position.setText(rs.getString("position"));

                //------------------------------photo--------////
                String path = rs.getString("photo");
                String encoder = EncodeDecodeImage.encoder(path);
                ImageIcon decoder = EncodeDecodeImage.decoder(encoder);
                photo.setIcon(decoder);

            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_NicKeyReleased

    private void NicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NicKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_NicKeyTyped

    private void ConatctMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConatctMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConatctMobileActionPerformed

    private void ConatctMobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConatctMobileKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) || ConatctMobile.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_ConatctMobileKeyTyped

    private void ConatctHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConatctHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConatctHomeActionPerformed

    private void ConatctHomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConatctHomeKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) || ConatctHome.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_ConatctHomeKeyTyped

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

        //   if (Nic.getText().length()>10 && !fromdate.getText().isEmpty() && !todate.getText().isEmpty()   ) {
        loadallowance();
        loaddeduction();
        loadPayments();
        Loadsalary();
        Loadleave();
        Loadattendence();

        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
        String inputString1 = fromdate.getText();
        String inputString2 = todate.getText();

        try {
            Date date1 = myFormat.parse(inputString1);
            Date date2 = myFormat.parse(inputString2);
            long diff = date2.getTime() - date1.getTime();
            totaldays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
            TotlDays.setText(""+totaldays);
            TotlDays2.setText(""+totaldays);
        } catch (ParseException e) {
            e.printStackTrace();
        }

//        }else{
//        
//            JOptionPane.showConfirmDialog(null, "enter valid nic or valid date");
//
//
//        
//        }
int tl=Integer.parseInt(TotlDays.getText());
int fl=Integer.parseInt(TotalFulldays.getText());
int hl=Integer.parseInt(TotalHalfdays.getText());
int pl=Integer.parseInt(TotalshortLeaves.getText());
       
        System.out.println((float)(fl*100/tl));
        jProgressBar2.setValue(Math.abs((int)(float)(fl*100/tl)));
        jProgressBar1.setValue(Math.abs((int)(float)(hl*100/tl*2)));
        jProgressBar3.setValue(Math.abs((int)(float)(pl*100/tl)));
        

   


    }//GEN-LAST:event_searchActionPerformed

    private void cancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel2ActionPerformed

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


    }//GEN-LAST:event_cancel2ActionPerformed

    private void todateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_todateActionPerformed

    private void TotalEtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalEtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalEtfActionPerformed

    private void TotalEpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalEpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalEpfActionPerformed

    private void TotalSalkaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalSalkaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalSalkaryActionPerformed

    private void TotlDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotlDaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotlDaysActionPerformed

    private void TotalFulldaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalFulldaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalFulldaysActionPerformed

    private void TotalHalfdaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalHalfdaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalHalfdaysActionPerformed

    private void TotalshortLeavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalshortLeavesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalshortLeavesActionPerformed

    private void TotlDays2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotlDays2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotlDays2ActionPerformed

    private void presentDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentDaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presentDaysActionPerformed

    private void TOTALAllowanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTALAllowanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TOTALAllowanceActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiantReport().setVisible(true);
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
    private javax.swing.JTable TBLAllowance;
    private javax.swing.JTable TBLAttendence;
    private javax.swing.JTable TBLDesuction;
    private javax.swing.JTable TBLLeave;
    private javax.swing.JTable TBLPayments;
    private javax.swing.JTable TBLSalary;
    private javax.swing.JTextField TOTALAllowance;
    private javax.swing.JTextField TOTALDeductions;
    private javax.swing.JTextField TOTALPayments;
    private javax.swing.JTextField TotalEpf;
    private javax.swing.JTextField TotalEtf;
    private javax.swing.JTextField TotalFulldays;
    private javax.swing.JTextField TotalHalfdays;
    private javax.swing.JTextField TotalSalkary;
    private javax.swing.JTextField TotalshortLeaves;
    private javax.swing.JTextField TotlDays;
    private javax.swing.JTextField TotlDays2;
    private javax.swing.JTextField add1;
    private javax.swing.JTextField add2;
    private javax.swing.JButton cancel2;
    private javax.swing.JTextField city;
    private javax.swing.JTextField dob;
    private com.alee.extended.date.WebDateField doj;
    private javax.swing.JPanel ep;
    private javax.swing.JTextField epf;
    private javax.swing.JTextField etf;
    private com.alee.extended.date.WebDateField fromdate;
    private javax.swing.JPanel identiry;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel phone;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField position;
    private javax.swing.JTextField presentDays;
    private javax.swing.JTextField salary;
    private javax.swing.JButton search;
    private com.alee.extended.date.WebDateField todate;
    private javax.swing.JPanel val;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            GiantReport.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GiantReport.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void loadallowance() {

        DefaultTableModel dtm = (DefaultTableModel) TBLAllowance.getModel();
        dtm.setRowCount(0);
        try {
            System.out.println(Nic.getText());
            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staff_has_allowence ON staff_has_allowence.Staff_idStaff = staff.idStaff INNER JOIN allowence ON staff_has_allowence.Allowence_idAllowence = allowence.idAllowence  WHERE staff.IsActive='" + 1 + "' AND staff.nic='" + Nic.getText() + "' AND date BETWEEN '" + fromdate.getText() + "' AND '" + todate.getText() + "'");

            while (rs.next()) {

                Vector v = new Vector();
                v.add(rs.getString("date"));
                v.add(rs.getString("AllowenceName"));
                v.add(rs.getString("Amount"));
                dtm.addRow(v);

            }
            int Total = 0;
            for (int i = 0; i < TBLAllowance.getRowCount(); i++) {

                int amount = Integer.parseInt(TBLAllowance.getValueAt(i, 2).toString());

                Total += amount;

            }

            TOTALAllowance.setText("" + Total);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loaddeduction() {

        try {

            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN deduction ON deduction.Staff_idStaff = staff.idStaff WHERE staff.nic='" + Nic.getText() + "' AND date BETWEEN '" + fromdate.getText() + "' AND '" + todate.getText() + "'");

            DefaultTableModel dtm = (DefaultTableModel) TBLDesuction.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("date"));
                v.add(rs.getString("type"));
                v.add(rs.getString("amount"));
                dtm.addRow(v);

            }

            int Total = 0;

            for (int i = 0; i < TBLDesuction.getRowCount(); i++) {
                int amount = Integer.parseInt(TBLDesuction.getValueAt(i, 2).toString());

                Total += amount;

            }

            TOTALDeductions.setText("" + Total);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadPayments() {

        try {
            DefaultTableModel dtm = (DefaultTableModel) TBLPayments.getModel();
            dtm.setRowCount(0);

            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staffpayment ON staffpayment.idStaff = staff.idStaff WHERE  nic='" + Nic.getText() + "'AND date BETWEEN '" + fromdate.getText() + "' AND '" + todate.getText() + "'  ");

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("date"));
                v.add(rs.getString("Description"));
                v.add(rs.getString("amount"));
                dtm.addRow(v);
            }

            int Total = 0;

            for (int i = 0; i < TBLPayments.getRowCount(); i++) {

                int amount = Integer.parseInt((String) TBLPayments.getValueAt(i, 2));

                Total += amount;

            }
            TOTALPayments.setText("" + Total);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void Loadsalary() {

        try {

            DefaultTableModel dtm = (DefaultTableModel) TBLSalary.getModel();
            dtm.setRowCount(0);

            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staffsalary ON staffsalary.idStaff = staff.idStaff WHERE nic='" + Nic.getText() + "' AND date BETWEEN '" + fromdate.getText() + "' AND '" + todate.getText() + "'");

            while (rs.next()) {

                Vector v = new Vector();
                v.add(rs.getString("date"));
                v.add(rs.getString("Etf"));
                v.add(rs.getString("Epf"));
                v.add(rs.getString("NettSalary"));
                dtm.addRow(v);

            }

            int TotalEtf1 = 0;
            int TotalEpf1 = 0;
            int TotalSalary = 0;

            for (int i = 0; i < TBLSalary.getRowCount(); i++) {

                int etf = Integer.parseInt((String) TBLSalary.getValueAt(i, 1));
                int epf = Integer.parseInt((String) TBLSalary.getValueAt(i, 2));
                int Salary = Integer.parseInt((String) TBLSalary.getValueAt(i, 3));

                TotalEtf1 += etf;
                TotalEtf1 += epf;
                TotalSalary += Salary;

            }

            TotalEtf.setText("" + TotalEtf1);
            TotalEpf.setText("" + TotalEpf1);
            TotalSalkary.setText("" + TotalSalary);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void Loadleave() {

        try {

            DefaultTableModel dtm = (DefaultTableModel) TBLLeave.getModel();
            dtm.setRowCount(0);

            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staffleave ON staffleave.idStaff = staff.idStaff WHERE nic='" + Nic.getText() + "'  AND FromDate BETWEEN '" + fromdate.getText() + "'  AND '" + todate.getText() + "'  ORDER BY LeaveType");

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("Requested date"));
                v.add(rs.getString("LeaveType"));
                v.add(rs.getString("FromDate"));
                v.add(rs.getString("ToDate"));
                v.add(rs.getString("Active Employee"));

                dtm.addRow(v);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        try {
            ResultSet rs = DB.search("SELECT COUNT(idStaffLeave) AS F FROM staff INNER JOIN staffleave ON staffleave.idStaff = staff.idStaff WHERE nic='" + Nic.getText() + "'  AND FromDate BETWEEN '" + fromdate.getText() + "'  AND '" + todate.getText() + "' AND LeaveType='" + "Fullday" + "'");

            while (rs.next()) {
                TotalFulldays.setText(""+rs.getInt("F"));
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            ResultSet rs = DB.search("SELECT COUNT(idStaffLeave) AS F FROM staff INNER JOIN staffleave ON staffleave.idStaff = staff.idStaff WHERE nic='" + Nic.getText() + "'  AND FromDate BETWEEN '" + fromdate.getText() + "'  AND '" + todate.getText() + "' AND LeaveType='" + "halfday" + "'");

            while (rs.next()) {
                TotalHalfdays.setText(""+rs.getInt("F"));
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            ResultSet rs = DB.search("SELECT COUNT(idStaffLeave) AS F FROM staff INNER JOIN staffleave ON staffleave.idStaff = staff.idStaff WHERE nic='" + Nic.getText() + "'  AND FromDate BETWEEN '" + fromdate.getText() + "'  AND '" + todate.getText() + "' AND LeaveType='" + "shortleave" + "'");

            while (rs.next()) {
                TotalshortLeaves.setText(""+rs.getInt("F"));
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
     
//        float tot=(float)totaldays;
//        float full=Float.parseFloat(TotalFulldays.getText());
        
       
       
        
        
        
        
        

    }

    private void Loadattendence() {
        
        try {
            DefaultTableModel dtm=(DefaultTableModel) TBLAttendence.getModel();
            dtm.setRowCount(0);
            
            ResultSet rs=DB.search("SELECT * FROM staff INNER JOIN staffattendence ON staffattendence.idStaff = staff.idStaff  WHERE nic='" + Nic.getText() + "'  AND Date BETWEEN '" + fromdate.getText() + "'  AND '" + todate.getText() + "'  ");
           
            
            
            while (rs.next()) {                
                Vector v = new Vector();
               
                v.add(rs.getString("Date"));
                v.add(rs.getString("Intime"));
                v.add(rs.getString("Outtime"));
                v.add(rs.getString("status"));
                dtm.addRow(v);
                
                
                
                
                
            }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            
            ResultSet rs=DB.search("SELECT Count(Date) AS x FROM staff INNER JOIN staffattendence ON staffattendence.idStaff = staff.idStaff  WHERE nic='" + Nic.getText() + "'  AND Date BETWEEN '" + fromdate.getText() + "'  AND '" + todate.getText() + "'  ");
            
            while (rs.next()) {                
                
                System.out.println(""+rs.getInt("x"));
              presentDays.setText(""+rs.getInt("x"));
                
                
                
                
                
            }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
