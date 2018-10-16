package ExtenelClasses;

import Finance.BankInformation;
import Finance.CHEQUEDETAILS;
import Finance.FINANCEADDBANKACCOUNT;
import Finance.IncomeExpence;
import RentandHire.HirePayment;
import RentandHire.HireVehicle;
import RentandHire.RentPayment;
import RentandHire.RentVehicle;
import Staff.AddUser;
import Staff.AttendenceReportPopup;
import Staff.EmployeePayments;
import Staff.Employeedeductions;
import Staff.Employeellowance;
import Staff.GiantReport;
import Staff.ViewAttendenceReport;
import Staff.ViewDeductionDetails;
import Staff.ViewLeaveManagementReport;

import Staff.registerAttendence;
import Staff.salary;
import Staff.salaryreport;
import Staff.staffleavemanagement;
import Staff.viewmonthsalarypopup;
import Student.AddExamDateBulkEnter;
import Student.AddExamDates;
import Student.AddExamDayAttendent;
import Student.AddTrialDayAttendent;
import Student.AddTrialResult;
import Student.Attendence;
import Student.DLCatory;
import Student.DLImagePreview;
import Student.ExamResultAdd;
import Student.IssueCapAndTshirt;
import Student.LernersPermitNo;
import Student.MedicleAndDocuments;
import Student.Payments;
import Student.PermentDLDetails;
import Student.Reports.DLImagePreview2;
import Student.Reports.DSRBook;
import Student.Reports.TshirtandCapRecords;
import Student.Reports.ViewExamAttendnce;
import Student.Reports.ViewExamDates;
import Student.Reports.ViewExamPayments;
import Student.Reports.ViewExamResult;
import Student.Reports.ViewLicenDetails;
import Student.Reports.ViewPaymentDetails;
import Student.Reports.ViewStudentAttendence;
import Student.Reports.ViewStudentInformation;
import Student.Reports.ViewStudentTrialDetails;
import Student.Reports.ViewTrialAttendnce;
import Student.Reports.ViewTrialDates;
import Student.Reports.ViewTrialPayments;
import Student.Reports.ViewTrialResult;
import Student.Reports.ViewdTrialAttendnce;
import Student.StudentRegistation;
import Student.TemporyDLDetails;
import Student.Trial;
import Student.ViewExamDayAttendent;
import Student.ViewTrialDayAttendent;
import Vehicle.ChangeTyre;
import Vehicle.InsuranceClaim;
import Vehicle.VehicleFuelCost;
import Vehicle.VehicleMaintance;
import Vehicle.VehicleMileage;
import Vehicle.VehicleRegister;
import Vehicle.VehicleService;
import Vehicle.ViewServiceDetails;
import Vehicle.ViewVehicleDetails;
import Vehicle.Viewmaintain;

public class MainMenu {

    private static Student.StudentRegistation student;
    private static Finance.BankInformation bankinformation;
    private static Finance.CHEQUEDETAILS chequedetails;
    private static Finance.FINANCEADDBANKACCOUNT addbankAccount;
    private static Finance.IncomeExpence incomeexpence;
    //-----------------------------------------------------------------------
    private static RentandHire.HirePayment hirepayment;
    private static RentandHire.HireVehicle hireVehicle;
    private static RentandHire.RegisterCustomers regcustomer;
    private static RentandHire.RentPayment rentPayment;
    private static RentandHire.RentVehicle rentvehicle;

    //-------------------------------------------------------------------------
    private static Staff.AddUser adduser;
    private static Staff.AttendenceReportPopup attendencereportpopup;
    private static Staff.EmployeePayments employeepayments;
    private static Staff.Employeedeductions employeedeductions;
    private static Staff.Employeellowance employeeallowance;
    private static Staff.ViewAttendenceReport viewAttendenceReport;
    private static Staff.ViewDeductionDetails viewdeductiondetails;

    private static Staff.registerAttendence registerattendence;
    private static Staff.registerEmployee registeremployee;
    private static Staff.salary salary;
    private static Staff.salaryreport salaryreport;
    private static Staff.staffleavemanagement staffleavemanagement;
    private static Staff.viewmonthsalarypopup viewmonthsalarypopup;
    private static Staff.ViewLeaveManagementReport viewLeaveManagementReport;
    private static Staff.GiantReport giantReport;

