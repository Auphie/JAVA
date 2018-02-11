
public class abs_Permanent extends abs_Employee{
	private double salary;
	
 // because private state in Employee, here needs to set getter & setter (encapsulation)	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

 // Constructor	
	abs_Permanent(int empNo, String eName, double salary) {
		super(empNo, eName);
		this.salary = salary;
	}
	
	abs_Permanent()	{
	}
 //
	
	void display() {
		super.display();	//p.114
		System.out.println("Salary = " + salary);
	}
}
