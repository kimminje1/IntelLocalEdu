import java.util.Scanner;

public class execrcise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//키보드로부터 정수를 입력받아서 
//그 수가 소수인지 아닌지 판별하는 프로그램을 작성하시오.
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int number = scanner.nextInt();
		if (number <= 1) {
			System.out.println("소수가 아닙니다");
			return;
		} else if (number == 2) {
			System.out.println("소수입니다");
			return;
		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					System.out.println("소수가 아닙니다");
					return;
					// number가 i로 나누어 떨어지면 소수가 아님

				}

			}

			System.out.println("소수입니다");
			scanner.close();
		}
	}
}
