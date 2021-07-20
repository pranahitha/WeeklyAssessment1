package stock;

public class Inventory {
	int quantity;
	public int lowOrderLevelQuantity;
	
	public Inventory() {
		this.lowOrderLevelQuantity=234;
	}
	public Inventory(int quantity)
	{
		this.quantity=quantity;
		System.out.println("Quantity of Inventory class is :" +quantity);
		
	}

	
}
