package ch7.polyExam.customer;

import ch7.polyExam.product.Book;
import ch7.polyExam.product.Com;
import ch7.polyExam.product.Product;
import ch7.polyExam.product.SmartPhone;

public class Buyer {
	public int money = 1000; //소지금
	public int bounsPoint = 0;
	
	
	//tv구매
	public void buy(Product pro) {
		if(money <pro.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= pro.price;
		bounsPoint =bounsPoint + pro.bonusPoint;
		
		System.out.println(pro+"을/를 구매하셨습니다.");
		
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
	//스마트폰구매
	public void buy(SmartPhone phone) {
		if(money <phone.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= phone.price;
		bounsPoint =bounsPoint + phone.bonusPoint;
		
		System.out.println(phone.toString()+"을/를 구매하셨습니다.");
		
	}
	//책구매
	public void buy(Book book) {
		if(money <book.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= book.price;
		bounsPoint =bounsPoint + book.bonusPoint;
		
		
		System.out.println(book.toString()+"을/를 구매하셨습니다. ");
	}
	
	
	
}
