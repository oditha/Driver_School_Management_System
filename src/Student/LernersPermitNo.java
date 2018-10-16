package Student;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class LernersPermitNo extends javax.swing.JFrame {

    static boolean maximized = true;
    int studentID;
    Map<String, String> studentid = new HashMap();

    public LernersPermitNo() {
        initComponents();
        maximizeWindow();
        loadStudents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAddResult = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Learners Permit-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lerners Permit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAddResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reg No", "Name", "NIC", "LP NO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAddResult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAddResultKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblAddResultKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tblAddResult);
        if (tblAddResult.getColumnModel().getColumnCount() > 0) {
            tblAddResult.getColumnModel().getColumn(1).setPreferredWidth(500);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 1250, 520));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel4.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 590, 120, 40));

        btnClear1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear1.setText("CLEAR");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 590, 120, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1290, 650));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblAddResultKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAddResultKeyTyped

        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }


    }//GEN-LAST:event_tblAddResultKeyTyped

    private void tblAddResultKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAddResultKeyReleased

       if (evt.getKeyCode() == 10) {
            tblAddResult.editCellAt(tblAddResult.getSelectedRow() + 1, 3);
            tblAddResult.setSurrendersFocusOnKeystroke(true);
            tblAddResult.getEditorComponent().requestFocus();
            tblAddResult.setRowSelectionInterval(tblAddResult.getSelectedRow() + 1, tblAddResult.getSelectedRow() + 1);
        }

    }//GEN-LAST:event_tblAddResultKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        for (int i = 0; i < tblAddResult.getRowCount(); i++) {

            try {
               if (!tblAddResult.getValueAt(i, 3).toString().isEmpty()) {

                    System.out.println("OK");

                    try {

                        DB.idu("UPDATE `newkamal`.`students` SET `LPNumber`='"+tblAddResult.getValueAt(i, 3)+"' WHERE (`NIC`='"+tblAddResult.getValueAt(i, 2)+"')");

                    } catch (Exception ex) {
                        
                        Logger.getLogger(LernersPermitNo.class.getName()).log(Level.SEVERE, null, ex);
                    
                    }

             }

//                }
            } catch (Exception e) {
            }

        }

        NotificationPopup.save();
        loadStudents();


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        loadStudents();
    }//GEN-LAST:event_btnClear1ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LernersPermitNo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAddResult;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            LernersPermitNo.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            LernersPermitNo.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void loadStudents() {
        
        try {
            ResultSet rs = DB.search("SELECT s.RegNo, s.NIC, s.FullName, s.LPNumber FROM students AS s INNER JOIN studentexam AS se ON se.idstudents = s.idstudents INNER JOIN examresult AS er ON er.idStudentExam = se.idStudentExam WHERE s.LPNumber = '' AND er.OverollResult = 'PASS' OR er.Marks = 'pre'");
            DefaultTableModel dtm = (DefaultTableModel) tblAddResult.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {                
                
                dtm.addRow(new Object[]{rs.getString("RegNo"),rs.getString("FullName"),rs.getString("NIC")});
                
            }
        } catch (Exception ex) {
            Logger.getLogger(LernersPermitNo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    

   
}
