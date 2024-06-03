package three68.basic;

public class Buyer {
	int money = 1000; //소지금
	int bounsPoint = 0;
	
	
	//tv구매
	public void buy(Tv t) {
		if(money <t.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= t.price;
		bounsPoint =bounsPoint + t.bonusPoint;
		
		System.out.println(t.toString()+"을/를 구매하셨습니다.");
		
	}
	
	// computer구매
	public void buy(Com Com) {
		if(money <Com.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= Com.price;
		bounsPoint =bounsPoint + Com.bonusPoint;
		
		System.out.println(Com.toString()+"을/를 구매하셨습니다.");
		
	}
	
	
	
}
