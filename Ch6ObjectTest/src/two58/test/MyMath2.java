package two58.test;



public class MyMath2 {
	
// 매서드 표현식
	int iv = 10;
	static int cv=20;
	int iv2 =cv;
//	static int cv2=iv;
	static int cv3=new MyMath2().iv;
static void staticMethod1() {
	System.out.println(cv);
	/* System.out.println(iv); */
	MyMath2 c=new MyMath2();
	System.out.println(c.iv);
}
void instanceMethod1(){
	System.out.println(cv);
	System.out.println(iv);
}
static void staticMethod2() {
	staticMethod1();
//	instanceMethod1();
	MyMath2 c=new MyMath2();
	c.instanceMethod1();
}	
void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
		}
public static void main(String[] args) {
    staticMethod2();           // 정적 메서드를 호출하여 프로그램을 실행
    MyMath2 myMath2 = new MyMath2();
    myMath2.instanceMethod2(); // 인스턴스 메서드를 호출하여 프로그램을 실행
}
}



	

	
	
	

