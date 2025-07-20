import java.util.Scanner;

public class Manipulation{
    public static void main(String[] args){
        //scanner object
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input=sc.nextLine();

        if(input.isEmpty()){
            System.out.println("empty String.");
        }else{
            String reverse="";
            for(int i=input.length()-1;i>=0;i--){
                reverse=reverse+input.charAt(i);
            }

            System.out.println("reverse input: "+reverse);
        }
        
    }
}


