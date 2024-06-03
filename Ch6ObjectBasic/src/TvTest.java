
public class TvTest {

	public static void main(String[] args) {
//main제외안해도 메소드하나만있어야한다
		Tv tv; // 사용자정의클래스-객체
		tv = new Tv(); //new는 인스턴스화를 하기 위해서다.->new하면 객체가만들어진다.
		
		tv.channel = 7;
		
		tv.channelDown();
		System.out.println("현재 채널은"+tv.channel+"입니다");
		tv.channelUp();
		
		System.out.println("현재 채널은"+tv.channel+"입니다");
		
	}

}
