package Student;

import ExtenelClasses.DB;
import ExtenelClasses.NotificationPopup;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

public class AddExamDateBulkEnter extends javax.swing.JFrame {

    static boolean maximized = true;

    public AddExamDateBulkEnter() {
        initComponents();
        loadPendingStudents();
        maximizeWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        DatePayment1 = new com.alee.extended.date.WebDateField();
        jLabel12 = new javax.swing.JLabel();
        btnSave1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListAllStudent = new javax.swing.JList();
        btnAddAll = new javax.swing.JButton();
        btnAddSelected = new javax.swing.JButton();
        btnRemoveAll = new javax.swing.JButton();
        btnRemoveSelected = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add exam result-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Exam Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 15))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DatePayment1.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        DatePayment1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel4.add(DatePayment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 560, 240, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel12.setText("Select students to assign Exam date");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 560, 30));

        btnSave1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave1.setText("SAVE");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 560, 120, 40));

        jList1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 570, 480));

        ListAllStudent.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jScrollPane2.setViewportView(ListAllStudent);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 560, 480));

        btnAddAll.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnAddAll.setText(">>");
        btnAddAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAllActionPerformed(evt);
            }
        });
        jPanel4.add(btnAddAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 100, 30));

        btnAddSelected.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnAddSelected.setText(">");
        btnAddSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSelectedActionPerformed(evt);
            }
        });
        jPanel4.add(btnAddSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 100, 30));

        btnRemoveAll.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnRemoveAll.setText("<<");
        btnRemoveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveAllActionPerformed(evt);
            }
        });
        jPanel4.add(btnRemoveAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 100, 30));

        btnRemoveSelected.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnRemoveSelected.setText("<");
        btnRemoveSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveSelectedActionPerformed(evt);
            }
        });
        jPanel4.add(btnRemoveSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 100, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Exam Date");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 90, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1300, 630));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed

        String day = null;

        if (!DatePayment1.getText().isEmpty()) {
            System.out.println("OK");
            ListModel model = jList1.getModel();
            
            for (int i = 0; i < model.getSize(); i++) {
                
                try {
                    DB.idu("INSERT INTO `newkamal`.`studentexam` (`DateExam`, `ShyExam`, `idstudents`, `ExamType`, `Stat`) VALUES ('"+DatePayment1.getText()
                            +"', '1', '"+model.getElementAt(i).toString().split(" - ")[0]+"', 'Written Test', '1')");
                } catch (Exception ex) {
                    Logger.getLogger(AddExamDateBulkEnter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        DefaultListModel dl = (DefaultListModel) jList1.getModel();
        dl.removeAllElements();
        NotificationPopup.save();
        loadPendingStudents();
        }else{
            
            NotificationPopup.fillFeilds();
            
        }
        

    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnAddSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSelectedActionPerformed

        List selectedValuesList = ListAllStudent.getSelectedValuesList();

        DefaultListModel<String> dl = new DefaultListModel<String>();

        for (Object ob : selectedValuesList) {

            dl.addElement(ob.toString());

        }

//       
        jList1.setModel(dl);

    }//GEN-LAST:event_btnAddSelectedActionPerformed

    private void btnAddAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAllActionPerformed

        DefaultListModel dlm = (DefaultListModel) ListAllStudent.getModel();
        jList1.setModel(dlm);


    }//GEN-LAST:event_btnAddAllActionPerformed

    private void btnRemoveSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveSelectedActionPerformed

        DefaultListModel dlm = (DefaultListModel) jList1.getModel();

        for (int i = 0; i < jList1.getSelectedIndices().length; i++) {

            dlm.removeElementAt(jList1.getSelectedIndex());
        }

        for (Object ob : jList1.getSelectedValuesList()) {

        }

    }//GEN-LAST:event_btnRemoveSelectedActionPerformed

    private void btnRemoveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveAllActionPerformed

        DefaultListModel dlm = (DefaultListModel) jList1.getModel();

        dlm.removeAllElements();


    }//GEN-LAST:event_btnRemoveAllActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddExamDateBulkEnter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.extended.date.WebDateField DatePayment1;
    private javax.swing.JList ListAllStudent;
    private javax.swing.JButton btnAddAll;
    private javax.swing.JButton btnAddSelected;
    private javax.swing.JButton btnRemoveAll;
    private javax.swing.JButton btnRemoveSelected;
    private javax.swing.JButton btnSave1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            AddExamDateBulkEnter.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            AddExamDateBulkEnter.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void loadPendingStudents() {

        try {
            ResultSet rs = DB.search("SELECT * FROM students ORDER BY RegNo ASC");
            DefaultListModel<String> dl = new DefaultListModel<String>();
            while (rs.next()) {

                ResultSet rs1 = DB.search("Select * FROM StudentExam Where idstudents = '" + rs.getString("idstudents") + "'");
                if (!rs1.next()) {
//                    System.out.println(rs.getString("idstudents"));
                    dl.addElement(rs.getString("idstudents") + " - " + rs.getString("RegNo") + " - " + rs.getString("FullName"));
                }

            }

            ListAllStudent.setModel(dl);

        } catch (Exception ex) {
            Logger.getLogger(AddExamDateBulkEnter.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
