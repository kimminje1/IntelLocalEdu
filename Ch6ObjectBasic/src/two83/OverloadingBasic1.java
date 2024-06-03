package two83;

public class OverloadingBasic1 {
//이름 명(name)
//타입이 같으면 이름이 유일해야한다	

	int print;

	void print(int a) {

	}

	
	  void print() {
	 
	 }
	  void print2() {
//이름이 유사해도전혀다른 기능을 수행하게 짜야한다
		 }
	
	 }
	long add(int a, long b) {
		 return a+b;
	 }
	 long add(long x, int y) {
		 return (long)x+y;
	 }


}
