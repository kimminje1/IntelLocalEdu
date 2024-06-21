package menu;
import java.util.Scanner;

import data.CustomerData;
import data.Product;

public class KioskTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ordering = true;

       
   
            System.out.println("전화번호를 입력하세요:");

            String phone = scanner.nextLine();
           
            // CustomerData 객체 생성
            CustomerData customerData = new CustomerData();
            // Kiosk 객체 생성 시 CustomerData 객체를 넘겨줌
            Kiosk kiosk = new Kiosk(customerData);
            Product product = new Product();
            Kiosk kiosk2 = new Kiosk(product);

            kiosk.findCustomerNameByPhone(phone);
            System.out.println("환영합니다");

            kiosk2.displayMenu();
            
            System.out.println("번호를 선택하세요:");
            String choiceStr = scanner.nextLine();
            int choice = Integer.parseInt(choiceStr);
            scanner.nextLine(); // 버퍼 비우기

            kiosk2.processOrder(choice, phone);

            // while 루프를 사용하여 사용자가 Y 또는 N을 선택할 때까지 반복
            while (true) {
                // 다시 메뉴를 표시하도록 함
                kiosk2.displayMenu();
                System.out.println("번호를 선택하세요:");
                choiceStr  = scanner.nextLine();
                choice = Integer.parseInt(choiceStr); // 버퍼 비우기
                kiosk2.processOrder(choice, phone);

                System.out.println("정말 선택하시겠습니까? (Y/N)");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Y")) {
                    ordering = true;
                    break;
                } else if (confirm.equalsIgnoreCase("N")) {
                    ordering = false;
                    break;
                } else {
                    System.out.println("올바른 입력이 아닙니다. 다시 입력해주세요.");
                }
            }
        
        
        System.out.println("주문표 가져가세요");
        scanner.close();
    }
    

   
}


