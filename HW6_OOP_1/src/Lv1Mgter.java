
public class Lv1Mgter extends Permanent{
	static final int lunchPayLV1 = 1800;
	static final int trafficPayLV1 = 2000;
	static final int allowanceLV1 = 5000;
		
	public Lv1Mgter() {
		super();
	}

	public Lv1Mgter(String name, char sex, String arrival_Date, String phoneNumber, String address, int salary,
			int workingHour) {
		super(name, sex, arrival_Date, phoneNumber, address, salary, workingHour);
	}

	void display() {
		super.display();
		System.out.println("Job Title: First Manager");
		System.out.println("Lunch Allowance: " + lunchPayLV1);
		System.out.println("Traffic Allowance: " + trafficPayLV1);
		System.out.println("Supervisory Pay: " + allowanceLV1);
		
	}
		
	public double paySalary() {
		return super.paySalary() + lunchPayLV1 + trafficPayLV1 + allowanceLV1;
	}

}
