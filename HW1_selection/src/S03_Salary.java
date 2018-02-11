
public class S03_Salary {

	public static void main(String[] args) {
		int workingHour = 70;
		int unitWage = 120;
		double stg2Wage = unitWage*1.25;
		double stg3Wage = unitWage*1.5;
		double wage;
		if (workingHour > 80)
			wage = (workingHour%80) * stg3Wage + 20 * stg2Wage + 60 * unitWage;
		else if (workingHour < 60)
			wage = workingHour * unitWage;
		else wage = (workingHour%60) * stg2Wage + 60 * unitWage;
		
		System.out.println("The wage is NT " + (int)wage + " for "+ workingHour + " Hours working time.");
	}

}
