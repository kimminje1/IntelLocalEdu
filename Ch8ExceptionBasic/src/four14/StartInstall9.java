package four14;

public class StartInstall9 {
	//메서드에 throw있다는것은 try catch없어도됨
	public void setupMethod() throws MyExceptionEx9Class {

		
		
		MyExceptionEx9Class me =new MyExceptionEx9Class("이제알았어", 500);
		throw me;
		
	}
}
