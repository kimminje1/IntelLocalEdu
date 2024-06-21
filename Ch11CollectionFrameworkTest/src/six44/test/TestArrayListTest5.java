package six44.test;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayListTest5 {

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

        System.out.println("다음 항목을 입력하세요: " + systemList);

        ArrayList<String> userList = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            boolean inputValid = false; // 입력이 유효한지 확인하는 변수
            while (!inputValid) {
                System.out.print(i + "번째 쇼핑 항목을 입력하세요: ");
                String item = scanner.nextLine();

                // systemList에 존재하는지 확인
                boolean isInSystemList = false;
                for (String systemItem : systemList) {
                    if (systemItem.equals(item)) {
                        isInSystemList = true;
                        break;
                    }
                }

                if (isInSystemList) {
                    // userList에 중복 항목이 없는지 확인
                    boolean isDuplicate = false;
                    for (String userItem : userList) {
                        if (userItem.equals(item)) {
                            isDuplicate = true;
                            break;
                        }
                    }

                    if (!isDuplicate) {
                        userList.add(item);
                        inputValid = true;
                    } else {
                        System.out.println("항목이 이미 입력되었습니다. 다시 입력해주세요.");
                    }
                } else {
                    System.out.println("잘못된 항목입니다. 다시 입력해주세요.");
                }
            }
        }

        System.out.print("당신이 선호하는 쇼핑 항목: ");
        for (String userItem : userList) {
            System.out.print(userItem + ", ");
        }
        System.out.println();
        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}
