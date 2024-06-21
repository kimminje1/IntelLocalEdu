package test;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayListTest3 {

	public static void main(String[] args) {
//문제1.반  5명 동기생의 이름 입력/순서대로 출력한다
//문제2. 1~10까지의 데이터를 저장하고 출력한다
//		1
//		2
//		3
//		..
//		10
//		이후
//		
//		1삭제
//		2삭제
//		
//		10까지 모두 삭제하는 코드를 작성하시오
//		마지막에 리스트의 사이즈:0이 출력되도록 하시오

		List<Integer> list1 = new ArrayList<Integer>(10);
//		for(int i=0;i<list1.size();i++) {
//			list1.add(i);
//		}
//		System.out.println(list1);
		for (int i = 1; i <= 10; i++) {
			list1.add(i);
		}
		System.out.println("1~10까지의 리스트:" + list1);
//		list1.add(1);
//		list1.add(2);
//		list1.add(3);
//		list1.add(4);
//		list1.add(5);
//		list1.add(6);
//		list1.add(7);
//		list1.add(8);
//		list1.add(9);
//		list1.add(10);

		// 1~10의 모든 요소를 제거 방법-1
//		for (int i = 1; i <= 10; i++) {
//            list1.remove(Integer.valueOf(i)); // remove(Object o)를 사용하여 값을 제거
//        }
		//while문사용 remove
//		while(list1.size()>0) {list1.remove(0);
//			list1.remove(0);
//		}
//		for문사용 remove
//		for (; list1.size() > 0;) {
//			list1.remove(0); // 항상 첫 번째 요소를 제거
//		}
//		list1.remove(0);
//		list1.remove(0);
//		list1.remove(0);
//		list1.remove(0);
//		list1.remove(0);
//		list1.remove(0);
//		list1.remove(0);
//		list1.remove(0);
//		list1.remove(0);
//		list1.remove(0);

		System.out.println(list1);
		System.out.println("지운후 리스트 사이즈" + list1.size());

	}

}
