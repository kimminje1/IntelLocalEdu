package four14;

public class ExceptionEx4 {
	public static void main(String[] args) {

//		예외가 발생하면 발생한 예외에 해당하는 클래스의 인스턴스가 만들어 진다
//		여기서는 NullPointerException이 발생했으므롤 널포인터익셉션 인스턴스가 생성된다
//		모든 예외클래스는 Exception 클래스의 자식이므로
//		catch블럭의 괄호에 Exception클래스를 선언해 놓으면 어떤 종류의 예외가 발생하더라도
//		이 catch블럭에 의해서 처리된다

		int[] numArr = null;
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(4/0);
			numArr[0] = 1;
			System.out.println(4); 
//멀티 catch블럭
		}
		catch (ArithmeticException | NullPointerException npe) {
			npe.printStackTrace();
			System.out.println(5);
		} catch (Exception e) { // 모든 예외처리가능
			System.out.println(6);
		}
		// Exception 상세하게 오류를 안알려줌
		
		System.out.println(7);

	}
}
