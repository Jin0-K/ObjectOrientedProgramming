import java.util.Scanner;

class Goods {
	private String name;
	private int price;
	private int numOfStock;
	private int sold;
	
	Goods(String name, int price, int numOfStock) {
		this.name = name;
		this.price = price;
		this.numOfStock = numOfStock;
		this.sold = 0;
	}
	Goods(String name, int price, int numOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numOfStock = numOfStock;
		this.sold = sold;
	}
	
	// Return value of the field
	String getName() {
		return name;
	}
	int getPrice() {
		return price;
	}
	int getNumOfStock() {
		return numOfStock;
	}
	int getSold() {
		return sold;
	}
	
	// Sell the goods
	int sell() {
		if (sold < numOfStock) {
			return price * ++sold;
		}
		// when the goods is out of stock
		else {
			return -1;
		}
	}
	// Purchase the goods
	int buy(int num) {
		numOfStock += num;
		return numOfStock;
	}
	// Update the number of stock when the payment is done
	void updateStock() {
		numOfStock -= sold;
		sold = 0;
	}
}

class MarketManager {
	private int max_goods_num = 10;
	int goods_num;
	Goods[] goodsArray = new Goods[max_goods_num];
	
	// Set the number of goods
	void setGoodsNum(Scanner scan) {
		System.out.print("How many type of goods will the market have? ");
		goods_num = scan.nextInt();
		while (goods_num < 1) {
			System.out.println("At least one goods should be in the market.");
			goods_num = scan.nextInt();
		}
		while (goods_num > max_goods_num) {
			System.out.println("The maximum number of the type of goods is 10");
			goods_num = scan.nextInt();
		}
	}
	// Put data of goods in goodsArray
	void registerGoods(Scanner scan) {
		System.out.println("Please enter the information of the goods");
		for (int i = 0; i < goods_num; i++) {
			System.out.printf("Goods %d (name, price, the number of stock): ", i+1);
			String name = scan.next();
			int price = scan.nextInt();
			int n = scan.nextInt();
			goodsArray[i] = new Goods(name, price, n);
		}
	}
	// Choose options
	int option(Scanner scan) {
		System.out.println("Choose an option");
		System.out.println("1) Sale   2) Purchase  3) Show Inventory   4)End");
		int choice = scan.nextInt();
		while ((choice < 0) || (choice > 5)) {
			System.out.print("Choose between the number above: ");
			choice = scan.nextInt();
		}
		return choice;
	}
	// return the money paid
	int paidMoney(Scanner scan) {
		System.out.print("Enter the paid money >>> ");
		int money = scan.nextInt();
		while (money < 0) {
			System.out.println("Error: Wrong input");
			System.out.print("Enter the paid money >>> ");
			money = scan.nextInt();
		}
		return money;
	}
	// Print the receipt
	void printReceipt(int total_cost, int cash, int change) {
		System.out.println();
		System.out.println("### Receipt ###");
		System.out.println("===================================");
		for (int i = 0; i < goods_num; i++) {
			if (goodsArray[i].getSold() > 0) {
				System.out.print(goodsArray[i].getName() + "     ");
				System.out.print(goodsArray[i].getPrice() + "x" + goodsArray[i].getSold() + "     ");
				System.out.print(goodsArray[i].getPrice() * goodsArray[i].getSold() + "\n");
			}
		}
		System.out.println("===================================");
		System.out.println("Total cost\t" + total_cost);
		System.out.println("Cash\t\t" + cash);
		System.out.println("===================================");
		System.out.println("Change\t" + change + "\n");
	}
	// Check the goods out and return the change
	void checkOut(Scanner scan) {
		int total_cost = 0;
		
		while(true) {
			// Print the list of the goods
			for (int i = 0; i < goods_num; i++) {
				System.out.print(i+1 + ") ");
				System.out.print(goodsArray[i].getName() + "   ");
			}
			System.out.print(goods_num+1 + ") Check\n");
			
			// Scan the goods or check out
			System.out.print(">>> ");
			int goods = scan.nextInt() - 1;
			
			// Count the goods that will be sold
			if ((goods < goods_num) && (goods >= 0)) {
				int price =	goodsArray[goods].sell();
				if (price < 0) {
					System.out.println("Error: Out of stock");
				}
				else {
					total_cost += price;
				}
			}
			//Check out
			else if (goods == goods_num) {
				break;
			}
			else {
				System.out.println("Error: Wrong input");
			}
		}
		System.out.println("Total Cost: " + total_cost);
		int cash = paidMoney(scan);
		printReceipt(total_cost, cash, cash - total_cost);
		
		for (int i = 0; i < goods_num; i++) {
			goodsArray[i].updateStock();
		}
	}
	// Print the number of stock of every goods
	void printNumOfStock() {
		System.out.println("\n###\tNAME\tSTOCK\t###");
		System.out.println("===================================");
		for (int i = 0; i < goods_num; i++) {
			System.out.println("\t" + goodsArray[i].getName() + "\t" + goodsArray[i].getNumOfStock());
		}
		System.out.println("===================================\n");
	}
	// Restock the goods
	void buyStock(Scanner scan) {
		while(true) {
			// Print the list of the goods
			System.out.println("Select the goods to restock");
			for (int i = 0; i < goods_num; i++) {
				System.out.print(i+1 + ") ");
				System.out.print(goodsArray[i].getName() + "   ");
			}
			System.out.print(goods_num+1 + ") End purchase\n");
			// Choose the goods that will be restocked
			System.out.print(">>> ");
			int goods = scan.nextInt() - 1;
			
			if (goods == goods_num) {
				break;
			}
			else if ((goods < 0) || (goods > goods_num)){
				System.out.println("Error: Wrong input");
				continue;
			}
			else {
				System.out.print("Enter how many stock will be purchased");
				System.out.print(">>> ");
				int purchase_num = scan.nextInt();
				while(purchase_num < 0) {
					System.out.println("Error: Wrong input");
					System.out.print("Please Enter the positive number >>> ");
					purchase_num = scan.nextInt();
				}
				
				goodsArray[goods].buy(purchase_num);
				System.out.print("## The number of stock of '" + goodsArray[goods].getName() + "' ");
				System.out.println("is now " + goodsArray[goods].getNumOfStock());
			}
		}
		printNumOfStock();
	}
}

public class GoodsArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MarketManager manager = new MarketManager();
		
		manager.setGoodsNum(scan);
		manager.registerGoods(scan);
		
		boolean quit = false;
		while(!quit) {
			int opt = manager.option(scan);
			
			switch(opt) {
			case 1 :
				manager.checkOut(scan);
				break;
			case 2 :
				manager.buyStock(scan);
				break;
			case 3 :
				manager.printNumOfStock();
				break;
			case 4 :
				quit = true;
				break;
			default :
				System.out.println("Error: Wrong input");
			}
		}
		System.out.println("End the Program");
	}

}
