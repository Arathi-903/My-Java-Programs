package constructors;

public class Parameterized {

	int id;
	String name;
	String Course;
	private String Car;
	private String modal;
	private String brand;
	private String Colour;
	private int millage;
	private String Animal;
	private String colour;
	private String bike;
	private String Book;
	private String Title;
	private String Author;
	private String Compony;
	private String mobile;
	private int price;
	private String Electronicdevice;
	private double ram;
	private String Librayname;
	private long bcount;
	private String Hotelname;
	private int rooms;
	private String FlightName;
	private long Flightnumber;
	private String Destination;
	private int pacengeers;

	Parameterized(int id, String name, String Course) {

		this.id = id;
		this.name = name;
		this.Course = Course;
	}

	Parameterized(String Car, String modal, String brand, String Colour, int millage) {
		this.Car = Car;
		this.modal = modal;
		this.brand = brand;
		this.Colour = Colour;
		this.millage = millage;
	}

	Parameterized(String Animal, String colour) {
		this.Animal = Animal;
		this.colour = colour;
	}

	Parameterized(String bike, String modal, String brand, String Colour) {

		this.bike = bike;
		this.modal = modal;
		this.brand = brand;
		this.Colour = Colour;

	}

	Parameterized(String Book, String Title, String Author) {
		this.Book = Book;
		this.Title = Title;
		this.Author = Author;

	}

	Parameterized(String mobile, String Compony,

			int price) {
		this.mobile = mobile;
		this.Compony = Compony;
		this.price = price;

	}

	Parameterized(String Electronicdevice, String brand, double ram) {

		this.Electronicdevice = Electronicdevice;
		this.brand = brand;
		this.ram = ram;

	}
	
	Parameterized(String Librayname,  long bcount) {

		this.Librayname = Librayname;
		this.bcount = bcount;

	}
	
	Parameterized(String Hotelname,int rooms){
		this.Hotelname=Hotelname;
		this.rooms=rooms;
	}

	
	Parameterized(String FlightName, long Flightnumber, String Destination,int pacengeers){
		this.FlightName=FlightName;
		this.Flightnumber=Flightnumber;
		this.Destination=Destination;
		this.pacengeers=pacengeers;
	}

	// Parameterized constructor constructor
	public static void main(String[] args) {

		System.out.println("Main method started!");
		Parameterized p1 = new Parameterized(302, "Arathi", "Java full stack");
		p1.Studentdetails();

		Parameterized p2 = new Parameterized("Scorpehoo", "3d", "higinic", "White", 20);
		p2.display();

		Parameterized p3 = new Parameterized("Picock", "Green");
		p3.Show();

		Parameterized p4 = new Parameterized("Hero", "Esl", "Tvs", "Red");
		p4.hello();

		Parameterized p5 = new Parameterized("Automic habit ", "Self-help book on habit information", "James Clear");

		p5.books();

		Parameterized p6 = new Parameterized("Smart Phone", "vivo", 10000);

		p6.mobile();

		Parameterized p7 = new Parameterized("Laptop", "Dell", 16.5);

		p7.Laptop();
		
		
		Parameterized p8 = new Parameterized("APJ Abudulkalam", 100000);
		p8.Library();
		Parameterized p9 = new Parameterized("Amma means", 100);
		p9.Hotel();
		Parameterized p10 = new Parameterized("Vandhebarath",22410407,"Singpur",100 );
		p10.flight();

		
	}

	void Studentdetails() {
		System.out.println("Enter id:" + id);
		System.out.println("Enter name:" + name);
		System.out.println("Enter course name:" + Course);

	}

	void display() {
		System.out.println("Enter Car:" + Car);
		System.out.println("Enter Car modal:" + modal);
		System.out.println("Enter Car brand:" + brand);
		System.out.println("Enter Car colour:" + millage);
	}

	void Show() {
		System.out.println("Enter Animal Name:" + Animal);
		System.out.println("Enter Animal Colour Name:" + colour);

	}

	void hello() {

		System.out.println("Enter bike name:" + bike);
		System.out.println("Enter modal name:" + modal);
		System.out.println("Enter brand name:" + brand);
		System.out.println("Enter colour name:" + colour);

	}

	void books() {
		System.out.println("Enter Book Name:" + Book);
		System.out.println("Enter Title Name:" + Title);
		System.out.println("Enter Author Name:" + Author);

	}

	void mobile() {
		System.out.println("Enter mobile type:" + mobile);
		System.out.println("Enter Mobile compony name:" + Compony);
		System.out.println("Enter mobile price:" + price);
	}

	void Laptop() {
		System.out.println("Enter What is electronic device:" + Electronicdevice);
		System.out.println("Enter brand name:" + brand);
		System.out.println("Enter What is your laptopp ram:" + ram);
	}

	void Library() {
		System.out.println("Enter libery name: "+Librayname);
		System.out.println("Enter Books count:"+bcount);
		
		
	}
	
	
	void Hotel() {
		System.out.println("Enter Hotel name: "+Hotelname);
		System.out.println("Enter room numbers:"+rooms);
		
	}
	

	void flight() {
		System.out.println("Enter flight name: "+FlightName);
		System.out.println("Enter flight numbers:"+Flightnumber);
		System.out.println("Enter flight Destination:"+Destination);
		System.out.println("Enter flight pacengeers numbers:"+pacengeers);
	

}
	
	
}