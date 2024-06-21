package five78.basic;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayListTest2 {

	public static void main(String[] args) {

		
//		List list1 = new ArrayList(5);	
//      제너릭스 or 지네릭스	(Generics)	
		List<Integer> list1 =new ArrayList<Integer>(5);
//		int num[]= new int[3];
//		num[1]=1; //앞으로 이런거 잘없음	
		
		
		list1.add(1);
		list1.add(new Integer(2)); //과거버전은 이렇게적어야
		list1.add(3);
		list1.add(4);
		
//	list1.add("문자열도가능");
// 		add를 하면 모든 데이터는 Object로 변환된다.	
//		다형성 원리로 저장
		list1.add(new Integer(5));
		
		
//		System.out.println(list1);
		
		int n= (int)list1.get(0);
//		Object obj = list1.get(0);
//		int n = list.get();
		System.out.println(n);
		
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		System.out.println(list1.get(4));
		
		
//	   	수정
//		삭제
		
		
		
	}

}
