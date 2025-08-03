import java.util.Scanner;

public class Question2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int totalpoints=0;
        String choice;


        do{
            System.out.println("Enter number ");
            int number=sc.nextInt();

            if(number<0||number>10){
                System.out.println("Invalid input");
            }
            else{
                int rnum=(int)(Math.random()*10);
                System.out.println(rnum);

                if(rnum==number){
                    System.out.println("Correct guess");
                    totalpoints++;
                }
                else{
                    System.out.println("Wrong guess");
                }    
            }
            System.out.println("Do you want to play again(y/n)?");
            choice=sc.next();
        }while(choice.equalsIgnoreCase("y"));

        System.out.println(totalpoints);
    }
}