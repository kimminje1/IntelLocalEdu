package four14.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardinputTest {
	public static void main(String[] args) {

		int userInputStr = 0;

		Scanner scanner = new Scanner(System.in);

		

		try {
			System.out.println("키보드로 숫자만 입력");
			userInputStr = scanner.nextInt();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("유효하지 않은 입력입니다. 숫자를 입력하세요.");
			scanner.next();
		}

		System.out.println(userInputStr);
		System.out.println("프로그램 정상 종료");

	}
}
