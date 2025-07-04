import java.util.Scanner;

public class Manipulation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter  srring:");
        String input=sc.nextLine();

        String[] words=input.split(" ");

        for(String word:words){
            System.out.print(reverseWord(word)+" ");
        }
    }

    public static String reverseWord(String word){
         String reversed = "";  // use a plain string

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);  // concatenate each character
        }

        return reversed;
    }

}