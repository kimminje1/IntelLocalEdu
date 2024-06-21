package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicArrayListTest4 {

	public static void main(String[] args) {


//		Iterator
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		 for(int i=0;i<5;i++) {
			 numList.add(i);
		 }
		
		 Iterator it =numList.iterator(); //알면좋음~
		 
		 Object obj = null;
		 while(it.hasNext()) { //hasnext->다음요소가잇는지 검증
			 obj=it.next(); //
			 
			 System.out.println((int)obj);
		 }
//		 while(it.hasNext()){ //hasnext->다음요소가잇는지 검증
//			 Object obj = null;
//			 obj=it.next(); //
//			 int num = (int)obj
//			 
//			 System.out.println(num);
//		 }->for(int num:numList){ System.out.println(num);}
//		 
		 
		 
	}

}
