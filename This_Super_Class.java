package constructors;

public class This_Super_Class {
	String hotelName="brathinejan";
	String customerName="Arathi";
	int roomNumber=34;
	String city="hyd";

	public static void main(String[] args) {
		System.out.println("main method parent class called ");

	}

}

class Super_this_class extends This_Super_Class{

	String hotelName ;
	String customerName="Arunamarthand";
	int roomNumber = 106;
	String city;
	public static void main(String[] args) {
		System.out.println("main method child class called");
		Super_this_class s1 = new Super_this_class();
		
		s1.display();
	}
	
	
	void display() {
		System.out.println("Enter hotelName:"+super.hotelName);
		System.out.println("Enter CustomerName:"+this.customerName);
		System.out.println("Enter room number:"+this.roomNumber);
		System.out.println("Enter cityName:"+super.city);

	}
	
}
