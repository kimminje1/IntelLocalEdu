
public class TEST1 {
public static void main(String[] args) {
	int year =2024;
	if (year % 400 == 0) {
        System.out.println("윤년입니다"); // 400으로 나누어 떨어지면 윤년
    } else if (year % 100 == 0) {
        System.out.println("윤년이 아닙니다"); // 100으로 나누어 떨어지면 윤년 아님
    } else if (year % 4 == 0) {
    	System.out.println("윤년입니다"); // 4로 나누어 떨어지면 윤년
    } else {
    	System.out.println("윤년이 아닙니다"); // 그 외에는 윤년 아님
    }
}
}
