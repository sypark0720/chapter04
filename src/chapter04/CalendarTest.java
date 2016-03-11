package chapter04;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); //new를 하지 않는다. 추상클래스


		printDate(calendar);
	}

	public static void printDate(Calendar calendar){
		
		String date = " ";
		//year
		int year = calendar.get(Calendar.YEAR);
		date += (year +"년");
		
		//month(0~11)
		int month = calendar.get(Calendar.MONTH );
		date += ((month+1)+"월");
				
		//day
		int d = calendar.get(Calendar.DATE);
		date += (d+"일");
		
		//요일(1~7) 일요일이 1
		final String[] days = {"sun","mon","tue","wed","thu","fri","sat"};
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		date += ("("+days[day-1]+")");
		
		//am or pm
		int isPM = calendar.get(Calendar.AM_PM); //1이면 pm 0이면 am
		String ampm= calendar.get(Calendar.AM_PM) ==0? "오전":"오후";
		date += (ampm + " ");
		
		//시간
		int hour = calendar.get(Calendar.HOUR);
		date += (hour+"시");
		
		//분
		int minute = calendar.get(Calendar.MINUTE);
		date += (minute+"분");
		
		//초
		int second = calendar.get(Calendar.SECOND);
		date += (second+"초");
		
		System.out.println(date);
	}

}
