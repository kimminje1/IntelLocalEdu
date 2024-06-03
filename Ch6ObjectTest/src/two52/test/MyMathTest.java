package two52.test;

public class MyMathTest {
	
	public static void main(String[] args) {
	
		
//  메서드의 호출방법		
// 메서드명(값1, 값2, ,,,);		
		
		MyMath mm= new MyMath();
		
		
		int myResult = 0;
		int myminusResult = 0;
		int mymultiplyResult = 0;
		
		int mydivisionResult = 0;
		
		myResult = mm.add(1, 2);
		myminusResult = mm.minus(2, 1);
		mymultiplyResult = mm.multiply(2, 2);
		mydivisionResult = mm.division(2, 2);
	
//함수f3->누르고 선언부로 갈수있음
		System.out.println(myResult);
		System.out.println(myminusResult);
		System.out.println(mymultiplyResult);
		System.out.println(mydivisionResult);
	}
	




}
	
	
	
	

