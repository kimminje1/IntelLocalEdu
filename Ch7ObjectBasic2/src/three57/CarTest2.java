package three57;

import three57.basic.Ambulance;
import three57.basic.Car;
import three57.basic.FireEngine;


public class CarTest2 {
	
	public static void main(String[] args) {
		
		
		Car car = null;
		//소방차1대
		FireEngine fel = new FireEngine();
		Ambulance am1 = null;
		
		fel.water();
		
		car = (Car)fel; 	
// car.water();
		
//명시적형변환
		
		am1 =(Ambulance)car;
		
		am1.siren();
		
		
		
		
		
		
// 명시적 형변환 수동,강제형변환
// 묵시적 형변환 자동형변환
		
		
		
		
		
	}
	
	
}
