package Finance;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import ExtenelClasses.dfPrice;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FINANCEADDBANKACCOUNT extends javax.swing.JFrame {

    static boolean maximized = true;

    public FINANCEADDBANKACCOUNT() {
        initComponents();
        maximizeWindow();
        tableLoad();
        clearTxt();
        hiddenacc.setVisible(false);
    }

    DecimalFormat df = new DecimalFormat("########.00");

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BankTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        bankDetails = new javax.swing.JPanel();
        AccNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BankBranch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AccName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        OpeningBalance = new javax.swing.JTextField();
        Cancel = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        AccType = new javax.swing.JComboBox<>();
        BankName = new javax.swing.JComboBox<>();
        hiddenacc = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Bank Account-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BankTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account No", "Bank Name", "Branch", "Account Name", "Type"
            }
        ));
        BankTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BankTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BankTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 600, 460));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 120, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 710, 550));

        bankDetails.setBackground(new java.awt.Color(255, 255, 255));
        bankDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Bank Details"));
        bankDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AccNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        AccNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccNoActionPerformed(evt);
            }
        });
        AccNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AccNoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AccNoKeyTyped(evt);
            }
        });
        bankDetails.add(AccNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 310, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Account No");
        bankDetails.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 120, 30));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckBox1.setText("jCheckBox1");
        bankDetails.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Select Bank Name");
        bankDetails.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 200, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Branch");
        bankDetails.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 200, 30));

        BankBranch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BankBranch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BankBranchFocusLost(evt);
            }
        });
        BankBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankBranchActionPerformed(evt);
            }
        });
        bankDetails.add(BankBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 310, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Account Name");
        bankDetails.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 200, 30));

        AccName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        AccName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccNameActionPerformed(evt);
            }
        });
        bankDetails.add(AccName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 310, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Account type");
        bankDetails.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 200, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Opening Balance");
        bankDetails.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 200, 30));

        OpeningBalance.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bankDetails.add(OpeningBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 310, 30));

        Cancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Cancel.setText("CANCEL");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        bankDetails.add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 120, 40));

        Save.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Save.setText("SAVE");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        bankDetails.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 120, 40));

        AccType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        AccType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Current", "Savings" }));
        AccType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccTypeActionPerformed(evt);
            }
        });
        bankDetails.add(AccType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 310, 30));

        BankName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BankName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "Regional Development Bank", "CO-OP Bank", "SANASA Development Bank PLC", "Peoples Bank  PLC", "Sampath Bank PLC", "Bank Of Ceylon", "Hatton National Bank", "Commercial Bank" }));
        BankName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankNameActionPerformed(evt);
            }
        });
        bankDetails.add(BankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 310, 30));

        hiddenacc.setText("jLabel2");
        bankDetails.add(hiddenacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jPanel1.add(bankDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 490, 550));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 20, 600));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

        boolean b = false;
        java.awt.Component[] cp = bankDetails.getComponents();
        for (java.awt.Component c : cp) {
            if (c instanceof JTextField) {

                if (((JTextField) c).getText().isEmpty()) {

                    b = true;
                    //JOptionPane.showMessageDialog(Save, "please fillempty fields");

                    NotificationPopup.fillFeilds();

                    break;

                } else {

                    b = false;

                }

            }
        }

