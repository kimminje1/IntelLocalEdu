package ch6.middle.exam;

import java.util.Scanner;

public class scannertest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");

		int[] numbers = new int[10]; // 10개 입력

		for (int i = 0; i < 10; i++) {
			numbers[i] = scanner.nextInt();
			System.out.println((i+1)+".숫자 입력: "+ numbers[i]);
			
		}

		// 입력된 숫자 출력
		

		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += numbers[i];
		}

		System.out.println("배열의 총합: " + sum);
		
		int mean = sum/10;
		

		System.out.println("평균: " + mean);

		scanner.close();

	}

}
