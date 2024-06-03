package three27;

public class Point3D extends Point {

	int z;
	
//재정의 메소드가 대상이 된다
//
	String getLocation() { //오버라이딩
		return "x : "+ x +", y : " + y+", z: "+z; 
	}
}
