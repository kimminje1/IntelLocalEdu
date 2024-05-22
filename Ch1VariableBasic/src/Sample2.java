
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for문은 반복횟수를 알고 있을때 적합하다
//		구조가 직관적이라 이해하기 쉽다

//		표현식(expression)
//		for(초기화;조건식;증감식) {
//			조건식이 참일때 수행할 문장들 작성
//		}
// 초기화부터 수행->조건식->수행문장->증감식
		for (int i = 10; i >= -5; i--) {
			System.out.print(" "+i + " ");
			if (i == 5 | i == 0 ) // 줄바꿈조건
			{
				System.out.println();
			}
		}

	}

}
