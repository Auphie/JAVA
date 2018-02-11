
public class abs_Temporary extends abs_Employee {

	private double hourPay;
	private int workHour;
		
	public double getHourPay() {
		return hourPay;
	}

	public void setHourPay(double hourPay) {
		this.hourPay = hourPay;
	}

	public int getWorkHour() {
		return workHour;
	}

	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}

	abs_Temporary(int empNo, String eName, double hourPay, int workHour) {
		super(empNo, eName);
		this.hourPay = hourPay;
		this.workHour = workHour;
	}
	
	abs_Temporary() {
		
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