    //----------------------------------------------------------------------
    private static Student.AddExamDateBulkEnter addexamdatebulkenter;
    private static Student.AddExamDates adexamdate;
    private static Student.AddExamDayAttendent Addexamdayattendent;
    private static Student.AddTrialDayAttendent addtrailDayattendend;
    private static Student.AddTrialResult addtrialresult;
    private static Student.Attendence attendence;
    private static Student.DLCatory Dlcatagory;
    private static Student.DLImagePreview Dlimagepreview;
    private static Student.ExamResultAdd examresultadd;
    private static Student.IssueCapAndTshirt issucapandtshirt;
    private static Student.LernersPermitNo learnerspermitNo;
    private static Student.MedicleAndDocuments medicalanddocuments;
    private static Student.Payments payments;
    private static Student.PermentDLDetails permitdlddetails;
    private static Student.StudentRegistation studentregistration;
    private static Student.TemporyDLDetails temporarydlddetails;
    private static Student.Trial trial;
    private static Student.ViewExamDayAttendent viewExamDayAttendent;
    private static Student.ViewTrialDayAttendent viewTrialDayAttendent;

    //-------------------------------------------------------------------------------------------------
    private static Student.Reports.DLImagePreview2 dLImagePreview2;
    private static Student.Reports.DSRBook dSRBook;
    private static Student.Reports.TshirtandCapRecords tshirtandCapRecords;
    private static ViewExamDayAttendent viewExamDayAttendent1;
    private static ViewExamAttendnce viewExamAttendnce;
    private static Student.Reports.ViewExamDates viewExamDates;
    private static Student.Reports.ViewExamPayments viewExamPayments;
    private static Student.Reports.ViewExamResult viewExamResult;
    private static Student.Reports.ViewLicenDetails viewLicenDetails;
    private static Student.Reports.ViewPaymentDetails viewPaymentDetails;
    private static Student.Reports.ViewStudentAttendence viewStudentAttendence;
    private static Student.Reports.ViewStudentInformation viewStudentInformation;
    private static Student.Reports.ViewStudentTrialDetails viewStudentTrialDetails;
    private static Student.Reports.ViewTrialDates viewTrialDates;
    private static Student.Reports.ViewTrialPayments viewTrialPayments;
    private static Student.Reports.ViewTrialResult viewTrialResult;
    private static Student.Reports.ViewdTrialAttendnce viewdTrialAttendnce;
    private static Student.Reports.ViewTrialAttendnce viewTrialAttendnce;

    //-------------------------------------------------------------------------
    private static Vehicle.ChangeTyre veChangeTyre;
    private static Vehicle.InsuranceClaim insuranceClaim;
    private static Vehicle.VehicleFuelCost vehicleFuelCost;
    private static Vehicle.VehicleMaintance vehicleMaintance;
    private static Vehicle.VehicleMileage vehicleMileage;
    private static Vehicle.VehicleService vehicleService;
    private static Vehicle.ViewServiceDetails viewServiceDetails;
    private static Vehicle.ViewVehicleDetails viewVehicleDetails;
    private static Vehicle.Viewmaintain viewmaintain;
    private static Vehicle.VehicleRegister vehicleRegister;

    // private static EMVPayments.     emvpayment;
    public static Student.StudentRegistation studentReg() {

//        if (student == null) {
        student = new StudentRegistation();

//        }
        return student;

    }

//    public  static  EMVPayments.em emvpay(){
//    
//        if (emvpayment==null) {
//            emvpayment=new EMVPayments();
//        }
//        return emvpayment;
//    
//    
//    
//    }
    public static Finance.BankInformation bankinfo() {

//        if (bankinformation == null) {
        bankinformation = new BankInformation();
//        }
        return bankinformation;

    }

    public static Finance.CHEQUEDETAILS checkdetails() {

//        if (chequedetails == null) {
        chequedetails = new CHEQUEDETAILS();
//        }
        return chequedetails;

    }

    public static Finance.FINANCEADDBANKACCOUNT addBankaccount() {

//        if (addbankAccount == null) {
        addbankAccount = new FINANCEADDBANKACCOUNT();
//        }
        return addbankAccount;

    }

    public static Finance.IncomeExpence incomeexpence() {

//        if (incomeexpence == null) {
        incomeexpence = new IncomeExpence();
//        }
        return incomeexpence;

    }

