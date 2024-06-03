package two64;

public class ReferenceExTest2 {
	public static void main(String[] args) {
		
		Data d=new Data();
		
		System.out.println(d.x);
		
		d.x=10;
		
		System.out.println(d.x);
		
		ReferenceEx2 pe = new ReferenceEx2();
		
		pe.change(d); //참조변수
		
		System.out.println();
		System.out.println("main: x " + d.x);
		
		
		
		
		
		
	}

	

}
