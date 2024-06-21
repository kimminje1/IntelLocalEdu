package etc.test;

import java.util.List;
import java.util.Map;

public class StudyGroupUtil {

	
	//의존관계
	//의존관계
		public  void studyGroupView(Map<Integer, List<String>> groupMap) {
			
			for (int i = 0; i < groupMap.size(); i++) {
				int groupNum = i + 1;
				List<String> floor1List = groupMap.get(groupNum);
				System.out.println( groupNum+"층에 사는 수강생들");
				
				int number = 0;
				for (int n = 0; n < floor1List.size(); n++) {
					number = n+1;
					System.out.println(groupNum*100+number + "호:" + floor1List.get(n));
				}
			}
			
		}
}
