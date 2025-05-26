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
			
			System.out.println("You have chosen "+description[itemIndex]);
			System.out.println("You have chosen "+description[itemIndex]+" is "+unitPrice[itemIndex]);
			
			System.out.println("Enter the quantity");
			int numberOfUnits=sc.nextInt();
			
			itemBasketIndex[basketIndex]=(byte)itemIndex;
			itemBasketQuantity[basketIndex]=numberOfUnits;
			basketIndex++;
			
			System.out.println("Enter y to continue,press any charcter to exit");
			
			Scanner sc1=new Scanner(System.in);
			userOption=sc1.nextLine().charAt(0);
		}
		while(userOption=='y' && basketIndex<3);
	}
	
	static void showBasket(){
		System.out.println("No \t Item \t Unit Price \t Quantity \t Price");
		for(int i=0;i<basketIndex;i++){
			System.out.println(i+1+" \t "+description[i]+" \t "+unitPrice[itemBasketIndex[i]]+" \t\t "+itemBasketQuantity[i]+" \t ");
		}
	}
	
	public static void main(String args[]){
		getItems();
		showBasket();
	}
	
	
}