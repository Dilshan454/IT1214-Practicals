import java.util.Scanner;

public class BankApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your name to create a bank account: ");
        String name=sc.nextLine();

        BankAccount a=new BankAccount(name);

        a.displayAccountInfo();

        System.out.print("Enter an amount to deposit: ");
        double depositAmount = sc.nextDouble();
        a.deposit(depositAmount);

        // Demonstrate invalid deposit
        System.out.println("Attempting to deposit a negative amount (e.g., -500.00):");
        a.deposit(-500.00);

        sc.close();
    }
}