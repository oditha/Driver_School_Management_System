
package MainMenu;


import ExtenelClasses.MainMenu;
import RentandHire.HireVehicle;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Dasboard extends javax.swing.JFrame {
static boolean maximized = true;
    public Dasboard() {
        initComponents();
        maximizeWindow();
        setpic();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rh_register_coustomer = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2_student = new javax.swing.JPanel();
        st_attendence = new javax.swing.JLabel();
        st_dl_category = new javax.swing.JLabel();
        st_dl_temporary1 = new javax.swing.JLabel();
        st_dsr_book1 = new javax.swing.JLabel();
        st_exam_date = new javax.swing.JLabel();
        st_exam_result1 = new javax.swing.JLabel();
        st_lerners_p_no1 = new javax.swing.JLabel();
        st_licence = new javax.swing.JLabel();
        st_mark_exam_attendence = new javax.swing.JLabel();
        st_medicle_document1 = new javax.swing.JLabel();
        st_issue_cap_tshirt = new javax.swing.JLabel();
        st_payment = new javax.swing.JLabel();
        st_student_registation = new javax.swing.JLabel();
        st_trai_day_attendence = new javax.swing.JLabel();
        st_trail_details1 = new javax.swing.JLabel();
        st_add_trail1 = new javax.swing.JLabel();
        st_dl_perment1 = new javax.swing.JLabel();
        st_attendence_view1 = new javax.swing.JLabel();
        st_exam_date_bulk1 = new javax.swing.JLabel();
        st_trail_result1 = new javax.swing.JLabel();
        st_student_impormation1 = new javax.swing.JLabel();
        dash_r_and_h = new javax.swing.JPanel();
        frame = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        dash_staff = new javax.swing.JLabel();
        dash_vehicle1 = new javax.swing.JLabel();
        dash_rent1 = new javax.swing.JLabel();
        dash_finance2 = new javax.swing.JLabel();
        dash_staff1 = new javax.swing.JLabel();
        dash_student1 = new javax.swing.JLabel();
        dash_student2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2_staff = new javax.swing.JPanel();
        sff_add1 = new javax.swing.JLabel();
        sff_leave_management1 = new javax.swing.JLabel();
        sff_payment1 = new javax.swing.JLabel();
        sff_employee_registration = new javax.swing.JLabel();
        sff_attendence3 = new javax.swing.JLabel();
        sff_attendence_report1 = new javax.swing.JLabel();
        sff_attendence_report2 = new javax.swing.JLabel();
        sff_attendence_report3 = new javax.swing.JLabel();
        sff_salary_report1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2_finance = new javax.swing.JPanel();
        f_income = new javax.swing.JLabel();
        f_add_bank_account1 = new javax.swing.JLabel();
        f_bank_history1 = new javax.swing.JLabel();
        f_cheque1 = new javax.swing.JLabel();
        jPanel2_rent = new javax.swing.JPanel();
        h_register_coustomer = new javax.swing.JLabel();
        h_hire_payment1 = new javax.swing.JLabel();
        h_hire_vehicle1 = new javax.swing.JLabel();
        h_rent_payment1 = new javax.swing.JLabel();
        h_rent_vehicle1 = new javax.swing.JLabel();
        jPanel2_vehicle = new javax.swing.JPanel();
        v_services = new javax.swing.JLabel();
        v_vehicle_view1 = new javax.swing.JLabel();
        v_view_maintain1 = new javax.swing.JLabel();
        v_fuel_cost1 = new javax.swing.JLabel();
        v_registration1 = new javax.swing.JLabel();
        v_service_view1 = new javax.swing.JLabel();
        v_services1 = new javax.swing.JLabel();
        insurance_claim = new javax.swing.JLabel();
        tyre_replace1 = new javax.swing.JLabel();
        StudentReport = new javax.swing.JPanel();
        v_services2 = new javax.swing.JLabel();
        v_vehicle_view2 = new javax.swing.JLabel();
        v_view_maintain2 = new javax.swing.JLabel();
        v_fuel_cost2 = new javax.swing.JLabel();
        v_registration2 = new javax.swing.JLabel();
        v_service_view2 = new javax.swing.JLabel();
        v_services3 = new javax.swing.JLabel();
        insurance_claim1 = new javax.swing.JLabel();
        tyre_replace2 = new javax.swing.JLabel();
        insurance_claim2 = new javax.swing.JLabel();
        insurance_claim3 = new javax.swing.JLabel();
        insurance_claim4 = new javax.swing.JLabel();
        insurance_claim5 = new javax.swing.JLabel();
        insurance_claim6 = new javax.swing.JLabel();
        insurance_claim7 = new javax.swing.JLabel();

        rh_register_coustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/register coustomer.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dashboard-New Kamal Learners | Rikillagaskada");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(236, 240, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2_student.setBackground(new java.awt.Color(236, 240, 241));
        jPanel2_student.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        st_attendence.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Attendence.jpg"))); // NOI18N
        st_attendence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_attendenceMouseClicked(evt);
            }
        });
        jPanel2_student.add(st_attendence, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 200, 90));

        st_dl_category.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/DL Category.jpg"))); // NOI18N
        st_dl_category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_dl_categoryMouseClicked(evt);
            }
        });
        jPanel2_student.add(st_dl_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 200, 90));

        st_dl_temporary1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/DL Temporary.jpg"))); // NOI18N
        st_dl_temporary1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_dl_temporary1MouseClicked(evt);
            }
        });
        jPanel2_student.add(st_dl_temporary1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, -1, 90));

        st_dsr_book1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/DSR Book.jpg"))); // NOI18N
        st_dsr_book1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_dsr_book1MouseClicked(evt);
            }
        });
        jPanel2_student.add(st_dsr_book1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, 90));

        st_exam_date.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Exam date.jpg"))); // NOI18N
        st_exam_date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_exam_dateMouseClicked(evt);
            }
        });
        jPanel2_student.add(st_exam_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, 90));

        st_exam_result1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Exam resultt.jpg"))); // NOI18N
        st_exam_result1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_exam_result1MouseClicked(evt);
            }
        });
        jPanel2_student.add(st_exam_result1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, -1, 90));

        st_lerners_p_no1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Lerners permit no.jpg"))); // NOI18N
        st_lerners_p_no1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_lerners_p_no1MouseClicked(evt);
            }
        });
        jPanel2_student.add(st_lerners_p_no1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, -1, 90));

        st_licence.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Licence.jpg"))); // NOI18N
        st_licence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_licenceMouseClicked(evt);
            }
        });
        jPanel2_student.add(st_licence, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, 90));

        st_mark_exam_attendence.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Mark exam attendence.jpg"))); // NOI18N
        st_mark_exam_attendence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_mark_exam_attendenceMouseClicked(evt);
            }
        });
        jPanel2_student.add(st_mark_exam_attendence, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, 90));

        st_medicle_document1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Medicle & Document.jpg"))); // NOI18N
        st_medicle_document1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_medicle_document1MouseClicked(evt);
            }
        });
        jPanel2_student.add(st_medicle_document1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, -1, 90));

        st_issue_cap_tshirt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Issue cap & T -shirt.jpg"))); // NOI18N
        st_issue_cap_tshirt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_issue_cap_tshirtMouseClicked(evt);
            }
        });
        jPanel2_student.add(st_issue_cap_tshirt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, -1, 90));

        st_payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/payment.jpg"))); // NOI18N
        st_payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_paymentMouseClicked(evt);
            }
        });
        jPanel2_student.add(st_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, 90));

        st_student_registation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Student registert.jpg"))); // NOI18N
        st_student_registation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_student_registationMouseClicked(evt);
            }
        });
        jPanel2_student.add(st_student_registation, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 90));

        st_trai_day_attendence.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Trial day attendence.jpg"))); // NOI18N
        st_trai_day_attendence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_trai_day_attendenceMouseClicked(evt);
            }
        });
        jPanel2_student.add(st_trai_day_attendence, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, -1, 90));

        st_trail_details1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Trial details.jpg"))); // NOI18N
        st_trail_details1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_trail_details1MouseClicked(evt);
            }
        });
        jPanel2_student.add(st_trail_details1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, 90));

        st_add_trail1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Add trial.jpg"))); // NOI18N
        st_add_trail1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_add_trail1MouseClicked(evt);
            }
        });
        jPanel2_student.add(st_add_trail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, 90));

        st_dl_perment1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Dl Perment.jpg"))); // NOI18N
        st_dl_perment1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_dl_perment1MouseClicked(evt);
            }
        });
        jPanel2_student.add(st_dl_perment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, 90));

        st_attendence_view1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Attendence view.jpg"))); // NOI18N
        st_attendence_view1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_attendence_view1MouseClicked(evt);
            }
        });
        jPanel2_student.add(st_attendence_view1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, 90));

        st_exam_date_bulk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Exam date bulk.jpg"))); // NOI18N
        st_exam_date_bulk1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_exam_date_bulk1MouseClicked(evt);
            }
        });
        jPanel2_student.add(st_exam_date_bulk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, 90));

        st_trail_result1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Trial result.jpg"))); // NOI18N
        st_trail_result1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_trail_result1MouseClicked(evt);
            }
        });
        jPanel2_student.add(st_trail_result1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, 90));

        st_student_impormation1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Student impormation.jpg"))); // NOI18N
        st_student_impormation1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_student_impormation1MouseClicked(evt);
            }
        });
        jPanel2_student.add(st_student_impormation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, -1, 90));

        jPanel1.add(jPanel2_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1020, 730));

        dash_r_and_h.setBackground(new java.awt.Color(189, 195, 199));
        dash_r_and_h.setForeground(new java.awt.Color(255, 255, 255));
        dash_r_and_h.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/frame.png"))); // NOI18N
        dash_r_and_h.add(frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 150, 150));
        dash_r_and_h.add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 150, 150));

        name1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dash_r_and_h.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 210, 20));

        name2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dash_r_and_h.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 30));

        dash_staff.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dash_staff.setForeground(new java.awt.Color(255, 255, 255));
        dash_staff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dash_staff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/exit (1).png"))); // NOI18N
        dash_staff.setText(" Signout");
        dash_staff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash_staffMouseClicked(evt);
            }
        });
        dash_r_and_h.add(dash_staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 250, 50));

        dash_vehicle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dash_vehicle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/vehicle.png"))); // NOI18N
        dash_vehicle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash_vehicle1MouseClicked(evt);
            }
        });
        dash_r_and_h.add(dash_vehicle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 250, 50));

        dash_rent1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dash_rent1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/r adn h.png"))); // NOI18N
        dash_rent1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash_rent1MouseClicked(evt);
            }
        });
        dash_r_and_h.add(dash_rent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 250, 50));

        dash_finance2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dash_finance2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/finance.png"))); // NOI18N
        dash_finance2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash_finance2MouseClicked(evt);
            }
        });
        dash_r_and_h.add(dash_finance2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 250, 50));

        dash_staff1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dash_staff1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/staff.png"))); // NOI18N
        dash_staff1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash_staff1MouseClicked(evt);
            }
        });
        dash_r_and_h.add(dash_staff1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 250, 50));

        dash_student1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dash_student1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/student.png"))); // NOI18N
        dash_student1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash_student1MouseClicked(evt);
            }
        });
        dash_r_and_h.add(dash_student1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 250, 50));

        dash_student2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dash_student2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/studentreport.png"))); // NOI18N
        dash_student2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash_student2MouseClicked(evt);
            }
        });
        dash_r_and_h.add(dash_student2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 250, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoNK2.png"))); // NOI18N
        dash_r_and_h.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 260, 90));

        jPanel1.add(dash_r_and_h, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 730));

        jPanel2_staff.setBackground(new java.awt.Color(236, 240, 241));
        jPanel2_staff.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sff_add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Add.jpg"))); // NOI18N
        sff_add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sff_add1MouseClicked(evt);
            }
        });
        jPanel2_staff.add(sff_add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 200, 90));

        sff_leave_management1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Leave management.jpg"))); // NOI18N
        sff_leave_management1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sff_leave_management1MouseClicked(evt);
            }
        });
        jPanel2_staff.add(sff_leave_management1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 200, 90));

        sff_payment1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Payment1.jpg"))); // NOI18N
        sff_payment1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sff_payment1MouseClicked(evt);
            }
        });
        jPanel2_staff.add(sff_payment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 200, 90));

        sff_employee_registration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Employee registertion.jpg"))); // NOI18N
        sff_employee_registration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sff_employee_registrationMouseClicked(evt);
            }
        });
        jPanel2_staff.add(sff_employee_registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 200, 90));

        sff_attendence3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/sf_Attendencet.jpg"))); // NOI18N
        sff_attendence3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sff_attendence3MouseClicked(evt);
            }
        });
        jPanel2_staff.add(sff_attendence3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 200, 90));

        sff_attendence_report1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Attendence report.jpg"))); // NOI18N
        sff_attendence_report1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sff_attendence_report1MouseClicked(evt);
            }
        });
        jPanel2_staff.add(sff_attendence_report1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 200, 90));

        sff_attendence_report2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Create Salaryt.jpg"))); // NOI18N
        sff_attendence_report2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sff_attendence_report2MouseClicked(evt);
            }
        });
        jPanel2_staff.add(sff_attendence_report2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 200, 90));

        sff_attendence_report3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Leave Report.jpg"))); // NOI18N
        sff_attendence_report3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sff_attendence_report3MouseClicked(evt);
            }
        });
        jPanel2_staff.add(sff_attendence_report3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 200, 90));

        sff_salary_report1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/salary report.jpg"))); // NOI18N
        sff_salary_report1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sff_salary_report1MouseClicked(evt);
            }
        });
        jPanel2_staff.add(sff_salary_report1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 200, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/summary.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2_staff.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 200, 90));

        jPanel1.add(jPanel2_staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1030, 730));

        jPanel2_finance.setBackground(new java.awt.Color(236, 240, 241));
        jPanel2_finance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        f_income.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Income exdence.jpg"))); // NOI18N
        f_income.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                f_incomeMouseClicked(evt);
            }
        });
        jPanel2_finance.add(f_income, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 200, 90));

        f_add_bank_account1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Add bank account.jpg"))); // NOI18N
        f_add_bank_account1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                f_add_bank_account1MouseClicked(evt);
            }
        });
        jPanel2_finance.add(f_add_bank_account1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 200, 90));

        f_bank_history1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Bank history.jpg"))); // NOI18N
        f_bank_history1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                f_bank_history1MouseClicked(evt);
            }
        });
        jPanel2_finance.add(f_bank_history1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 200, 90));

        f_cheque1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Cheque details.jpg"))); // NOI18N
        f_cheque1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                f_cheque1MouseClicked(evt);
            }
        });
        jPanel2_finance.add(f_cheque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 200, 90));

        jPanel1.add(jPanel2_finance, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1030, 730));

        jPanel2_rent.setBackground(new java.awt.Color(236, 240, 241));
        jPanel2_rent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        h_register_coustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/register coustomer.jpg"))); // NOI18N
        h_register_coustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_register_coustomerMouseClicked(evt);
            }
        });
        jPanel2_rent.add(h_register_coustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 200, 90));

        h_hire_payment1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Hire payment.jpg"))); // NOI18N
        h_hire_payment1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_hire_payment1MouseClicked(evt);
            }
        });
        jPanel2_rent.add(h_hire_payment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 200, 90));

        h_hire_vehicle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Hire vehicle.jpg"))); // NOI18N
        h_hire_vehicle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_hire_vehicle1MouseClicked(evt);
            }
        });
        jPanel2_rent.add(h_hire_vehicle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 200, 90));

        h_rent_payment1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Rent payment.jpg"))); // NOI18N
        h_rent_payment1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_rent_payment1MouseClicked(evt);
            }
        });
        jPanel2_rent.add(h_rent_payment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 200, 90));

        h_rent_vehicle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Rent vehicle.jpg"))); // NOI18N
        h_rent_vehicle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_rent_vehicle1MouseClicked(evt);
            }
        });
        jPanel2_rent.add(h_rent_vehicle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 200, 90));

        jPanel1.add(jPanel2_rent, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1020, 730));

        jPanel2_vehicle.setBackground(new java.awt.Color(236, 240, 241));
        jPanel2_vehicle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        v_services.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Add maintain.jpg"))); // NOI18N
        v_services.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v_servicesMouseClicked(evt);
            }
        });
        jPanel2_vehicle.add(v_services, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 200, 90));

        v_vehicle_view1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Vehicle view.jpg"))); // NOI18N
        v_vehicle_view1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v_vehicle_view1MouseClicked(evt);
            }
        });
        jPanel2_vehicle.add(v_vehicle_view1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 200, 90));

        v_view_maintain1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/View maintain.jpg"))); // NOI18N
        v_view_maintain1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v_view_maintain1MouseClicked(evt);
            }
        });
        jPanel2_vehicle.add(v_view_maintain1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 200, 90));

        v_fuel_cost1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/fuel cost.jpg"))); // NOI18N
        v_fuel_cost1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v_fuel_cost1MouseClicked(evt);
            }
        });
        jPanel2_vehicle.add(v_fuel_cost1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 200, 90));

        v_registration1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/registration.jpg"))); // NOI18N
        v_registration1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v_registration1MouseClicked(evt);
            }
        });
        jPanel2_vehicle.add(v_registration1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 200, 90));

        v_service_view1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/service view.jpg"))); // NOI18N
        v_service_view1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v_service_view1MouseClicked(evt);
            }
        });
        jPanel2_vehicle.add(v_service_view1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 200, 90));

        v_services1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/service.jpg"))); // NOI18N
        v_services1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v_services1MouseClicked(evt);
            }
        });
        jPanel2_vehicle.add(v_services1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 200, 90));

        insurance_claim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Insurance claim.jpg"))); // NOI18N
        insurance_claim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insurance_claimMouseClicked(evt);
            }
        });
        jPanel2_vehicle.add(insurance_claim, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 200, 110));

        tyre_replace1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/Tyre replace.jpg"))); // NOI18N
        tyre_replace1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tyre_replace1MouseClicked(evt);
            }
        });
        jPanel2_vehicle.add(tyre_replace1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 200, 110));

        jPanel1.add(jPanel2_vehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1020, 730));

        StudentReport.setBackground(new java.awt.Color(236, 240, 241));
        StudentReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        v_services2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/ViewTrialPayments.jpg"))); // NOI18N
        v_services2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v_services2MouseClicked(evt);
            }
        });
        StudentReport.add(v_services2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 200, 90));

        v_vehicle_view2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/ViewExamAttendnce.jpg"))); // NOI18N
        v_vehicle_view2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v_vehicle_view2MouseClicked(evt);
            }
        });
        StudentReport.add(v_vehicle_view2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 200, 90));

        v_view_maintain2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/ViewdTrialAttendnce.jpg"))); // NOI18N
        v_view_maintain2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v_view_maintain2MouseClicked(evt);
            }
        });
        StudentReport.add(v_view_maintain2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 200, 90));

        v_fuel_cost2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/ViewTrialDates.jpg"))); // NOI18N
        v_fuel_cost2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v_fuel_cost2MouseClicked(evt);
            }
        });
        StudentReport.add(v_fuel_cost2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 200, 90));

        v_registration2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/ViewExamDates.jpg"))); // NOI18N
        v_registration2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v_registration2MouseClicked(evt);
            }
        });
        StudentReport.add(v_registration2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 200, 90));

        v_service_view2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/ViewExamResult.jpg"))); // NOI18N
        v_service_view2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v_service_view2MouseClicked(evt);
            }
        });
        StudentReport.add(v_service_view2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 200, 90));

        v_services3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/ViewExamPayments.jpg"))); // NOI18N
        v_services3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v_services3MouseClicked(evt);
            }
        });
        StudentReport.add(v_services3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 200, 90));

        insurance_claim1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/ViewExamDates.jpg"))); // NOI18N
        insurance_claim1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insurance_claim1MouseClicked(evt);
            }
        });
        StudentReport.add(insurance_claim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 200, 110));

        tyre_replace2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/ViewStudentTrialDetails.jpg"))); // NOI18N
        tyre_replace2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tyre_replace2MouseClicked(evt);
            }
        });
        StudentReport.add(tyre_replace2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 200, 110));

        insurance_claim2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/ViewTrialResult.jpg"))); // NOI18N
        insurance_claim2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insurance_claim2MouseClicked(evt);
            }
        });
        StudentReport.add(insurance_claim2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 200, 110));

        insurance_claim3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/ViewLicenDetails.jpg"))); // NOI18N
        insurance_claim3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insurance_claim3MouseClicked(evt);
            }
        });
        StudentReport.add(insurance_claim3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 200, 110));

        insurance_claim4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/ViewTrialResult.jpg"))); // NOI18N
        insurance_claim4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insurance_claim4MouseClicked(evt);
            }
        });
        StudentReport.add(insurance_claim4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 200, 110));

        insurance_claim5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/ViewStudentInformation.jpg"))); // NOI18N
        insurance_claim5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insurance_claim5MouseClicked(evt);
            }
        });
        StudentReport.add(insurance_claim5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 200, 110));

        insurance_claim6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/ViewPaymentDetails.jpg"))); // NOI18N
        insurance_claim6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insurance_claim6MouseClicked(evt);
            }
        });
        StudentReport.add(insurance_claim6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 200, 110));

        insurance_claim7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn/ViewStudentAttendence.jpg"))); // NOI18N
        insurance_claim7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insurance_claim7MouseClicked(evt);
            }
        });
        StudentReport.add(insurance_claim7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 200, 110));

        jPanel1.add(StudentReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1020, 730));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dash_student1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash_student1MouseClicked
      jPanel2_student.setVisible(true);
      jPanel2_finance.setVisible(false);
      jPanel2_rent.setVisible(false);
      jPanel2_staff.setVisible(false);
      jPanel2_vehicle.setVisible(false);
      StudentReport.setVisible(false);
      
    }//GEN-LAST:event_dash_student1MouseClicked

    private void dash_vehicle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash_vehicle1MouseClicked
       jPanel2_student.setVisible(false);
      jPanel2_finance.setVisible(false);
      jPanel2_rent.setVisible(false);
      jPanel2_staff.setVisible(false);
      jPanel2_vehicle.setVisible(true);
      StudentReport.setVisible(false);
    }//GEN-LAST:event_dash_vehicle1MouseClicked

    private void dash_rent1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash_rent1MouseClicked
  jPanel2_student.setVisible(false);
      jPanel2_finance.setVisible(false);
      jPanel2_rent.setVisible(true);
      jPanel2_staff.setVisible(false);
      jPanel2_vehicle.setVisible(false);
      StudentReport.setVisible(false);
    }//GEN-LAST:event_dash_rent1MouseClicked

    private void dash_finance2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash_finance2MouseClicked
     jPanel2_student.setVisible(false);
      jPanel2_finance.setVisible(true);
      jPanel2_rent.setVisible(false);
      jPanel2_staff.setVisible(false);
      jPanel2_vehicle.setVisible(false);
      StudentReport.setVisible(false);
    }//GEN-LAST:event_dash_finance2MouseClicked

    private void dash_staff1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash_staff1MouseClicked
      jPanel2_student.setVisible(false);
      jPanel2_finance.setVisible(false);
      jPanel2_rent.setVisible(false);
      jPanel2_staff.setVisible(true);
      jPanel2_vehicle.setVisible(false);
      StudentReport.setVisible(false);
    }//GEN-LAST:event_dash_staff1MouseClicked

    private void v_registration1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v_registration1MouseClicked
       MainMenu.VehicleRegister().setVisible(true);
    }//GEN-LAST:event_v_registration1MouseClicked

    private void v_vehicle_view1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v_vehicle_view1MouseClicked
       MainMenu.ViewVehicleDetails().setVisible(true);
    }//GEN-LAST:event_v_vehicle_view1MouseClicked

    private void v_services1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v_services1MouseClicked
       MainMenu.VehicleService().setVisible(true);       
    }//GEN-LAST:event_v_services1MouseClicked

    private void v_service_view1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v_service_view1MouseClicked
       MainMenu.ViewServiceDetails().setVisible(true);   
    }//GEN-LAST:event_v_service_view1MouseClicked

    private void v_fuel_cost1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v_fuel_cost1MouseClicked
       MainMenu.VehicleFuelCost().setVisible(true);  
    }//GEN-LAST:event_v_fuel_cost1MouseClicked

    private void v_servicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v_servicesMouseClicked
       MainMenu.vehicleMaintance().setVisible(true);  
    }//GEN-LAST:event_v_servicesMouseClicked

    private void v_view_maintain1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v_view_maintain1MouseClicked
       MainMenu.Viewmaintain().setVisible(true);  
    }//GEN-LAST:event_v_view_maintain1MouseClicked

    private void h_register_coustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_register_coustomerMouseClicked
      MainMenu.regcustomer().setVisible(true);
    }//GEN-LAST:event_h_register_coustomerMouseClicked

    private void h_hire_vehicle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_hire_vehicle1MouseClicked
       //MainMenu.hirevehicle().setVisible(true);
        HireVehicle hv=new HireVehicle();
        hv.setVisible(true);
    }//GEN-LAST:event_h_hire_vehicle1MouseClicked

    private void h_hire_payment1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_hire_payment1MouseClicked
        MainMenu.hirepayment().setVisible(true);
    }//GEN-LAST:event_h_hire_payment1MouseClicked

    private void h_rent_vehicle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_rent_vehicle1MouseClicked
       MainMenu.renthire().setVisible(true);
    }//GEN-LAST:event_h_rent_vehicle1MouseClicked

    private void h_rent_payment1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_rent_payment1MouseClicked
       MainMenu.rentPayment().setVisible(true);
    }//GEN-LAST:event_h_rent_payment1MouseClicked

    private void st_student_registationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_student_registationMouseClicked
        MainMenu.studentRegistation().setVisible(true);
       // MainMenu.studentReg().setVisible(true);
        
