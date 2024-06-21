package six44.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicArrayListTest5 {

	public static void main(String[] args) {

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
//				userList.add(item);
				if (userList.contains(item)) {
					System.out.println("다른항목을 입력해주세요.");
				} // 재입력
				else if (systemList.contains(item)) {
					userList.add(item);
					Input = true;
				}  
				else {
					System.out.println("다시 입력해주세요.");
				}
				

			}

		}
		System.out.println("당신이 선호:");
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

//		3개의 쇼핑 항목을 확인하는 프로그램
//		항목-시스템=리스트에 담아야한다
//		의류, 잡화, 식품, 가전, 스포츠, 공구, 도서, 생필품이 있다
//		키보드 입력->사용자가 의류를 입력하면->의류를 리스트에 추가한다
//		사용자favorite리스트에 넣고		
//		식품을 입력하면 
//		식품을 리스트에 추가한다
//		
//		도서를 입력하면 
//		도서를 리스트에 추가한다
//		
//		3개를 다 담은 경우 
//		당신이 선호하는 항목은-> 의류,식품,도서 출력
//		사용자가 담은 항목을 출력한 후
//		
//		프로그램을 종료한다
//		만약1.
//		쇼핑 항목에 없는 단어를 입력하면
//		잘못 입력했다는 메시지를 출력하고 
//		위의 내용을 반복한다
//		
//		만약2.
//		의류가 리스트에 담긴 상태에서 
//		사용자가 다시 의류를 입력하면
//		'이미 리스트에 있습니다'
//		'다른 항목을 입력해주세요' 라고 출력하며
//		다시 위의 내용을 반복한다
//				
