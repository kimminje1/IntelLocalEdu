package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicArrayListTest5 {

	public static void main(String[] args) {

//		리스트에 담긴 값
//		100,30,50,70,40,90
//		총점과 평균을 구하시오
//		평균은 3번째자리에서 올림처리하시오

//		1번째값: 100
//		2번째값: 30
//		..
//		6번째값: 90
//		
//		총점: ??
//		평균: ??.??

		ArrayList<Integer> numList = new ArrayList<Integer>();

		// 값 입력
		numList.add(100);
		numList.add(30);
		numList.add(50);
		numList.add(70);
		numList.add(40);
		numList.add(90);
		
		// 값 출력
		for (int i = 0; i < numList.size(); i++) {
			System.out.println((i + 1) + "번째값: " + numList.get(i));
		}

		// 총점구하기
		int sum = 0;
		for (int num : numList) {
			sum +=num;
		}	

		// 평균구하기
		double average = (double) sum / numList.size();
		average = Math.ceil(average * 100) / 100.0;

		// 결과 출력
		System.out.println("총점: " + sum);
		System.out.println("평균: " + average);

	}

}
