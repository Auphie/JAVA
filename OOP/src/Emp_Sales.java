
public class Emp_Sales extends Emp_Permanent{
	double commission;

	Emp_Sales(int empNo, String eName, double salary, double commission) {
		super(empNo, eName,salary);
		this.commission = commission;
	}
	
	double paySalary() {
		return super.paySalary() + commission;
	}
	
}
