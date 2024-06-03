package four14;

public class ExceptionEx5 {
	public static void main(String[] args) {

//		키워드 throw
//		프로그래머가 고의로 예외를 발생시킨다

//		방법
//		1. 예외 발생시키고 싶은 예외클래스 객체를 만든다
//		2. throw를 이용해서 예외를 발생시킨다
		
		try {
		
			Exception e = new Exception("고의로 예외발생시킴 by kmj");
			throw e;
		} catch (Exception e) {
			
			System.out.println("에러메세지: "+ e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("finally");
			System.out.println(7);
		}
		
		System.out.println("프로그램 종료");
		
		
		
	
		
		

	}
}
