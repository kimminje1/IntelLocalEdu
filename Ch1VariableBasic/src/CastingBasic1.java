
public class CastingBasic1 {
	public static void main(String[] args) {
	
//      boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다
/*		기본형과 참조형은 서로 형변환 할 수 없다
		서로 다른 타입의 변수간의 연산은 형변환을 하는 것이 원칙이지만
		값의 범위가 작은 타입에서 큰 타입으로 형변환은 생략할 수 있다*/
		int firstNum = 5;
		int secondNum = 6;
		
		int totalNum = 0;
		double avg =  0.0;
		
		System.out.println("총점:"+ totalNum);
		System.out.println("평균:"+ avg);
//		총점과 평균을 구하시오
		
//		소수점 3째자리 반올림?
//		소수점 1자리 올림?
//	c언어->	printf("%0.3f",f)

		firstNum =10;
		secondNum = 7;
		totalNum=firstNum + secondNum;
		//소수 3째자리내림
		avg =(double)totalNum/3;
		System.out.println("총점:"+ totalNum);
		System.out.println("평균:"+ avg);
//									구하고 싶은 소수점 자리수		
		/*
		 * 원래 숫자에 1000을 곱하여 소수점 셋째 자리로 이동합니다. 올림의 경우, 양수일 때는 1을 더하고 음수일 때는 -1을 더한 후, 정수
		 * 부분만을 취합니다. 반올림의 경우, 양수일 때는 0.5를 더하고 음수일 때는 -0.5를 더한 후, 정수 부분만을 취합니다. 다시
		 * 1000으로 나누어 원래 자릿수로 복원합니다.
		 */
//		소수점 3번째 자리에서 올림,반올림 구함	
//		반올림-기능 분리
		avg =(double)totalNum/3;
		System.out.println("1번 :"+avg);
		
		avg = avg +0.005;
		System.out.println("2번 :"+avg);
		
		avg = avg * 100;
		System.out.println("3번 :"+avg);
		
		avg = (int)avg;
		System.out.println("4번 :"+avg);
		
		avg = avg/100;
		System.out.println("5번 :"+avg);
		
	}

		
		
	
}
