package etc;



//카드만들기
public class CardCaseTest {
	public static void main(String[] args) {
		
		CardCase cc= new CardCase();
		
		cc.init();
		
		card card1 = cc.pick(0);
		
		cc.allCard();
		
		
		
	}

}
