package hk.exam.one;

public class DiceService {
	
	// 주사위를 던지다
	public void throwDice(){
		
		// 주사위는 1부터 6까지 숫자만 존재
		
		int num = (int)(Math.random()*6)+1;
		System.out.println("주사위를 던졌습니다.");
		if (num ==1 ) {
			System.out.println("주사위숫자: 1");
		}
		else if(num ==2) {
			System.out.println("주사위숫자: 2");
		}
		else if(num ==3) {
			System.out.println("주사위숫자: 3");
		}
		else if(num ==4) {
			System.out.println("주사위숫자: 4");
		}
		else if(num == 5) {
			System.out.println("주사위숫자: 5");
		}
		else if(num ==6) {
			System.out.println("주사위숫자: 6");
		}
		
	}
}