    ////////---------------------------------------------------------------
    public static RentandHire.HirePayment hirepayment() {

//        if (hirepayment == null) {
        hirepayment = new HirePayment();
//        }
        return hirepayment;

    }

    public static RentandHire.HireVehicle hirevehicle() {

        try {
//                 if (hirevehicle() == null) {
            hireVehicle = new HireVehicle();
//        }

        } catch (Exception e) {
        }
        return hireVehicle;
    }

    public static RentandHire.RegisterCustomers regcustomer() {

//        if (regcustomer == null) {
            regcustomer = new RentandHire.RegisterCustomers();
//        }

        return regcustomer;

    }

    public static RentandHire.RentPayment rentPayment() {

//        if (rentPayment == null) {
            rentPayment = new RentPayment();
//        }

        return rentPayment;

    }

    public static RentandHire.RentVehicle renthire() {

//        if (rentvehicle == null) {
            rentvehicle = new RentVehicle();
//        }
        return rentvehicle;

    }

    //-----------------------------------------------------------------------------------------------------------
    public static Staff.AddUser adduser() {

//        if (adduser == null) {
            adduser = new AddUser();
//        }

        return adduser;

    }

    public static Staff.AttendenceReportPopup attendenceReportPopup() {

//        if (attendencereportpopup == null) {
            attendencereportpopup = new AttendenceReportPopup();
//        }
        return attendencereportpopup;

    }

    public static EmployeePayments employeepayments() {
//        if (employeepayments == null) {
            employeepayments = new EmployeePayments();
//        }

        return employeepayments;

    }

    public static Employeedeductions employeedeductions() {

//        if (employeedeductions == null) {
            employeedeductions = new Employeedeductions();
//        }
        return employeedeductions;

    }

    public static Employeellowance employeellowance() {

//        if (employeeallowance == null) {
            employeeallowance = new Employeellowance();
//        }
        return employeeallowance;

    }

    public static ViewAttendenceReport attendenceReport() {

//        if (viewAttendenceReport == null) {
            viewAttendenceReport = new ViewAttendenceReport();
//        }
        return viewAttendenceReport;

    }

    public static ViewDeductionDetails viewdeductiondetails() {

//        if (viewdeductiondetails == null) {
            viewdeductiondetails = new ViewDeductionDetails();
//        }

        return viewdeductiondetails;

    }

    public static Staff.registerAttendence registerattendence() {

//        if (registerattendence == null) {
            registerattendence = new registerAttendence();
//        }
        return registerattendence;

    }

    public static Staff.registerEmployee registeremployee() {

//        if (registeremployee == null) {
            registeremployee = new Staff.registerEmployee();
//        }

        return registeremployee;

    }

    public static Staff.salary salary() {

//        if (salary == null) {
            salary = new salary();
//        }
        return salary;

    }

    public static salaryreport salaryreport() {

//        if (salaryreport == null) {
            salaryreport = new salaryreport();
//        }
        return salaryreport;

    }

    public static staffleavemanagement staffleavemanage() {

//        if (staffleavemanagement == null) {
            staffleavemanagement = new staffleavemanagement();
//        }

        return staffleavemanagement;
    }

    public static viewmonthsalarypopup viewmonthsalarypopup() {

//        if (viewmonthsalarypopup == null) {
            viewmonthsalarypopup = new viewmonthsalarypopup();
//        }
        return viewmonthsalarypopup;

    }

    public static Student.AddExamDateBulkEnter addexamdatebulkenter() {

//        if (addexamdatebulkenter == null) {
            addexamdatebulkenter = new AddExamDateBulkEnter();
//        }
        return addexamdatebulkenter;

    }

    public static Student.AddExamDates addexamdates() {

//        if (adexamdate == null) {
            adexamdate = new AddExamDates();
//        }
        return adexamdate;

    }

    public static Student.AddExamDayAttendent addexamdayattendent() {

//        if (Addexamdayattendent == null) {
            Addexamdayattendent = new AddExamDayAttendent();
//        }
        return Addexamdayattendent;

    }

    public static Student.AddTrialDayAttendent addtrialdayattendence() {

//        if (addtrailDayattendend == null) {
            addtrailDayattendend = new AddTrialDayAttendent();
//        }
        return addtrailDayattendend;

    }

    public static Student.AddTrialResult addTrialResult() {

//        if (addtrialresult == null) {
            addtrialresult = new AddTrialResult();
//        }
        return addtrialresult;

    }

