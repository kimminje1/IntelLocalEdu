package test;
import java.util.Scanner;
import java.util.Iterator;

public class MyMath {
	
// 매서드 표현식
	void age(int n) {
	if (n>=8) {
		System.out.println("학교에 갑니다");
	}
	else {
		System.out.println("학교에 가지않습니다.");
	}
	}
	void age1() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age1 = scanner.nextInt();
		System.out.println("입력하신 나이는 " + age1 + "살 입니다.");
        scanner.close();
		if (age1>=19) {
			System.out.println("입장료는 3000원 일반인 입니다");
		}
		else if(age1>=13 && age1<19 ) {
			System.out.println("입장료는 2500원 중, 고등학생 입니다");
		}
		else if(age1>=7 && age1<13 ) {
			System.out.println("입장료는 2000원 초등학생입니다");
		}
		else {
			System.out.println("입장료는 1000원 취학전 아동입니다");
		}
	}
	void medal() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("등수를 입력하세요(1,2,3....)");
		int medal = scanner.nextInt();
		if (medal == 1) {
			System.out.println(medal+"등이고 메달 색은 금메달입니다");
		}
		else if(medal==2) {
			System.out.println(medal+"등이고 메달 색은 은메달입니다");
		}
		else if(medal==3) {
			System.out.println(medal+"등이고 메달 색은 동메달입니다");
		}
		else {
			System.out.println(medal+"등입니다");
		}
		scanner.close();
	}
	
	void forth(int n) {
		int temp=n;
		System.out.println(temp+n);
	}
	
	int add(int a, int b) {
		//유효성검사 validation
		if(a==0 && b==0) {
			System.out.println("0과0은 + 결과는 0입니다");
			return 0;
		}
		//유효성검사: 특별한 조건문 충족시 메서드 종료
		
		int result = a+b;
		
		System.out.println("더하기 메서드 수행됨");
		
		return result;
	}
	

	void sub(int a, int b) {
		int result = a+b;
		System.out.println(result);
		
		//return 생략된것
		//void타입->return을 명시하면 안됨 
	}
	//곱셉void 나누기void 숫자/0 예외처리후 이외는 올바르게
	void multi(int a, int b) {
		int result = a*b;
		System.out.println(result);
		System.out.println("곱하기 메서드 수행됨");
	}
	
	void div(int a, int b) {
		if(b==0) {
			System.out.println("0나누기는 작동하지 않습니다.");
			return;
		}
		int result = a/b;
		System.out.println(result);
		System.out.println("나누기 메서드 수행됨");
	}
		
		void multimul(int a, int b) {
			for (int i = 0; i < 9; i++) {
				 for (int j = 0; j <9; j++) {
					  System.out.println(i*j);
				}
			}
		
		
	}
}
	
	
	
	

