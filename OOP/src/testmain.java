public class testmain {
	public static void main(String[] args) {
		Emp_Permanent p1 = (Emp_Permanent)new Employee(111, "Mike");
		System.out.println(p1.paySalary());
	}
}

