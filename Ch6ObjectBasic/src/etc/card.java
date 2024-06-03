package etc;

//카드만들기
public class card {
	static String[] shape= {
			"♥","◆","♣","♠"
	};
	static String[] number= {
			"A","2","3","4","5","6","7","8","9","T","J","Q","K"
	};
	
	String cardStr = ""; //조합된 결과->카드
	
	
	//객체생성하자마자 카드를 생성
	card(int shapeIndex,int numberIndex){
		init( shapeIndex,numberIndex);
	}
	//자동으로 카드 생성
	void init() {
		int shapeIndex =(int)(Math.random()*shape.length);
		int numberIndex =(int)(Math.random()*number.length);
		
		cardStr=shape[shapeIndex]+number[numberIndex];
	}
	
	void init(int shapeIndex,int numberIndex) {
		
		cardStr=shape[shapeIndex]+number[numberIndex];
	}
	
	String getCard() {
		return cardStr;
	}
	
}
