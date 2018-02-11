public class Sales extends Permanent{
	double commission;

	Sales(int empNo, String eName, double salary, double commission) {
		super(empNo, eName,salary);
		this.commission = commission;
	}
	
	double paySalary() {
		return super.paySalary() + commission;
	}
	
}