package exam;



public class StudentTest {
public static void main(String[] args) {
	
	
	Student ex = new Student("홍길동",2,1,100,76,60);
	Student ex2 = new Student("김민재",2,2,100,90,50);
	ex.info();
	ex.getTotal();
	
	ex.getAverage();
	
	ex2.info();
	ex2.getTotal();
	System.out.println("총점은:"+ex.getTotal());
	ex2.getAverage();
	System.out.println("평균:" + ex.getAverage());
	
    

}
}