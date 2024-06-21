package hk.exam.two;

public class GugudanService {

	// 원하는 단 하나 출력
	/*
	 * 2~9단 뿐만이 아니라 10단, 20단, 어떤 숫자도 출력이 가능하다. 여러 단을 한번에 출력하는 메서드의 경우 (5, 3)로 입력한 경우
	 * “처음 숫자가 마지막 숫자보다 클 수 없습니다.” 라고 출력해준다. 여러 단을 한번에 출력하는 메서드의 경우 (3, 5)로 입력한 경우
	 * 3단, 4단, 5단을 출력해준다. 여러 단을 한번에 출력하는 메서드의 경우 (3, 3)로 입력한 경우 3단만 출력해준다.
	 */


	// 사용자가 지정한 2개의 숫자 사이 만큼의 구구단 출력
	public void showGugudan(int frontIndex, int lastIndex) {
		if (frontIndex >lastIndex) {
			System.out.println("처음 숫자가 마지막 숫자보다 클 수 없습니다.");
		}
		// “처음 숫자가 마지막 숫자보다 클 수 없습니다.” (5,3)
/* 여러 단을 한번에 출력하는 메서드의 경우 (3, 5)로 입력한 경우 3단, 4단, 5단을 출력해준다. */
		
		// 몇 단이 시작되는지 출력
		//단 하나만 출력(3,3)
		if (frontIndex == lastIndex) {
			for(int i=1;i<=9;i++) {
				System.out.println(frontIndex+"*"+i+"="+(frontIndex*i));
			}
		}
		 for (int dan = frontIndex; dan <= lastIndex; dan++) {
		        System.out.println("==== " + dan + "단 ====");
		        for (int i = 1; i <= 9; i++) {
		            System.out.println(dan + " * " + i + " = " + (dan * i));
		        }
		        System.out.println(); // 각 단 사이에 빈 줄을 추가합니다.
		    }
		 
		System.out.println("20단"); 
		for(int i=1;i<=9;i++) {
			System.out.println(20+"*"+i+"="+(20*i));
		}
		

		// 여러 단을 한번에 출력해준다.
		

	}

}
