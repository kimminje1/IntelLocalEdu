package etc;

//카드만들기
public class cardTest {
	public static void main(String[] args) {
		
		Card card1 = new Card();
		
		card1.init();
	
		String cardStr=card1.getCard();
		
		System.out.println(cardStr);
		
		Card card2 = new Card(2,12);
		
		String cardStr2=card2.getCard();
		
		System.out.println(cardStr2);	
		
	}

}
