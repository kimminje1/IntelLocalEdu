package three57;

import three57.basic.Car;
import three57.basic.FireEngine;


public class CarTest {
	
	public static void main(String[] args) {
		
		
		Car car = null;
		//소방차1대
		FireEngine fel = new FireEngine();
		FireEngine fel2 = null;
		
		fel.water();
		
		car = fel; //car=(Car)fel 묵시적형변환
//		car.water();		
		
		fel2 = (FireEngine)car; //명시형변환 부모타입-fireengine으로
		// FireEngine=FireEngine이된다
		fel2.water();
// 명시적 형변환 수동,강제형변환
// 묵시적 형변환 자동형변환
		
		
		
		
		
	}
	
	
}
