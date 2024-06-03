package four14;

public class ExceptionEx3 {
	public static void main(String[] args) {
//		try Catch문 흐름

//		예외가 발생한 경우
		int[] numArr = null;
		System.out.println(1);
		System.out.println(2);
		
		
		try {
			System.out.println(3);
			numArr[0] = 1;
			System.out.println(4); //예외가 발생한 순간 그 이후 코드 작동안함
		} catch (NullPointerException npe) {
			// TODO: handle exception
			System.out.println(5);
		}
		System.out.println(6);	
		
		
		
		
		

	}
}
