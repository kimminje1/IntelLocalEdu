package test;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayListTest2 {

	public static void main(String[] args) {
//명명규칙
//	num
//	str
//	numArr
//	strArr
//	numList
//	strList
		
		ArrayList<Integer> numList= new ArrayList<Integer>();
		
		for(int i = 0; i<5;i++) {
			numList.add(i);
		}
		
		
//		확장된 for문 or forEach문
//		출력용
		for(int num:numList) {
			System.out.println(num);
		}

		
		
		
	}

}
