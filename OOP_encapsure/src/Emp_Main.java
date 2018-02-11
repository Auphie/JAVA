
public class Emp_Main {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpno(111);
		e1.setEname("Tom");
	    e1.display();
		Employee e3 = new Employee(113,"Dus");
		
		//e3.display();
		
		Permanent p = new Permanent();
		p.setEmpno(201);
		p.setEname("John");
		p.setSalary(45600);
		//p.display();

		Temporary t = new Temporary(301,"Mary", 200, 12);
		t.setEmpno(301);
		t.setEname("Mary");
		t.setHourPay(200);
		t.setWorkHour(12);
		t.display();
		
	//  Polymorphism. p.119
	//	建立e(父類別)，給3個值的array(就是3個人)
		Employee[] e = new Employee[3];
	//  將父親 e 的reference指向子類別的instance
		e[0] = new Permanent(111,"Tom",40000);
		e[1] = new Temporary(222, "Ain", 200, 60);
		e[2] = new Sales(333,"Pete",20000, 15000);
		for(int i=0; i < e.length; i++)
			System.out.println("Salary = " + e[i].paySalary());

	}
}
