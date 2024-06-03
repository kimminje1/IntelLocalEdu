package two38;

public class TvTest {

	public static void main(String[] args) {
//main제외안해도 메소드하나만있어야한다
		Tv tv; // 사용자정의클래스-객체
		tv = new Tv(); //new는 인스턴스화를 하기 위해서다.->new하면 객체가만들어진다.
		
		Tv tv2 =new Tv(); //다른객체,2번째객체임
		
		
		System.out.println("tv1의 채널값은"+tv.channel+"입니다");
		System.out.println("tv2의 채널값은"+tv2.channel+"입니다");
		
		
//		어떤 tv의 설정을 그래도 다른 tv에 적용하고 싶다		
//		tv2=tv; //tv2에 tv 주소값을 할당->tv의 함수이용
//주소할당되면 다시 못찾으니 조심해야함 	
		tv.channel = 8;
		System.out.println("tv1의 채널값은"+tv.channel+"입니다");
		
		tv2.channel=4; //tv2=tv면 tv의 채널에 4를 할당됨
		
		tv.channelDown();
		tv.channelUp();
		System.out.println("tv1의 채널값은"+tv.channel+"입니다");
		System.out.println("tv2의 채널값은"+tv2.channel+"입니다");
		
	}

}
