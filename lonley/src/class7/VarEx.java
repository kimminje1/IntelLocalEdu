package class7;

public class VarEx {
	public static void main(String[] args) {
		//클래스 변수사용
		System.out.println("Avante 제조사: "+ Avante.company);
		
		Avante a1=new Avante();
		Avante a2=new Avante();
		
		//인스턴스 변수의 값 설정
		a1.color= "화이트";
		a2.color="블랙";
		
		//인스턴스 변수 출력
		System.out.println("a1 색상: "+a1.color);
		System.out.println("a2 색상: "+a2.color);
	
		
	}
	class Avante{
		
		String color; //인스턴스변수
		static String company = "현대"; //클래스변수
	}
}

