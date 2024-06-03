package ch6.middle.exam;

public class lottoTest {
	public static void main(String[] args) {
		int[] lottoNumbers = new int[6];
		System.out.println("로또 번호:");
		for (int i = 0; i < lottoNumbers.length; i++) {
			int num = (int) (Math.random() * 45) + 1;
			lottoNumbers[i] = num;
			// 중복 체크
			for (int j = 0; j < i; j++) {
				if (lottoNumbers[i] == lottoNumbers[j]) {
					i--;
					break;
				}
			}
		}
		lotto a = new lotto();
		// 로또 번호 출력
		for (int j = 0; j < lottoNumbers.length; j++) {
            System.out.print(lottoNumbers[j] + " ");
        }
		System.out.println();

		// 버블 정렬 호출
		lotto.bubbleSort(lottoNumbers);

		// 정렬 후 로또 번호 출력
		System.out.print("정렬 후:");
		for (int j = 0; j < lottoNumbers.length; j++) {
            System.out.print(lottoNumbers[j] + " ");
        }
		System.out.println();
		lotto.bubbleSort2(lottoNumbers);

		// 정렬 후 로또 번호 출력
		System.out.print("정렬 후:");
		for (int j = 0; j < lottoNumbers.length; j++) {
            System.out.print(lottoNumbers[j] + " ");
        }
	}
}
