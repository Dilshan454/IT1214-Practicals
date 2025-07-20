import java.util.*;

abstract class Staff{
    String name;
    int staffId;
    String department;

    Staff(String name,int staffId,String department){
        this.name=name;
        this.staffId=staffId;
        this.department=department;
    }


    abstract double calculateSalary();

    void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("Staff ID: "+staffId);
        System.out.println("Department: "+department);
    }
}

class PermanentStaff extends Staff{
    double basicSalary;
    double allowance;

    PermanentStaff(String name,int staffId,String department,double basicSalary,double allowance){
        super(name,staffId,department);
        this.basicSalary=basicSalary;
        this.allowance=allowance;
    }

    double calculateSalary(){
        return basicSalary+allowance;
    }
}

class TemporyStaff extends Staff{
    double dailyWage;
    int workingDays;

    TemporyStaff(String name,int staffId,String department,double dailyWage,int workingDays){
        super(name,staffId,department);
        this.dailyWage=dailyWage;
        this.workingDays=workingDays;
    }

    double calculateSalary(){
        return dailyWage*workingDays;
    }
}

class University{
    ArrayList<Staff> staffList= new ArrayList<>();

    void addStaff(Staff s){
        staffList.add(s);
    }

    void displayAllSalaries(){
        for(Staff s:staffList){
            s.displayDetails();
            System.out.println("Salary: "+s.calculateSalary());
        }
    }
}

public class Main{
    public static void main(String[] args){
        University u=new University();
        Scanner sc=new Scanner(System.in);
        int choice;

        u.addStaff(new PermanentStaff("Nimal",1,"eng",25000,2000));
        u.addStaff(new PermanentStaff("kamal",2,"cs",35000,200));

        
        do{


        System.out.println("1.Add Permenant staff member\n2.enter Tempory Staff member\n3.view details and salaries\n4.exit");
        choice=sc.nextInt();
        sc.nextLine();

        
            switch(choice){
                case 1:
                    System.out.print("Name: ");
                    String name=sc.nextLine();
                    System.out.print("ID: ");
                    int ID =sc.nextInt();
                    sc.nextLine();
                    System.out.print("department: ");
                    String dep=sc.nextLine();
                    System.out.print("Basic SAlary: ");
                    double salary=sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Allowance: ");
                    double allowance=sc.nextDouble();
                    sc.nextLine();

                    u.addStaff(new PermanentStaff(name,ID,dep,salary,allowance));
                    break;
                case 2:
                    System.out.print("Name: ");
                    String namep=sc.nextLine();
                    System.out.print("ID: ");
                    int IDp =sc.nextInt();
                    sc.nextLine();
                    System.out.print("department: ");
                    String depp=sc.nextLine();
                    System.out.print("Daily Wage: ");
                    double wagep=sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Working Days: ");
                    int daysp=sc.nextInt();
                    sc.nextLine();

                    u.addStaff(new TemporyStaff(namep,IDp,depp,wagep,daysp));
                    break;
                case 3:
                    u.displayAllSalaries();
                    break;
                case 4: 
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("invalid option");
            }
        }while(choice!=4);

    }
}