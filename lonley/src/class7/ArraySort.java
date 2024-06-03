package class7;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요: ");
		int size = scanner.nextInt();

		int[] array = new int[size];

		System.out.println("배열의 원소를 입력하세요:");
		for (int i = 0; i < size; i++) {
			System.out.print("원소 " + (i + 1) + ": ");
			array[i] = scanner.nextInt();
		}

		Arrays.sort(array);

		System.out.println("정렬된 배열: " + Arrays.toString(array));

		scanner.close();
	}
}