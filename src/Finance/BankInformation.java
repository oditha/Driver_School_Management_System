package Finance;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class BankInformation extends javax.swing.JFrame {

    static boolean maximized = true;

    public BankInformation() {
        initComponents();
        maximizeWindow();
        tableload();
        setbalance();
        setdate();
    }
int id;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Balance = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BankTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        bankcombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        transtype = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        date123 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Bank Information-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Description", "Deposite", "Widthdrawel"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 580, 470));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Balance");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 110, 30));

        Balance.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(Balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 300, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 640, 590));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Bank Information"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BankTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Account No", "Bank Name", "Branch", "Account Name", " Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BankTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BankTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BankTable);
        if (BankTable.getColumnModel().getColumnCount() > 0) {
            BankTable.getColumnModel().getColumn(0).setResizable(false);
            BankTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            BankTable.getColumnModel().getColumn(1).setResizable(false);
            BankTable.getColumnModel().getColumn(2).setResizable(false);
            BankTable.getColumnModel().getColumn(3).setResizable(false);
            BankTable.getColumnModel().getColumn(4).setResizable(false);
            BankTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            BankTable.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 540, 220));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 580, 260));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Add a Transaction"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bankcombo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bankcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select-" }));
        bankcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankcomboActionPerformed(evt);
            }
        });
        jPanel5.add(bankcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 390, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Transaction Type");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 30));

        transtype.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        transtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Deopsit", "widthdrawel" }));
        jPanel5.add(transtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 390, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Amount");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 200, 30));

        amount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountKeyTyped(evt);
            }
        });
        jPanel5.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 390, 30));

        date123.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel5.add(date123, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 390, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Date");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 280, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Description");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 30));

        description.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel5.add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 390, 30));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("SAVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 120, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("CANCEL");
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 120, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Select Bank account");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 190, 30));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 570, 310));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 620, 630));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 20, 600));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
         boolean b = false;
        java.awt.Component[] cp = jPanel5.getComponents();
        for (java.awt.Component c : cp) {
            if (c instanceof JTextField) {

                if (((JTextField) c).getText().isEmpty()) {

                    b = true;

                    break;

                } else {

                    b = false;

                }

            }}
        
            if (b==false) {
                
          
        if (bankcombo.getSelectedIndex()!=0) {
            
       
        if (transtype.getSelectedIndex()==1) {
            
            
            
            
            try {
                
                DB.idu("INSERT INTO bankhistory(Date, Description, Deposite, Withrawal, idbankDetails)  VALUES('"+date123.getText()+"','"+description.getText()+"','"+amount.getText()+"','"+"0"+"','"+id+"')");
                loadtable222();
                bankcombo.setSelectedIndex(0);
                transtype.setSelectedIndex(0);
                amount.setText(null);
                description.setText(null);
                setdate();
                  NotificationPopup.save();
                  setbalance();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
            
        }
        else if (transtype.getSelectedIndex()==2) {
            
            
            
            try {
                
                DB.idu("INSERT INTO bankhistory(Date, Description, Deposite, Withrawal, idbankDetails)  VALUES('"+date123.getText()+"','"+description.getText()+"','"+"0"+"','"+amount.getText()+"','"+id+"')");
                loadtable222();
                bankcombo.setSelectedIndex(0);
                transtype.setSelectedIndex(0);
                amount.setText(null);
                description.setText(null);
                setdate();
                  setbalance();
                  NotificationPopup.save();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
            
            
        }
        else{
        
        JOptionPane.showMessageDialog(jButton3, "PLEASE SELECT TRANSACTION TYPE");
        
        
        
        }
        
         }else{
        
        JOptionPane.showMessageDialog(jButton3, "please select bank");
        
        
        }
          }else{
            
            
            JOptionPane.showMessageDialog(rootPane, "please fill empty text fields");
            
            }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BankTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BankTableMouseClicked

        
        
        loadtable222();
        
        

setbalance();
    }//GEN-LAST:event_BankTableMouseClicked

    private void bankcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankcomboActionPerformed
      
        String s1[]=bankcombo.getSelectedItem().toString().split("-");
        
        String bankname=s1[1];
        
        try {
            ResultSet rs=DB.search("SELECT * FROM bankdetails WHERE name='"+bankname+"'");
            while (rs.next()) {                
                id=rs.getInt("idbankDetails");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_bankcomboActionPerformed

    private void amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyTyped
char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_amountKeyTyped

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Balance;
    private javax.swing.JTable BankTable;
    private javax.swing.JTextField amount;
    private javax.swing.JComboBox<String> bankcombo;
    private javax.swing.JTextField date123;
    private javax.swing.JTextField description;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> transtype;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            BankInformation.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            BankInformation.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void tableload() {

        try {
            ResultSet rs = DB.search("Select * FROM bankdetails  WHERE isDelete='"+1+"'");
            DefaultTableModel dtm = (DefaultTableModel) BankTable.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {

                Vector v = new Vector();
                
                v.add(rs.getString("idbankDetails"));
                v.add(rs.getString("AccountNumber"));
                v.add(rs.getString("Name"));
                v.add(rs.getString("Branch"));
                v.add(rs.getString("AccountName"));
                v.add(rs.getString("AccountType"));

                dtm.addRow(v);
                bankcombo.addItem(rs.getString("AccountNumber")+"-"+rs.getString("Name"));

            }

        } catch (Exception e) {
        }

    }

    private void setbalance() {
        
    double income = 0;
        double expnce = 0;
        double balance = 0;

        for (int i = jTable2.getRowCount() - 1; i > -1; --i) {

            income = Double.parseDouble((String) jTable2.getValueAt(i, 2));
            expnce = Double.parseDouble((String) jTable2.getValueAt(i, 3));

            balance += income - expnce;

           
            
            Balance.setText(""+balance);
    
    
    
    
    
    }
}

    private void setdate() {
    
      
                java.util.Date date = new java.util.Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
                date123.setText(simpleDateFormat.format(date));
               date123.setEditable(false);
                

        
    
    
    
    
    
    }

    private void loadtable222() {
        
    DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        int r=BankTable.getSelectedRow();
        String id=BankTable.getValueAt(r, 0).toString();
        dtm.setRowCount(0);
        try {
            
            ResultSet rs=DB.search("SELECT * FROM bankhistory WHERE idbankDetails='"+id+"'  ORDER BY Date DESC;");
            
            while( rs.next()){
            
            Vector v=new Vector();
            v.add(rs.getString("Date"));
            v.add(rs.getString("Description"));
            v.add(rs.getString("Deposite"));
            v.add(rs.getString("Withrawal"));
            dtm.addRow(v);
           
            
            
            
            
            
            
            
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
    }
}
