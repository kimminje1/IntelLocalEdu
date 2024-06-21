package hk.exam.four;

public class ExamMainFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LottoService ls = new LottoService();
		// 1~45까지의 공 준비
		ls.setLottoNumber();
		// 총 6개의 로또 번호가 담긴 공 선택
		ls.setAutoLottoNumber();
		System.out.println("일반출력");
		// 6개의 로또 번호 출력
		
		ls.printLottoNumber();
		System.out.println();
		ls.sortLottoNumber(true); // 6개의 로또 번호 오름차순으로 정렬

		ls.printLottoNumber(); // 6개의 로또 번호 출력
		System.out.println();
		ls.sortLottoNumber(false); // 6개의 로또 번호 내림차순으로 정렬

		ls.printLottoNumber(); // 6개의 로또 번호 출력

	}

}
