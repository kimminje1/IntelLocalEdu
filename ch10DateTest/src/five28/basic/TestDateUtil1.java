package five28.basic;

import java.util.Date;

public class TestDateUtil1 {
	Date now = new Date();
	int year =now.getYear() + 1900;
	int month = now.getMonth();
	int	date = now.getDate();
	int hour = now.getHours();
	int min = now.getMinutes();
	int second = now.getSeconds() ;

//  2024년 06월 05일 수요일 10시 50분 49초
	public static void now() {
		Date now = new Date();
		System.out.print((now.getYear() + 1900) + "년 " + (now.getMonth() + 1)
				+ "월 " + now.getDate() + "일 "); 
		System.out.print(week());
		System.out.print((now.getHours()) + "시 "
		+ (now.getMinutes()) + "분 " + now.getSeconds() + "초 ");
	}
	if(month <10) {System.out.print((now.getYear() + 1900) + "년 " +"0"+ (now.getMonth() + 1)
			+ "월 " + now.getDate() + "일 "); 
	System.out.print(week());
	System.out.print((now.getHours()) + "시 "
	+ (now.getMinutes()) + "분 " + now.getSeconds() + "초 ");}
	else {System.out.print((now.getYear() + 1900) + "년 " + (now.getMonth() + 1)
			+ "월 " + now.getDate() + "일 "); 
	System.out.print(week());
	System.out.print((now.getHours()) + "시 "
	+ (now.getMinutes()) + "분 " + now.getSeconds() + "초 ");
		
	}

	public static void week() {
		Date now = new Date();
		int dayOfWeek = now.getDay();
		if (dayOfWeek == 0) {
			System.out.print("일요일 ");
		} else if (dayOfWeek == 1) {
			System.out.print("월요일 ");
		} else if (dayOfWeek == 2) {
			System.out.print("화요일 ");
		} else if (dayOfWeek == 3) {
			System.out.print("수요일 ");
		} else if (dayOfWeek == 4) {
			System.out.print("목요일 ");
		} else if (dayOfWeek == 5) {
			System.out.print("금요일 ");
		} else if (dayOfWeek == 6) {
			System.out.print("토요일 ");
		}
		

}
