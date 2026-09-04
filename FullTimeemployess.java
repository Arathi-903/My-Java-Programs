package Arrays;

public class FullTimeemployess  extends Employee {
	public FullTimeemployess(int id,
    String name,
    String type,
    double salary )  {
		super(id,name,"FullTime Employee",salary);
	}
		@Override
		 void calculateSalary() {
			this.netsalary = this.salary+this.salary*0.02+this.salary*0.01;
			System.out.println(this.netsalary);	
	    }
	

}
