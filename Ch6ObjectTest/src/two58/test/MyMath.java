package two58.test;

import java.util.Iterator;

public class MyMath {
	
// 매서드 표현식
	
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
	
	
	
	

