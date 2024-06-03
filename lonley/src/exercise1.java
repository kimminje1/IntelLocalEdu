import java.util.Scanner;
public class exercise1 {
public static void main(String[] args) {
//키보드로 정수를 입력받은 만큼 모든 수를 누적한 후 
//누적한 결과를 출력하시오
 // Scanner 객체 생성 (System.in을 통해 입력 받음)
    
    // 사용자가 입력한 숫자를 읽음
	Scanner scanner = new Scanner(System.in);
	int sum = 0;
	
	while(true) {
		System.out.println("숫자를 입력하세요: ");
		int number = scanner.nextInt();

		if (number<-999) {
			break;
		}
		sum+=number;
		System.out.println("정수의 합계는:"+sum);
		System.out.println("종료를 원하면 -999를 입력하세요");
	}
		
		System.out.println("프로그램을 종료합니다.");
        scanner.close();

	}
	
	




}
	


