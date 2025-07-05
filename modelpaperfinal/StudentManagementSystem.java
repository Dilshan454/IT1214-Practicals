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
            return sum/5.0;
        }
    }

    public void displayInfo(){
        System.out.println("Student ID: "+studentid);
        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("Grades: ");
         for(int g:grades){
            System.out.print(g+" ");
         }
        System.out.println("Average: "+getAverageGrade); 

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


}

public class StudentManagementSystem{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        StudentManger s=new StudentManger();
        int choice;


        System.out.println()
    }
}