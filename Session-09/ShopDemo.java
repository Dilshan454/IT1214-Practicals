import java.util.Scanner;
class ShopDemo{
	
	static String description[]={"Bread","Milk Powder","Tooth Paste"};
	static int unitPrice[]={160,1060,260};
	
	static byte[] itemBasketIndex=new byte[3];
	static int[] itemBasketQuantity=new int[3];
	static int basketIndex=0;
	
	static void getItems(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the demo shop");
		
		System.out.println("Please Select Your Item by Entering the number");
		
		char userOption='y';
		
		do{
		
			for(int i=0;i<description.length;i++){
				System.out.println("Enter "+i+" for "+description[i]);
			}
			
			int itemIndex=sc.nextInt();

			if (itemIndex < 0 || itemIndex >= description.length) {
                System.out.println("Invalid item selected. Try again.");
                continue;
			
			System.out.println("You have chosen "+description[itemIndex]+" for Rs. "+unitPrice[itemIndex]);
			
			System.out.println("Enter the quantity");
			int numberOfUnits=sc.nextInt();
			
			itemBasketIndex[basketIndex]=(byte)itemIndex;
			itemBasketQuantity[basketIndex]=numberOfUnits;
			basketIndex++;

			if (basketIndex >= 3) {
                System.out.println("Basket is full. Proceeding to checkout.");
                break;
            }
			
			System.out.println("Enter y to continue,press any charcter to exit");
			
			
			userOption=sc.nextLine().charAt(0);
		}
		while(userOption=='y' && basketIndex<3);
	}
	
	static void showBasket(){
		System.out.println("No \t Item \t Unit Price \t Quantity \t Price");
		 int total = 0;
        for (int i = 0; i < basketIndex; i++) {
            int index = itemBasketIndex[i];
            int price = unitPrice[index] * itemBasketQuantity[i];
            total += price;
            System.out.printf("%d \t%-15s Rs.%-8d \t%-8d \tRs.%d\n", (i + 1), description[index], unitPrice[index], itemBasketQuantity[i], price);
        }
        System.out.println("\nTotal Amount: Rs." + total);
	}
	
	public static void main(String args[]){
		getItems();
		showBasket();
	}
	
	
}