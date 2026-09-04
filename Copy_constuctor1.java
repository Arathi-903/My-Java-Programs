package constructors;

public class Copy_constuctor1 {
	String moviedirector;
	String hero;
	String heroine;
	String moviename;
	
	
	Copy_constuctor1(){
		
		System.out.println("no-arg constructor called!");
		
	}
	

	public Copy_constuctor1(String moviedirector) {
		this.moviedirector=moviedirector;
	}

public Copy_constuctor1(Copy_constuctor1 m, String hero) {
	this.moviedirector = m.moviedirector;
	this.hero = hero;
	}

public Copy_constuctor1(Copy_constuctor1 m, String heroine,String moviename) {
	this.moviedirector = m.moviedirector;
	this.hero = m.hero;
	this.heroine = heroine;
	this.moviename = moviename;
	}


public static void main(String[] args) {
		
		System.out.println("Main method started!!!");
		
		Copy_constuctor1 c = new Copy_constuctor1("vishwanath");
	   c.movirinfo();

	   
	   Copy_constuctor1 c2 = new Copy_constuctor1(c,"Meshbabu");
	   c2.movirinfo();
	   
	   Copy_constuctor1 c3 = new Copy_constuctor1(c2,"Sruthi","Srimanthudu");
	   c3.movirinfo();
	   
	}
	void movirinfo() {
		System.out.println("Enter moviedirectoe Name:"+moviedirector);
		System.out.println("Enter hero Name:"+hero);
		System.out.println("Enter heroine Name:"+heroine);
		System.out.println("Enter movie Name:"+moviename);
		System.out.println("****************************************************");
		
		
	}

}
