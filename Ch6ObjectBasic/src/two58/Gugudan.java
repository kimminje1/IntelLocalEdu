package two58;

public class Gugudan {
//객체지향프로그래밍	
//클래스타입
//구구단?
	
//리턴 타입?
	
	int guguan1(int dan) {
		for (int i = dan; i <=9; i++) {
			for (int n = 1; n<= 9; n++) {
				System.out.print(n +"*"+ i +"=" +(i*n)+"\t");
			}
			System.out.println();
		}
		return 0;
	}
//
//구구단->void가 맞다
	void guguan2(int dan) {
		for (int i = dan; i <=9; i++) {
			for (int n = 1; n<= 9; n++) {
				System.out.print(i +"*"+ n +"=" +(i*n)+"\t");
			}
			System.out.println();
		}
	}
	
	
	
	
}
