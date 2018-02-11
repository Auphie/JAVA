
public class Staffs extends Permanent{
	
	public Staffs() {
	super();
	}

	public Staffs(String name, char sex, String arrival_Date, String phoneNumber, String address, int salary,
			int workingHour) {
		super(name, sex, arrival_Date, phoneNumber, address, salary, workingHour);
	}

	public double paySalary() {
		return super.paySalary();
	}
}