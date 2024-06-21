package one;

import one.two.Abc;

public class AbcTest {
	public static void main(String[] args) {
		
		Abc abc=new Abc();
		//The method info() from the type Abc is not visible
		//보이지 않는다,다른클래스에서 접근불가
		abc.info();
		
		
		
		
		
	}
}
