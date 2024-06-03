package chapter07;

public class Singleton {
	//스태틱변수
	private static Singleton instance = new Singleton();
	
	private Singleton(){
		System.out.println("객체생성");
	}
	
	//스태틱 메서드
	public static  Singleton getInstance() {
		System.out.println("객체리턴");
		return instance;
	}
	
	
	
	
}
