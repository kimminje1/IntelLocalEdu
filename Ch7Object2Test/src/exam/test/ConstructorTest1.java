package exam.test;
// 
class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
	  Product() {
	        this(0); // 기본 가격으로 매개변수가 있는 생성자를 호출
	    }
}

class Tv extends Product {
	Tv() {
		super(100000);
		// 이곳에서 에러가 발생하는데 코드를 어떻게 변경해야 해결이 되는지 코드를 작성하시오
		// 2가지 해결 방법 존재
		//1.부모클래스의 생성자를 명시적으로 호출하기
		//2.부모 클래스에 기본 생성자 추가하기
	}
}

public class ConstructorTest1 {
	public static void main(String[] args) {
		Tv t = new Tv();
		System.out.println("제품의 가격: " + t.price);
		System.out.println("보너스 점수" + t.bonusPoint);
	}
}