package etc.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class TestMapLis4 {

	public static void main(String[] args) {
		
//		Map과 List를 활용한 문제3
//		맵에 여러 데이터 그룹을 다루는 경우
// 101호,102호
// 201호,202호
// 301호,302호
//각방에는 수강생들이 있다
///1층,2층,3층에 사는 수강생들을 분류해서 출력하시오
		Map<Integer, List<String>> groupMap = 
			new HashMap<Integer, List<String>>();
		
//		키는 그룹
//		밸류는 그룹에 속한 사람들
		
		List<String> floor1List = new ArrayList<String>();
		
		floor1List.add("조무연");
		floor1List.add("김민재");
		
		
		groupMap.put(1, floor1List);
		
		List<String> floor2List = new ArrayList<String>();
		
		floor2List.add("조병철");
		floor2List.add("국하현");
		
		
		groupMap.put(2, floor2List);
		
		List<String> floor3List = new ArrayList<String>();
		
		floor3List.add("김유경");
		floor3List.add("김보근");
		
		
		groupMap.put(3, floor3List);
		
		StudyGroupUtil studyGroupUtil = new StudyGroupUtil();
		
		studyGroupUtil.studyGroupView(groupMap);
	}
	
	
	
	
}
