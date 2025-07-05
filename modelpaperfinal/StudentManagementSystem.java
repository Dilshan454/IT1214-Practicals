import java.util.Scanner;

class Student{
    private int studentid;
    private String name;
    private int age;
    private int[] grades=new int[5];

    Student(int studentid,String name,int age,int[] grades){
        this.studentid=studentid;
        this.name=name;
        this.age=age;
        this.grades=grades;
    }

    public int getStudenid(){
        return studentid;
    }

    public double getAverageGrade(){
        int sum=0;
        for(int g:grades){
            sum+=g;
            
        }
        return sum/5.0;
    }

    public void displayInfo(){
        System.out.println("Student ID: "+studentid);
        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("Grades: ");
         for(int g:grades){
            System.out.print(g+" ");
         }
        System.out.println("Average: "+getAverageGrade()); 

    }

    
}

class StudentManger{
    private Student[] students=new Student[100];
    private int studentCount=0;

    public void addStudent(Student student){
        if(studentCount<students.length){
            students[studentCount++]=student;
            System.out.println("Student added sucsesfully.");
        }
    }
    public void displayStudents(){
        for(int i=0;i<=studentCount;i++){
            students[i].displayInfo();
        }
    }

    public void findStudent(int id){
        for(int i=0;i<studentCount;i++){
            if(students[i].getStudenid()==id){
                students[i].displayInfo();
                return;
            }
        }
        System.out.println("Student not found.");
    }


}

public class StudentManagementSystem{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        StudentManger s=new StudentManger();
        int choice;


        System.out.println("1. Add Student\n2. Display All Students \n3. Find Student by ID\n4. Display High Performers (Average > 75) \n5. Exit");
        choice=sc.nextInt();

        do{
            switch(choice){
                case 1:
                    int id,age;
                    String name;
                    int[] grades=new int[5];

                    System.out.print("Enter student ID: ");
                    id=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter student name: ");
                    name=sc.nextLine();

                    do{
                        System.out.print("Enter student age: ");
                        age=sc.nextInt();
                    }while(age<=0);

                    System.out.print("Enter grades for 5 subjects: ");
                    for(int i=0;i<5;i++){
                        grades[i]=sc.nextInt();
                        if(grades[i]<0||grades[i]>100){
                            System.out.println("invalid grade! ");
                            continue;
                        }
                    }

                    Student m=new Student(id,name,age,grades);
                    s.addStudent(m);
                    break;
                case 2:
                    s.displayStudents();
                    break;
                case 3:
                    System.out.print("Enetr id to search: ");
                    int search=sc.nextInt();
                    s.findStudent(search);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }while(choice!=5);
    }
}