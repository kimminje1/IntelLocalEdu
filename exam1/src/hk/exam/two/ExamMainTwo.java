package hk.exam.two;

public class ExamMainTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GugudanService c=new GugudanService(); 
		// 원하는 단 하나 출력
		c.showGugudan(3, 3);
		c.showGugudan(5, 3);// 사용자가 지정한 2개의 숫자 사이 만큼의 구구단 출력
		c.showGugudan(3, 5);

	}

}
