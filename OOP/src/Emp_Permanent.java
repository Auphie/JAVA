
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
	// �I�s�Xparent��display()�ð�override�A���Fparent��display()�~�A�A�[�W�ݩ�ۤv��display()�\��
    // �Y�S����overriding���ܡA���G�u�|�L�Xparent���䪺���

	void display() {
		super.display();	//p.114
		System.out.println("Salary = " + salary);
	}
*/
}
