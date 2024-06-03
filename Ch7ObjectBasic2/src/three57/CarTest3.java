package three57;

import three57.basic.Ambulance;
import three57.basic.Car;
import three57.basic.FireEngine;


public class CarTest3 {
	
	public static void main(String[] args) {
		
		
		Car car = new Car();
		//소방차1대
		FireEngine fe1;
		Ambulance am1 = null; //데이터는 의미를 가진다
		
//		System.out.println(fe1); //지역변수는 초기화해야한다
		
//		fe1=(FireEngine)car;->오류
//      부모 객체는 자식참조변수에 할당 불가능		
		
		fe1 = null;
		System.out.println(fe1);
		
		
		fe1.drive();
		fe1.stop();
//		fe1.water();
		
		//명시적형변환
		
		am1 =(Ambulance)car;
				
		am1.siren();
					
	
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
