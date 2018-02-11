// note that having set abstract in abs_Employee class, and then abstract paySalary()

public class abs_Emp_Main {
	public static void main(String[] args) {
  // while Employee has been abstracted, Main can't new with Employee class!
		/*
		abs_Employee e1 = new abs_Employee();
		e1.setEmpno(111);
		e1.setEname("Tom");
	    e1.display();
	    abs_Employee e3 = new abs_Employee(113,"Dus");
		
		//e3.display();
		
	    abs_Permanent p = new abs_Permanent();
		p.setEmpno(201);
		p.setEname("John");
		p.setSalary(45600);
		//p.display();
*/
		abs_Permanent p1 = new abs_Permanent();
		p1.setEmpno(111);
		p1.setEname("Tom");
		p1.setSalary(40000);
		p1.display();
		
		abs_Temporary t1 = new abs_Temporary(301,"Mary", 200, 12);
		t1.setEmpno(301);
		t1.setEname("Mary");
		t1.setHourPay(200);
		t1.setWorkHour(12);
		t1.display();
		
		abs_Sales s1 = new abs_Sales(333,"Pete",20000, 15000);
		s1.display();
		
	}
}
