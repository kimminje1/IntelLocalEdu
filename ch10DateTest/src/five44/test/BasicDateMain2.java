package five44.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BasicDateMain2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
//		Date now = new Date();
//		
//		System.out.println(now);
	
//		SimpleDateFormat sdf 
//		= new SimpleDateFormat("yyyy년MM-dd E요일 H시 m분 s초");
//		String todayStr =sdf.format(now);
//		System.out.println(todayStr);
	
		
//		Date myChoiceDate = new Date();
//		
//		int year =2024-1900;
//		
//		myChoiceDate.setYear(year);
//		myChoiceDate.setMonth(7);
//		myChoiceDate.setDate(16);
//		myChoiceDate.setHours(8);
//		myChoiceDate.setMinutes(30);
//		myChoiceDate.setSeconds(10);
//		System.out.println(myChoiceDate);
		
		//자신의 생년월일을표현하자
		//만들고 일~시 축하한다
		Date myBrithDate = new Date();
		int year =1995-1900;
		myBrithDate.setYear(year);
		myBrithDate.setMonth(2);
		myBrithDate.setDate(19);
		
//		System.out.println(myBrithDate+"김민재 생일 축하합니다");
		SimpleDateFormat sdf 
			= new SimpleDateFormat("yyyyMMdd");
		String todayStr = sdf.format(myBrithDate);
		System.out.println(todayStr + " 김민재아 생일 축하합니다^^");
	
		
		
	}
	
}
