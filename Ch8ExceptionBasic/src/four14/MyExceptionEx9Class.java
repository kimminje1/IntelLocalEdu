package four14;

//일반 클래스
public class MyExceptionEx9Class extends Exception{
	
	private final int ERR_CODE;
	
	
	public MyExceptionEx9Class(String msg, int errCode) {
		super(msg); //Exception 생성자 호출
		ERR_CODE = errCode;
	}
	
	public int getERR_CODE() {
		return ERR_CODE;
	}
	
	public void getErrorMessage() {
		System.out.println("뭔지 모르지만 오류났으니까");
		System.err.println("010-1234-5678로 연락ㄱㄱ");
		super.printStackTrace();
	}
	
	
	
	
	
	
}
