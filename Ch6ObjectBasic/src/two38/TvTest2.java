package two38;

public class TvTest2 {

	public static void main(String[] args) {
//main제외안해도 메소드하나만있어야한다
		Tv tv; // 사용자정의클래스-객체
		tv = new Tv(); //new는 인스턴스화를 하기 위해서다.->new하면 객체가만들어진다.
		
		Tv tv2 =new Tv(); //다른객체,2번째객체임
		
		
		System.out.println("tv1의 채널값은"+tv.channel+"입니다");
		System.out.println("tv1의 채널값은"+tv.color+"입니다");
		System.out.println("tv2의 채널값은"+tv2.channel+"입니다");
		System.out.println("tv2의 채널값은"+tv2.color+"입니다");
		
		tv.color="black";
		tv.channel = 8;
		System.out.println("========================");
		tv2.color=tv.color;
		tv2.channel=tv.channel+1;
		
		System.out.println("tv1의 채널값은"+tv.channel+"입니다");
		System.out.println("tv1의 채널값은"+tv.color+"입니다");
		System.out.println("tv2의 채널값은"+tv2.channel+"입니다");
		System.out.println("tv2의 채널값은"+tv2.color+"입니다");
	}

}
