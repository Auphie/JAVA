
public class Emp_Permanent extends Employee{
	double salary;

	Emp_Permanent(int empNo, String eName, double salary)
	{	super(empNo, eName);
		this.salary = salary;
	}
	
	Emp_Permanent()
	{	
	}
	
	double paySalary() {
		return salary;
	}
	
	
/*	
	// 呼叫出parent的display()並做override，除了parent的display()外，再加上屬於自己的display()功能
    // 若沒有做overriding的話，結果只會印出parent那邊的兩行

	void display() {
		super.display();	//p.114
		System.out.println("Salary = " + salary);
	}
*/
}
