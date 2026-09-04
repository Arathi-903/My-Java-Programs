package constructors;

public class coppy_constructor3 {

    String universityName;
    String location;
    String viceChancellor;
    int establishedYear;
    int totalStudents;
    int totalColleges;
    double ranking;

	public coppy_constructor3(String universityName) {
		System.out.println("copy constructor 1 called");
		this.universityName = universityName;
	}
	

	public coppy_constructor3(coppy_constructor3 c, String location) {
		this.universityName=c.universityName;
		this.location=location;
	}


	public coppy_constructor3(coppy_constructor3 c, String viceChancellor , int establishedYear) {
		this.universityName=c.universityName;
		this.location=c.location;
		this.viceChancellor = viceChancellor;
		this.establishedYear=establishedYear;
		
	}


	public coppy_constructor3(coppy_constructor3 c, int totalStudents , int  totalColleges) {
		
		
		this.universityName=c.universityName;
		this.location=c.location;
		this.viceChancellor = c.viceChancellor;
		this.establishedYear= c.establishedYear;
		this.totalStudents=totalStudents;
		this.totalColleges=totalColleges;		
	}

	public coppy_constructor3(coppy_constructor3 c, double  ranking ) {
		
		this.universityName=c.universityName;
		this.location=c.location;
		this.viceChancellor = c.viceChancellor;
		this.establishedYear= c.establishedYear;
		this.totalStudents=c.totalStudents;
		this.totalColleges=c.totalColleges;
		this.ranking=ranking;
		
	}


	
	public static void main(String[] args) {
		System.out.println("Main method started!!!");
		coppy_constructor3 c3 = new coppy_constructor3("Jantu");
		c3.display();
		
		coppy_constructor3 c4 = new coppy_constructor3(c3,"hyd");
		c4.display();
		coppy_constructor3 c5 = new coppy_constructor3(c4,"vishwanath",2008);
		c5.display();
		
		coppy_constructor3 c6 = new coppy_constructor3(c5,120,4);
		c6.display();
		
		coppy_constructor3 c7 = new coppy_constructor3(c5,4.5);
		c7.display();
		
	
	

	}
	
   void display() {
	   
	   System.out.println("Enter university Name:"+universityName);
	   System.out.println("Enter location :"+location);
	   System.out.println("Enter vicechancellor:"+viceChancellor);
	   System.out.println("Enter establishedYear:"+establishedYear);
	   System.out.println("Enter totalStudents:"+totalStudents);
	   System.out.println("Enter totalColleges:"+totalColleges);
	   System.out.println("Enter rankinge:"+ranking);
	   System.out.println("************************************************************");
	   
   }
	
	
	

}
