import java.util.*;

class GPA{

	float gradePoint(String grade){
		float gp=0;//grade point value
		
		/*if(grade=="A+" || grade=="A")
		{
			gp=4;
		}
		else if(grade=="A-")
		{
			gp=3.7f;
		}*/
		
		
		
		switch(grade){
			case"A+":
			gp=4;
			break;
			case"A":
			gp=4;
			break;
			case"A-":
			gp=3.7;
			break;
			case"B+":
			gp=3.3;
			break;
			case"B":
			gp=3;
			break;
			case"B-":
			gp=2.7;
			break;
			case"C+":
			gp=2.3;
			break;
			case"C":
			gp=2;
			break;
			case"C-":
			gp=1.7;
			break;}
			
			return gp;
	}
	
}

class Demo{
	
	public static void main(String[] args){
		String name,grade;
		float ogpa,point;
		
		Scanner sc=new Scanner(System.in);
		GPA g=new GPA();
		
		System.out.println("Enter your Name: ");
		name=sc.nextLine();
		System.out.println("Hi "+name);
		
		System.out.println("Enter the grade for IT1113: ");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		ogp=ogp+point*3;
		System.out.println("Grade point value of the grade "+grade+" is "+point);
	}
}