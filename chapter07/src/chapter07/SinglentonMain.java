package chapter07;

public class SinglentonMain {
	public static void main(String[] args) {

//		Singleton s= new Singlenton(); 에러발생
	
		Singleton s1 = Singleton.getInstance();		
		Singleton s2 = Singleton.getInstance();	
		Singleton s3 = Singleton.getInstance();	
		
		
		
	}
}
