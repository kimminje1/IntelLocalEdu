import java.util.*;

public class LadderGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 참가자 이름 입력
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        String[] names = scanner.nextLine().split(",");
        
        // 최대 사다리 높이 입력
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int ladderHeight = scanner.nextInt();

        // 라인 생성
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < ladderHeight; i++) {
            Line line = new Line(names.length);
            lines.add(line);
        }

        // 사다리 출력
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-5s", names[i]);
        }
        System.out.println();
        for (int i = 0; i < ladderHeight; i++) {
            for (int j = 0; j < names.length; j++) {
                System.out.print(lines.get(i).getPoint(j));
            }
            System.out.println();
        }
    }
}

class Line {
    private List<Boolean> points = new ArrayList<>();

    public Line(int countOfPerson) {
        Random random = new Random();
        for (int i = 0; i < countOfPerson - 1; i++) {
            points.add(random.nextBoolean());
        }
        points.add(false); // 마지막은 항상 false로 설정하여 가장 오른쪽 끝에는 선이 없도록 함
    }

    public String getPoint(int index) {
        StringBuilder sb = new StringBuilder();
        if (points.get(index)) {
            sb.append("|-----");
        } else {
            sb.append("|     ");
        }
        return sb.toString();
    }
}