package ch7.inter.exam.main;

import ch7.inter.exam.cat.FirstCat;
import ch7.inter.exam.cat.SecondCat;
import ch7.inter.exam.chicken.Chicken;

public class MyPetRaisingTest {
	public static void main(String[] args) {
	 // 여러분은 고양이 2마리, 닭, 원숭이를 유심히 봤다.
    // 너무나 귀엽고 깜찍해서 키우고 싶은 생각이 들었다.
    // 각 동물의 행동을 구현하시오 
    // 각 동물의 행동을 출력하시오
    
    
    // 동물을 키우는 사람 클래스 알아서 정의하고 
    // 동물 2마리만 입양이 가능하도록 작성
    // 입양을 하게된 동물들의 정보도 출력되게 작성하시오 
		FirstCat fc = new FirstCat();
		
		fc.call();
		fc.eat("사료");
		fc.work("장난감 공");
		fc.sleep("누워서");
		System.out.println("===========================");
		
		SecondCat sc = new SecondCat();
		
		sc.call();
		sc.eat("츄르");
		sc.work("장난감 방울");
		sc.sleep("누워서");
		System.out.println("===========================");
		
		Chicken ch = new Chicken();
		
		ch.call();
		ch.eat("곡물");
		ch.work("날면서");
		ch.sleep("앉아서");
		System.out.println("===========================");
		
		
		
	}
}
