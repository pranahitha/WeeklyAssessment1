package material;

import stock.Inventory;

public class Laptops extends Inventory {
	int laptopUniqueId;
	String laptopName;
	
	public Laptops() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Laptops(int quantity) {
		// TODO Auto-generated constructor stub
		System.out.println("LAptop quantity : "+quantity);
	}

	

	public Laptops(int quantity, int UniqueId) {
		super(quantity);
		this.laptopUniqueId=UniqueId;
		System.out.println(" Accesories UniqueId is : "+laptopUniqueId);
		
	}

	public Laptops(int quantity, String LaptopName) {
		System.out.println("quantity: "+quantity+" Laptop name: "+LaptopName);
	}

	public static void main(String[] args) {
		Inventory laptop=new Laptops();
		laptop.lowOrderLevelQuantity=3;
		//System.out.println("the lowOrderLevelQuantity for Laptops is : "+laptop.lowOrderLevelQuantity);
		Inventory q1=new Laptops(67);
		Inventory q2=new Laptops();
		Inventory q3=new Laptops(56,"Dell");
		Inventory q4=new Laptops(87,"hp");
		Inventory q5=new Laptops(90,235);
	}
}
