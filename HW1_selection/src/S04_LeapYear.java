
public class S04_LeapYear {

	public static void main(String[] args) {
		int year = 1700;
		String leap;
		
		Leaploop:
		if(year%4 == 0 || year%400 == 0)
			{if(year%100 == 0 && year%400 != 0 || year%4000 == 0)
				leap = "Not a Leap year.";
			else leap = "a Leap year.";
			break Leaploop;
			}
		else leap = "not a Leap Year.";
		System.out.printf("Year %d is %s", year, leap);
	}
}
