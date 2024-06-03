package three68.basic;

public class Com extends Product {
	Com() {
		super(200);
	}
	//모든 클래스는 Object를 상속받는다
	//object의 toString 재정의

	
	
	@Override
	public String toString() {
		return "Computer";
	}
	
	
	
	
}
