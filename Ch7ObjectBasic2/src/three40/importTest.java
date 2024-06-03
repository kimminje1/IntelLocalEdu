package three40;

//import java.text.SimpleDateFormat;
//import java.util.Date;

import three40.cal.*;

public class importTest {

	
	public static void main(String[] args) {
	
		//java.util.Date=Date라서 import로 생략
		/*
		 * Date today = new Date();
		 * 
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/DD"); SimpleDateFormat
		 * time = new SimpleDateFormat("hh:mm:ss a");
		 * 
		 * System.out.println("오늘 날짜는:+"+sdf.format(today));
		 * System.out.println("현재 시간은:+"+time.format(today));
		 */
		Cal c = new Cal();
		
		c.calInfo();
		
	}

}
