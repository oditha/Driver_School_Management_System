package Student;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ExamResultAdd extends javax.swing.JFrame {

    static boolean maximized = true;
    int studentID;

    public ExamResultAdd() {
        initComponents();
        maximizeWindow();
        loadExamDates();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAddResult = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        comboExamDate = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Kamal-Exam Result");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAddResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reg No", "Name", "Exam Id", "Marks", "Results", "Marks H"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAddResult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblAddResultKeyPressed(evt);
            }
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
            tblAddResult.getColumnModel().getColumn(2).setMinWidth(0);
            tblAddResult.getColumnModel().getColumn(2).setPreferredWidth(0);
            tblAddResult.getColumnModel().getColumn(2).setMaxWidth(0);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1270, 480));

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear.setText("SEARCH");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel4.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 120, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 204));
        jLabel12.setText("Enter Marks and press Enter Key");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 340, 30));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel4.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 590, 120, 40));

        btnClear1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear1.setText("CLEAR");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 590, 120, 40));

        comboExamDate.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        comboExamDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboExamDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboExamDateActionPerformed(evt);
            }
        });
        jPanel4.add(comboExamDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 180, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel13.setText("Select Exam Date");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1320, 650));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        try {
            ResultSet rs = DB.search("SELECT s.*, se.* FROM students s INNER JOIN StudentExam se ON se.idstudents = s.idstudents WHERE se.DateExam = '" + comboExamDate.getSelectedItem().toString() + "' AND se.Stat = '1'");

            DefaultTableModel dtm = (DefaultTableModel) tblAddResult.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {
                

                ResultSet search = DB.search("SELECT * FROM examdayattendece WHERE IdExam = '"+rs.getString("idStudentExam")+"'");
                if (search.next()) {

                    
                    if (search.getString("Type").equals("Present")) {
                    
                        dtm.addRow(new Object[]{rs.getString("RegNo"), rs.getString("FullName"), rs.getString("idStudentExam"),"","N/A","N/A"});
                        
                    }else if(search.getString("Type").equals("Absent")){
                    
                         try {

                        DB.idu("INSERT INTO `newkamal`.`ExamResult` (`Marks`, `OverollResult`, `idStudentExam`,Marks2) VALUES ('0', 'ABSENT', '" + search.getString("IdExam") + "','0')");

                    } catch (Exception ex) {
                        Logger.getLogger(ExamResultAdd.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    }
                    
                   

                }

            }

        } catch (Exception ex) {
            Logger.getLogger(ExamResultAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblAddResultKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAddResultKeyTyped


    }//GEN-LAST:event_tblAddResultKeyTyped

    private void tblAddResultKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAddResultKeyReleased

        if (evt.getKeyCode() == 10) {
             try {
            int row = tblAddResult.getSelectedRow();
            String Value = tblAddResult.getValueAt(row, 3).toString();

            if (!Value.isEmpty()) {

                try {
                     double marks = Double.parseDouble(Value);

                
                if (marks >= 30) {

                    tblAddResult.setValueAt("PASS", row, 4);

                } else if (marks < 30) {

                    tblAddResult.setValueAt("REPEAT", row, 4);

                }
                } catch (Exception e) {
                    
                  
                    
                }
                
          tblAddResult.editCellAt(tblAddResult.getSelectedRow()+1, 3);
          tblAddResult.setSurrendersFocusOnKeystroke(true);
          tblAddResult.getEditorComponent().requestFocus();
          tblAddResult.setRowSelectionInterval(tblAddResult.getSelectedRow()+1, tblAddResult.getSelectedRow()+1);
              
                
            }

        } catch (Exception e) {
        }
        }


    }//GEN-LAST:event_tblAddResultKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        
        
        for (int i = 0; i < tblAddResult.getRowCount(); i++) {

            try {


                    try {

                        DB.idu("INSERT INTO `newkamal`.`ExamResult` (`Marks`, `OverollResult`, `idStudentExam`,Marks2) VALUES ('"
                                + tblAddResult.getValueAt(i, 3) + "', '" + tblAddResult.getValueAt(i, 4) + "', '" + tblAddResult.getValueAt(i, 2) + "','" + tblAddResult.getValueAt(i, 5) + "')");

                    } catch (Exception ex) {
                        Logger.getLogger(ExamResultAdd.class.getName()).log(Level.SEVERE, null, ex);
                    }
            } catch (Exception e) {
            }

        }

        NotificationPopup.save();
        DefaultTableModel dt = (DefaultTableModel) tblAddResult.getModel();
        dt.setRowCount(0);


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        DefaultTableModel dt = (DefaultTableModel) tblAddResult.getModel();
        dt.setRowCount(0);
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void tblAddResultKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAddResultKeyPressed

        
        
//        if (tblAddResult.getValueAt(tblAddResult.getSelectedRow(), 3).toString().equals("P") || tblAddResult.getValueAt(tblAddResult.getSelectedRow(), 3).toString().equals("p")) {
//            
//            tblAddResult.setValueAt("PRE", tblAddResult.getSelectedRow(), 3);
//            
//        }
        
    }//GEN-LAST:event_tblAddResultKeyPressed

    private void comboExamDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboExamDateActionPerformed


    }//GEN-LAST:event_comboExamDateActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamResultAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboExamDate;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAddResult;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            ExamResultAdd.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ExamResultAdd.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void loadExamDates() {

        DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel<String>();

        try {
            ResultSet rs = DB.search("SELECT DateExam , idStudentExam FROM studentexam GROUP BY DateExam");
            while (rs.next()) {

                ResultSet search = DB.search("SELECT DISTINCT * FROM examresult WHERE idStudentExam = '" + rs.getString("idStudentExam") + "'");

                if (!search.next()) {

                    dcm.addElement(rs.getString("DateExam"));

                }

            }

            comboExamDate.setModel(dcm);

        } catch (Exception ex) {
            Logger.getLogger(ExamResultAdd.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
