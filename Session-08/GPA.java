import java.util.*;

class GPA{

	float gradePoint(String grade){
		float gp=0;//grade point value
		
		
		switch(grade){
			case "A+":
				gp=4;
				break;
			case "A":
				gp=4;
				break;
			case "A-":
				gp=3.7f;
				break;
			case "B+":
				gp=3.3f;
				break;
			case "B":
				gp=3;
				break;
			case "B-":
				gp=2.7f;
				break;
			case "C+":
				gp=2.3f;
				break;
			case "C":
				gp=2;
				break;
			case "C-":
				gp=1.7f;
				break;
			case "D+":
				gp=1.3f;
				break;
			case "D":
				gp=1;
				break;
				
			default:
				gp=0;
				break;
			}
			
			return gp;
	}
	
}

class Demo{
	static  Scanner sc=new Scanner(System.in);
	static GPA g=new GPA();
	static String subjects[]={"IT1113","IT1122","IT1134","IT1144","IT1152"};
	static int credits[]={3,2,4,4,2};
	
	static String[] grades=new String[5];
	static float[] gps=new float[5];
	
	static float getPoint(String subjectCode,int credit,int index){
		System.out.print("Enter the Grade for "+subjectCode+": ");
		grades[index]=sc.nextLine();
		System.out.println("Grade point value of the grade "+grades[index]+" is "+g.gradePoint(grades[index]));
		System.out.println("Overall Grade point is "+g.gradePoint(grades[index])*credit);
		return g.gradePoint(grades[index])*credit;
		
	

	}
	
	
	public static void main(String[] args){
		String name/*,grade*/;
		float ogp=0/*,point=0*/;
		
		/*Scanner sc=new Scanner(System.in);
		GPA g=new GPA();*/
		
		System.out.println("Enter your Name: ");
		name=sc.nextLine();
		System.out.println("Hi "+name);
		
		for(int i=0;i<5;i++){
			ogp+=getPoint(subjects[i],credits[i],i);
		}
		
		
		
		/*System.out.println("Enter the grade for IT1113: ");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		ogp+=point*3;
		System.out.println("Grade point value of the grade "+grade+" is "+point);
		System.out.println("Overall Grade point is "+ogp);
		
		System.out.println("Enter the grade for IT1122: ");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		ogp+=point*2;
		System.out.println("Grade point value of the grade "+grade+" is "+point);
		System.out.println("Overall Grade point is "+ogp);*/
		
		/*ogp+=getPoint("IT1113",3);//read the Grade of IT1113,Get the Point value,return the point*credit.
		ogp+=getPoint("IT1122",2);
		ogp+=getPoint("IT1134",4);
		ogp+=getPoint("IT1144",4);
		ogp+=getPoint("IT1152",2);*/
		
		System.out.println("Final GPA is for current semester is : "+ogp/15);
	
		for(int i=0;i<5;i++){
			System.out.println("Subject "+subjects[i]+" Credit "+credits[i]+" Grade "+grades[i]+" Grade Point "+gps[i]);
		}
	
	}
}