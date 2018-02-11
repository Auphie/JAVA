
public class Employee_Main {

	public static void main(String[] args) {

		Employee[] a = new Employee[4];

		a[0] = new Lv1Mgter("Tom", 'M', "2001-1-1", "09654785", "Northbay",72000, 190);
		a[1] = new Lv1Mgter("Sami", 'F', "2011-1-1", "09611185", "Southbay",72000, 168);
		a[2] = new Lv2Mgter("Tifa", 'F', "2012-11-11", "49615185", "Cambridge",48000, 168);
		a[3] = new Staffs("Mary", 'F', "2016-11-11", "9875645", "Oxford",24000, 198);

		for(int i = 0; i < a.length; i++) {
			a[i].display();
			System.out.println(a[i].paySalary());
			System.out.println("\n");
		}
	}
}
