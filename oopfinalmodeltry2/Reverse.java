import java.util.Scanner;

public class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Snter String: ");
        String input=sc.nextLine();

        char[] a=input.toCharArray();
        for(int i=input.length()-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
}