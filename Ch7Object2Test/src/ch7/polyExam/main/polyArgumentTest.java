package ch7.polyExam.main;

import ch7.polyExam.customer.Buyer;
import ch7.polyExam.product.*;


public class polyArgumentTest {
	 
		public static void main(String[] args) {
			
			Buyer buy1= new Buyer();
			
			Tv t = new Tv();	
			buy1.buy(t);
			
			System.out.println("현재 남은 돈은 "+buy1.money+"만원입니다.");
			System.out.println("현재 보너스 점수는 "+buy1.bounsPoint+"점입니다.");
			System.out.println();
			
			Com com = new Com();
			buy1.buy(com);
			
			System.out.println("현재 남은 돈은 "+buy1.money+"만원입니다.");
			System.out.println("현재 보너스 점수는 "+buy1.bounsPoint+"점입니다.");
			System.out.println();
			
			SmartPhone phone = new SmartPhone();
			buy1.buy(phone);
			
			System.out.println("현재 남은 돈은 "+buy1.money+"만원입니다.");
			System.out.println("현재 보너스 점수는 "+buy1.bounsPoint+"점입니다.");
			System.out.println();
			
			Book book = new Book();
			buy1.buy(book);
			
			System.out.println("현재 남은 돈은 "+buy1.money+"만원입니다.");
			System.out.println("현재 보너스 점수는 "+buy1.bounsPoint+"점입니다.");
			
			
			
			
			
//			Tv t = new Tv();
//			System.out.println("제품의 가격 " + t.price);
//			System.out.println("보너스 점수" + t.bonusPoint);
		}
}
