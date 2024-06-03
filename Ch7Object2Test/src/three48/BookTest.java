package three48;

public class BookTest {
	public static void main(String[] args) {
		Book a=new Book();
		a.setTitle("Cosmos");
		a.setAuthor("Carl Edward Sagan");
		a.setPublisher("랜덤하우스");
		a.setDate("1980년");
		a.setPrice(45000);
		

		System.out.println(a.getTitle());
		System.out.println(a.getAuthor());
		System.out.println(a.getDate());
		System.out.println(a.getPublisher());
		System.out.println(a.getPrice());
		
		a.setProperties("정의란 무엇인가", "마이클 샌델", "김영사", 13200, "2010년");
		
		System.out.println(a.getTitle());
		System.out.println(a.getAuthor());
		System.out.println(a.getPrice());
		System.out.println(a.getPublisher());
		System.out.println(a.getDate());
		
	
	
	}
	
	
	
	
}
