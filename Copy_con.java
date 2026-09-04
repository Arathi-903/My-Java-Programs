package constructors;

public class Copy_con {
	String flightName;
	String versionmodel;
	String colour;
	long  flightnumber;
	


	public Copy_con(String flightName) {
		System.out.println("Copy constructor1 called");
		this.flightName = flightName;
	}

	public Copy_con(Copy_con c1, String versionmodel) {
		System.out.println("Copy constructor 2 called");
		this.flightName = c1.flightName;
		this. versionmodel= versionmodel;
	}
	


	public Copy_con(Copy_con c2, String colour,long  flightnumber) {
		System.out.println("Copy_constructor 3 is called");
		
		this.flightName = c2.flightName;
		this. versionmodel= c2.versionmodel;
		this.colour = colour;
		this. flightnumber =  flightnumber;
	}
	

	public static void main(String[] args) {
		System.out.println("Main method started");
		Copy_con c1 = new Copy_con("AghniAstra");
		c1.display();
		
		Copy_con c2 = new Copy_con(c1,"x2-sl1");
		c2.display();
		
		Copy_con c3 = new Copy_con(c2,"white",22223334);
		c3.display();
		
		

	}
	
	void display() {
		System.out.println("Enter flight name:"+flightName);
		System.out.println("Enter flight model:"+versionmodel);
		System.out.println("Enter flight colour:"+colour);
		System.out.println("Enter flight number:"+flightnumber);
		System.out.println("**************************************************************");
		
		
	}
	

}
