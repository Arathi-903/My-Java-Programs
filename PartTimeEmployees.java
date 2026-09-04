package Arrays;

public class PartTimeEmployees extends Employee{
	public PartTimeEmployees( int id,
    String name,
    String type,
    double salary
    ) {
		super(id,name,"PartTime",salary);
	}
	@Override
	 void calculateSalary() {
		this.netsalary = this.salary+this.salary*5/100;
		System.out.println(this.netsalary);	
   }

}
