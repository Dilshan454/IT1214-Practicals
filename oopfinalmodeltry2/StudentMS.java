import java.util.Scanner;

class Student{
    private int studentId;
    private String name;
    private int age;
    private int[] grades=new int[5];

    Student(int studentId,String name,int age,int[] grades){
        this.studentId=studentId;
        this.name=name;
        this.age=age;
        this.grades=grades;
    }

    public int getStudentId(){
        return studentId;
    }

    public double getAverage(){
        int sum=0;
        for(int g:grades){
            sum+=g;
        }
        return sum/5.0;
    }

    public void displayInfo(){
        System.out.println("Student ID: "+studentId);
        System.out.println("Student name: "+name);
        System.out.println("age: "+age);
        System.out.println("Grades: ");
        for(int g: grades){
            System.out.print(g+" ,");
        }
        System.out.println("Average: "+getAverage());
    }
}

class StudentManger{
    private Student[] students=new Student[100];
    private int studentCount;

    public void addStudent(Student student){
        if(studentCount<students.length){
            students[studentCount++]=student;
            System.out.println("Student added.");
        }
    }

    public void displayStudents(){
        for(int i=0;i<studentCount;i++){
            students[i].displayInfo();
        }
    }

    public void findStudent(int id){

    }
}

public class StudentMS{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int choice;

        System.out.println("1. Add Student \n2. Display All Students\n3. Find Student by ID\n4. Display High Performers (Average > 75) \n5. Exit");
        choice =sc.nesxt


    }
}