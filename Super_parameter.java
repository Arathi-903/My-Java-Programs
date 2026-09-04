package constructors;

//parent class constructor using super

public class Super_parameter {
	String MovieName;
	String heroName;
	String heroine;
	String Song;
	int movieNumber;
	
	Super_parameter(){
		System.out.println("no-arg constructor called");
	}
	public Super_parameter(String movieName, String heroName, String heroine, String song, int movieNumber) {
		super();
		this.MovieName = movieName;
		this.heroName = heroName;
		this.heroine = heroine;
		this.Song = Song;
		this.movieNumber = movieNumber;
	}

	public static void main(String[] args) {
		System.out.println("Super parametarized one constructor called!");

	}
	
}

//Child class constructor using super 

class Super_parameter2 extends Super_parameter {
	
	 Super_parameter2(String movieName, String heroName, String heroine, String song, int movieNumber){ 
		 super(movieName,heroName,heroine,song,movieNumber);
		 System.out.println("Super_parameter2 constructed called!");
	 }
	

	public static void main(String[] args) {
		System.out.println("Super 2 parametarized two constructor called!");
		 Super_parameter2  sp = new  Super_parameter2 ("Maharshi","Mahi","pooja","idhenuani nenu ani",2256782);
		 	 
		System.out.println("Enter Movie Name:"+sp.MovieName);
		System.out.println("Enter Hero Name:"+sp.heroName);
		System.out.println("Enter Heroine Name:"+sp.heroine);
		System.out.println("Enter Song Name:"+sp.Song);
		System.out.println("Enter Movie number:"+sp.movieNumber);
			
		
		

	}		
	
}

