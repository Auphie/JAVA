
public class Emp_Temporary extends Employee {

	double hourPay;
	int workHour;
	
	Emp_Temporary(int empNo, String eName, double hourPay, int workHour) {
		super(empNo, eName);
		this.hourPay = hourPay;
		this.workHour = workHour;
	}
	
	Emp_Temporary() {
		
	}

	double paySalary() {
		return hourPay * workHour;
	}
	
	
	void display() {
		super.display();
		System.out.println("hourPay = " + hourPay);
		System.out.println("workHour = " + workHour);
	}

}
