package three10;
//클래스 다이어그램
public class ParentTest  {
	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.age=40;
		p.play();
		
		Child c= new Child();
		
		c.age = 13;
		
		c.play();
		
	}
}
