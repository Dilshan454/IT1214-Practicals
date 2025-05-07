class Student{
    String name="Bob";
    int marks=8;
    Student(){
        name="NoNmae";
    }

    Student(String n){
        name=n;
    }

    Student(String n,int m){
        name=n;
        marks=m;
    }
}

class StudentDemo{
    public static void main(String[] args){
        System.out.println("From StudentDemo class");
        System.out.println("Creating an object of Student Class");
        Student s1=new Student("Nice Name",85);
        System.out.println("Created an object of Student Class");
		System.out.println("Name value of the object is " +s1.name);
		System.out.println("Marks value of the object is " +s1.marks);
		s1.name="coc";
		s1.marks=9;
		
		System.out.println("Name value of the object is " +s1.name);
		System.out.println("Marks value of the object is " +s1.marks);

    }
}