package hk.exam.four;

import java.util.ArrayList;
import java.util.Collections;

public class LottoService {
	// 인스턴스의 변수는 배열 or 컬렉션 클래스 둘 중 하나만 이용

	// 45개의 정수값을 저장하기 위한 배열 생성.
	private int[] balls = new int[45];
	private int[] luckyBall = new int[6];

	private ArrayList<Integer> ballList = new ArrayList<>();
	private ArrayList<Integer> luckyBallList = new ArrayList<>();

	// 1~45까지의 공 준비
	public void setLottoNumber() {
		ballList.clear();
		// 배열의 각 요소에 1~45의 값을 저장한다.
		for (int i = 1; i <= 45; i++) {
			ballList.add(i);
		}
	}

	// 45개의 로또 번호 중 중복되지 않는 나만의 숫자 6개를 선택
	public void setAutoLottoNumber() {
		// 먼저 1~45까지의 숫자를 설정한다.
		setLottoNumber();

		// ArrayList를 무작위로 섞는다.
		Collections.shuffle(ballList);

		// 섞인 ArrayList에서 처음 6개의 숫자를 선택하여 luckyBallList에 저장
		luckyBallList.clear();
		for (int i = 0; i < 6; i++) {
			luckyBallList.add(ballList.get(i));
		}

		// 선택된 번호 출력

		System.out.println();
	}

	/**
	 * 
	 * @param sequence true이면 오름차순, false이면 내림차순 정렬
	 * 
	 *                 <pre>
	 * 로또 번호 정렬
	 *                 </pre>
	 */
	public void sortLottoNumber(boolean sequence) {

		if (sequence) { // 오름차순 정렬
			System.out.println("오름차순");
			Collections.sort(luckyBallList);
			/* printLottoNumber(); */
		} else { // 내림차순 정렬
			System.out.println("내림차순");
			Collections.sort(luckyBallList, Collections.reverseOrder());
			 // 정렬된 번호 출력
		}

	}

	// 6개의 공의 숫자를 출력
	public void printLottoNumber() {
		System.out.print("선택된 로또 번호: ");
		for (int num : luckyBallList) {
			System.out.print(num + " ");
		}
	}

}
