interface Payable{
    double calculateSalary();
}

abstract class Employee implements Payable{
    private String name;
    private int id;

    Employee(String name,int id){
        this.name=name;
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
}

class FullTimeEmployee extends Employee{
    private double salary;

    FullTimeEmployee(String name,int id,double salary){
        super(name,id);
        this.salary=salary;
    }

    @Override
    public double calculateSalary(){
        return salary;
    }
}

class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    PartTimeEmployee(String name,int id,double hourlyRate,int hoursWorked){
        super(name,id);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    @Override
    public double calculateSalary(){
        return hourlyRate*hoursWorked;
    }
}
public class Main{
    public static void main(String[] args){
        Employee fullTimeEmployee=new FullTimeEmployee("john f",1,50000);
        Employee partTimeEmployee=new PartTimeEmployee("Jane d",2,20,40);

        System.out.println("Full time employee salary: "+fullTimeEmployee.calculateSalary());
        System.out.println("Part time employee salary: "+partTimeEmployee.calculateSalary());

    }
}