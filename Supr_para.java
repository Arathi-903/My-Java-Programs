package constructors;

public class Supr_para {
	String flightName;
	String model;
	String colour;
	int flightNumber;

	Supr_para() {
		System.out.println("Supr_para constructor called!!");
	}

	public Supr_para(String flightName, String model, String colour, int flightNumber) {
		super();
		this.flightName = flightName;
		this.model = model;
		this.colour = colour;
		this.flightNumber = flightNumber;
	}

	public static void main(String[] args) {
		System.out.println("Main method started!");

	}
}

class Super2 extends Supr_para {

	Super2(String flightName, String model, String colour, int flightNumber) {
		super(flightName,model,colour,flightNumber);
		
		System.out.println("Supe2 constuctor called!!");
	}

	public static void main(String[] args) {
		System.out.println("Child Main Method");
		Super2 s2 = new Super2("Aghniastra", "x2-s", "white", 78);

		System.out.println("Enter flight name:" + s2.flightName);
		System.out.println("Enter flight model:" + s2.model);
		System.out.println("Enter flight colour:" + s2.colour);
		System.out.println("Enter flight Number:" + s2.flightNumber);

	}

}
