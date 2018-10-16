package Staff;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import ExtenelClasses.dateFormat;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class salary extends javax.swing.JFrame {

    static boolean maximized = true;

    public salary() {

        initComponents();
        maximizeWindow();
        searchmonth();
        loademployee();
        enab();
        setmonth();

        basic.setEditable(false);
        totalallowance.setEditable(false);
        subtotal.setEditable(false);
        deduction.setEditable(false);
        paymentt.setEditable(false);
        netsalry.setEditable(false);

    }
    String month;
    int id;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        empbox1 = new javax.swing.JComboBox<>();
        totalallowance = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        deduction = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        netsalry = new javax.swing.JTextField();
        pay = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        basic = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        epf1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        etf1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        paymentt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sub = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allowance = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reduction = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        reduction1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        reduction2 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        reduction3 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        paymnt = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Staff Salary-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 10, 640));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("salary"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Select Staff");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 40));

        empbox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));
        empbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empbox1ActionPerformed(evt);
            }
        });
        jPanel2.add(empbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 430, 40));

        totalallowance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalallowance.setPreferredSize(new java.awt.Dimension(69, 23));
        totalallowance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalallowanceActionPerformed(evt);
            }
        });
        totalallowance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalallowanceKeyTyped(evt);
            }
        });
        jPanel2.add(totalallowance, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 120, 40));

        jLabel3.setText("Toltal allowence");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 100, 40));

        jLabel4.setText("Sub Total");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, 40));

        subtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        subtotal.setPreferredSize(new java.awt.Dimension(69, 23));
        subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotalActionPerformed(evt);
            }
        });
        subtotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                subtotalKeyTyped(evt);
            }
        });
        jPanel2.add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 400, 40));

        jLabel5.setText("Total Deduction");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 80, 40));

        deduction.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        deduction.setPreferredSize(new java.awt.Dimension(69, 23));
        deduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deductionActionPerformed(evt);
            }
        });
        deduction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                deductionKeyTyped(evt);
            }
        });
        jPanel2.add(deduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 140, 40));

        jLabel7.setText("Net Salary");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 80, 40));

        netsalry.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        netsalry.setPreferredSize(new java.awt.Dimension(69, 23));
        netsalry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netsalryActionPerformed(evt);
            }
        });
        netsalry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                netsalryKeyTyped(evt);
            }
        });
        jPanel2.add(netsalry, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 400, 40));

        pay.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pay.setText("PAY");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        jPanel2.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 590, 120, 40));

        jLabel9.setText("Basic Salary");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 40));

        basic.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        basic.setPreferredSize(new java.awt.Dimension(69, 23));
        basic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                basicKeyTyped(evt);
            }
        });
        jPanel2.add(basic, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 130, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 120, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("EPF");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 40));

        epf1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        epf1.setPreferredSize(new java.awt.Dimension(69, 23));
        epf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                epf1FocusLost(evt);
            }
        });
        epf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epf1ActionPerformed(evt);
            }
        });
        jPanel5.add(epf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 140, 40));

        jLabel8.setText("ETF");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 80, 40));

        etf1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        etf1.setPreferredSize(new java.awt.Dimension(69, 23));
        etf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                etf1FocusLost(evt);
            }
        });
        etf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etf1ActionPerformed(evt);
            }
        });
        jPanel5.add(etf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 130, 40));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText(" LKR");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 30, 40));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText(" LKR");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, 40));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText(" LKR");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, 40));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 550, 80));

        paymentt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        paymentt.setPreferredSize(new java.awt.Dimension(69, 23));
        paymentt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymenttActionPerformed(evt);
            }
        });
        paymentt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paymenttKeyTyped(evt);
            }
        });
        jPanel2.add(paymentt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 130, 40));

        jLabel10.setText("Total Payment");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 80, 40));

        jLabel1.setText("Total ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        sub.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        jPanel2.add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 400, 40));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText(" LKR");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 30, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText(" LKR");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 30, 40));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText(" LKR");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 30, 40));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText(" LKR");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 30, 40));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText(" LKR");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 30, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText(" LKR");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, -1, 40));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText(" LKR");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, -1, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 600, 640));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Allownce"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allowance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Allownce type", "Amount"
            }
        ));
        jScrollPane1.setViewportView(allowance);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 40, 610, 170));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 660, 230));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Reduction"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reduction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", " Reduction  type", "Amount"
            }
        ));
        jScrollPane2.setViewportView(reduction);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 40, 610, 150));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("reduction"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reduction1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", " Reduction  type", "Amount"
            }
        ));
        jScrollPane3.setViewportView(reduction1);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 40, 610, 150));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 670, 220));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("reduction"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reduction2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", " Reduction  type", "Amount"
            }
        ));
        jScrollPane4.setViewportView(reduction2);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 40, 610, 150));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("reduction"));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reduction3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", " Reduction  type", "Amount"
            }
        ));
        jScrollPane5.setViewportView(reduction3);

        jPanel8.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 40, 610, 150));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 670, 220));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 670, 220));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 670, 220));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Payments"));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paymnt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Payment Type", "Amount"
            }
        ));
        jScrollPane6.setViewportView(paymnt);

        jPanel9.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 600, 130));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 670, 180));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void netsalryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netsalryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_netsalryActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        boolean b = false;
        java.awt.Component[] cp = jPanel2.getComponents();
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

        java.util.Date date = new java.util.Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");

        String d1 = dateFormat.DateFullCurrent();
        if (b == false) {

            if (empbox1.getSelectedIndex() != 0) {

                try {
                    DB.idu("INSERT INTO `newkamal`.`staffsalary` ( `idStaff`, `date`, `BasicSalary`, `TotalAllowence`, `TotalDeductions`, `TotalPayments`, `Etf`, `Epf`, `NettSalary`,Totalreduct) VALUES ('" + id + "', '" + d1 + "', '" + basic.getText() + "', '" + totalallowance.getText() + "', '" + deduction.getText() + "', '" + paymentt.getText() + "','" + etf1.getText() + "','" + epf1.getText() + "','" + netsalry.getText() + "','"+sub.getText()+"')");
                    DB.idu("INSERT INTO `newkamal`.`incomeexpence` (`Date`, `Description`, `Income`, `Expence`) VALUES ( '" + d1 + "', '" + "staff salary-" + empbox1.getSelectedItem().toString() + "', '" + 0 + "', '" + netsalry.getText() + "')");
                    netsalry.setEditable(false);
                    basic.setEditable(false);
                    totalallowance.setEditable(false);
                    subtotal.setEditable(false);
                    deduction.setEditable(false);
                    paymentt.setEditable(false);

                    clearfields();
                    enab();

                    epf1.setText(null);
                    etf1.setText(null);
                    netsalry.setText(null);
                    DefaultTableModel dtm = (DefaultTableModel) allowance.getModel();
                    DefaultTableModel dtm1 = (DefaultTableModel) reduction.getModel();

                    dtm.setRowCount(0);
                    dtm1.setRowCount(0);
                    NotificationPopup.save();

//                        try {
//                            InputStream path = getClass().getResourceAsStream("/Jreport/Pay_Sheet.jrxml");
//
//                            JasperReport compileReport = JasperCompileManager.compileReport(path);
//                            Map<String, Object> m = new HashMap();
//                            m.put("staff", id);
//                            m.put("date", d1);
//
//                            JasperPrint fillReport = JasperFillManager.fillReport(compileReport, m, DB.getCon());
////                    JasperViewer.viewReport(fillReport, false);
//                            JasperPrintManager.printReport(fillReport, true);
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
                } catch (Exception ex) {
                    Logger.getLogger(salary.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {

                System.out.println("staff");
            }

        } else {

            System.out.println("false");

        }


    }//GEN-LAST:event_payActionPerformed


    private void empbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empbox1ActionPerformed

        basic.setEditable(false);
        totalallowance.setEditable(false);
        subtotal.setEditable(false);
        deduction.setEditable(false);
        paymentt.setEditable(false);

        totalallowance.setText("" + 0.0);
        deduction.setText("" + 0.0);
        paymentt.setText("" + 0.0);

        String s1[] = empbox1.getSelectedItem().toString().split("-");
        String nic = s1[1];

        try {
            ResultSet rs = DB.search("SELECT * FROM `staff`  WHERE nic='" + nic + "'");

            while (rs.next()) {

                id = rs.getInt("idStaff");
                //JOptionPane.showMessageDialog(rootPane, id);
            }
        } catch (Exception e) {

            e.printStackTrace();

        }

        basicsalary();
        loadallowance();
        subtotal();
        deduction();
        payment();
        setnet();

        epf1.grabFocus();
        try {
            ResultSet rs = DB.search("SELECT * FROM `staffsalary`WHERE idStaff='" + id + "' AND date LIKE '" + dateFormat.MonthOnly() + "%'");
            if (rs.next()) {
                pay.setEnabled(false);
                etf1.setText(rs.getString("Etf"));
                epf1.setText(rs.getString("Epf"));
                netsalry.setText(rs.getString("NettSalary"));
                sub.setText(rs.getString("Totalreduct"));
            } else {
                pay.setEnabled(true);
                etf1.setText(null);
                epf1.setText(null);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_empbox1ActionPerformed

    private void deductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deductionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deductionActionPerformed

    private void etf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etf1FocusLost


    }//GEN-LAST:event_etf1FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clearfields();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void basicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_basicKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_basicKeyTyped

    private void totalallowanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalallowanceKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_totalallowanceKeyTyped

    private void subtotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subtotalKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_subtotalKeyTyped

    private void deductionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deductionKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_deductionKeyTyped

    private void netsalryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_netsalryKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_netsalryKeyTyped

    private void totalallowanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalallowanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalallowanceActionPerformed

    private void epf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epf1ActionPerformed

        double sub = Double.parseDouble(subtotal.getText());
        double epf = 0.0;
        double deduction1 = Double.parseDouble(deduction.getText());
        double payment = Double.parseDouble(paymentt.getText());
        double net = Double.parseDouble(netsalry.getText());

        if (epf1.getText().isEmpty()) {
            epf = 0.0;
            epf1.setText("" + epf);
        } else {
            epf = Double.parseDouble(epf1.getText());

        }
        netsalry.setText("" + (sub - (deduction1 + payment + epf)));
        etf1.grabFocus();


    }//GEN-LAST:event_epf1ActionPerformed

    private void epf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_epf1FocusLost

    }//GEN-LAST:event_epf1FocusLost

    private void etf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etf1ActionPerformed

        double etf = 0.0;
        double epf = Double.parseDouble(epf1.getText());
        double subtotal = Double.parseDouble(this.subtotal.getText());
        double deduction1 = Double.parseDouble(deduction.getText());
        double payment = Double.parseDouble(paymentt.getText());

        if (etf1.getText().isEmpty()) {
            etf = 0.0;
            etf1.setText("" + etf);
        } else {

            etf = Double.parseDouble(etf1.getText());

        }
        sub.setText(""+(epf + etf + deduction1 + payment));
        netsalry.setText("" + (subtotal - (epf + etf + deduction1 + payment)));


    }//GEN-LAST:event_etf1ActionPerformed

    private void paymenttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymenttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymenttActionPerformed

    private void paymenttKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymenttKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_paymenttKeyTyped

    private void subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotalActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allowance;
    private javax.swing.JTextField basic;
    private javax.swing.JTextField deduction;
    public javax.swing.JComboBox<String> empbox1;
    private javax.swing.JTextField epf1;
    private javax.swing.JTextField etf1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField netsalry;
    private javax.swing.JButton pay;
    private javax.swing.JTextField paymentt;
    private javax.swing.JTable paymnt;
    private javax.swing.JTable reduction;
    private javax.swing.JTable reduction1;
    private javax.swing.JTable reduction2;
    private javax.swing.JTable reduction3;
    private javax.swing.JTextField sub;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTextField totalallowance;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            salary.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            salary.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void searchmonth() {

        java.util.Date date = new java.util.Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/");

        month = simpleDateFormat.format(date);

    }

    private void setdate() {

        java.util.Date date = new java.util.Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");

    }

    private void loademployee() {

        try {

            ResultSet rs = DB.search("SELECT * FROM `staff` WHERE IsActive='1'");

            while (rs.next()) {

                empbox1.addItem(rs.getString("name") + "-" + rs.getString("nic"));

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void basicsalary() {

        try {
            ResultSet rs = DB.search("SELECT * FROM `staff` WHERE idStaff='" + id + "'");
            while (rs.next()) {

                basic.setText("" + rs.getDouble("Basic Salary"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void clearfields() {

        java.awt.Component[] cp = jPanel2.getComponents();
        for (java.awt.Component c : cp) {

            if (c instanceof JTextField) {

                ((JTextField) c).setText(null);

            }

        }

        java.awt.Component[] cp1 = jPanel5.getComponents();
        for (java.awt.Component c : cp1) {

            if (c instanceof JTextField) {

                ((JTextField) c).setText(null);

            }

        }
//empbox.setSelectedIndex(0);
//DefaultTableModel dtm=(DefaultTableModel) allowance.getModel();
//dtm.setRowCount(0);
//DefaultTableModel dtm1=(DefaultTableModel) reduction.getModel();
//dtm1.setRowCount(0);
//DefaultTableModel dtm2=(DefaultTableModel) paymnt.getModel();
//dtm2.setRowCount(0);
    }

    private void enab() {
        java.util.Date date = new java.util.Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(".MM.");

        String d1 = simpleDateFormat.format(date);
        try {
            ResultSet rs = DB.search("SELECT * FROM `staffsalary` WHERE date LIKE '%" + d1 + "%' AND idStaff='" + id + "' ");
            if (rs.next()) {
                pay.setEnabled(false);
                epf1.setText(rs.getString("Epf"));
                etf1.setText(rs.getString("Etf"));
                netsalry.setText(rs.getString("NettSalary"));
            } else {
                pay.setEnabled(true);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadallowance() {

        try {

            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN staff_has_allowence ON staff_has_allowence.Staff_idStaff = staff.idStaff INNER JOIN allowence ON staff_has_allowence.Allowence_idAllowence = allowence.idAllowence   WHERE staff.idStaff ='" + id + "' AND date LIKE '" + dateFormat.MonthOnly() + "%' AND  staff_has_allowence.isDelete='" + 1 + "'");
            DefaultTableModel dtm = (DefaultTableModel) allowance.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {

                Vector v = new Vector();
               
                v.add(rs.getString("date"));
                v.add(rs.getString("AllowenceName"));

                v.add(rs.getString("Amount"));
                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        ///----------------------------------------------------------------------------------------------------------------------------------
        double t1allowance = 0.0;
        double t2allowance = 0.0;
        if (allowance.getRowCount() != 0) {

            for (int i = 0; i < allowance.getRowCount(); i++) {

                t1allowance = Double.parseDouble(allowance.getValueAt(i, 2).toString());

                t2allowance += t1allowance;

                totalallowance.setText("" + t2allowance);

            }

        } else {
            //System.out.println("else");
            t2allowance = 0.0;
            totalallowance.setText("" + t2allowance);

        }

    }

    private void setmonth() {

        java.util.Date date = new java.util.Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/");

        month = simpleDateFormat.format(date);

    }

    private void subtotal() {

        double basic = 0.0;
        double tallowance = 0.0;

        basic = Double.parseDouble(this.basic.getText());
        tallowance = Double.parseDouble(totalallowance.getText());

        subtotal.setText("" + (basic + tallowance));

    }

    private void deduction() {

        DefaultTableModel dtm = (DefaultTableModel) reduction.getModel();
        dtm.setRowCount(0);

        try {
            ResultSet rs = DB.search("SELECT * FROM staff INNER JOIN deduction ON deduction.Staff_idStaff = staff.idStaff WHERE Staff_idStaff='" + id + "' AND date LIKE '" + dateFormat.MonthOnly() + "%' ");

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("date"));
                v.add(rs.getString("type"));
                v.add(rs.getString("amount"));
                dtm.addRow(v);

            }

        } catch (Exception ex) {
            Logger.getLogger(salary.class.getName()).log(Level.SEVERE, null, ex);
        }

        //-------------------------------------------------------------------------------------------------------------------------------
        double treduction = 0.0;
        double t1reduction = 0.0;
        if (reduction.getSelectedRow() != 0) {

            for (int i = 0; i < reduction.getRowCount(); i++) {
                t1reduction = Double.parseDouble(reduction.getValueAt(i, 2).toString());

                treduction += t1reduction;

                deduction.setText("" + treduction);

            }

        } else {

            treduction = 0.0;
            deduction.setText("" + treduction);

        }

    }

    private void payment() {

        DefaultTableModel dtm = (DefaultTableModel) paymnt.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = DB.search("SELECT * FROM staff  INNER JOIN staffpayment ON staffpayment.idStaff = staff.idStaff WHERE staff.idStaff='" + id + "' AND date LIKE '" + dateFormat.MonthOnly() + "%' ");

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("date"));
                v.add(rs.getString("Description"));
                v.add(rs.getString("amount"));
                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        double treduction = 0.0;
        double t1reduction = 0.0;
        if (paymnt.getSelectedRow() != 0) {

            for (int i = 0; i < paymnt.getRowCount(); i++) {
                t1reduction = Double.parseDouble(paymnt.getValueAt(i, 2).toString());

                treduction += t1reduction;

                paymentt.setText("" + treduction);

            }

        } else {

            treduction = 0.0;
            paymentt.setText("" + treduction);

        }

    }

    private void setnet() {

        double subtotal = 0.0;
        double td = 0.0;
        double tp = 0.0;

        if (deduction.getText().isEmpty()) {
            td = 0.0;
        } else {

            td = Double.parseDouble(deduction.getText());
        }

        if (paymentt.getText().isEmpty()) {
            tp = 0.0;
        } else {
            tp = Double.parseDouble(paymentt.getText());

        }
        subtotal = Double.parseDouble(this.subtotal.getText());

        netsalry.setText("" + (subtotal - (td + tp)));

    }

}
