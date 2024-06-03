package two94;

public class Car {
//드림카 만들기
//옵션
//1개 추가
//차명
	String name;
	String auto;
	String color;
	String gearType;
	int door;
//생성자 기본(default)생성자 
	Car() {
		System.out.println("기본 생성자 호출됨");
	}
//안적어도 묵시적으로 수행함
//매개 변수
// 생성자	
	Car(String a,String n,String c, String g,int d) {
		System.out.println("다른 생성자 호출됨");
		System.out.println("인스턴스 변수를 초기화한다");
		auto = a;
		name = n;
		color = c;
		gearType = g;
		door = d;
	}
}
