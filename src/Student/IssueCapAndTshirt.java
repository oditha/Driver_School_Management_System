
package Student;

import ExtenelClasses.DB;
import ExtenelClasses.df;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class IssueCapAndTshirt extends javax.swing.JFrame {
static boolean maximized = true;
boolean b=false;
    int studentID;

    public IssueCapAndTshirt() {
        initComponents();
        maximizeWindow();
           chkRN.setSelected(true);

        loadtable();
        setTotal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        comboItem = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        webDate = new com.alee.extended.date.WebDateField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCapTshirt = new javax.swing.JTable();
        txtAmount = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        chkNic = new javax.swing.JCheckBox();
        chkPP = new javax.swing.JCheckBox();
        chkOldDl = new javax.swing.JCheckBox();
        chkRN = new javax.swing.JCheckBox();
        txtStudentName = new javax.swing.JLabel();
        Photo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Issue Cap And T-shirt-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Issue T-shirt and cap ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel8.setText("Item");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 50, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel9.setText("Amount");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 60, 20));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 120, 40));

        comboItem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cap", "T-shirt", "T-shirt and Cap" }));
        jPanel3.add(comboItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 300, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel12.setText("LKR");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 50, 20));

        webDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        webDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(webDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 300, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 20, 440));

        tableCapTshirt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student", "Item", "Issue Date", "Payment"
            }
        ));
        tableCapTshirt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCapTshirtMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCapTshirt);
        if (tableCapTshirt.getColumnModel().getColumnCount() > 0) {
            tableCapTshirt.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 500, 250));

        txtAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAmountKeyReleased(evt);
            }
        });
        jPanel3.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 300, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 290, 70));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel13.setText("Date");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 50, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Total");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 370, -1, 20));

        txtTotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setText("0.00");
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel3.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 360, 140, 30));

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Student"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel4.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 380, 30));

        chkNic.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkNic);
        chkNic.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkNic.setText("NIC");
        jPanel4.add(chkNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        chkPP.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkPP);
        chkPP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkPP.setText("Passport No");
        jPanel4.add(chkPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        chkOldDl.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkOldDl);
        chkOldDl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkOldDl.setText("OLD DL");
        jPanel4.add(chkOldDl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        chkRN.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(chkRN);
        chkRN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chkRN.setText("Register No");
        jPanel4.add(chkRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtStudentName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtStudentName.setText("Student Name");
        jPanel4.add(txtStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 480, 20));

        Photo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel4.add(Photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 90, 110));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 540, 120));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1160, 510));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void tableCapTshirtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCapTshirtMouseClicked
//        try {
//            SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
//            DefaultTableModel dtm=(DefaultTableModel) tableCapTshirt.getModel();
//            int x=tableCapTshirt.getSelectedRow();
//            String s=(tableCapTshirt.getModel().getValueAt(x,0).toString());
//            ResultSet rs=DB.search("SELECT tc.*,s.* FROM students s INNER JOIN tshirtandcap tc ON s.idstudents=tc.students_idstudents WHERE NIC='"+s+"' ");
//            if (rs.next()) {
//                String s1=rs.getString("NIC");
//                txtStudentID.setText(s);
//                String s2=rs.getString("Item");
//                comboItem.setSelectedItem(s2);
//                String s3=rs.getString("Amount");
//                txtAmount.setText(s3);
//                String s4=rs.getString("HandOverDate");
//                webDate.setDate(sdf.parse(s4));
//                btnSave.setText("UPDATE");
//            }
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_tableCapTshirtMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        try {
            DateFormat df=new SimpleDateFormat("yyyy/MM/dd");
                   String getDate=df.format(webDate.getDate());
                    String insert_1="INSERT INTO tshirtandcap(HandOverDate,Item,Amount,students_idstudents) VALUES('"+getDate+"','"+comboItem.getSelectedItem()+"','"+txtAmount.getText()+"','"+studentID+"')";
                    DB.idu(insert_1);
                    
                    String insert_2="INSERT INTO incomeexpence(Date,Description,Income,Expence) VALUES('"+getDate+"','T-shirt/Cap','0','"+txtAmount.getText()+"') ";
                    DB.idu(insert_2);  
                loadtable();
                setTotal();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyReleased
                   char c=evt.getKeyChar();
            if (Character.isLetter(c)) {
                 evt.consume();
        }
    }//GEN-LAST:event_txtAmountKeyReleased

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        ResultSet rs = null;


        try {
            if (chkNic.isSelected()) {

                rs = DB.search("SELECT * FROM students WHERE NIC LIKE '" + txtSearch.getText() + "%' ");

            } else if (chkOldDl.isSelected()) {

                rs = DB.search("SELECT * FROM students WHERE OldDLNo LIKE '" + txtSearch.getText() + "%' ");

            } else if (chkPP.isSelected()) {

                rs = DB.search("SELECT * FROM students WHERE PassportNo LIKE '" + txtSearch.getText() + "%' ");

            } else if (chkRN.isSelected()) {

                rs = DB.search("SELECT * FROM students WHERE RegNo LIKE '" + txtSearch.getText() + "%' ");

            }

            

            if (rs.next()) {

                studentID = rs.getInt("idstudents");
                txtStudentName.setText(rs.getString("FullName"));
                try {
                    Photo.setIcon(new ImageIcon(ImageIO.read(new File(rs.getString("Image"))).getScaledInstance(90, 100, Image.SCALE_SMOOTH)));

                } catch (Exception e) {
                }

                

            } else {

                

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueCapAndTshirt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Photo;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkNic;
    private javax.swing.JCheckBox chkOldDl;
    private javax.swing.JCheckBox chkPP;
    private javax.swing.JCheckBox chkRN;
    private javax.swing.JComboBox<String> comboItem;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableCapTshirt;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtStudentName;
    private javax.swing.JTextField txtTotal;
    private com.alee.extended.date.WebDateField webDate;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            IssueCapAndTshirt.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            IssueCapAndTshirt.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void loadtable() {
        try {
            ResultSet rs=DB.search("SELECT tc.*,s.* FROM students s INNER JOIN tshirtandcap tc ON s.idstudents=tc.students_idstudents");
            DefaultTableModel dtm=(DefaultTableModel) tableCapTshirt.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                Vector v=new Vector();
                v.add(rs.getString("NIC"));
                v.add(rs.getString("Item"));
                v.add(rs.getString("HandOverDate"));
                v.add(rs.getString("Amount"));
                dtm.addRow(v);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setTotal() {
                Double sum=0.00;
                for (int i = 0; i < tableCapTshirt.getRowCount(); i++) {
                    double getsum=Double.parseDouble((String) tableCapTshirt.getValueAt(i, 3));
                    sum=getsum+sum;
                    txtTotal.setText(df.dcf(sum));
                }
    }
    
        private void validateTxt(){
        java.awt.Component[] cp =jPanel3.getComponents();
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
      }

}
