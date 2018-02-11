
public class pg102_Constructor {
	int empNo;
	String eName;
	
	pg102_Constructor() {
		// 由e1, e3來參照
	}
	
	pg102_Constructor(int a, String b) {
		// 由e2來參照
		empNo = a;
		eName = b;
	}
	
	void display() {
		System.out.println("empNo = " + empNo);
		System.out.println("eName = " + eName);
		System.out.println("\n");
	}	
	
	public static void main(String[] args) {
		pg102_Constructor e1 = new pg102_Constructor();
		e1.empNo = 111;
		e1.eName = "Tom";
		pg102_Constructor e2 = new pg102_Constructor(112,"Sam");
		pg102_Constructor e3 = new pg102_Constructor();
		e3.empNo = 113;
		e3.eName = "Dus";
		e1.display();
		e2.display();
		e3.display();
	}

}
