package five44.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BasicDateMain2 {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		System.out.println(now);
		
//		1900을 더해야 현재 연도가 나오는 이유
//		Date 클래스는 매우 오래된 클래스(1995년 도입)
//		많은 개발자들이 2000년 문제(Y2K)와 관련된 혼란을 겪었다
		System.out.println("년: " + (now.getYear() + 1900));
//		0=1월, 1=2월, 2=3월, ,,, 10=11월, 11=12월
		System.out.println("월: " + (now.getMonth() + 1));
		System.out.println("일: " + now.getDate());
		
//		String dayStr = "";
//		0=일요일, 1=월요일, 2=화요일, ,,, 5=금요일, 6=토요일		
		System.out.println("요일: " + now.getDay());
		
		System.out.println("시: " + now.getHours());
		System.out.println("분: " + now.getMinutes());
		System.out.println("초: " + now.getSeconds());
		
		//형식지정자
		SimpleDateFormat sdf 
		= new SimpleDateFormat("yyyy년MM-dd E요일 H시 m분 s초");
	//yyyy같은거 지켜야함
		String todayStr =sdf.format(now);
		
		System.out.println(todayStr);
	
		
		
		
		
		
	}
	
}
