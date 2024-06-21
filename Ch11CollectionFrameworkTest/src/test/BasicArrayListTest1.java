package test;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayListTest1 {

	public static void main(String[] args) {
//문제1.반  5명 동기생의 이름 입력/순서대로 출력한다
		

		List<String> list1 =new ArrayList<String>(5);

		list1.add("김민재");
		list1.add("조무연"); 
		list1.add("김유경");
		list1.add("김진우");
		list1.add("김보근");
		list1.add("국하현");
		
		System.out.println(list1.size());
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
	

		
		
	}

}
