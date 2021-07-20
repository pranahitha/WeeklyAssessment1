package material;

import stock.Inventory;

public class Accesories extends Inventory{
	
	int accesoriesUniqueId;
	String accesoriesName;
	
	public Accesories() {
		super();
	}

	public Accesories(int quantity) {
		
		System.out.println("Accesories Quantity is "+quantity);
	}
	public Accesories(int quantity,int UniqueId)
	{
		super(quantity);
		this.accesoriesUniqueId=UniqueId;
		System.out.println(" Accesories UniqueId is : "+UniqueId);
	}

	
	public Accesories(int quantity, String accesoriesName) {
		System.out.println("quantity: "+quantity+" Accesory name: "+accesoriesName);
		
	}	

	public static void main(String[] args) {
		Inventory acc=new Accesories();
		acc.lowOrderLevelQuantity=5;
		//System.out.println("the lowOrderLevelQuantity for Accesories is : "+acc.lowOrderLevelQuantity);
		Inventory q1=new Accesories(67);
		Inventory q2=new Accesories(7);
		Inventory q3=new Accesories(56,567);
		Inventory q4=new Accesories(87);
		Inventory q5=new Accesories(90,235);
		Inventory q6=new Accesories(48,"Ipod");
		Inventory q7=new Accesories(69);
		Inventory q8=new Accesories(01,9786);
		Inventory q9=new Accesories(67,"Headphones");
		Inventory q10=new Accesories();
		
	}

}