    public static Student.Attendence atttendence() {

//        if (attendence == null) {
            attendence = new Attendence();
//        }
        return attendence;

    }

    public static Student.DLCatory dlcatagory() {

//        if (Dlcatagory == null) {
            Dlcatagory = new DLCatory();
//        }
        return Dlcatagory;

    }

    public static Student.DLImagePreview dliimagepreview() {

//        if (Dlimagepreview == null) {
            Dlimagepreview = new DLImagePreview();
//        }
        return Dlimagepreview;

    }

    public static Student.ExamResultAdd ExamresultAdd() {

//        if (examresultadd == null) {
            examresultadd = new ExamResultAdd();
//        }
        return examresultadd;

    }

    public static Student.IssueCapAndTshirt issuecapandtshirt() {

//        if (issucapandtshirt == null) {
            issucapandtshirt = new IssueCapAndTshirt();
//        }
        return issucapandtshirt;

    }

    public static Student.LernersPermitNo learnerspermitno() {

//        if (learnerspermitNo == null) {
            learnerspermitNo = new LernersPermitNo();
//        }
        return learnerspermitNo;

    }

    public static Student.MedicleAndDocuments medicalandDocument() {

//        if (medicalanddocuments == null) {

            medicalanddocuments = new MedicleAndDocuments();
//        }
        return medicalanddocuments;
    }

    public static Student.PermentDLDetails permentDLDdetails() {

//        if (permitdlddetails == null) {
            permitdlddetails = new PermentDLDetails();
//        }

        return permitdlddetails;

    }

    public static Student.Payments payments() {

//        if (payments == null) {
            payments = new Payments();
//        }
        return payments;

    }

    public static Student.StudentRegistation studentRegistation() {

//        if (studentregistration == null) {
            studentregistration = new StudentRegistation();
//        }

        return studentregistration;

    }

    public static Student.TemporyDLDetails temporyDLDetails() {

//        if (temporarydlddetails == null) {
            temporarydlddetails = new TemporyDLDetails();
//        }
        return temporarydlddetails;

    }

    public static Student.Trial trial1() {

//        if (trial == null) {
            trial = new Trial();
//        }
        return trial;

    }

    public static Student.ViewExamDayAttendent viewExamDayAttendent1() {

//        if (viewExamDayAttendent == null) {
            viewExamDayAttendent = new ViewExamDayAttendent();
//        }

        return viewExamDayAttendent;

    }

    public static Student.ViewTrialDayAttendent viewTrialDayAttendent1() {

//        if (viewTrialDayAttendent == null) {
            viewTrialDayAttendent = new ViewTrialDayAttendent();
//        }
        return viewTrialDayAttendent;

    }

    public static Student.Reports.DLImagePreview2 dLImagePreview21() {

//        if (dLImagePreview2 == null) {
            dLImagePreview2 = new DLImagePreview2();
//        }
        return dLImagePreview2;

    }

    public static DSRBook dSRBook1() {

//        if (dSRBook == null) {
            dSRBook = new DSRBook();
//        }
        return dSRBook;

    }

    public static TshirtandCapRecords tshirtandCapRecords1() {

//        if (tshirtandCapRecords == null) {
            tshirtandCapRecords = new TshirtandCapRecords();
//        }
        return tshirtandCapRecords;

    }

    public static ViewExamAttendnce viewExamAttendnce1() {

//        if (viewExamAttendnce == null) {

            viewExamAttendnce = new ViewExamAttendnce();

//        }
        return viewExamAttendnce;

    }

    public static Student.Reports.ViewExamDates viewExamDates1() {

//        if (viewExamDates == null) {
            viewExamDates = new ViewExamDates();
//        }
        return viewExamDates;

    }

    public static Student.Reports.ViewExamPayments viewExamPayments1() {

//        if (viewExamPayments == null) {
            viewExamPayments = new ViewExamPayments();
//        }
        return viewExamPayments;

    }

    public static ViewExamResult viewExamResult1() {

//        if (viewExamResult == null) {
            viewExamResult = new ViewExamResult();
//        }

        return viewExamResult;

    }

    public static ViewLicenDetails viewLicenDetails1() {

//        if (viewLicenDetails == null) {
            viewLicenDetails = new ViewLicenDetails();
//        }
        return viewLicenDetails;

    }

