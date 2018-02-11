public class Permanent extends Employee{
	private double salary;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	Permanent(int empNo, String eName, double salary) {
		super(empNo, eName);
		this.salary = salary;
	}
	
	Permanent()	{
	}


	
	double paySalary() {
		return salary;
	}
}