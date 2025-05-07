class Student{
    int marks;
    String name;

    Student(){
        System.out.println("Creating a Student object");
        name="Default name";
        marks=0;
    }

    Student(String n,int m){
        name=n;
        marks=m;
    }
}

class Printer{
    void print(String s){
        System.out.println(s);
    }
}

class App{
    public static void main(String[] args){

        Printer p=new Printer();
        p.print("Welcome to the Demo class App");

        Student s1=new Student();
        s1.marks=100;
        s1.name="Bob";

        p.print("The marks of "+s1.name+" is "+s1.marks);
		System.out.println();
		
		Student s2=new Student("asd",4);

		p.print("The marks of "+s2.name+" is "+s2.marks);
		
		
		Student s3=new Student();
		
		p.print("The marks of "+s3.name+" is "+s3.marks);

    }
}