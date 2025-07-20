import java.util.*;

interface Payable { 
    double calculateSalary(); 
    double calculateBonus(); 
    void displayPayslip(); 
}
interface Evaluable { 
    double calculatePerformanceScore(); 
    String getPerformanceGrade(); 
    void displayPerformanceReport(); 
}

class AcademicStaff implements Payable,Evaluable{
        String name;
        String employeeID;
        String department;
        double basicSalary;
        double researchAllowance;
        int teachingHours;

        AcademicStaff(String name,String employeeID,String department,double basicSalary,double researchAllowance,int teachingHours){
            this.name=name;
            this.employeeID=employeeID;
            this.department=department;
            this.basicSalary=basicSalary;
            this.researchAllowance=researchAllowance;
            this.teachingHours=teachingHours;
        }
        @Override
        public double calculateSalary(){
            return basicSalary + researchAllowance + (teachingHours * 50);
        }
        @Override
        public double calculateBonus(){
             double totalSalary = calculateSalary(); 
            return (teachingHours > 20) ? totalSalary * 0.10 : totalSalary * 0.05;
        }
        @Override
        public void displayPayslip(){
            System.out.println("===Academic Staff Payslip===");
            System.out.println("Name: "+name);
            System.out.println("Name: "+employeeID);
            System.out.println("Name: "+department);
            System.out.println("Name: "+calculateSalary());
            System.out.println("Name: "+calculateBonus());

        }
        @Override
        public double calculatePerformanceScore(){
            return teachingHours*2.5;
        }

        @Override
        public String getPerformanceGrade(){
            double pscore=calculatePerformanceScore();
            if(pscore>80){
                return "A";
            }
            else if(pscore>60){
                return "B";
            }
            else{
                return "c";
            }
        }

        @Override
        public void displayPerformanceReport(){
            System.out.println("===Academic Staff Payslip===");
            System.out.println("Name: "+name);
            System.out.println("Name: "+employeeID);
            System.out.println("Name: "+department);
            System.out.println("Name: "+calculatePerformanceScore());
            System.out.println("Name: "+getPerformanceGrade());

        }

}

class AdministrativeStaff implements Payable,Evaluable{
    String name;
    String employeeID;
    String department;
    double hourlyRate;
    int hoursWorked;
    double overtimeRate;

    AdministrativeStaff(String name,String employeeID,String department,double hourlyRate,int hoursWorked,double overtimeRate){
        this.name=name;
        this.employeeID=employeeID;
        this.department=department;
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
        this.overtimeRate=overtimeRate;
    }

        @Override
         public double calculateSalary(){
            double regularPay = hourlyRate * Math.min(40, hoursWorked);
            double overtimePay = overtimeRate * Math.max(0, hoursWorked - 40);
            return regularPay + overtimePay;
        }
        @Override
        public double calculateBonus(){
           
            double totalSalary = calculateSalary(); 
            if(hoursWorked>45){
                return totalSalary*0.8;
            }
            else{
                return totalSalary*0.3;
            }
        }
         @Override
        public void displayPayslip(){
            System.out.println("===Administrative Staff Payslip===");
            System.out.println("Name: "+name);
            System.out.println("Name: "+employeeID);
            System.out.println("Name: "+department);
            System.out.println("Name: "+calculateSalary());
            System.out.println("Name: "+calculateBonus());

        }
        @Override
        public double calculatePerformanceScore(){
            return hoursWorked*2.5;
        }
         @Override
        public String getPerformanceGrade(){
            double pscore=calculatePerformanceScore();
            if(pscore>80){
                return "A";
            }
            else if(pscore>60){
                return "B";
            }
            else{
                return "c";
            }
        }
         @Override
        public void displayPerformanceReport(){
            System.out.println("===Administrative Staff Payslip===");
            System.out.println("Name: "+name);
            System.out.println("Name: "+employeeID);
            System.out.println("Name: "+department);
            System.out.println("Name: "+calculatePerformanceScore());
            System.out.println("Name: "+getPerformanceGrade());

        }



}


class University{
    ArrayList<Payable> payableEmployees=new ArrayList<>();
    ArrayList<Evaluable> evaluableEmployees=new ArrayList<>();

    void displayAllEmployeesDetails(){
        for(Payable employee:payableEmployees){
            employee.displayPayslip();
            if(employee instanceof Evaluable){
                ((Evaluable)employee).displayPerformanceReport();
            }
        }
    }

    void addEmployee(Payable employee){
        payableEmployees.add(employee);
        /*if(employee instanceof Evaluable){
            evaluableEmployees.add((Evaluable)employee);
        }*/
    }

    /*double calculateTotal(){
        double totalPayroll=0;
        for(Payable employee:payableEmployees){
            totalPayroll+=employee.calculateSalary();
        }
        return totalPayroll;
    }*/

    void topPermers(){

    }

}

public class Main{
    public static void main(String[] args){
            University uni = new University();

            AcademicStaff ac1 = new AcademicStaff("Dr. John", "AC001", "CS", 5000, 1500, 25);
            AdministrativeStaff ad1 = new AdministrativeStaff("Mary", "AD001", "Finance", 25, 48, 25);

            uni.addEmployee(ac1);
            uni.addEmployee(ad1);

            uni.displayAllEmployeesDetails();
    }
}