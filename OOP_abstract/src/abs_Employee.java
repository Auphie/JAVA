
public abstract class abs_Employee {
	private int empNo;
	private String eName;
	static int empCount;
	
 // because private state in above, here needs to set getter & setter (encapsulation)	
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
	
	
	abs_Employee() {
		empCount++;
	//	System.out.print("From Father 1 Constructor");
	}
	
	abs_Employee(int empNo, String eName) {
		empCount++;
		this.empNo = empNo;
		this.eName = eName;
	//	System.out.print("From Father 2 Constructor");
	}
	
	void display() {
		System.out.println("empNo = " + empNo);
		System.out.println("eName = " + eName);
	}
}
