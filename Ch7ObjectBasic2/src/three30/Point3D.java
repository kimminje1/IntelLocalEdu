package three30;

public class Point3D extends Point {
	
	int x=10;
	int y=20;
	int z;
	
//재정의 메소드가 대상이 된다
//
	public Point3D() {
		super();
		System.out.println("Point3D()");
	}
	
	
	String getLocation() { //오버라이딩
		
		
		return "x : "+ x +", y : " + y+", z: "+z; 
	}
	
	void superTestMethod() {
		System.out.println("void superTestMethod() 수행");
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(super.y);
	}
	
}
