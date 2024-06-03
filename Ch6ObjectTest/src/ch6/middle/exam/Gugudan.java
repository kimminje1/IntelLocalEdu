package ch6.middle.exam;

import java.util.Scanner;

public class Gugudan {

//	인스턴스 변수가 없는 경우

	// 하나의 단만 출력
//	2값이라면 2단만 출력하고 종료
//	100값이라면 100단만 출력
	void wantDanPrint(int dan) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		dan = scanner.nextInt();

		System.out.println(dan + "단 입니다");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
//ctrl+shift+f 블럭정렬
		}

	}

}
