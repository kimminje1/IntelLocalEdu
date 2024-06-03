package two94;

public class CarTest2 {

	public static void main(String[] args) {
		
		Car car1 = new Car();//여기서 호출
		
		car1.color =  "white";
		car1.gearType= "auto";
		car1.door = 4;
		
		System.out.println("car1의 정보");
		System.out.println(car1.color);
		System.out.println(car1.gearType);
		System.out.println(car1.door);
		
		System.out.println();
		
		Car2 car2 = new Car2("블랙","자동",4);//여기서 호출
		
	
		car2.info();
		
		
		
		
		
	}

}