    public static ViewStudentAttendence viewStudentAttendence() {

//        if (viewStudentAttendence == null) {
            viewStudentAttendence = new ViewStudentAttendence();
//        }
        return viewStudentAttendence;

    }

    public static ViewStudentInformation viewStudentInformation1() {

//        if (viewStudentInformation == null) {
            viewStudentInformation = new ViewStudentInformation();
//        }
        return viewStudentInformation;

    }

    public static ViewStudentTrialDetails viewStudentTrialDetails() {

//        if (viewStudentTrialDetails == null) {
            viewStudentTrialDetails = new ViewStudentTrialDetails();
//        }

        return viewStudentTrialDetails;

    }

    public static ViewTrialAttendnce ViewTrialAttendnce() {

//        if (viewTrialAttendnce == null) {
            viewTrialAttendnce = new ViewTrialAttendnce();
//        }

        return viewTrialAttendnce;

    }

    public static ViewTrialDates ViewTrialDates() {

//        if (viewTrialDates == null) {
            viewTrialDates = new ViewTrialDates();
//        }

        return viewTrialDates;

    }

    public static ViewTrialPayments ViewTrialPayments() {

//        if (viewTrialPayments == null) {
            viewTrialPayments = new ViewTrialPayments();
//        }

        return viewTrialPayments;

    }

    public static ViewTrialResult ViewTrialResult() {

//        if (viewTrialResult == null) {
            viewTrialResult = new ViewTrialResult();
//        }

        return viewTrialResult;

    }

    public static ViewdTrialAttendnce ViewdTrialAttendnce() {

//        if (viewdTrialAttendnce == null) {
            viewdTrialAttendnce = new ViewdTrialAttendnce();
//        }

        return viewdTrialAttendnce;

    }

    //-------------------------------------------------------------------------------------------------
    public static ChangeTyre ChangeTyre() {

//        if (veChangeTyre == null) {
            veChangeTyre = new ChangeTyre();
//        }

        return veChangeTyre;

    }

    public static InsuranceClaim InsuranceClaim() {

//        if (insuranceClaim == null) {
            insuranceClaim = new InsuranceClaim();
//        }

        return insuranceClaim;

    }

    public static VehicleFuelCost VehicleFuelCost() {

//        if (vehicleFuelCost == null) {
            vehicleFuelCost = new VehicleFuelCost();
//        }

        return vehicleFuelCost;

    }

    public static VehicleMaintance vehicleMaintance() {

//        if (vehicleMaintance == null) {
            vehicleMaintance = new VehicleMaintance();
//        }

        return vehicleMaintance;

    }

    public static VehicleMileage VehicleMileage() {

//        if (vehicleMileage == null) {
            vehicleMileage = new VehicleMileage();
//        }

        return vehicleMileage;

    }

    public static VehicleRegister VehicleRegister() {

//        if (vehicleRegister == null) {
            vehicleRegister = new VehicleRegister();
//        }

        return vehicleRegister;

    }

    public static VehicleService VehicleService() {

//        if (vehicleService == null) {
            vehicleService = new VehicleService();
//        }

        return vehicleService;

    }

    public static ViewServiceDetails ViewServiceDetails() {

//        if (viewServiceDetails == null) {
            viewServiceDetails = new ViewServiceDetails();
//        }

        return viewServiceDetails;

    }

    public static ViewVehicleDetails ViewVehicleDetails() {

//        if (viewVehicleDetails == null) {
            viewVehicleDetails = new ViewVehicleDetails();
//        }

        return viewVehicleDetails;

    }

    public static Viewmaintain Viewmaintain() {

//        if (viewmaintain == null) {
            viewmaintain = new Viewmaintain();
//        }

        return viewmaintain;

    }

    public static ViewLeaveManagementReport ViewLeaveManagementReport() {

//        if (viewLeaveManagementReport == null) {
            viewLeaveManagementReport = new ViewLeaveManagementReport();
//        }

        return viewLeaveManagementReport;

    }

    public static ViewPaymentDetails ViewPaymentDetails() {
//
//        if (viewPaymentDetails == null) {
            viewPaymentDetails = new ViewPaymentDetails();
//        }

        return viewPaymentDetails;

    }

    public static Staff.GiantReport GiantReport() {

//        if (giantReport == null) {
            giantReport = new GiantReport();

//        }
        return giantReport;

    }

}
