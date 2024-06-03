package four14;

public class ExceptionEx2 {
	public static void main(String[] args) {
//try Catch문 흐름

//		예외가 발생하지 않는 경우
		
		
		System.out.println(1);
		System.out.println(2);
		//try가 완벽하면 catch 미수행 if문처럼
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(5);
		}
		System.out.println(6);
		
		
		
		
		

	}
}
