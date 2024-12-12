/*develop inheritance for a given case study, identify objects and relationships and 
implement inheritance wherever applicable. Employee class hasEmp_name, Emp_id, Address, 
 Mail_id, and Mobile_noas members. Inherit the classes: Programmer, Team Lead, Assistant Project  
Manager and Project Manager from employee class. Add Basic Pay (BP) as the member of all the 
inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff 
club fund. Generate pay slips for the employees with their gross and net salary.  write a simple 
java program for this
*/
 
 class Employee{
    String Emp_name, Emp_id, Address, Mail_id;
    double mobile_no, basicpay;

    Employee(String Emp_name,String Emp_id , String Address , String Mail_id,double mobile_no, double basicpay){

        this.Emp_name=Emp_name;
        this.Emp_id=Emp_id;
        this.Address=Address;
        this.mobile_no=mobile_no;
        this.basicpay=basicpay;

    }

    double grossSalary(){

        double da = 0.97*basicpay;
        double hra = 0.10*basicpay;
        return basicpay+da+hra;
    }
    double netsalary(){
        double gross= grossSalary();
        double pf = 0.12*basicpay;
        double staffclubfund = 0.01*basicpay;
        return gross-(pf+staffclubfund);
    }

    void paySlip(){
        System.out.println("Employee Name: " + Emp_name);
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Address: " + Address);
        System.out.println("Mail ID: " + Mail_id);
        System.out.println("Mobile No: " + mobile_no);
        System.out.println("Basic Pay: " + basicpay);
        System.out.println("Gross Salary: " + grossSalary());
        System.out.println("Net Salary: " + netsalary());
    }
 }

 class Programmer extends Employee{
    Programmer(String Emp_name,String Emp_id , String Mail_id , String Address, double mobile_no , double basicpay){
        super(Emp_name, Emp_id, Address, Mail_id, mobile_no, basicpay);
    }
 }
 class TeamLead extends Employee{
    TeamLead(String Emp_name,String Emp_id , String Mail_id , String Address, double mobile_no , double basicpay){
        super(Emp_name, Emp_id, Address, Mail_id, mobile_no, basicpay);
    }
 }
 class projectManager extends Employee{
    projectManager(String Emp_name,String Emp_id , String Mail_id , String Address, double mobile_no , double basicpay){
        super(Emp_name, Emp_id, Address, Mail_id, mobile_no, basicpay);
    }
 }


 
 
 class Practical3 {
    public static void main(String[] args) {

        Programmer p1 = new Programmer("raj", "77", "abc@gmail.com", "homeless", 0, 700);
        p1.paySlip();
    }
}
