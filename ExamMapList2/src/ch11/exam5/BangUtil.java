package ch11.exam5;

import java.util.List;
import java.util.Map;

public class BangUtil {
	
	public void groupMaking() {}
	
	
	
	
	
	
	
	
	public void bangUtilView(Map <Integer, List<Student>> groupMap) {

	Student student =null;
		for (int i = 0; i < groupMap.size(); i++) {
			int groupNum = i + 1;
			List<Student> studyGroup1List = groupMap.get(groupNum);
			System.out.println(groupNum + "조");
			
//			int number = 0;
			for (int n = 0; n < studyGroup1List.size(); n++) {
//				number = n+1;
				student = studyGroup1List.get(n);
				System.out.println(student.number + "번: " +student.name);
		    }
			System.out.println();
		}
	}
}
