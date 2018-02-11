
public class Lv2Mgter extends Permanent{
	static final int lunchPayLV2 = 1800;
	static final int allowanceLV2 = 3000;

		public Lv2Mgter() {
		super();
	}

	public Lv2Mgter(String name, char sex, String arrival_Date, String phoneNumber, String address, int salary,
			int workingHour) {
		super(name, sex, arrival_Date, phoneNumber, address, salary, workingHour);
	}

	void display() {
		super.display();
		System.out.println("Job Title: First Manager");
		System.out.println("Lunch Allowance: " + lunchPayLV2);
		System.out.println("Supervisory Pay: " + allowanceLV2);
	}
	
	public double paySalary() {
		return super.paySalary() + lunchPayLV2 + allowanceLV2;
	}
}
