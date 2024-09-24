import java.util.*;

class BillDetails {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of pizza you brought: ");
		int pizzaCount = sc.nextInt();

		System.out.print("Enter Number of puff you brought: ");
		int puffCount = sc.nextInt();
			
		System.out.print("Enter Number of cold drinks you brought: ");
		int coldDrinkCount = sc.nextInt();

		int pizzaPrice = 100 * pizzaCount;
		int puffPrice = 20 * puffCount;
		int coldDrinkPrice = 10 * coldDrinkCount;

		
		System.out.println("\n!!!!!!!! BILL DETAILS !!!!!!!!\n");
		System.out.println("Number of pizza " + pizzaCount);
		System.out.println("Number of puff " + puffCount);
		System.out.println("Number of cold drink " + coldDrinkCount);

		int totalPrice = pizzaPrice + puffPrice + coldDrinkPrice;

		System.out.println("\nTotal Price = " + totalPrice);

		System.out.println("\nENJOY THE SHOW!!! :)");
	}
}