//        new StudentRegistation().setVisible(true);
    }//GEN-LAST:event_st_student_registationMouseClicked

    private void st_attendenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_attendenceMouseClicked

        MainMenu.atttendence().setVisible(true);
    }//GEN-LAST:event_st_attendenceMouseClicked

    private void st_paymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_paymentMouseClicked
       MainMenu.payments().setVisible(true);
    }//GEN-LAST:event_st_paymentMouseClicked

    private void st_exam_dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_exam_dateMouseClicked
       MainMenu.addexamdates().setVisible(true);
    }//GEN-LAST:event_st_exam_dateMouseClicked

    private void st_exam_date_bulk1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_exam_date_bulk1MouseClicked
       MainMenu.addexamdatebulkenter().setVisible(true);
    }//GEN-LAST:event_st_exam_date_bulk1MouseClicked

    private void st_mark_exam_attendenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_mark_exam_attendenceMouseClicked
       MainMenu.addexamdayattendent().setVisible(true);
    }//GEN-LAST:event_st_mark_exam_attendenceMouseClicked

    private void st_exam_result1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_exam_result1MouseClicked
        MainMenu.ExamresultAdd().setVisible(true);
    }//GEN-LAST:event_st_exam_result1MouseClicked

    private void st_add_trail1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_add_trail1MouseClicked
        MainMenu.trial1().setVisible(true);
    }//GEN-LAST:event_st_add_trail1MouseClicked

    private void st_trail_details1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_trail_details1MouseClicked
       MainMenu.viewStudentTrialDetails().setVisible(true);
    }//GEN-LAST:event_st_trail_details1MouseClicked

    private void st_trail_result1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_trail_result1MouseClicked
        MainMenu.addTrialResult().setVisible(true);
    }//GEN-LAST:event_st_trail_result1MouseClicked

    private void st_trai_day_attendenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_trai_day_attendenceMouseClicked
       MainMenu.addtrialdayattendence().setVisible(true);
    }//GEN-LAST:event_st_trai_day_attendenceMouseClicked

    private void st_attendence_view1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_attendence_view1MouseClicked
       MainMenu.viewStudentAttendence().setVisible(true);
    }//GEN-LAST:event_st_attendence_view1MouseClicked

    private void st_medicle_document1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_medicle_document1MouseClicked
        MainMenu.medicalandDocument().setVisible(true);
    }//GEN-LAST:event_st_medicle_document1MouseClicked

    private void st_licenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_licenceMouseClicked
       MainMenu.viewLicenDetails1().setVisible(true);
    }//GEN-LAST:event_st_licenceMouseClicked

    private void st_dl_categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_dl_categoryMouseClicked
       MainMenu.dlcatagory().setVisible(true);
    }//GEN-LAST:event_st_dl_categoryMouseClicked

    private void st_dl_perment1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_dl_perment1MouseClicked
       MainMenu.permentDLDdetails().setVisible(true);
    }//GEN-LAST:event_st_dl_perment1MouseClicked

    private void st_dl_temporary1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_dl_temporary1MouseClicked
        MainMenu.temporyDLDetails().setVisible(true);
    }//GEN-LAST:event_st_dl_temporary1MouseClicked

    private void st_lerners_p_no1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_lerners_p_no1MouseClicked
        MainMenu.learnerspermitno().setVisible(true);
    }//GEN-LAST:event_st_lerners_p_no1MouseClicked

    private void st_dsr_book1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_dsr_book1MouseClicked
       MainMenu.dSRBook1().setVisible(true);
    }//GEN-LAST:event_st_dsr_book1MouseClicked

    private void st_issue_cap_tshirtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_issue_cap_tshirtMouseClicked
       MainMenu.issuecapandtshirt().setVisible(true);
    }//GEN-LAST:event_st_issue_cap_tshirtMouseClicked

    private void dash_staffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash_staffMouseClicked
        Window[] wins = Window.getWindows();
        for (int i = 0; i < wins.length; i++) {
            System.out.println(wins[i]);
            wins[i].dispose();
        }
        
        new login().setVisible(true);
    }//GEN-LAST:event_dash_staffMouseClicked

    private void sff_employee_registrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sff_employee_registrationMouseClicked
        MainMenu.registeremployee().setVisible(true);
    }//GEN-LAST:event_sff_employee_registrationMouseClicked

    private void sff_payment1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sff_payment1MouseClicked
        MainMenu.employeepayments().setVisible(true);
    }//GEN-LAST:event_sff_payment1MouseClicked

    private void sff_leave_management1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sff_leave_management1MouseClicked
        MainMenu.staffleavemanage().setVisible(true);
    }//GEN-LAST:event_sff_leave_management1MouseClicked

    private void sff_add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sff_add1MouseClicked
        MainMenu.adduser().setVisible(true);
    }//GEN-LAST:event_sff_add1MouseClicked

    private void f_add_bank_account1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f_add_bank_account1MouseClicked
       MainMenu.addBankaccount().setVisible(true);
    }//GEN-LAST:event_f_add_bank_account1MouseClicked

    private void f_bank_history1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f_bank_history1MouseClicked
      MainMenu.bankinfo().setVisible(true);
    }//GEN-LAST:event_f_bank_history1MouseClicked

    private void f_cheque1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f_cheque1MouseClicked
     MainMenu.checkdetails().setVisible(true);
    }//GEN-LAST:event_f_cheque1MouseClicked

    private void f_incomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f_incomeMouseClicked
       MainMenu.incomeexpence().setVisible(true);
    }//GEN-LAST:event_f_incomeMouseClicked

    private void st_student_impormation1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_student_impormation1MouseClicked
       MainMenu.viewStudentInformation1().setVisible(true);
    }//GEN-LAST:event_st_student_impormation1MouseClicked

    private void tyre_replace1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tyre_replace1MouseClicked
       MainMenu.ChangeTyre().setVisible(true);
    }//GEN-LAST:event_tyre_replace1MouseClicked

    private void insurance_claimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insurance_claimMouseClicked
       
        MainMenu.InsuranceClaim().setVisible(true);
        
        
        
    }//GEN-LAST:event_insurance_claimMouseClicked

    private void sff_attendence3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sff_attendence3MouseClicked
