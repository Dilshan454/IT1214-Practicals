import java.util.*;
//class Staff(abstract)
abstract class Staff{
    String name;
    int StaffID;
    String department;

    Staff(String name,int StaffID,String department){
        this.name=name;
        this.StaffID=StaffID;
        this.department=department;
    }

    abstract double calculateSalary();

    void displayDetails(){
        System.out.println("Name :"+name);
        System.out.println("Staff ID :"+StaffID);
        System.out.println("department :"+department);


    }
}

class PermanentStaff extends Staff{
    double basicSalary;
    double allownce;

    PermanentStaff(String name,int StaffID,String department,double basicSalary,double allownce){
        super(name,StaffID,department);

        this.allownce=allownce;
        this.basicSalary=basicSalary;
    }

    double calculateSalary(){
        return basicSalary+allownce;
    }
}

class TemporyStaff extends Staff{
    double dailyWage;
    int workingDays;

    TemporyStaff(String name,int StaffID,String department,double dailyWage,int workingDays){
        super(name,StaffID,department);

        this.dailyWage=dailyWage;
        this.workingDays=workingDays;
    }

    double calculateSalary(){
        return dailyWage*workingDays;
    }
}

class University{
    ArrayList<Staff> staffList=new ArrayList<>();

    void addStaff(Staff s){
        staffList.add(s);
    }

    void displayAllSalaries(){
        for(Staff s:staffList){
            s.displayDetails();
            System.out.println("Total Salary: "+s.calculateSalary());
            System.out.println();
        }
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        University university=new University();

        for(int i=0;i<2;i++){
            System.out.println("Enter PermanentStaff "+(i+1));
            System.out.print("Name: ");
            String name=sc.nextLine();
             System.out.print("ID: ");
             int ID =sc.nextInt();
             System.out.print("department: ");
            String dep=sc.nextLine();
            System.out.print("Basic SAlary: ");
            double salary=sc.nextDouble();
             System.out.print("Allowance: ");
            double allowance=sc.nextDouble();
            sc.nextLine();

            university.addStaff(new PermanentStaff(name,ID,dep,salary,allowance));


        for(int i=0;i<2;i++){
            System.out.println("Enter PermanentStaff "+(i+1));
            System.out.print("Name: ");
            String name=sc.nextLine();
             System.out.print("ID: ");
             int ID =sc.nextInt();
             System.out.print("department: ");
            String dep=sc.nextLine();
            System.out.print("Daily Wage: ");
            double wage=sc.nextDouble();
             System.out.print("Working Days: ");
            double days=sc.nextDouble();
            sc.nextLine();

            university.addStaff(new TemporyStaff(name,ID,dep,wage,days));


            university.displayAllSalaries();


        }
    }
}