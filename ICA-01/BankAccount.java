public class BankAccount{
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder){
        this.accountHolder=accountHolder;
        this.balance=1000.00;//Default Balance
    }

     public String getAccountHolder() {
        return accountHolder;
    }

     public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo(){
        System.out.println("Account Holder: "+accountHolder+", Balance: Rs."+balance);
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited "+amount+ ". Updated balance "+balance);
        }
        else{
            System.out.println("Error: Invalid deposit amount. Please enter a positive value.");
        }
    }
}