//        MainMenu.registerattendence().setVisible(true);
new Staff.registerAttendence().setVisible(true);

    }//GEN-LAST:event_sff_attendence3MouseClicked

    private void v_services2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v_services2MouseClicked
        MainMenu.ViewTrialPayments().setVisible(true);
    }//GEN-LAST:event_v_services2MouseClicked

    private void v_vehicle_view2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v_vehicle_view2MouseClicked
        MainMenu.viewExamAttendnce1().setVisible(true);
    }//GEN-LAST:event_v_vehicle_view2MouseClicked

    private void v_view_maintain2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v_view_maintain2MouseClicked
        MainMenu.ViewTrialAttendnce().setVisible(true);
    }//GEN-LAST:event_v_view_maintain2MouseClicked

    private void v_fuel_cost2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v_fuel_cost2MouseClicked
        MainMenu.ViewTrialDates().setVisible(true);
    }//GEN-LAST:event_v_fuel_cost2MouseClicked

    private void v_registration2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v_registration2MouseClicked
       MainMenu.viewExamDates1().setVisible(true);
    }//GEN-LAST:event_v_registration2MouseClicked

    private void v_service_view2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v_service_view2MouseClicked
       MainMenu.viewExamResult1().setVisible(true);
    }//GEN-LAST:event_v_service_view2MouseClicked

    private void v_services3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v_services3MouseClicked
        MainMenu.viewExamPayments1().setVisible(true);
    }//GEN-LAST:event_v_services3MouseClicked

    private void insurance_claim1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insurance_claim1MouseClicked
        MainMenu.viewExamDates1().setVisible(true);
    }//GEN-LAST:event_insurance_claim1MouseClicked

    private void tyre_replace2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tyre_replace2MouseClicked
       MainMenu.viewStudentTrialDetails().setVisible(true);
    }//GEN-LAST:event_tyre_replace2MouseClicked

    private void insurance_claim2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insurance_claim2MouseClicked
        MainMenu.ViewTrialResult().setVisible(true);
    }//GEN-LAST:event_insurance_claim2MouseClicked

    private void insurance_claim3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insurance_claim3MouseClicked
        MainMenu.viewLicenDetails1().setVisible(true);
    }//GEN-LAST:event_insurance_claim3MouseClicked

    private void insurance_claim4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insurance_claim4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_insurance_claim4MouseClicked

    private void insurance_claim5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insurance_claim5MouseClicked
        MainMenu.viewStudentInformation1().setVisible(true);
    }//GEN-LAST:event_insurance_claim5MouseClicked

    private void insurance_claim6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insurance_claim6MouseClicked
        MainMenu.ViewPaymentDetails().setVisible(true);
    }//GEN-LAST:event_insurance_claim6MouseClicked

    private void insurance_claim7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insurance_claim7MouseClicked
       MainMenu.viewStudentAttendence().setVisible(true);
    }//GEN-LAST:event_insurance_claim7MouseClicked

    private void dash_student2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash_student2MouseClicked
         jPanel2_student.setVisible(false);
      jPanel2_finance.setVisible(false);
      jPanel2_rent.setVisible(false);
      jPanel2_staff.setVisible(false);
      jPanel2_vehicle.setVisible(false);
      StudentReport.setVisible(true);
    }//GEN-LAST:event_dash_student2MouseClicked

    private void sff_attendence_report1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sff_attendence_report1MouseClicked
        MainMenu.attendenceReport().setVisible(true);
    }//GEN-LAST:event_sff_attendence_report1MouseClicked

    private void sff_attendence_report2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sff_attendence_report2MouseClicked
        MainMenu.employeellowance().setVisible(true);
    }//GEN-LAST:event_sff_attendence_report2MouseClicked

    private void sff_attendence_report3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sff_attendence_report3MouseClicked
       MainMenu.ViewLeaveManagementReport().setVisible(true);
    }//GEN-LAST:event_sff_attendence_report3MouseClicked

    private void sff_salary_report1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sff_salary_report1MouseClicked
        MainMenu.salaryreport().setVisible(true);
    }//GEN-LAST:event_sff_salary_report1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        MainMenu.GiantReport().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked


    public static void main(String args[]) {
        
        WebLookAndFeel.install();
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dasboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel StudentReport;
    private javax.swing.JLabel dash_finance2;
    private javax.swing.JPanel dash_r_and_h;
    private javax.swing.JLabel dash_rent1;
    private javax.swing.JLabel dash_staff;
    private javax.swing.JLabel dash_staff1;
    private javax.swing.JLabel dash_student1;
    private javax.swing.JLabel dash_student2;
    private javax.swing.JLabel dash_vehicle1;
    private javax.swing.JLabel f_add_bank_account1;
    private javax.swing.JLabel f_bank_history1;
    private javax.swing.JLabel f_cheque1;
    private javax.swing.JLabel f_income;
    private javax.swing.JLabel frame;
    private javax.swing.JLabel h_hire_payment1;
    private javax.swing.JLabel h_hire_vehicle1;
    private javax.swing.JLabel h_register_coustomer;
    private javax.swing.JLabel h_rent_payment1;
    private javax.swing.JLabel h_rent_vehicle1;
    private javax.swing.JLabel insurance_claim;
    private javax.swing.JLabel insurance_claim1;
    private javax.swing.JLabel insurance_claim2;
    private javax.swing.JLabel insurance_claim3;
    private javax.swing.JLabel insurance_claim4;
    private javax.swing.JLabel insurance_claim5;
    private javax.swing.JLabel insurance_claim6;
    private javax.swing.JLabel insurance_claim7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2_finance;
    private javax.swing.JPanel jPanel2_rent;
    private javax.swing.JPanel jPanel2_staff;
    private javax.swing.JPanel jPanel2_student;
    private javax.swing.JPanel jPanel2_vehicle;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel rh_register_coustomer;
    private javax.swing.JLabel sff_add1;
    private javax.swing.JLabel sff_attendence3;
    private javax.swing.JLabel sff_attendence_report1;
    private javax.swing.JLabel sff_attendence_report2;
    private javax.swing.JLabel sff_attendence_report3;
    private javax.swing.JLabel sff_employee_registration;
    private javax.swing.JLabel sff_leave_management1;
    private javax.swing.JLabel sff_payment1;
    private javax.swing.JLabel sff_salary_report1;
    private javax.swing.JLabel st_add_trail1;
    private javax.swing.JLabel st_attendence;
    private javax.swing.JLabel st_attendence_view1;
    private javax.swing.JLabel st_dl_category;
    private javax.swing.JLabel st_dl_perment1;
    private javax.swing.JLabel st_dl_temporary1;
    private javax.swing.JLabel st_dsr_book1;
    private javax.swing.JLabel st_exam_date;
    private javax.swing.JLabel st_exam_date_bulk1;
    private javax.swing.JLabel st_exam_result1;
    private javax.swing.JLabel st_issue_cap_tshirt;
    private javax.swing.JLabel st_lerners_p_no1;
    private javax.swing.JLabel st_licence;
    private javax.swing.JLabel st_mark_exam_attendence;
    private javax.swing.JLabel st_medicle_document1;
    private javax.swing.JLabel st_payment;
    private javax.swing.JLabel st_student_impormation1;
    private javax.swing.JLabel st_student_registation;
    private javax.swing.JLabel st_trai_day_attendence;
    private javax.swing.JLabel st_trail_details1;
    private javax.swing.JLabel st_trail_result1;
    private javax.swing.JLabel tyre_replace1;
    private javax.swing.JLabel tyre_replace2;
    private javax.swing.JLabel v_fuel_cost1;
    private javax.swing.JLabel v_fuel_cost2;
    private javax.swing.JLabel v_registration1;
    private javax.swing.JLabel v_registration2;
    private javax.swing.JLabel v_service_view1;
    private javax.swing.JLabel v_service_view2;
    private javax.swing.JLabel v_services;
    private javax.swing.JLabel v_services1;
    private javax.swing.JLabel v_services2;
    private javax.swing.JLabel v_services3;
    private javax.swing.JLabel v_vehicle_view1;
    private javax.swing.JLabel v_vehicle_view2;
    private javax.swing.JLabel v_view_maintain1;
    private javax.swing.JLabel v_view_maintain2;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            Dasboard.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Dasboard.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void setpic() {
        
    try {
        photo.setIcon(new ImageIcon(ImageIO.read(new File(login.pic)).getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
    } catch (IOException ex) {
        Logger.getLogger(Dasboard.class.getName()).log(Level.SEVERE, null, ex);
    }
        name2.setText(login.Name);
    }
}
