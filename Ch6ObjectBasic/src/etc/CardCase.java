package etc;

public class CardCase {
	int numOfCards = card.shape.length*card.number.length;
	card[] cardArr =new card[numOfCards];
	
	CardCase() {
		}
	//52장의 카드가 나란히 만들어진다
	void init() {
		int totalCnt = 0;
		
		for(int i=0;i<card.shape.length;i++) {
			for(int n=0;n<card.number.length;n++) {
				cardArr[totalCnt++]=new card(i,n);
				
			}
			
		}//전체 for end
		
	}
	card pick(int index) {
		
		
		card card= cardArr[index];
		
		return card;
		
	}
	void shuffle() {
		
	}
//카드 섞기

//카드케이스의 전체카드 보기
void allCard() {
	int totalCnt = 0;
	
	for(int i=0;i<card.shape.length;i++) {
		for(int n=0;n<card.number.length;n++) {
			cardArr[totalCnt++]=new card(i,n);
			System.out.print(cardArr[totalCnt-1].getCard()+" ");
		}
		System.out.println();
	}//전체 for end
}






}
