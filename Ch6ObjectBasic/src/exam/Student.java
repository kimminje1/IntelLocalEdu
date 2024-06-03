package exam;

public class Student {
	String name; //학생이름
	int	ban; //반
	int no; //번호
	int kor; //국어
	int	eng;//영어
	int math;//수학
	Student(String name,int ban,int no,int kor,int eng, int math){
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	void info() {
		System.out.println("학생의 정보는");
		System.out.println("이름:"+this.name);
		System.out.println("반은 "+this.ban+"반");
		System.out.println("번호는:"+this.no);
	}
	
	int getTotal() {
        int total = this.kor + this.eng + this.math;
        return total;
	}    
/*	int getTotal(int kor,int math,int eng) {
		int total=kor+eng+math;
		return total;
	}*/
	
	double getAverage() {
		getTotal();
		double mean=(double)getTotal()/3;
		double roundedAverage 
			= Math.round(mean * 100+0.5 ) / 100.0; // 반올림 수식
		
		return roundedAverage;
	}
}
