package ch6.middle.exam;

public class Mathmatic {

//	인스턴스 변수가 있는 경우

	int firstNum;
	int secondNum;

//	2개의 수만 사칙연산과 나머지 연산자를 구하는 계산기

	int add() {
		int rslt = firstNum + secondNum;

		return rslt;

	}

	int minus() {
		int rslt = firstNum - secondNum;

		return rslt;

	}

	int multi() {
		int rslt = firstNum * secondNum;

		return rslt;

	}

	double div() {
		if (secondNum==0) {
			System.out.println("0으로 나눌수 없습니다");
			return 0;
		}
		double rslt =(double)firstNum / secondNum;
		
		return rslt;

	}

	int remainder() {
		if (secondNum==0) {
			System.out.println("0으로 나눌수 없습니다");
			return 0;
		}
		int rslt = firstNum % secondNum;
		System.out.println("나머지는: " + rslt);
		return rslt;

	}
}