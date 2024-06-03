package two94;

public class CarTest {

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
		
		Car car2 = new Car("자동운전","제네시스","블랙","자동",4);//여기서 호출
		
	
		System.out.println("car2의 정보");
		System.out.println(car2.auto);
		System.out.println(car2.name);
		System.out.println(car2.color);
		System.out.println(car2.gearType);
		System.out.println(car2.door);
		
		
		
		
		
	}

}
