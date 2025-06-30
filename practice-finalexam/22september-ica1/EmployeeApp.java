import java.util.*;

class Employee{
    private String employeeID;
    private String name;
    private char sex;
    private double salary;
    private int age;

    Employee(String employeeID,String name,char sex,double salary,int age){
        this.employeeID=employeeID;
        this.name=name;
        this.sex=sex;
        this.salary=salary;
        this.age=age;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }
    public void setAge(int age){
        this.age=age;
    }


    public String getEmployeeID(){
        return employeeID;
    }
    public String getName(){
        return name;
    }
    public char getSex(){
        return sex;
    }
    public double getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }

    public void displayDetails(){
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Name: "+name);
        System.out.println("Sex: "+sex);
        System.out.println("Salary: "+salary);
        System.out.println("Age: "+age);
    }
}

public class EmployeeApp{
    public static void main(String[] args){
        ArrayList<Employee> employees=new ArrayList<>();

        employees.add(new Employee("E001","D.M.Kumara",'M',80000,25));
        employees.add(new Employee("E002","N.M.Bandara",'M',100000,27));
        employees.add(new Employee("E003","J.L.Ameer",'M',120000,28));
        employees.add(new Employee("E004","K.Barathy",'F',90000,26));
        employees.add(new Employee("E005","H.L.Kumari",'F',85000,24));

        System.out.println("Details of all Employees: ");
        for(Employee e:employees){
            e.displayDetails();
        }

        //Change the salary of D.M.Kumara as 150000
        for(Employee e:employees){
            if(e.getName().equals("D.M.Kumara")){
                e.setSalary(150000);
            }
        }

        //details of employee who gets maximum salary.
        Employee maxSalary=employees.get(0);
        for(Employee e:employees){
            if(e.getSalary()>maxSalary.getSalary()){
                maxSalary=e;
            }
        }
        System.out.println("Employee with max Salary: ");
        maxSalary.displayDetails();

        //Change the age of J.L.Ameer as 22. 
        for(Employee e:employees){
            if(e.getName().equals("J.L.Ameer")){
                e.setAge(22);
            }
        }

        //display the details of youngest employee. 
        Employee youngest=employees.get(0);
        for(Employee e:employees){
            if(e.getAge()<youngest.getAge()){
                youngest=e;
            }
        }
        System.out.println("youngest employee: ");
        youngest.displayDetails();

        // details of female employees. 
        for(Employee e:employees){
            if(e.getSex()=='F'){
                e.displayDetails();
            }
        }
    }
}