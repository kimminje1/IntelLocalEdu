package ch11.exam5;

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
		
		Student student =new Student("조무연",1);
		studyGroup1List.add(student);
		
		student =new Student("김민재",2);
		studyGroup1List.add(student);
		
		student =new Student("송승은",3);
		studyGroup1List.add(student);
		
		groupMap.put(1, studyGroup1List);

		
		List<Student> studyGroup2List = new ArrayList<Student>();
		
		student = new Student("조병철", 1);
		studyGroup2List.add(student);
		
		student = new Student("국하현", 2);
		studyGroup2List.add(student);
		
		student = new Student("김진우", 3);
		studyGroup2List.add(student);
		
		groupMap.put(2, studyGroup2List);
		
		List<Student> studyGroup3List = new ArrayList<Student>();
		
		student = new Student("김유경", 1);
		studyGroup3List.add(student);
		student = new Student("김보근", 3);
		studyGroup3List.add(student);
		student = new Student("이상현", 3);
		studyGroup3List.add(student);
		
		
		groupMap.put(3, studyGroup3List);
		
	    BangUtil bUtil = new BangUtil();
		
		bUtil.bangUtilView(groupMap);

	}

}
