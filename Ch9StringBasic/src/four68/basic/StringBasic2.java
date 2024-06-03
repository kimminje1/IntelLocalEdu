package four68.basic;

public class StringBasic2 {
	public static void main(String[] args) {
		
		int iVal = 100;
		
		String numStr = String.valueOf(iVal);
		
		
		
		double dVal = 200.0;
		String douStr = String.valueOf(dVal);
		
		long lVal = 300L;
		String longNumStr = lVal + "";
		
		
		//객체 타입을 기본형 타입으로 변경해준다
		double sum =Integer.parseInt(numStr)+Double.parseDouble(douStr);
		//문자열을 숫자열로변환Integer.parseInt
		System.out.println(sum);
		
		System.out.println(numStr+"+"+douStr + "="+ sum);
		
		
		
		
		
	}
}
