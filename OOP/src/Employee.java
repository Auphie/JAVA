
public class Employee {
	int empNo;
	String eName;
	
	Employee() {
		
	}
	
	Employee(int empNo, String eName) {
		this.empNo = empNo;
		this.eName = eName;
	}
	
	double paySalary() {
		return 0;
	}
	
	void display() {
		System.out.println("empNo = " + empNo);
		System.out.println("eName = " + eName);
		System.out.println("\n");
	}

}
