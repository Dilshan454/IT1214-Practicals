
class Item{
    private String description, name;
	private double unitPrice;
	private int quantityAvailable;

}


public class Database{
    static void displayMenu(){
        System.out.println("------ Inventory Management ------");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. Update Item Quantity");
        System.out.println("4. List all items");
        System.out.println("5. Add Customer");
        System.out.println("6. List all Customers");
        System.out.println("7. Search Item by Name");
        System.out.println("0. Exit");
        System.out.println("--------------------------------- ");
        System.out.println("Choose an Option");
    }



    public static void main(String [] arg){
        
            displayMenu();
        
    }
}