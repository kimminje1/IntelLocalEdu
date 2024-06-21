package six44.test;

import java.util.ArrayList;
import java.util.Scanner;

public class TestHashMapTest1 {
	public static void main(String[] args) {
	//3개의 쇼핑 항목을 확인하는 프로그램
	//의류,잡화,식품,가전,스포츠,공구,도서,생필품이 있다
		ArrayList<String> systemList = new ArrayList<>();

		systemList.add("의류");
		systemList.add("잡화");
		systemList.add("식품");
		systemList.add("가전");
		systemList.add("스포츠");
		systemList.add("공구");
		systemList.add("도서");
		systemList.add("생필품");
		Scanner scanner = new Scanner(System.in);

		System.out.println("다음 항목을 입력하세요" + systemList);

		ArrayList<String> userList = new ArrayList<>();
		for (int i = 1; i < 4; i++) {
			boolean Input = false; // 입력이 일치하는지 알아내는 문장
			while (!Input) {
				System.out.print((i) + "번째 쇼핑 항목을 입력하세요: ");
				String item = scanner.nextLine();
				
				
				boolean itemExistsInUserList = false;
                for (String userItem : userList) {
                    if (userItem.equals(item)) {
                    	 itemExistsInUserList = true;
                        break;
                    }
                }

                if (itemExistsInUserList) {
                    System.out.println("이미 리스트에 있습니다. 다른 항목을 입력해주세요.");
                } else {
                    boolean itemExistsInSystemList = false;
                    for (String systemItem : systemList) {
                        if (systemItem.equals(item)) {
                            itemExistsInSystemList = true;
                            break;
                        }
                        
                        
                    }

                    if (itemExistsInSystemList) {
                        userList.add(item);
                        Input = true;
                        
                        System.out.println(userList.get(0).equals("공구"));
                    } else {
                        System.out.println("잘못된 항목입니다. 다시 입력해주세요.");
                    }
                }
			
			}

		}
		System.out.println("선호 항목은:");
		for (String item : userList) {
			System.out.print(item + ", ");
		}

		System.out.println();
		// 프로그램을 종료합니다.
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
		scanner.close();

		
		
	
	}
}
