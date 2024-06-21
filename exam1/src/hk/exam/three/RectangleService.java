package hk.exam.three;

public class RectangleService {

	// 정사각형을 출력한다
	public void printRectangle(int line) {

		// 정사각형의 크기

		/*
		 * for (int i = 0; i < line; i++) { // 행을 반복 for (int j = 0; j < line; j++) { //
		 * 열을 반복 System.out.print("*"); // 별을 출력 (줄바꿈 없음) } System.out.println(); // 한
		 * 행이 끝나면 줄바꿈 } System.out.println("===============");
		 */
		// 직각삼각형
		/*
		 * for (int i = 1; i <= line; i++) { // 행을 반복 (1부터 시작하여 line까지) for (int j = 1;
		 * j <= i; j++) { // 각 행에서 i개의 별을 출력 System.out.print("*"); // 줄바꿈 없이 별을 출력 }
		 * System.out.println(); // 한 행이 끝나면 줄바꿈 } for (int i = line; i >= 1; i--) { //
		 * 행을 반복 (1부터 시작하여 line까지) for (int j = 1; j <= i; j++) { // 각 행에서 i개의 별을 출력
		 * System.out.print("?"); // 줄바꿈 없이 별을 출력 } System.out.println(); // 한 행이 끝나면
		 * 줄바꿈 }
		 */

        for (int i = 1; i <= line; i++) { // 행을 반복
            // *을 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // ?를 출력
            for (int j = i + 1; j <= line; j++) {
                System.out.print("?");
            }
            System.out.println(); // 한 행이 끝나면 줄바꿈
        }
		// 역직각삼각형

	}

}