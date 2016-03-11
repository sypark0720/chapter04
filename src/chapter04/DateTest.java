package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getYear()+1900); //deprecated 곧 사라질 것이다. 다른걸써라-> calender
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 hh:mm:ss");
		
		System.out.println(sdf.format(now)); 
		
		
		
		
		

	}

}
