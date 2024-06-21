package ch11.exam4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import etc.test.*;

public class TestMapList4 {

	public static void main(String[] args) {
		
		Map<Integer, List<Student>> groupMap = 
				new HashMap<Integer, List<Student>>();
		
		
		List<Student> studyGroup1List = new ArrayList<Student>();
		Student student1 =new Student("조무연",1);
		Student student2 =new Student("김민재",2);
		Student student3 =new Student("송승은",3);
		
		studyGroup1List.add(student1);
		studyGroup1List.add(student2);
		studyGroup1List.add(student3);
		
		groupMap.put(1, studyGroup1List);

		
		List<Student> studyGroup2List = new ArrayList<Student>();
		
		Student student4 =new Student("조병철",1);
		Student student5 =new Student("국하현",2);
		Student student6 =new Student("김진우",3);
		
		studyGroup2List.add(student4);
		studyGroup2List.add(student5);
		studyGroup2List.add(student6);
	
		
		groupMap.put(2, studyGroup2List);
		
		List<Student> studyGroup3List = new ArrayList<Student>();
		
		Student student7 =new Student("김유경",1);
		Student student8 =new Student("김보근",3);
		Student student9 =new Student("이상현",3);
		studyGroup3List.add(student7);
		studyGroup3List.add(student8);
		studyGroup3List.add(student9);
		
		
		groupMap.put(3, studyGroup3List);
		
	    BangUtil bUtil = new BangUtil();
		
		bUtil.bangUtilView(groupMap);

	}

}
