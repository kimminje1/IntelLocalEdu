import java.util.Scanner;
public class SwitchBasic3 {
public static void main(String[] args) {
	/*스위치문과 반복문

	사용자가 1 or 2를 입력 받는다

	1이면 
	2 * 1 = 2      3 * 1 = 3      ...   9 * 1 = 9
	2 * 2 = 4      3 * 2 = 6         3 * 9 = 27
	.
	.
	.
	2 * 9 = 18   3 * 9 = 27   ...   9 * 9 = 81
	2이면
	2 * 1 = 2      2 * 2 = 4      ...   2 * 9 = 18
	3 * 1 = 3      3 * 2 = 6      ...   3 * 9 = 27
	4 * 1 = 4
	.
	.
	.
	9 * 1 = 9      9 * 2 = 18   ...   9 * 9 = 81
	출력하는 프로그램 구현*/
	
	
	
	 Scanner scanner = new Scanner(System.in);

     System.out.println("1 또는 2를 입력하세요:");
     int choice = scanner.nextInt();

     switch (choice) {
         case 1:
             int i = 1;
             while (i <= 9) {
                 int j = 2;
                 while (j <= 9) {
                     System.out.print(j + " * " + i + " = " + (i * j) + "\t");
                     j++;
                 }
                 System.out.println();
                 i++;
             }
             break;
         case 2:
             int m = 1; // 변수 이름 수정
             while (m <= 9) {
                 int n = 2; // 변수 이름 수정
                 while (n <= 9) {
                     System.out.print(n + " * " + m + " = " + (n * m) + "\t");
                     n++;
                 }
                 System.out.println();
                 m++;
             }
             break;
         default:
             System.out.println("잘못된 입력입니다.");
     }
     
     
     System.out.println("프로그램 종료");
     scanner.close();
 }
	
}

