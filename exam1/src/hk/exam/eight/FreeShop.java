package hk.exam.eight;

import java.util.ArrayList;

// 면세점
public class FreeShop {
	
	// 면세점이 열리면 책, 컴퓨터, Tv, 스마트폰을 한개 판매 가능하다
	// 상품을 한번 판매한 경우 해당 상품은 존재하지 않는다. ex) 책을 팔았으면 책은 존재하지 않음 하지만 나머지 상품은 존재한다.
	
	double storeMoney = 0;  // 주인장의 소지금
	private Book book = null; // 책 한권 
	private Computer computer = null; // 컴퓨터 한개
	private Tv tv = null; // Tv 한개
	private SmartPhone smartPhone = null; // 스마트폰 한개
	public ArrayList<Product> productList ;
	public FreeShop() {
		super();
		productList = new ArrayList<>();
	}

	public FreeShop(Book book, Computer computer, Tv tv, SmartPhone smartPhone){
		this.storeMoney = 100000; // 초기자금은 무조건 10만원
		this.book = book;
		this.computer = computer;
		this.tv = tv;
		this.smartPhone = smartPhone;
	}
	
	// 물건 구입
	// 메서드명 buy로 작성하시오
	/**
	 * @param gangsucwon 
	 * @param customer  고객
	 * @param ?? 어떤 상품을 살까
	 * @throws CloneNotSupportedException
	 */
	public void buy(Customer c, Product p) {
		// 물건이 존재하지 않으면 구매 불가
		if ((p instanceof Book && book == null) || 
			(p instanceof Computer && computer == null) || 
			(p instanceof Tv && tv == null) || 
			(p instanceof SmartPhone && smartPhone == null)) {
			System.out.println("죄송합니다. " + p.getName() + "는 이미 판매되었습니다.");
					return;
				}
		// 고객의 잔액이 부족하면 구매 불가
		if (c.getMoney() < p.getPrice()) {			
			System.out.println("잔액이 부족하여 " + p.toString() + "를 살 수 없습니다.");			return;
		}
		c.setMoney(c.getMoney() - p.getPrice());
		c.setMyBonusPoint(c.getMyBonusPoint() + p.getBonusPoint());
		c.setProduct(p);
		storeMoney += p.getPrice();
		// 해당 물건 제거
		if (p instanceof Book) {
					book = null;} 
		else if (p instanceof Computer) {
					computer = null;
				} 
		else if (p instanceof Tv) {
					tv = null;
				} 
		else if (p instanceof SmartPhone) {
					smartPhone = null;
				}
	System.out.println(c.getName() + "님이 " + p.getName() + "를 구매하였습니다.");
		
	}
	
		// 물건이 존재하는지 여부
		
		
		// 물건이 존재하면 구매 가능여부 확인
		// 나의 소지금으로 해당 상품의 구매가 가능하면
		
			// 나의 소지금으로 해당 상품의 구매가 불가능하면
		
	

	@Override
	public String toString() {
		return "FreeShop 상태 = 매진: [storeMoney=" + storeMoney + ", book=" + book + ", computer=" + computer + ", tv=" + tv
				+ ", smartPhone=" + smartPhone + "]";
	}


	
}
