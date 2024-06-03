package three54;

import three54.basic.CaptionTv;
import three54.basic.Tv;

public class TvTest {


public static void main(String[] args) {
	
//부모타입은 자식타입의 객체를 가질수 있다	
	
	
	Tv t= new CaptionTv();
	
	t.channel =1;
	t.channelUp();
	
	t.power();
	//The method caption() is undefined for the type Tv
//	t.caption();
	
	
	
	//다되는 형태가 아니면 오류
//	CaptionTv captv = new Tv();
////	
//	captv.channel =2;
//	captv.caption();
	
	CaptionTv ctv2 = new CaptionTv();
	
	ctv2.caption();
	
	
	
	
	
}
		
		
	}

