
public class TvTvTest {

	public static void main(String[] args) {
//main제외안해도 메소드하나만있어야한다
		//tv를 켠 상태로 출력
		//채널 7인 상태에서 채널을 1로 내리시오
		//tv를 끈 상태를 출력
		TvTv tv; // 사용자정의클래스-객체
		tv = new TvTv(); //new는 인스턴스화를 하기 위해서다.->new하면 객체가만들어진다	
		tv.power();
		tv.tvpower();
		System.out.println(tv.power);
		tv.power();
		tv.tvpower();
		System.out.println(tv.power);
		
		tv.channel = 7;
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		System.out.println("현재 채널은"+tv.channel+"입니다");
		tv.channelUp();
		
		System.out.println("현재 채널은"+tv.channel+"입니다");
		
	}

}
