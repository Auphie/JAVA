
public class Employee_main {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.empNo = 111;
		e1.eName = "Tom";
		Employee e3 = new Employee(113,"Dus");
		
		//e1.display();
		//e3.display();
		
		Emp_Permanent p = new Emp_Permanent();
		p.empNo = 201;
		p.eName = "John";
		p.salary = 45600;
		//p.display();

		Emp_Temporary t = new Emp_Temporary(301,"Mary", 200, 12);
		t.empNo = 301;
		t.eName = "Mary";
		t.hourPay = 200;
		t.workHour = 12;
		t.display();
		
	//  Polymorphism. p.119
	//	建立e(父類別)，給3個值的array(就是3個人)
		Employee[] e = new Employee[3];
	//  將父親 e 的reference指向子類別的instance
		e[0] = new Emp_Permanent(111,"Tom",40000);
		e[1] = new Emp_Temporary(222, "Ain", 200, 60);
		e[2] = new Emp_Sales(333,"Pete",20000, 15000);
		for(int i=0; i < e.length; i++)
			System.out.println("Salary = " + e[i].paySalary());
	/*  原先在呼叫e.paySalary()時，原先的型態應為Employee，並沒有commission
		的參數，所以在new的時候降轉至子型別後，動態呼叫子型別的資料。
	
		for(Employee[] aa :e)
			printf()
	*/
	}
}
