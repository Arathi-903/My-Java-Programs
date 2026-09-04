package constructors;

public class FoodOrder {
	private int Orderid;
	private String customerName;
	private String resturentName;
	private String itemName;
	private String quantity;
	private long price;



	FoodOrder(int Orderid,String customerName,String resturentName,String itemName,String quantity,long price){
		this.Orderid=Orderid;
		this.customerName=customerName;
		this.resturentName=resturentName;
		this.itemName=itemName;
		this.quantity=quantity;
		this.price=price;
		
	}
	
	FoodOrder(){
		Orderid=102;
		customerName= "priyanka";
		resturentName="chickentadhaka";
		itemName = "biryani";
		quantity = "Good";
		price = 100;
		display();
		
		
		
	}
	

	public static void main(String[] args) {
		System.out.println("Main method startedd!");
		FoodOrder f1 = new FoodOrder(101,"Arathi","Goldentaj","chicken","Good",100);
		f1.display();
		
		
		
		
	}
	
	
	void display() {
		System.out.println("Enter your orderid:"+Orderid);
		System.out.println("Enter Customer Nme:"+customerName);
		System.out.println("Enter Restaruent Name:"+resturentName);
		System.out.println("Enter your order item name:"+itemName);
		System.out.println("Enter your order quantity:"+quantity);
		System.out.println("Enter your order price:"+price);
		
	}

}
