
public class dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dicenum=0;
		int dice = 0;
		while(dice !=6) {
			
			dice = (int)(Math.random() * 6) + 1;//1~6
			System.out.println("("+dice+")");
			++dicenum;
		}
		System.out.println(dicenum+"회 굴렸습니다");
		System.out.println("주사위가 6이 나왔습니다 주사위를 종료합니다");
		
			
			
			
		
		
	
	
	}

}
