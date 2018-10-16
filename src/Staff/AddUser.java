package Staff;

import ExtenelClasses.DB;
import ExtenelClasses.EncodeDecodeImage;
import ExtenelClasses.NotificationPopup;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddUser extends javax.swing.JFrame {

    static boolean maximized = true;
    String path;
    String encoder;

    public AddUser() {
        initComponents();
        maximizeWindow();
        loademp();
        loadtable();
        err.setVisible(false);
    }
    int id;
    int i;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        save = new javax.swing.JButton();
        empbox = new javax.swing.JComboBox<>();
        privilage = new javax.swing.JComboBox<>();
        password = new javax.swing.JPasswordField();
        reenterpassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        err = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add User-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "Username", "Privilages"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 550, 460));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 120, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 600, 580));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Employee Privilages"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Select Employee");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 410, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Username");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, 30));

        username.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 400, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Password");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 200, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Re-Enter Password");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 200, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 120, 40));

        save.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel3.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 120, 40));

        empbox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        empbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-" }));
        empbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empboxActionPerformed(evt);
            }
        });
        jPanel3.add(empbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 400, 30));

        privilage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Admin", "User", " " }));
        jPanel3.add(privilage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 400, 30));
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 400, 30));

        reenterpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                reenterpasswordKeyReleased(evt);
            }
        });
        jPanel3.add(reenterpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 400, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Privilage");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 200, 30));

        err.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        err.setForeground(new java.awt.Color(255, 0, 0));
        err.setText("jLabel2");
        jPanel3.add(err, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 140, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 600, 580));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(500, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 20, 650));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        boolean b = false;
        java.awt.Component[] cp1 = jPanel3.getComponents();
        for (java.awt.Component c : cp1) {
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
        if (empbox.getSelectedIndex() != 0) {
            if (password.getText().equals(reenterpassword.getText())) {

                if (b == false) {

                    if (save.getText().equals("SAVE")) {

                        try {
                            DB.idu("INSERT INTO `newkamal`.`users` ( `userName`, `Password`, `Privilage`, `idStaff`, userPic) VALUES ( '" + username.getText() + "', '" + password.getText() + "', '" + privilage.getSelectedItem().toString() + "', '" + id + "', '" + encoder + "')");
                            loadtable();
                            loademp();
                            cleartxt();
                            err.setText(null);
                            NotificationPopup.save();
                            java.awt.Component[] cp = jPanel3.getComponents();
                            for (java.awt.Component c : cp) {

                                if (c instanceof JTextField) {

                                    ((JTextField) c).setText(null);

                                }

                            }
                            loadtable();
                            err.setText(null);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    } else if (save.getText().equals("UPDATE")) {

                        try {
                            DB.idu("UPDATE `newkamal`.`users` SET  `userName`='" + username.getText() + "', `Password`='" + password.getText() + "', `Privilage`='" + privilage.getSelectedItem() + "' WHERE (`idusers`='" + i + "')");
                            loadtable();
                            cleartxt();
                            err.setText(null);
                            loademp();
                            NotificationPopup.save();
                            java.awt.Component[] cp = jPanel3.getComponents();
                            for (java.awt.Component c : cp) {

                                if (c instanceof JTextField) {

                                    ((JTextField) c).setText(null);

                                }

                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    } else {
                        System.out.println("condition");
                    }
                }
            } else {
                err.setVisible(true);
                err.setText("password doesnt match");

            }
        } else {

            JOptionPane.showMessageDialog(rootPane, "please selct staff");

        }


    }//GEN-LAST:event_saveActionPerformed

    private void empboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empboxActionPerformed

        String s1[] = empbox.getSelectedItem().toString().split("-");

        try {

            ResultSet rs = DB.search("SELECT * FROM `staff` WHERE  nic='" + s1[1] + "' AND IsActive='" + 1 + "' ");

            while (rs.next()) {

                //empbox.addItem(rs.getString("name") + "-" + rs.getString("nic"));
                id = rs.getInt("idStaff");

            }

        } catch (Exception e) {

            e.printStackTrace();

        }


    }//GEN-LAST:event_empboxActionPerformed

    private void reenterpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reenterpasswordKeyReleased

        if (password.getText().equals(reenterpassword.getText())) {
            err.setVisible(true);

            err.setText("password match");

        } else {
            err.setVisible(true);
            err.setText("password doesn't match");

        }


    }//GEN-LAST:event_reenterpasswordKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int r = jTable1.getSelectedRow();
        i = Integer.parseInt(jTable1.getValueAt(r, 0).toString());
        try {
            ResultSet rs = DB.search("SELECT * FROM `users` WHERE idusers='" + i + "' ");
            if (rs.next()) {
                username.setText(rs.getString("userName"));
                password.setText(rs.getString("Password"));
                reenterpassword.setText(rs.getString("Password"));
                privilage.setSelectedItem(rs.getString("Privilage"));
                //  photo.setIcon(EncodeDecodeImage.decoder(rs.getString("userPic")));
                save.setText("UPDATE");

            }
        } catch (Exception e) {

            e.printStackTrace();

        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cleartxt();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int r=jTable1.getSelectedRow();
       String s=(String) jTable1.getValueAt(r, 0);
        System.out.println(s);
        
        try {
            DB.idu("UPDATE `users`  SET isDelete='0' WHERE idusers='"+s+"'");
            loadtable();
            cleartxt();
            loademp();
        } catch (Exception e) {
        
        e.printStackTrace();
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> empbox;
    private javax.swing.JLabel err;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> privilage;
    private javax.swing.JPasswordField reenterpassword;
    private javax.swing.JButton save;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            AddUser.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            AddUser.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void loademp() {
        try {

            ResultSet rs = DB.search("SELECT * FROM `Staff` WHERE IsActive='1'");

            while (rs.next()) {

                 ResultSet rs2=DB.search("SELECT * FROM `users` Where idStaff='"+rs.getString("idStaff")+"' AND isDelete='"+1+"'");
                
                 if (!rs2.next()) {
                    
                empbox.addItem(rs.getString("name") + "-" + rs.getString("nic"));
                }
                 
                 
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void loadtable() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = DB.search("SELECT * FROM Staff INNER JOIN users ON users.idStaff = Staff.idStaff WHERE IsActive='"+1+"' AND users.isDelete='" + '1' + "'");
            while (rs.next()) {

                Vector v = new Vector();

                v.add(rs.getString("idusers"));
                v.add(rs.getString("name"));
                v.add(rs.getString("userName"));
                v.add(rs.getString("Privilage"));
                dtm.addRow(v);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void cleartxt() {
        
        empbox.setSelectedIndex(0);
        username.setText(null);
        password.setText(null);
        reenterpassword.setText(null);
        privilage.setSelectedIndex(0);
    
    
    
    }
}
