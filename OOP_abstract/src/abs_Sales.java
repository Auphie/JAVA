public class abs_Sales extends abs_Permanent{
	double commission;

	abs_Sales(int empNo, String eName, double salary, double commission) {
		super(empNo, eName,salary);
		this.commission = commission;
		}
	void display() {
		super.display();
		System.out.println("Commission = " + commission);
		System.out.println("\n");
		}
}
	