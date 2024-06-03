package three81.basic;

public interface Tv extends Mp3, Video  {
	// 블럭후 crtl + shift + x와y와 대소문자 변경
	public boolean POWER = false; //static final 생략됨
	public static final int CHANNEL = 0; //상수는 대문자로
	
	
	public void power(); //abstract 생략됨
	
	public abstract void channelUp();

//	public void channelDown();
	//오류가 발생한다
}
