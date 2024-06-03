package three30;

public class Point {
	int x;
	int y;
	
	
	public Point() {
		super();
		System.out.println("Point()");
	}
	String getLocation() {
		return "x :"+ x +", y:" + y; 
	}
}
