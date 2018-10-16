package Finance;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class IncomeExpence extends javax.swing.JFrame {

    static boolean maximized = true;

    public IncomeExpence() {
        initComponents();
        maximizeWindow();
        setDate();
        hideText();
        //filltable();
        FromDate.setEnabled(false);
        ToDate.setEnabled(false);
        

    }
    String AcountNo;
    String BankName;
    int bankid;
    java.util.Date date = new java.util.Date();
    SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
    DecimalFormat df = new DecimalFormat("########.00");

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ExpenceType1 = new javax.swing.JComboBox<>();
        BankAccount = new javax.swing.JLabel();
        AMOUNT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DESCRIPTION = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        currentDate = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        save = new javax.swing.JButton();
        SelectBankacc = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dateselect = new javax.swing.JCheckBox();
        ToDate = new com.alee.extended.date.WebDateField();
        FromDate = new com.alee.extended.date.WebDateField();
        jLabel10 = new javax.swing.JLabel();
        expencecombo2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        expencetable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        bal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Income And Expences-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("New Income Or Expences"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Expence Type");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, 30));

        ExpenceType1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ExpenceType1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Bank Transfer", "Other Income", "Other Expense" }));
        ExpenceType1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpenceType1ActionPerformed(evt);
            }
        });
        jPanel2.add(ExpenceType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 420, 30));

        BankAccount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BankAccount.setText("Bank Account");
        jPanel2.add(BankAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, 30));

        AMOUNT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        AMOUNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMOUNTActionPerformed(evt);
            }
        });
        AMOUNT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AMOUNTKeyTyped(evt);
            }
        });
        jPanel2.add(AMOUNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 420, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Amount");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 120, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Description");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 120, 30));

        DESCRIPTION.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(DESCRIPTION, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 420, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Date");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 120, 30));

        currentDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(currentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 420, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("CANCEL");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 120, 40));

        save.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 120, 40));

        SelectBankacc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select-" }));
        SelectBankacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectBankaccActionPerformed(evt);
            }
        });
        jPanel2.add(SelectBankacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 420, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 640, 640));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 20, 680));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Reports"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Expence Type");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("TO DATE");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 160, 20));

        dateselect.setBackground(new java.awt.Color(255, 255, 255));
        dateselect.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dateselect.setText("Select By Date");
        dateselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateselectActionPerformed(evt);
            }
        });
        jPanel3.add(dateselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, -1));

        ToDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        ToDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(ToDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 220, 30));

        FromDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        FromDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        FromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromDateActionPerformed(evt);
            }
        });
        jPanel3.add(FromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 220, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("FROM DATE ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 20));

        expencecombo2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        expencecombo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Records", "All Income", "All Expence" }));
        jPanel3.add(expencecombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 240, 30));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("SEARCH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 120, 30));

        expencetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Income", "Expence"
            }
        ));
        jScrollPane2.setViewportView(expencetable);
        if (expencetable.getColumnModel().getColumnCount() > 0) {
            expencetable.getColumnModel().getColumn(1).setMinWidth(200);
            expencetable.getColumnModel().getColumn(1).setPreferredWidth(200);
            expencetable.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 580, 380));

        jLabel2.setText("Balance");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 70, 30));

        bal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bal.setText("jTextField1");
        jPanel3.add(bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, 270, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 620, 640));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        ResultSet rs = null;

        if (dateselect.isSelected()) {

            if (expencecombo2.getSelectedIndex() == 0) {

                try {
                    rs = DB.search("Select * FROM incomeexpence WHERE Date BETWEEN '" + FromDate + "' AND '" + ToDate + "'");

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }
            if (expencecombo2.getSelectedIndex() == 1) {

                try {
                    rs = DB.search("Select * FROM incomeexpence WHERE Expence ='0' AND (Date BETWEEN '" + FromDate + "' AND '" + ToDate + "'");

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }
            if (expencecombo2.getSelectedIndex() == 2) {

                try {
                    rs = DB.search("Select * FROM incomeexpence WHERE Income ='0' AND (Date BETWEEN '" + FromDate + "' AND '" + ToDate + "'");

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }

        } else if (!dateselect.isSelected()) {

            if (expencecombo2.getSelectedIndex() == 0) {
                try {
                    rs = DB.search("Select * FROM incomeexpence ");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (expencecombo2.getSelectedIndex() == 1) {
                try {
                    rs = DB.search("Select * FROM incomeexpence WHERE Expence ='0' ");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (expencecombo2.getSelectedIndex() == 2) {
                try {
                    rs = DB.search("Select * FROM incomeexpence WHERE Income='0' ");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

        DefaultTableModel dtm = (DefaultTableModel) expencetable.getModel();
        dtm.setRowCount(0);
        try {
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("Date"));
                v.add(rs.getString("Description"));
                v.add(rs.getString("Income"));
                v.add(rs.getString("Expence"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        setBalance();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void FromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FromDateActionPerformed

    private void ExpenceType1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpenceType1ActionPerformed
        if (ExpenceType1.getSelectedIndex() == 1) {

            loadacc();

        } else {

            BankAccount.setVisible(false);
            SelectBankacc.setVisible(false);
            DESCRIPTION.setEnabled(true);
            DESCRIPTION.setText(null);

        }

    }//GEN-LAST:event_ExpenceType1ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        boolean b = false;
        java.awt.Component[] cp = jPanel2.getComponents();
        for (java.awt.Component c : cp) {
            if (c instanceof JTextField) {

                if (((JTextField) c).getText().isEmpty()) {

                    b = true;
                    JOptionPane.showMessageDialog(save, "please fillempty fields");
                    break;

                } else {

                    b = false;

                }

            }
        }

//        --------------------------------------------------------------------------------
        if (ExpenceType1.getSelectedIndex() != 0) {
//         expence type != select   
            if (ExpenceType1.getSelectedIndex() == 1) {
//                expence type == bank transfer
                if (SelectBankacc.getSelectedIndex() != 0) {
//                    bank!= select

                    try {
                        DB.idu("INSERT INTO bankhistory(Date, Description, Deposite, Withrawal, BankDetails_idbankDetails)VALUES('" + currentDate.getText() + "','" + "Cash Deposit" + "','" + AMOUNT.getText() + "','" + "0" + "','" + bankid + "')");
                        DB.idu("INSERT into incomeexpence(date, Description, Income, Expence) VALUES('" + currentDate.getText() + "','" + "Bank Tranfer for " + DESCRIPTION.getText() + "','" + "0" + "','" + df.format(AMOUNT.getText()).toString() + "')");
                        ExpenceType1.setSelectedIndex(1);
                        DESCRIPTION.setText(null);
                        AMOUNT.setText(null);
                        SelectBankacc.setSelectedIndex(0);
                        filltable();
                        NotificationPopup.save();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } else {
                    JOptionPane.showMessageDialog(save, "select a bank account");
                }

            }
            if (b == false) {

                if (ExpenceType1.getSelectedIndex() == 3) {

                    try {
                        DB.idu("INSERT into incomeexpence(date, Description, Income, Expence) VALUES('" + currentDate.getText() + "','" + DESCRIPTION.getText() + "','" + "0" + "','" + AMOUNT.getText() + "')");

                        ExpenceType1.setSelectedIndex(1);
                        DESCRIPTION.setText(null);
                        AMOUNT.setText(null);
                        SelectBankacc.setSelectedIndex(0);

                        filltable();
                        NotificationPopup.save();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
                if (ExpenceType1.getSelectedIndex() == 2) {

                    try {
                        DB.idu("INSERT into incomeexpence(date, Description, Income, Expence) VALUES('" + currentDate.getText() + "','" + DESCRIPTION.getText() + "','" + AMOUNT.getText() + "','" + "0" + "')");

                        ExpenceType1.setSelectedIndex(1);
                        DESCRIPTION.setText(null);
                        AMOUNT.setText(null);
                        SelectBankacc.setSelectedIndex(0);

                        filltable();
                        NotificationPopup.save();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        } else {

            JOptionPane.showMessageDialog(save, "Select Expecne type");

        }
    }//GEN-LAST:event_saveActionPerformed

    private void AMOUNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMOUNTActionPerformed
//     DESCRIPTION.setText("Bank Tranfer for "+SelectBankacc.getSelectedItem()); 
    }//GEN-LAST:event_AMOUNTActionPerformed

    private void SelectBankaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectBankaccActionPerformed
        String sarr[] = SelectBankacc.getSelectedItem().toString().split("-");
        AcountNo = sarr[0];
        BankName = sarr[1];
        DESCRIPTION.setText("Bank Tranfer for " + SelectBankacc.getSelectedItem().toString());
        try {
            ResultSet rs = DB.search("Select * FROM bankdetails WHERE Name='" + BankName + "'");
            while (rs.next()) {
                bankid = rs.getInt("idbankDetails");
            }
        } catch (Exception e) {

            e.printStackTrace();

        }


    }//GEN-LAST:event_SelectBankaccActionPerformed

    private void dateselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateselectActionPerformed
        if (dateselect.isSelected()) {

            FromDate.setEnabled(true);
            ToDate.setEnabled(true);

        } else {
            FromDate.setEnabled(false);
            ToDate.setEnabled(false);

        }
    }//GEN-LAST:event_dateselectActionPerformed

    private void AMOUNTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AMOUNTKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_AMOUNTKeyTyped

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IncomeExpence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AMOUNT;
    private javax.swing.JLabel BankAccount;
    private javax.swing.JTextField DESCRIPTION;
    private javax.swing.JComboBox<String> ExpenceType1;
    private com.alee.extended.date.WebDateField FromDate;
    private javax.swing.JComboBox SelectBankacc;
    private com.alee.extended.date.WebDateField ToDate;
    private javax.swing.JTextField bal;
    private javax.swing.JTextField currentDate;
    private javax.swing.JCheckBox dateselect;
    private javax.swing.JComboBox<String> expencecombo2;
    private javax.swing.JTable expencetable;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            IncomeExpence.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            IncomeExpence.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void setDate() {

        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Date date = new java.util.Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
                currentDate.setText(simpleDateFormat.format(date));
                currentDate.setEditable(false);

            }
        });
        t.start();

    }

    private void hideText() {

        BankAccount.setVisible(false);
        SelectBankacc.setVisible(false);

    }

    private void loadacc() {

        BankAccount.setVisible(true);
        SelectBankacc.setVisible(true);
        DESCRIPTION.setEnabled(false);
        try {
            ResultSet rs = DB.search("SELECT * FROM bankdetails");
            DefaultComboBoxModel dcm = (DefaultComboBoxModel) SelectBankacc.getModel();

            while (rs.next()) {
//                    Vector v=new Vector();
//                    SelectBankacc.addItem(rs.getString("AccountNumber")+"-"+rs.getString("Name"));

//                    v.add(rs.getString("AccountNumber")+"-"+rs.getString("Name"));
                dcm.addElement(rs.getString("AccountNumber") + "-" + rs.getString("Name"));
            }
        } catch (Exception e) {
            System.out.println("e");
        }

    }

    private void filltable() {

        loadTable1();
        setBalance();

    }

    private void loadTable1() {

        try {
            ResultSet rs = DB.search("SELECT * FROM incomeexpence ORDER BY incomeexpence.date DESC ");

            DefaultTableModel dtm = (DefaultTableModel) expencetable.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("Date"));
                v.add(rs.getString("Description"));
                v.add(rs.getString("Income"));
                v.add(rs.getString("Expence"));
                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void setBalance() {
        try {
            
        
        double income = 0;
        double expnce = 0;
        double balance = 0;

      ResultSet rs=DB.search("SELECT Sum(incomeexpence.Income) AS income, Sum(incomeexpence.Expence) AS expence FROM incomeexpence");
            while (rs.next()) {                
                
                bal.setText(""+   (rs.getDouble("Income")-rs.getDouble("Expence"))    );
                
                
                
                
            }
      
      
      
      
        } catch (Exception e) {
        }
    }
}
