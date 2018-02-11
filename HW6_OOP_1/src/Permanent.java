
abstract class Permanent extends Employee{
	private int salary;
	private int workingHour;
	double overtimePay;
	static int stdHour = 168;
	
	Permanent() {
		if(workingHour > Permanent.stdHour)
			overtimePay = salary/240*1.5*(workingHour - Permanent.stdHour);	
	}
	
	Permanent(String name, char sex, String arrival_Date, String phoneNumber, String address,
				int salary, int workingHour) {
		super(name, sex, arrival_Date, phoneNumber, address);
		this.salary = salary;
		this.workingHour = workingHour;
		if(workingHour > Permanent.stdHour)
			overtimePay = salary/240*1.5*(workingHour - Permanent.stdHour);		
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getWorkingHour() {
		return workingHour;
	}

	public void setWorkingHour(int workingHour) {
		this.workingHour = workingHour;
	}
	
	void display() {
		super.display();
		System.out.println("Working Hours this month: " + workingHour + " Hours");
		System.out.println("Overtime Hours this month: " + (workingHour-stdHour) + " Hours");
	}
	
	double paySalary() {
		return salary + overtimePay;
	};
	
}
