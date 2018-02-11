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
			case 1: b = "日";
				break;
			case 2: b = "一";
				break;
			case 3: b = "二";
				break;
			case 4: b = "三";
				break;
			case 5: b = "四";
				break;
			case 6: b = "五";
				break;
			case 7: b = "六";
				break;
		} */		
		String[] weekDay = {"日","一","二","三","四","五","六"};
		
		System.out.printf("今天是%4d年%2d月%2d日%n",year,month,day);
		System.out.println("今天是星期"+weekDay[day_of_week-1]);
		System.out.printf("今天是%2d:%02d:%02d%n",hour,minute,second);
	//  三元運算子寫法，應用在沒有printf的語言中
		System.out.printf("今天是"+ hour +":"+
				((minute >= 10)? minute: "0"+minute) + ":" +
				((second >= 10)? second: "0"+second));
	}
}
