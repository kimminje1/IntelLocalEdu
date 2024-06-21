package four68.basic;

public class StringBasic3 {
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
		
//      기본형 값을 래퍼 클래스의 객체로 자동 변환해주는 것을 오토박싱(autoboxing)이라 하고
//      반대로 변환하는 것을 언박싱(unboxing)이라고 한다
      int n = 5;
      Integer iObj = new Integer(7);
      
//      언박싱
      n = n + iObj;
//      위의 코드는 컴파일 후에 아래와 같은 코드로 작동됨
      n = n + iObj.intValue();
      
      // 오토박싱
      iObj = n + iObj.intValue();
//      위의 코드는 컴파일 후에 아래와 같은 코드로 작동됨
      iObj = Integer.valueOf(n) + iObj;
		
		
		
	}
}
