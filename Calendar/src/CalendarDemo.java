import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DATE);
		int day_of_week = today.get(Calendar.DAY_OF_WEEK);
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);

		/*String b="";
		switch(day_of_week) {
			case 1: b = "��";
				break;
			case 2: b = "�@";
				break;
			case 3: b = "�G";
				break;
			case 4: b = "�T";
				break;
			case 5: b = "�|";
				break;
			case 6: b = "��";
				break;
			case 7: b = "��";
				break;
		} */		
		String[] weekDay = {"��","�@","�G","�T","�|","��","��"};
		
		System.out.printf("���ѬO%4d�~%2d��%2d��%n",year,month,day);
		System.out.println("���ѬO�P��"+weekDay[day_of_week-1]);
		System.out.printf("���ѬO%2d:%02d:%02d%n",hour,minute,second);
	//  �T���B��l�g�k�A���Φb�S��printf���y����
		System.out.printf("���ѬO"+ hour +":"+
				((minute >= 10)? minute: "0"+minute) + ":" +
				((second >= 10)? second: "0"+second));
	}
}
