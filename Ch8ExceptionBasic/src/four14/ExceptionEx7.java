package four14;

public class ExceptionEx7 {
	public static void main(String[] args) {


		ExceptionEx7Class ex7= new ExceptionEx7Class();
		try {
			ex7.method1();
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}
		
//		Unhandled exception type Exception
// 		예외처리를 컴파일적으로 해줘야한다		
		try {
			ex7.method2();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
	
		
		

	}
}
