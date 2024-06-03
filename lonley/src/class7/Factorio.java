package class7;
import java.util.Scanner;
public class Factorio {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("팩토리얼을 계산할 숫자를 입력하세요: ");
	        int number = scanner.nextInt();
	        
	        long factorial = 1;
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	        }
	        
	        System.out.println(number + "의 팩토리얼: " + factorial);
	        
	        scanner.close();
	    }
	}
