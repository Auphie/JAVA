
public class Employee {
	private int empNo;
	private String eName;
	
	public int getEmpno() {
		return empNo;
	}
	public void setEmpno(int empNo) {
		this.empNo = empNo;
	}
	public String getEname() {
		return eName;
	}
	public void setEname(String eName) {
		this.eName = eName;
	}
	
	Employee() {
		
	}
	
	Employee(int empNo, String eName) {
		this.empNo = empNo;
		this.eName = eName;
	}
	
	double paySalary() {
		return 0;
	}
 /* 	
 public abstract double paySalary();
	*/
	void display() {
		System.out.println("empNo = " + empNo);
		System.out.println("eName = " + eName);
		System.out.println("\n");
	}
}
