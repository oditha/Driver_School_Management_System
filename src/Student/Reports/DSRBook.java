package Student.Reports;

import ExtenelClasses.DB;
import ExtenelClasses.EncodeDecodeImage;
import ExtenelClasses.dfPrice;
import com.alee.laf.WebLookAndFeel;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class DSRBook extends javax.swing.JFrame {

    static boolean maximized = true;
    int studentID;
    String TrialID;
    int studentIDadd;
    String TrialIDadd;

    HashMap<String, Integer> examDate = new HashMap();
    HashMap<String, Integer> TrialDate = new HashMap();

    public DSRBook() {
        initComponents();
        maximizeWindow();
        txtSearch.grabFocus();
        chkRN.setSelected(true);
        tableDecor();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        txtPanel = new javax.swing.JPanel();
        chkNic = new javax.swing.JCheckBox();
        chkPP = new javax.swing.JCheckBox();
        chkOldDl = new javax.swing.JCheckBox();
        chkRN = new javax.swing.JCheckBox();
        ImageIcon = new javax.swing.JLabel();
        txtStudentName2 = new javax.swing.JLabel();
        txtStudentName3 = new javax.swing.JLabel();
        txtStudentName4 = new javax.swing.JLabel();
        txtStudentName5 = new javax.swing.JLabel();
        txtLernersPermit = new javax.swing.JTextField();
        txtNic = new javax.swing.JTextField();
        txtPP = new javax.swing.JTextField();
        txtOldDl = new javax.swing.JTextField();
        txtRegNo = new javax.swing.JTextField();
        txtAddress2 = new javax.swing.JTextField();
        txtAddress1 = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtStudentName8 = new javax.swing.JLabel();
        txtStudentName9 = new javax.swing.JLabel();
        txtStudentName10 = new javax.swing.JLabel();
        txtStudentName11 = new javax.swing.JLabel();
        txtStudentName12 = new javax.swing.JLabel();
        txtContactOffice = new javax.swing.JTextField();
        txtStudentName13 = new javax.swing.JLabel();
        txtContactHome = new javax.swing.JTextField();
        txtStudentName15 = new javax.swing.JLabel();
        txtContactPersonal = new javax.swing.JTextField();
        txtStudentName16 = new javax.swing.JLabel();
        txtCoursefee = new javax.swing.JTextField();
        txtStudentName21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        txtStudentName23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtStudentName7 = new javax.swing.JLabel();
        txtStudentName17 = new javax.swing.JLabel();
        txtStudentName18 = new javax.swing.JLabel();
        txtStudentName19 = new javax.swing.JLabel();
        txtStudentName6 = new javax.swing.JLabel();
        txtIssue = new javax.swing.JLabel();
        txtReportno = new javax.swing.JLabel();
        txtWeight = new javax.swing.JLabel();
        txtHeight = new javax.swing.JLabel();
        txtBlood = new javax.swing.JLabel();
        txtExpire = new javax.swing.JLabel();
        txtStudentName20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblTrialDate = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblExamDate = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblSimiulator = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblLectures = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblVehicle = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblMechnicle = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblTrailResult = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblCoursePayments = new javax.swing.JTable();
        txtStudentName14 = new javax.swing.JLabel();
        txtStudentName22 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblExamFee = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblExamResults = new javax.swing.JTable();
        txtCap = new javax.swing.JLabel();
        txtStudentName24 = new javax.swing.JLabel();
        txtTshirt = new javax.swing.JLabel();
        txtStudentName26 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pass", "Fail" }));

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DSR RecordNew Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPanel.setBackground(java.awt.Color.white);
        txtPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Student"));
        txtPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chkNic.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkNic);
        chkNic.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkNic.setText("NIC");
        txtPanel.add(chkNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        chkPP.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkPP);
        chkPP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkPP.setText("Passport No");
        txtPanel.add(chkPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        chkOldDl.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkOldDl);
        chkOldDl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkOldDl.setText("OLD DL");
        txtPanel.add(chkOldDl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        chkRN.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkRN);
        chkRN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkRN.setText("Register No");
        txtPanel.add(chkRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        ImageIcon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ImageIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPanel.add(ImageIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, 190));

        txtStudentName2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName2.setText("NIC :");
        txtPanel.add(txtStudentName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 130, 20));

        txtStudentName3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName3.setText("Passport No :");
        txtPanel.add(txtStudentName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 130, 20));

        txtStudentName4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName4.setText("OLD DL No :");
        txtPanel.add(txtStudentName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 140, 20));

        txtStudentName5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName5.setText("Register No :");
        txtPanel.add(txtStudentName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 140, 20));

        txtLernersPermit.setEditable(false);
        txtPanel.add(txtLernersPermit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 190, -1));

        txtNic.setEditable(false);
        txtPanel.add(txtNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 190, -1));

        txtPP.setEditable(false);
        txtPanel.add(txtPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 190, -1));

        txtOldDl.setEditable(false);
        txtPanel.add(txtOldDl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 190, -1));

        txtRegNo.setEditable(false);
        txtRegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegNoActionPerformed(evt);
            }
        });
        txtPanel.add(txtRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 190, -1));

        txtAddress2.setEditable(false);
        txtPanel.add(txtAddress2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 390, -1));

        txtAddress1.setEditable(false);
        txtAddress1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress1ActionPerformed(evt);
            }
        });
        txtPanel.add(txtAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 390, -1));

        txtGender.setEditable(false);
        txtPanel.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 390, -1));

        txtDOB.setEditable(false);
        txtPanel.add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 390, -1));

        txtFullName.setEditable(false);
        txtPanel.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 390, -1));

        txtStudentName8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName8.setText("Address 2");
        txtPanel.add(txtStudentName8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 140, 20));

        txtStudentName9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName9.setText("Address 1");
        txtPanel.add(txtStudentName9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 140, 20));

        txtStudentName10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName10.setText("Gender");
        txtPanel.add(txtStudentName10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 140, 20));

        txtStudentName11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName11.setText("DOB");
        txtPanel.add(txtStudentName11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 20));

        txtStudentName12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName12.setText("FullName");
        txtPanel.add(txtStudentName12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 130, 20));

        txtContactOffice.setEditable(false);
        txtPanel.add(txtContactOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 390, -1));

        txtStudentName13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName13.setText("Contact Office");
        txtPanel.add(txtStudentName13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 140, 20));

        txtContactHome.setEditable(false);
        txtContactHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactHomeActionPerformed(evt);
            }
        });
        txtPanel.add(txtContactHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 390, -1));

        txtStudentName15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName15.setText("Contact Personal");
        txtPanel.add(txtStudentName15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 140, 30));

        txtContactPersonal.setEditable(false);
        txtPanel.add(txtContactPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 390, -1));

        txtStudentName16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName16.setText("Course Fee");
        txtPanel.add(txtStudentName16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 140, 30));

        txtCoursefee.setEditable(false);
        txtCoursefee.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPanel.add(txtCoursefee, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, 390, -1));

        txtStudentName21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName21.setText("Contact Home");
        txtPanel.add(txtStudentName21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 140, 20));

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel2.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 540, 30));

        txtPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 570, 40));

        txtStudentName23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName23.setText("Lerners Permit :");
        txtPanel.add(txtStudentName23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 140, 20));

        jPanel1.add(txtPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 590, 670));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Medicle Report"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtStudentName7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName7.setText("Report No");
        jPanel3.add(txtStudentName7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 20));

        txtStudentName17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName17.setText("Weight");
        jPanel3.add(txtStudentName17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 20));

        txtStudentName18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName18.setText("Height");
        jPanel3.add(txtStudentName18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, 20));

        txtStudentName19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName19.setText("Blood Group");
        jPanel3.add(txtStudentName19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 20));

        txtStudentName6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName6.setText("Issue Date");
        jPanel3.add(txtStudentName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, 20));

        txtIssue.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 140, 20));

        txtReportno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtReportno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 140, 20));

        txtWeight.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 140, 20));

        txtHeight.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 130, 20));

        txtBlood.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 130, 20));

        txtExpire.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtExpire, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 140, 20));

        txtStudentName20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName20.setText("Expire Date");
        jPanel3.add(txtStudentName20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 210, 160));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Exam and Trial"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTrialDate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trial Date"
            }
        ));
        tblTrialDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTrialDateMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblTrialDate);

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 140, 120));

        tblExamDate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exam Dates"
            }
        ));
        tblExamDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblExamDateMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblExamDate);

        jPanel4.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 120));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 210, 350, 160));

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Attendence Records"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSimiulator.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Simiulator"
            }
        ));
        jScrollPane9.setViewportView(tblSimiulator);

        jPanel5.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 110, 120));

        tblLectures.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lectures"
            }
        ));
        jScrollPane10.setViewportView(tblLectures);

        jPanel5.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 120));

        tblVehicle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle"
            }
        ));
        jScrollPane11.setViewportView(tblVehicle);

        jPanel5.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 110, 120));

        tblMechnicle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mechnicle"
            }
        ));
        jScrollPane12.setViewportView(tblMechnicle);

        jPanel5.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 110, 120));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 490, 160));

        jPanel6.setBackground(java.awt.Color.white);
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Trial Results"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTrailResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class", "Result"
            }
        ));
        jScrollPane13.setViewportView(tblTrailResult);

        jPanel6.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 330, 110));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 510, 350, 150));

        jPanel7.setBackground(java.awt.Color.white);
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Course Details"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class", "Type", "Amount"
            }
        ));
        jScrollPane14.setViewportView(tblCourse);
        if (tblCourse.getColumnModel().getColumnCount() > 0) {
            tblCourse.getColumnModel().getColumn(2).setHeaderValue("Amount");
        }

        jPanel7.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 330, 120));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 350, 160));

        jPanel8.setBackground(java.awt.Color.white);
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Payments"));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCoursePayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment Date", "Amount"
            }
        ));
        jScrollPane15.setViewportView(tblCoursePayments);
        if (tblCoursePayments.getColumnModel().getColumnCount() > 0) {
            tblCoursePayments.getColumnModel().getColumn(1).setHeaderValue("Amount");
        }

        jPanel8.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 330, 110));

        txtStudentName14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName14.setText("Course fee Payment");
        jPanel8.add(txtStudentName14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 20));

        txtStudentName22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName22.setText("Exam / Trial  fee Payment");
        jPanel8.add(txtStudentName22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, 20));

        tblExamFee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment Date", "Amount"
            }
        ));
        jScrollPane16.setViewportView(tblExamFee);
        if (tblExamFee.getColumnModel().getColumnCount() > 0) {
            tblExamFee.getColumnModel().getColumn(1).setHeaderValue("Amount");
        }

        jPanel8.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 330, 110));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 350, 310));

        jPanel10.setBackground(java.awt.Color.white);
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Exam Result"));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblExamResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marks", "Result"
            }
        ));
        jScrollPane17.setViewportView(tblExamResults);

        jPanel10.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 330, 80));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 380, 350, 120));

        txtCap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 670, 60, 20));

        txtStudentName24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName24.setText("Cap :");
        jPanel1.add(txtStudentName24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 670, 60, 20));

        txtTshirt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtTshirt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 670, 60, 20));

        txtStudentName26.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStudentName26.setText("Tshirt :");
        jPanel1.add(txtStudentName26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 670, 60, 20));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        ResultSet rs = null;

        try {
            if (chkNic.isSelected()) {

                rs = DB.search("SELECT idstudents, FullName FROM students WHERE NIC = '" + txtSearch.getText() + "' ");

            } else if (chkOldDl.isSelected()) {

                rs = DB.search("SELECT idstudents, FullName FROM students WHERE OldDLNo = '" + txtSearch.getText() + "' ");

            } else if (chkPP.isSelected()) {

                rs = DB.search("SELECT idstudents, FullName FROM students WHERE PassportNo = '" + txtSearch.getText() + "' ");

            } else if (chkRN.isSelected()) {

                rs = DB.search("SELECT idstudents, FullName FROM students WHERE RegNo = '" + txtSearch.getText() + "' ");

            }

            if (rs.next()) {

                studentID = rs.getInt("idstudents");

                loadStudentDetails();
                setAttendents();
                setMedicleRecord();
                loadCourseDetails();
                loadCoursepaymet();
                loadExamTrial();

            } else {

                studentID = 0;
                clearFeilds();
                setAttendents();
                setMedicleRecord();
                loadCourseDetails();
                loadExamTrial();
                loadCoursepaymet();
             DefaultTableModel dtm1 = (DefaultTableModel) tblExamFee.getModel();
             DefaultTableModel dtm2 = (DefaultTableModel) tblExamResults.getModel();
             DefaultTableModel dtm3 = (DefaultTableModel) tblTrailResult.getModel();
             dtm1.setRowCount(0);
             dtm2.setRowCount(0);
             dtm3.setRowCount(0);
             
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegNoActionPerformed

    }//GEN-LAST:event_txtRegNoActionPerformed

    private void txtAddress1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress1ActionPerformed


    }//GEN-LAST:event_txtAddress1ActionPerformed

    private void txtContactHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactHomeActionPerformed
        
    }//GEN-LAST:event_txtContactHomeActionPerformed

    private void tblExamDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExamDateMouseClicked
        
        try {
        
            ResultSet rs = DB.search("Select * from ExamResult where idStudentExam = '"+examDate.get(tblExamDate.getValueAt(tblExamDate.getSelectedRow(), 0).toString())+"' and isDelete = '1'");
            DefaultTableModel dtm = (DefaultTableModel) tblExamResults.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                
                dtm.addRow(new Object[]{rs.getString("Marks"),rs.getString("OverollResult")});
                
            }
            
            ResultSet rs1 = DB.search("Select * from examPayment where idStudentExam = '"+examDate.get(tblExamDate.getValueAt(tblExamDate.getSelectedRow(), 0).toString())+"' and deleteEP = '1'");
            DefaultTableModel dtm1 = (DefaultTableModel) tblExamFee.getModel();
            dtm1.setRowCount(0);
            while (rs1.next()) {                
                
                dtm1.addRow(new Object[]{rs1.getString("Date"),dfPrice.dcf(rs1.getDouble("Amount"))});
                
            }
            
        } catch (Exception ex) {
            
            Logger.getLogger(DSRBook.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
    }//GEN-LAST:event_tblExamDateMouseClicked

    private void tblTrialDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTrialDateMouseClicked
         try {
        
            ResultSet rs = DB.search("Select * from TrialResult where idTrial = '"+TrialDate.get(tblTrialDate.getValueAt(tblTrialDate.getSelectedRow(), 0).toString())+"' and isDelete = '1'");
            DefaultTableModel dtm = (DefaultTableModel) tblTrailResult.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                
                dtm.addRow(new Object[]{rs.getString("VehicleClass"),rs.getString("TrialResult")});
                
            }
            
            ResultSet rs1 = DB.search("Select * from TrialPayment where Trial_idTrial = '"+TrialDate.get(tblTrialDate.getValueAt(tblTrialDate.getSelectedRow(), 0).toString())+"' and isDelete = '1'");
            DefaultTableModel dtm1 = (DefaultTableModel) tblExamFee.getModel();
            dtm1.setRowCount(0);
            while (rs1.next()) {                
                
                dtm1.addRow(new Object[]{rs1.getString("DatePayment"),dfPrice.dcf(rs1.getDouble("Amount"))});
                
            }
            
            
        } catch (Exception ex) {
            
            Logger.getLogger(DSRBook.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    }//GEN-LAST:event_tblTrialDateMouseClicked

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DSRBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageIcon;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chkNic;
    private javax.swing.JCheckBox chkOldDl;
    private javax.swing.JCheckBox chkPP;
    private javax.swing.JCheckBox chkRN;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable tblCourse;
    private javax.swing.JTable tblCoursePayments;
    private javax.swing.JTable tblExamDate;
    private javax.swing.JTable tblExamFee;
    private javax.swing.JTable tblExamResults;
    private javax.swing.JTable tblLectures;
    private javax.swing.JTable tblMechnicle;
    private javax.swing.JTable tblSimiulator;
    private javax.swing.JTable tblTrailResult;
    private javax.swing.JTable tblTrialDate;
    private javax.swing.JTable tblVehicle;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtAddress2;
    private javax.swing.JLabel txtBlood;
    private javax.swing.JLabel txtCap;
    private javax.swing.JTextField txtContactHome;
    private javax.swing.JTextField txtContactOffice;
    private javax.swing.JTextField txtContactPersonal;
    private javax.swing.JTextField txtCoursefee;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JLabel txtExpire;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JLabel txtHeight;
    private javax.swing.JLabel txtIssue;
    private javax.swing.JTextField txtLernersPermit;
    private javax.swing.JTextField txtNic;
    private javax.swing.JTextField txtOldDl;
    private javax.swing.JTextField txtPP;
    private javax.swing.JPanel txtPanel;
    private javax.swing.JTextField txtRegNo;
    private javax.swing.JLabel txtReportno;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtStudentName10;
    private javax.swing.JLabel txtStudentName11;
    private javax.swing.JLabel txtStudentName12;
    private javax.swing.JLabel txtStudentName13;
    private javax.swing.JLabel txtStudentName14;
    private javax.swing.JLabel txtStudentName15;
    private javax.swing.JLabel txtStudentName16;
    private javax.swing.JLabel txtStudentName17;
    private javax.swing.JLabel txtStudentName18;
    private javax.swing.JLabel txtStudentName19;
    private javax.swing.JLabel txtStudentName2;
    private javax.swing.JLabel txtStudentName20;
    private javax.swing.JLabel txtStudentName21;
    private javax.swing.JLabel txtStudentName22;
    private javax.swing.JLabel txtStudentName23;
    private javax.swing.JLabel txtStudentName24;
    private javax.swing.JLabel txtStudentName26;
    private javax.swing.JLabel txtStudentName3;
    private javax.swing.JLabel txtStudentName4;
    private javax.swing.JLabel txtStudentName5;
    private javax.swing.JLabel txtStudentName6;
    private javax.swing.JLabel txtStudentName7;
    private javax.swing.JLabel txtStudentName8;
    private javax.swing.JLabel txtStudentName9;
    private javax.swing.JLabel txtTshirt;
    private javax.swing.JLabel txtWeight;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            DSRBook.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            DSRBook.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void loadStudentDetails() {

        try {
            ResultSet rs = DB.search("select * from students where idstudents = '" + studentID + "'");
            if (rs.next()) {

                txtAddress1.setText(rs.getString("AddressPermenent"));
                txtAddress2.setText(rs.getString("AddressResident"));
                txtContactHome.setText(rs.getString("TpHome"));
                txtContactOffice.setText(rs.getString("TpBusiness"));
                txtContactPersonal.setText(rs.getString("TpPersonal"));
                txtCoursefee.setText(dfPrice.dcf(rs.getDouble("CourseFee")));
                txtDOB.setText(rs.getString("DOB"));
                txtFullName.setText(rs.getString("FullName"));
                txtGender.setText(rs.getString("Gender"));
                txtLernersPermit.setText(rs.getString("LPNumber"));
                txtOldDl.setText(rs.getString("OldDLNo"));
                txtPP.setText(rs.getString("PassportNo"));
                txtRegNo.setText(rs.getString("RegNo"));
                txtNic.setText(rs.getString("NIC"));
                
                try {
                    ImageIcon.setIcon(new ImageIcon(ImageIO.read(new File(rs.getString("Image"))).getScaledInstance(90, 100, Image.SCALE_SMOOTH)));
                } catch (Exception e) {
                }

            }

        } catch (Exception ex) {
            Logger.getLogger(DSRBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void clearFeilds() {
        Component[] cp = txtPanel.getComponents();
        for (Component c : cp) {

            if (c instanceof JTextField) {

                ((JTextField) c).setText(null);

            }

        }

        ImageIcon.setIcon(null);
    }

    private void setAttendents() {

        try {
            ResultSet rs1 = DB.search("Select * from TheoryClass where idstudents = '" + studentID + "'");
            ResultSet rs2 = DB.search("Select * from VehicleTraining where idstudents = '" + studentID + "'");
            ResultSet rs3 = DB.search("Select * from SimulatorPractice where idstudents = '" + studentID + "'");
            ResultSet rs4 = DB.search("Select * from MachinecalClass where idstudents = '" + studentID + "'");

            DefaultTableModel dt1 = (DefaultTableModel) tblLectures.getModel();
            dt1.setRowCount(0);
            DefaultTableModel dt2 = (DefaultTableModel) tblMechnicle.getModel();
            dt2.setRowCount(0);
            DefaultTableModel dt3 = (DefaultTableModel) tblSimiulator.getModel();
            dt3.setRowCount(0);
            DefaultTableModel dt4 = (DefaultTableModel) tblVehicle.getModel();
            dt4.setRowCount(0);

            while (rs1.next()) {

                dt1.addRow(new Object[]{rs1.getString("Date")});

            }

            while (rs2.next()) {
                dt4.addRow(new Object[]{rs2.getString("Date")});
            }

            while (rs3.next()) {
                dt3.addRow(new Object[]{rs3.getString("Date")});
            }

            while (rs4.next()) {
                dt2.addRow(new Object[]{rs4.getString("Date")});
            }

        } catch (Exception ex) {
            Logger.getLogger(DSRBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void setMedicleRecord() {

        try {
            ResultSet rs = DB.search("select * from medicalReport where idstudents = '" + studentID + "' ");
            if (rs.next()) {

                txtHeight.setText(rs.getString("Height"));
                txtExpire.setText(rs.getString("ValidPeriod"));
                txtIssue.setText(rs.getString("IssueDate"));
                txtWeight.setText(rs.getString("Weight"));
                txtBlood.setText(rs.getString("BloodGroup"));
                txtReportno.setText(rs.getString("ReportNo"));
            } else {

                txtHeight.setText(null);
                txtExpire.setText(null);
                txtIssue.setText(null);
                txtWeight.setText(null);
                txtBlood.setText(null);
                txtReportno.setText(null);

            }
        } catch (Exception ex) {
            Logger.getLogger(DSRBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void loadCourseDetails() {

        try {
            ResultSet rs = DB.search("select lc.*, vc.* from LicenceCatagory lc inner join VehicleClasses vc on lc.idVehicleClasses = vc.idVehicleClasses where lc.idstudents = '" + studentID + "' and lc.isDelete = '1' ");
            DefaultTableModel dtm = (DefaultTableModel) tblCourse.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString("VehicleClasseName"), rs.getString("type"), dfPrice.dcf(rs.getDouble("PriceCatogiry"))});

            }
        } catch (Exception ex) {
            Logger.getLogger(DSRBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void tableDecor() {

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tblCourse.getColumnModel().getColumn(2).setCellRenderer(dtcr);
        tblCoursePayments.getColumnModel().getColumn(1).setCellRenderer(dtcr);
        tblExamFee.getColumnModel().getColumn(1).setCellRenderer(dtcr);

    }

    private void loadCoursepaymet() {

        try {
            ResultSet rs = DB.search("select * from StudentPayment where idstudents = '" + studentID + "' and isDelete = '1'");
            DefaultTableModel dtm = (DefaultTableModel) tblCoursePayments.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString("date"), dfPrice.dcf(rs.getDouble("amount"))});

            }
        } catch (Exception ex) {
            Logger.getLogger(DSRBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void loadExamTrial() {

        try {
            ResultSet rs1 = DB.search(" Select * from StudentExam where idstudents = '" + studentID + "' and Stat = '1' ");
            ResultSet rs2 = DB.search(" Select * from Trial where idstudents = '" + studentID + "' and isDelete = '1' ");
            DefaultTableModel dtm1 = (DefaultTableModel) tblExamDate.getModel();
            DefaultTableModel dtm2 = (DefaultTableModel) tblTrialDate.getModel();
            dtm1.setRowCount(0);
            dtm2.setRowCount(0);
            while (rs1.next()) {

                dtm1.addRow(new Object[]{rs1.getString("DateExam")});
                examDate.put(rs1.getString("DateExam"), rs1.getInt("idStudentExam"));
            }
            while (rs2.next()) {
                dtm2.addRow(new Object[]{rs2.getString("Date")});
                TrialDate.put(rs2.getString("Date"), rs2.getInt("idTrial"));

            }
        } catch (Exception ex) {
            Logger.getLogger(DSRBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
