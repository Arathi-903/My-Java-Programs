package constructors;

public class This_of__constructor {
	int powerusingthings;
	String light;
	String fan;
	String laptop;
	String phone;
	private String fans;
	
	This_of__constructor(){
		System.out.println("no-arg constructor called!");
		this(5,"led");
	
	}
	

	public This_of__constructor(int powerusingthings, String light) {
		System.out.println("2-org constucted called");
		this(5,"led","3-fans");
		
		
	}
	
	


	public This_of__constructor(int powerusingthings, String light,String fans) {
		System.out.println("3-arg constructed called");
		this(5,"led","3-fans","lenovo");
	}


	public This_of__constructor( int powerusingthings, String light,String fans,String laptop) {
		System.out.println("4-arg constructed called");
		this(5,"led","3-fans","lenovo","vivo");
	}


	public This_of__constructor( int powerusingthings, String light,String fans,String laptop, String phone) {
		this.powerusingthings = powerusingthings;
		this.light = light;
		this.fans = fans;
		this.laptop = laptop;
		this.phone = phone;
		System.out.println("5-arg constorcter called!");
	}
	


	public static void main(String[] args) {
		This_of__constructor t1 = new This_of__constructor();
		t1.display();

	}
	
	
	void display() {
		System.out.println("Enter powerthings how many:"+powerusingthings);
		System.out.println("Enter light things :"+light);
		System.out.println("Enter fan name  :"+fan);
		System.out.println("Enter laptop name :"+laptop);
		System.out.println("Enter phone name:"+phone);


		
	}
	

}
