package stock;

public class Order extends Inventory{
	int orderedQuantity;
	public Order(int orderQuantity) {
		this.orderedQuantity=orderQuantity;
	}
	public void customerPlaceOrders()
	{
		if(orderedQuantity == lowOrderLevelQuantity)
		{
			System.out.println("Invoice is generated");
		}
		else if(orderedQuantity<lowOrderLevelQuantity)
		{
			System.out.println("Request For Material(RFM) must be  generated");
		}
		
	}

	public static void main(String[] args) {
		Order o1=new Order(34);
		o1.customerPlaceOrders();
		Order o2=new Order(234);
		o2.customerPlaceOrders();
		
	}
}
