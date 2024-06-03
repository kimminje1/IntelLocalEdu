import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            try {
                System.out.print("숫자를 입력하세요: ");
                number = scanner.nextInt();
                // 숫자가 올바르게 입력되었으므로 반복문을 탈출합니다.
                break;
            } catch (InputMismatchException e) {
                // 숫자가 아닌 값을 입력한 경우 예외가 발생합니다.
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                scanner.nextLine(); // 버퍼를 비웁니다.
            }
        }

        // 입력된 숫자가 홀수인지 짝수인지 판단합니다.
        if (number % 2 == 0) {
            System.out.println("입력한 숫자는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자는 홀수입니다.");
        }

        scanner.close();
    }
}

