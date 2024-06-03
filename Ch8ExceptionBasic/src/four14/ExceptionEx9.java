package four14;

//사용자 정의 예외만들기
public class ExceptionEx9 {
	public static void main(String[] args) {

		//기존의 예외 클래스를 활용할 수 있지만
		//때론 새로운 예외 클래스를 만들어 사용할 수도 있다.
		
		
		
		StartInstall9 st = new StartInstall9();
		
		try {
			st.setupMethod();
		} catch (MyExceptionEx9Class e) {
			e.getErrorMessage();
			
			System.out.println(e.getERR_CODE());
			
			e.printStackTrace();
		}
		
	
	
	
	
	
	
	}
}