//        --------------------------------------------------------------------------------
        if (b == false) {
            if (BankName.getSelectedIndex() != 0 && AccType.getSelectedIndex() != 0) {

                if (Save.getText().equals("SAVE")) {
JOptionPane.showMessageDialog(rootPane, b);
                    try {

                        java.util.Date date = new java.util.Date();
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
                        String date1 = simpleDateFormat.format(date);

                        DB.idu("INSERT INTO BankDetails(Name, Branch, AccountName, AccountNumber, AccountType,OpeningBalance)VALUES ('" + BankName.getSelectedItem() + "','" + BankBranch.getText() + "','" + AccName.getText() + "','" + AccNo.getText() + "','" + AccType.getSelectedItem() + "','" + dfPrice.dcf(Double.parseDouble(OpeningBalance.getText())) + "')");

                        try {
                            ResultSet rs = DB.search("SELECT * FROM BankDetails WHERE AccountNumber='" + AccNo.getText() + "'");

                            while (rs.next()) {
                                DB.idu("INSERT INTO bankhistory(Date, Description, Deposite, Withrawal,idbankDetails)  VALUES('" + date1 + "','" + "opening balance" + AccNo.getText() + "','" + dfPrice.dcf(Double.parseDouble(OpeningBalance.getText())) + "','" + "0" + "','" + rs.getString("idbankDetails") + "')");

                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        NotificationPopup.save();
                        tableLoad();
                        clearTxt();

                    } catch (Exception e) {

                        e.printStackTrace();

                    }
                } else if (Save.getText().equals("UPDATE")) {

                    try {
                        DB.idu("UPDATE bankdetails SET Name='" + BankName.getSelectedItem() + "', Branch='" + BankBranch.getText() + "',AccountName='" + AccName.getText() + "' , AccountNumber='" + AccNo.getText() + "', AccountType='" + AccType.getSelectedItem() + "' Where AccountNumber='" + hiddenacc.getText() + "'  ");
                        tableLoad();
                        clearTxt();
                        NotificationPopup.save();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    /*update*/                }
                /*combo*/ } else if (BankName.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(Save, "please select bankname");
            } else if (AccType.getSelectedIndex() == 0) {

                JOptionPane.showMessageDialog(Save, "please select Account Type");
            } else {

                JOptionPane.showMessageDialog(Save, "please select Account Type and bankname");

            }

            /*b==false*/        }


    }//GEN-LAST:event_SaveActionPerformed

    private void BankTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BankTableMouseClicked

        DefaultTableModel dtm = (DefaultTableModel) BankTable.getModel();

        int row = BankTable.getSelectedRow();
        String accNo = (String) dtm.getValueAt(row, 0);

        hiddenacc.setText(accNo);
        try {

            ResultSet rs = DB.search("SELECT * FROM bankdetails  WHERE AccountNumber='" + accNo + "'");

            while (rs.next()) {

                BankName.setSelectedItem(rs.getString("Name"));
                AccNo.setText(rs.getString("AccountNumber"));
                BankBranch.setText(rs.getString("Branch"));
                AccName.setText(rs.getString("AccountName"));
                AccType.setSelectedItem(rs.getString("AccountType"));
                OpeningBalance.setText(rs.getString("OpeningBalance"));
                OpeningBalance.setEditable(false);
                Save.setText("UPDATE");

            }

        } catch (Exception e) {

            e.printStackTrace();

        }


    }//GEN-LAST:event_BankTableMouseClicked

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        clearTxt();
    }//GEN-LAST:event_CancelActionPerformed

    private void AccNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccNoActionPerformed

    }//GEN-LAST:event_AccNoActionPerformed

    private void BankBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankBranchActionPerformed
        AccNo.grabFocus();
    }//GEN-LAST:event_BankBranchActionPerformed

    private void AccTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccTypeActionPerformed
        OpeningBalance.grabFocus();
    }//GEN-LAST:event_AccTypeActionPerformed

    private void BankNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankNameActionPerformed

        BankBranch.grabFocus();


    }//GEN-LAST:event_BankNameActionPerformed

    private void AccNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AccNoKeyReleased
        try {

            ResultSet rs = DB.search("SELECT * FROM bankdetails WHERE AccountNumber='" + AccNo.getText() + "' AND isDelete='" + 1 + "'");

            while (rs.next()) {

                BankName.setSelectedItem(rs.getString("Name"));
                AccNo.setText(rs.getString("AccountNumber"));
                BankBranch.setText(rs.getString("Branch"));
                AccName.setText(rs.getString("AccountName"));
                AccType.setSelectedItem(rs.getString("AccountType"));
                OpeningBalance.setText(rs.getString("OpeningBalance"));
                OpeningBalance.setEditable(false);
                Save.setText("UPDATE");
                

            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    }//GEN-LAST:event_AccNoKeyReleased

    private void AccNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AccNoKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }
    }//GEN-LAST:event_AccNoKeyTyped

    private void BankBranchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BankBranchFocusLost
        AccNo.grabFocus();
    }//GEN-LAST:event_BankBranchFocusLost

    private void AccNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int r = BankTable.getSelectedRow();

        String acc = (String) BankTable.getValueAt(r, 0);

        try {
            DB.idu("UPDATE bankdetails SET isDelete='" + 0 + "' WHERE AccountNumber='" + acc + "'");
            tableLoad();
            clearTxt();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FINANCEADDBANKACCOUNT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccName;
    private javax.swing.JTextField AccNo;
    private javax.swing.JComboBox<String> AccType;
    private javax.swing.JTextField BankBranch;
    private javax.swing.JComboBox<String> BankName;
    private javax.swing.JTable BankTable;
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField OpeningBalance;
    private javax.swing.JButton Save;
    private javax.swing.JPanel bankDetails;
    private javax.swing.JLabel hiddenacc;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            FINANCEADDBANKACCOUNT.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            FINANCEADDBANKACCOUNT.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void tableLoad() {

        try {
            ResultSet rs = DB.search("Select * FROM bankdetails WHERE isDelete='" + 1 + "'");
            DefaultTableModel dtm = (DefaultTableModel) BankTable.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {

                Vector v = new Vector();
                v.add(rs.getString("AccountNumber"));
                v.add(rs.getString("Name"));
                v.add(rs.getString("Branch"));
                v.add(rs.getString("AccountName"));
                v.add(rs.getString("AccountType"));

                dtm.addRow(v);

            }

        } catch (Exception e) {
        }

    }

    private void clearTxt() {

        java.awt.Component[] cp = bankDetails.getComponents();
        for (java.awt.Component c : cp) {

            if (c instanceof JTextField) {

                ((JTextField) c).setText(null);

            }

        }
        AccType.setSelectedIndex(0);
        BankName.setSelectedIndex(0);
        OpeningBalance.setEditable(true);
                Save.setText("SAVE");

    }

}
